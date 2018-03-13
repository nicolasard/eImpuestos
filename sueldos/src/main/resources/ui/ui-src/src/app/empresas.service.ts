import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { Empresa } from './empresa';

export class EmpresasService {

    private empresasURL = 'http://localhost:8080/EmpresaController?nameBusqueda=12&pagina=234&maxPorPagina=234'; 

    constructor(
        private http: HttpClient) { }

    getHeroes (): Observable<Empresa[]> {
        return this.http.get<Empresa[]>(this.empresasURL)
        }
}