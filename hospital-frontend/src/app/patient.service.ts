import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Patients } from './patients'
@Injectable({
  providedIn: 'root'
})
export class PatientService {

  private baseURL ="http://localhost:52953/api/v1/patients";
  constructor(private httpClient: HttpClient) { }

  getPatientsList(): Observable<Patients[]>{
    return this.httpClient.get<Patients[]>(`${this.baseURL}`);
  }


  createPatient(patient: Patients): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`,patient);
  }

  getPatientById(id : number): Observable<Patients>{
    return this.httpClient.get<Patients>(`${this.baseURL}/${id}`);
  }

  updatePatient(id: number,patient: Patients): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${id}`,patient);
  }

  deletePatient(id: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${id}`);
  }
}
