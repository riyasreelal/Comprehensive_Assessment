import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreatePatientComponent } from './create-patient/create-patient.component';
import { DoctorDetailsComponent } from './doctor-details/doctor-details.component';
import { DoctorListComponent } from './doctor-list/doctor-list.component';
import { PatientDetailsComponent } from './patient-details/patient-details.component';
import { PatientListComponent } from './patient-list/patient-list.component';
import { UpdatePatientComponent } from './update-patient/update-patient.component';

const routes: Routes = [
  {path: 'patients', component:PatientListComponent},
  {path: 'create-patient', component:CreatePatientComponent},
  {path: '', redirectTo: 'patients',pathMatch:'full'},
  {path: 'update-patient/:id',component: UpdatePatientComponent},
  {path: 'patient-details/:id', component: PatientDetailsComponent},
  {path: 'doctors', component: DoctorListComponent},
  {path: 'doctor-details/:id', component: DoctorDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
