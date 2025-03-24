import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CondicionListarComponent } from './condicion-listar.component';

describe('CondicionListarComponent', () => {
  let component: CondicionListarComponent;
  let fixture: ComponentFixture<CondicionListarComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CondicionListarComponent]
    });
    fixture = TestBed.createComponent(CondicionListarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
