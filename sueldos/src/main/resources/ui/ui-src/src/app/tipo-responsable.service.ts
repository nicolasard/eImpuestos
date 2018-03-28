import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';
import { catchError, map, tap } from 'rxjs/operators';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/toPromise';
import { tipoResponsable } from './tipoResponsable';

const httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

@Injectable()
export class TipoResponsableService {

  private tipoResponsableURL = 'http://127.0.0.1:8080/TipoResponsableController'; 

  constructor(
    private http: HttpClient) { }

    getEmpresas(): Observable<tipoResponsable[]> {
      console.log('Retriving tipoResponsable...');
      return this.http.get<tipoResponsable[]>(this.tipoResponsableURL);
  }

}
