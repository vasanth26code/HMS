import { Component, OnInit } from '@angular/core';
import { Doctor } from '../doctor';
import { DoctorService } from '../doctor.service';

@Component({
  selector: 'app-listofevery',
  templateUrl: './listofevery.component.html',
  styleUrls: ['./listofevery.component.css']
})
export class ListofeveryComponent implements OnInit {

  doctors!: Doctor[];

  id!: number;
  putDoctorId!: number;

  constructor(private doctorService: DoctorService) { }

  ngOnInit(): void {
    this.getDoctors();
  }

  private getDoctors(){
    this.doctorService.getDoctorsList().subscribe(data => {
      this.doctors = data;
      
      //console.log(this.doctors);
    });

    // onSubmit(){
    //   // console.log(this.patient);
    //   // this.savePatient();
  
    //  }

  //  showDoctor(){
  //     this.doctorService.getDoctorById(this.putDoctorId).subscribe(data =>{
  //       console.log(data);
  //     },
  //     error => console.log(error));
      
  //   }
  // }

  // viewProfile(id: number){
  //   console.log(this.doctors);
  //    this.showDoctor;
  //  }

}
}


