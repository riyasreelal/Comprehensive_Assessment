import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { PatientService } from '../patient.service';
import { Patients } from '../patients';

@Component({
  selector: 'app-patient-details',
  templateUrl: './patient-details.component.html',
  styleUrls: ['./patient-details.component.css']
})
export class PatientDetailsComponent implements OnInit {

  id: number;
  patient: Patients;
  constructor(private route: ActivatedRoute, private patientService:PatientService) { }

  ngOnInit(): void {
    this.id= this.route.snapshot.params['id'];
    this.patient= new Patients();
    this.patientService.getPatientById(this.id).subscribe(data=>{
      this.patient = data;
      
    })
  }

}
