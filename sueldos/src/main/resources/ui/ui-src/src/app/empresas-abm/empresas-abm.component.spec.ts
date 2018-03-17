import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmpresasAbmComponent } from './empresas-abm.component';

describe('EmpresasAbmComponent', () => {
  let component: EmpresasAbmComponent;
  let fixture: ComponentFixture<EmpresasAbmComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmpresasAbmComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmpresasAbmComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
