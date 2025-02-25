import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HttpService } from '../http.service';
import { Employee } from '../model/employee';

@Component({
  selector: 'app-empdetails',
  templateUrl: './empdetails.component.html',
  styleUrls: ['./empdetails.component.css']
})
export class EmpdetailsComponent implements OnInit
{
  empobj:Employee=<Employee>{};

  constructor(private route:ActivatedRoute,
              private service:HttpService){}

  ngOnInit(): void {
    this.getDataFromUrl();
  }

  getDataFromUrl(){
      this.route.paramMap
      .subscribe((param:any)=>{
        // console.log(param.get("id"))
        this.getDataFromBackend(param.get("id"))
      })
  }

  getDataFromBackend(id:any){
    this.service.getParticularRecordById(id)
    .subscribe((response:any)=>{
      // console.log(response);
      this.empobj=response;
    })
  }


  OnUpdate(){
    
  }

}
