import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CondicionService {
  private apiUrl = 'http://localhost:8080/api/hospitales';

  constructor(private http: HttpClient) {}

  listarCondiciones(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/listar-condiciones`);
  }
}
