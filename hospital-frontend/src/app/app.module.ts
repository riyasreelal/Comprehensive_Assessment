import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PatientListComponent } from './patient-list/patient-list.component';
import { CreatePatientComponent } from './create-patient/create-patient.component';
import { FormsModule } from '@angular/forms';
import { UpdatePatientComponent } from './update-patient/update-patient.component';
import { PatientDetailsComponent } from './patient-details/patient-details.component';
import { DoctorDetailsComponent } from './doctor-details/doctor-details.component';
import { DoctorListComponent } from './doctor-list/doctor-list.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap'

@NgModule({
  declarations: [
    AppComponent,
    PatientListComponent,
    CreatePatientComponent,
    UpdatePatientComponent,
    PatientDetailsComponent,
    DoctorDetailsComponent,
    DoctorListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
