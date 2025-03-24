import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GerenteListarComponent } from './gerente-listar.component';

describe('GerenteListarComponent', () => {
  let component: GerenteListarComponent;
  let fixture: ComponentFixture<GerenteListarComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [GerenteListarComponent]
    });
    fixture = TestBed.createComponent(GerenteListarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
