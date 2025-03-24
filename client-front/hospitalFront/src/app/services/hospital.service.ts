import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map, Observable } from 'rxjs';
import { Hospital } from '../models/hospital'; // Importamos el modelo
import { HospitalDTO } from '../models/hospital-dto.model';

@Injectable({
  providedIn: 'root',
})
export class HospitalService {
  private apiUrl = 'http://localhost:8080/api/hospitales'; // URL del backend

  constructor(private http: HttpClient) {}

  registrarHospital(hospital: any): Observable<string> {
    return this.http.post(`${this.apiUrl}/registrar`, hospital, {
      responseType: 'text',
    });
  }

  // Obtener un hospital por ID
  public getHospitalById(id: number): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/listar?idHospital=${id}`);
  }

  // Actualizar un hospital
  public actualizarHospital(hospital: Hospital): Observable<any> {
    console.log('Datos enviados al backend:', hospital); // Depuración
    return this.http.put(`${this.apiUrl}/actualizar`, hospital);
  }

  public eliminarHospital(id: number): Observable<any> {
    return this.http.delete<any>(`${this.apiUrl}/eliminar/${id}`);
  }

  listarHospitales(): Observable<Hospital[]> {
    return this.http.get<Hospital[]>(`${this.apiUrl}/listar`);
  }

  public listarDistritos(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/listar-distritos`);
  }

  public listarSedes(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/listar-sedes`);
  }

  public listarGerentes(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/listar-gerentes`);
  }

  public listarCondiciones(): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/listar-condiciones`);
  }
}
