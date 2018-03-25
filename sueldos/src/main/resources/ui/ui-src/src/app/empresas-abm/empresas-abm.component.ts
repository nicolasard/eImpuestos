import { Component, OnInit } from '@angular/core';
import { Empresa } from '../empresa';
import { EmpresasService } from '../empresas.service';

@Component({
  selector: 'app-empresas-abm',
  templateUrl: './empresas-abm.component.html',
  styleUrls: ['./empresas-abm.component.css']
})
export class EmpresasAbmComponent implements OnInit {

  empre = new Empresa();

  constructor(private empresaService: EmpresasService) { }

  ngOnInit() {
  }

  save(): void {
    console.log("saving...");
    this.empresaService.addEmpresa(this.empre).subscribe(data => this.empre = data);
  }

  get diagnostic() { return JSON.stringify(this.empre); }

}
