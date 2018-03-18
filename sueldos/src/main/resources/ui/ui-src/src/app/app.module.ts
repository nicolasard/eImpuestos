import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule }   from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { EmpresasComponent } from './empresas/empresas.component';
import { EmpresasService } from './empresas.service';
import { AppRoutingModule } from './/app-routing.module';
import { EmpresasAbmComponent } from './empresas-abm/empresas-abm.component';

@NgModule({
  declarations: [
    AppComponent,
    EmpresasComponent,
    EmpresasAbmComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [EmpresasService],
  bootstrap: [AppComponent]
})
export class AppModule { }
