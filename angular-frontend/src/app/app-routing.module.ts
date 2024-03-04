import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateDoctorComponent } from './create-doctor/create-doctor.component';
import { DoctorListComponent } from './doctor-list/doctor-list.component';
import { CreatePatientComponent } from './create-patient/create-patient.component';
import { HomeComponent } from './home/home.component';
import { ListofeveryComponent } from './listofevery/listofevery.component';
import { PatientListComponent } from './patient-list/patient-list.component';
const routes: Routes = [
  {path:'doctors',component:DoctorListComponent},
  {path:'create-doctor',component:CreateDoctorComponent},

  {path:'home',component:HomeComponent},
  {path:'listofevery',component:ListofeveryComponent},
  {path:'', redirectTo:'home',pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
