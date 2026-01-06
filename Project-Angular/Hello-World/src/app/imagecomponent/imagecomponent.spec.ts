import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Imagecomponent } from './imagecomponent';

describe('Imagecomponent', () => {
  let component: Imagecomponent;
  let fixture: ComponentFixture<Imagecomponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Imagecomponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Imagecomponent);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
