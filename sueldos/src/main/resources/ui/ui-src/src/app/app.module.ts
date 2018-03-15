import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
//import { HttpModule } from '@angular/http';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { EmpresasComponent } from './empresas/empresas.component';
import { EmpresasService } from './empresas.service';

@NgModule({
  declarations: [
    AppComponent,
    EmpresasComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [EmpresasService],
  bootstrap: [AppComponent]
})
export class AppModule { }
