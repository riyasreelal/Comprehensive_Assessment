import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { DoctorService } from '../doctor.service';
import { Doctors } from '../doctors';

@Component({
  selector: 'app-doctor-details',
  templateUrl: './doctor-details.component.html',
  styleUrls: ['./doctor-details.component.css']
})
export class DoctorDetailsComponent implements OnInit {

  id: number;
  doctor: Doctors;
  constructor(private route: ActivatedRoute, private doctorService:DoctorService) { }

  ngOnInit(): void {
    this.id= this.route.snapshot.params['id'];
    this.doctor= new Doctors();
    this.doctorService.getDoctorById(this.id).subscribe(data=>{
      this.doctor = data;
      
    })
  }

}
