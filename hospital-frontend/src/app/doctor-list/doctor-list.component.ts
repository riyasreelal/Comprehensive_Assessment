import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { DoctorService } from '../doctor.service';
import { Doctors } from '../doctors';

@Component({
  selector: 'app-doctor-list',
  templateUrl: './doctor-list.component.html',
  styleUrls: ['./doctor-list.component.css']
})
export class DoctorListComponent implements OnInit {

  doctors: Doctors[];
  
  constructor(private doctorService: DoctorService, private router: Router) { }

  ngOnInit(): void {
    this.getDoctors();

  }

  private getDoctors(){
    this.doctorService.getDoctorsList().subscribe(data =>{
      this.doctors=data;
    });
  }

  doctorDetails(id: number){
    this.router.navigate(['doctor-details',id]);
  }

}
