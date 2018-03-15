import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { Empresa } from './empresa';



@Injectable()
export class EmpresasService {

    private empresasURL = 'http://localhost:8080/EmpresaController?nameBusqueda=12&pagina=234&maxPorPagina=234'; 

    constructor(
        private http: HttpClient) { }

    getEmpresas (): Observable<Empresa[]> {
        return this.http.get<Empresa[]>(this.empresasURL)
    }
}