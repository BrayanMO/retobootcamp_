import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HospitalActualizarComponent } from './hospital-actualizar.component';

describe('HospitalActualizarComponent', () => {
  let component: HospitalActualizarComponent;
  let fixture: ComponentFixture<HospitalActualizarComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [HospitalActualizarComponent]
    });
    fixture = TestBed.createComponent(HospitalActualizarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
