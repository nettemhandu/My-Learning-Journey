Random random = new Random();
int daysUntilExpiration = random.Next(12);
int discountPercentage = 0;

// Your code goes here

if (daysUntilExpiration <= 10){
    Console.WriteLine("Your subscription will expire soon. Renew now!");
}
else if(daysUntilExpiration <= 5)
{
    Console.WriteLine($"Your subscription expires {daysUntilExpiration} in days. Renew now and save 10%!");
}
else if(daysUntilExpiration <= 1)
{
    Console.WriteLine("");
}