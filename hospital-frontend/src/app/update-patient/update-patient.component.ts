import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { PatientService } from '../patient.service';
import { Patients } from '../patients';

@Component({
  selector: 'app-update-patient',
  templateUrl: './update-patient.component.html',
  styleUrls: ['./update-patient.component.css']
})
export class UpdatePatientComponent implements OnInit {

  id: number;
  patient: Patients= new Patients();
  constructor(private patientService: PatientService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.id= this.route.snapshot.params['id'];

    this.patientService.getPatientById(this.id).subscribe(data =>{
      this.patient=data;      
    },error => console.log(error));
  }

  updatePatient(){
    this.patientService.updatePatient(this.id, this.patient).subscribe(data =>{
      console.log(data);
      this.patient= new Patients();
      this.gotoList();
    }, error => console.log(error));
  }

  onSubmit(){
    this.updatePatient();
  }

  gotoList(){
    this.router.navigate(['/patients']);
  }

}
