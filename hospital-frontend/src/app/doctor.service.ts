import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Doctors } from './doctors';

@Injectable({
  providedIn: 'root'
})
export class DoctorService {

  constructor(private httpClient: HttpClient) { }
  private baseURL ="http://localhost:52953/api/v1/doctors";
 

  getDoctorsList(): Observable<Doctors[]>{
    return this.httpClient.get<Doctors[]>(`${this.baseURL}`);
  }


  getDoctorById(id : number): Observable<Doctors>{
    return this.httpClient.get<Doctors>(`${this.baseURL}/${id}`);
  }
  

}

