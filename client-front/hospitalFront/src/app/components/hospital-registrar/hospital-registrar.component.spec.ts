import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HospitalRegistrarComponent } from './hospital-registrar.component';

describe('HospitalRegistrarComponent', () => {
  let component: HospitalRegistrarComponent;
  let fixture: ComponentFixture<HospitalRegistrarComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [HospitalRegistrarComponent]
    });
    fixture = TestBed.createComponent(HospitalRegistrarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
