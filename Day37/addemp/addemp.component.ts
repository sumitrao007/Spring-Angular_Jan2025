import { Component, OnInit } from '@angular/core';
import { Employee } from '../model/employee';
import { HttpService } from '../http.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-addemp',
  templateUrl: './addemp.component.html',
  styleUrls: ['./addemp.component.css']
})
export class AddempComponent implements OnInit {
  addData:Employee=<Employee>{};
  allCountry:any[]=[];
  isUpdate:boolean=false;

  constructor(private service:HttpService,
              private router:Router,
              private route:ActivatedRoute
  ){}


  ngOnInit(): void {
    this.getAllCountryFromBackend();
    this.getDataFromUrl();
  }

  getDataFromUrl(){
    this.route.paramMap
    .subscribe((param:any)=>{
      // console.log(param.get("id"));      
      if(param.get("id")!=null){
        this.isUpdate=true;
        this.getDataFromBackend(param.get("id"))
      }
      

    })
  }
  getDataFromBackend(id:any){
    this.service.getParticularRecordById(id)
    .subscribe((response:any)=>{
      console.log(response);
      this.addData=response;
    })
  }

  getAllCountryFromBackend(){
    this.service.getAllCountry()
    .subscribe((resposne:any)=>{
      this.allCountry=resposne;
    })
  }

  onSubmit(){

    if(this.isUpdate){
      // Update a Record

      this.addData.updatedDate=Date.now();
      this.addData.updatedBy="admin";
      this.service.updateEmpData(this.addData)
      .subscribe((response)=>{
        this.router.navigate(['/home']);
      });

    }else{
      // Add a new Record 
      this.addData.createdDate=Date.now();
      this.addData.updatedDate=Date.now();
      this.addData.createdBy="admin",
      this.addData.updatedBy="admin";
     
      this.service.postEmpData(this.addData)
      .subscribe((response:any)=>{
        console.log(response)
        this.router.navigate(['/home']);
      });
    }

   


  }

  

}
