import { Component, OnInit } from '@angular/core';
import { Empresa } from '../empresa';

@Component({
  selector: 'app-empresas-abm',
  templateUrl: './empresas-abm.component.html',
  styleUrls: ['./empresas-abm.component.css']
})
export class EmpresasAbmComponent implements OnInit {

  empre = new Empresa();

  constructor() { }

  ngOnInit() {
  }

  submitted = false;

  onSubmit() { this.submitted = true; }  

  get diagnostic() { return JSON.stringify(this.empre); }

}
