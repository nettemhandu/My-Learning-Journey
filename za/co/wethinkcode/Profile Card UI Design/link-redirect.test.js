// happy path test 

const { test, expect } = require('@playwright/test');
const path = require('path');

test('LinkedIn link redirects correctly', async ({ page }) => {
  // Open your local HTML file
  await page.goto('file://' + path.resolve(__dirname, '../Profile Card UI Design/index.html'));

  // Click the LinkedIn link
  const linkedinLink = await page.locator('a[href*="linkedin.com"]');
  const [newPage] = await Promise.all([
    page.waitForEvent('popup'),
    linkedinLink.click()
  ]);

  // Check the new page URL
  expect(newPage.url()).toContain('linkedin.com/in/antonette-mhandu-2447a9240');
});

--

// sad path test 
// still to debug 

// test('Broken link does NOT redirect (no popup)', async ({ page }) => {
//   await page.goto('file://' + path.resolve(__dirname, '../Profile Card UI Design/index.html'));

//   // Suppose you have a broken link with href="#"
//   const brokenLink = await page.locator('a[href="#"]');
//   // Try clicking and wait for popup (should NOT happen)
//   let popupOpened = false;
//   page.once('popup', () => { popupOpened = true; });

//   await brokenLink.click();
//   // Wait a short time to see if popup opens
//   await page.waitForTimeout(1000);

//   expect(popupOpened).toBeFalsy(); // No popup should open
// });