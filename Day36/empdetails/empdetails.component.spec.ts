import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmpdetailsComponent } from './empdetails.component';

describe('EmpdetailsComponent', () => {
  let component: EmpdetailsComponent;
  let fixture: ComponentFixture<EmpdetailsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [EmpdetailsComponent]
    });
    fixture = TestBed.createComponent(EmpdetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
