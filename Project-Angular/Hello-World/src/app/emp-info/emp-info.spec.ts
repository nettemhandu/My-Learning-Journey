import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmpInfo } from './emp-info';

describe('EmpInfo', () => {
  let component: EmpInfo;
  let fixture: ComponentFixture<EmpInfo>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EmpInfo]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmpInfo);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
