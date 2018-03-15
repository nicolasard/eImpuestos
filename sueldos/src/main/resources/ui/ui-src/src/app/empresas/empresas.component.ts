import { Component, OnInit } from '@angular/core';
import { Empresa } from '../empresa';
import { EmpresasService } from '../empresas.service';

@Component({
  selector: 'app-empresas',
  templateUrl: './empresas.component.html',
  styleUrls: ['./empresas.component.css']
})

export class EmpresasComponent implements OnInit {

  empresas: Empresa[];
  

  constructor(private empresaService: EmpresasService) { }

  ngOnInit() {
    this.getEmpresas();
    console.log(this.empresas);
  }


  getEmpresas(): void {
    this.empresaService.getEmpresas()
    .subscribe(heroes => this.empresas = heroes);
  }

}
