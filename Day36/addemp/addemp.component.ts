import { Component, OnInit } from '@angular/core';
import { Employee } from '../model/employee';
import { HttpService } from '../http.service';

@Component({
  selector: 'app-addemp',
  templateUrl: './addemp.component.html',
  styleUrls: ['./addemp.component.css']
})
export class AddempComponent implements OnInit {
  addData:Employee=<Employee>{};
  allCountry:any[]=[];

  constructor(private service:HttpService){}


  ngOnInit(): void {
    this.getAllCountryFromBackend();
  }

  getAllCountryFromBackend(){
    this.service.getAllCountry()
    .subscribe((resposne:any)=>{
      this.allCountry=resposne;
    })
  }

  onSubmit(){

  }

  

}
