import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Patients } from './patients';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'hospital-frontend';
  public id: number;
  patient: Patients;
  router: Router;

  patientDetails(id: number){
    this.router.navigate(['patient-details',id]);
  }
}
