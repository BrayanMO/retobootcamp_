import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DistritoListarComponent } from './distrito-listar.component';

describe('DistritoListarComponent', () => {
  let component: DistritoListarComponent;
  let fixture: ComponentFixture<DistritoListarComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DistritoListarComponent]
    });
    fixture = TestBed.createComponent(DistritoListarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
