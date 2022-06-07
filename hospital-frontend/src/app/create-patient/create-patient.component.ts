import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { DoctorService } from '../doctor.service';
import { Doctors } from '../doctors';
import { PatientService } from '../patient.service';
import { Patients } from '../patients';

@Component({
  selector: 'app-create-patient',
  templateUrl: './create-patient.component.html',
  styleUrls: ['./create-patient.component.css']
})
export class CreatePatientComponent implements OnInit {

  patient:Patients=new Patients();
  doctor: Doctors[];
  constructor(private patientService: PatientService, private doctorService: DoctorService, private router:Router) { }

  ngOnInit(): void {
  }

  savePatient(){
    this.patientService.createPatient(this.patient).subscribe(data=>{
      console.log(data);
      this.goToPatientList();
    },
    error => console.log(error))
  }

  goToPatientList(){
    this.router.navigate(['/patients']);
  }

  getdoctorlist(){
    this.doctorService.getDoctorsList().subscribe(data =>{
      this.doctor=data;
    });
  }

  onSubmit(){
    console.log(this.patient);
    this.savePatient();
  }

}
