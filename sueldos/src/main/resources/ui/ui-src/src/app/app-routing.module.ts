import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { EmpresasComponent }   from './empresas/empresas.component';
import { EmpresasAbmComponent }   from './empresas-abm/empresas-abm.component';

const routes: Routes = [
  { path: '', redirectTo: '/empresas', pathMatch: 'full' },
  { path: 'empresas', component: EmpresasComponent },
  { path: 'empresas/alta', component: EmpresasAbmComponent },
];


@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})

export class AppRoutingModule {}