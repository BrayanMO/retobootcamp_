import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HospitalListarComponent } from './hospital-listar.component';

describe('HospitalListarComponent', () => {
  let component: HospitalListarComponent;
  let fixture: ComponentFixture<HospitalListarComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [HospitalListarComponent]
    });
    fixture = TestBed.createComponent(HospitalListarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
