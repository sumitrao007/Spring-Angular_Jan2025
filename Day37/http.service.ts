import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HttpService {

  baseUrl:string='http://localhost:8080/api/';
  

  constructor(private http:HttpClient) { }

  registerData(obj:any){
   return (this.http.post(`${this.baseUrl}create-user`,obj,{
      responseType:"text"
    }));
  }

  login(obj:any){
   return (this.http.post(`${this.baseUrl}login-user`,obj))
  }

getAllEmpRecord(){
  return (this.http.get(`${this.baseUrl}get-all-employee`))
}

getParticularRecordById(id:any){
   return (this.http.get(`${this.baseUrl}get-particular-record-by-id/${id}`))
}

getAllCountry(){
 return (this.http.get(`${this.baseUrl}getallcountry`));
}


postEmpData(obj:any){
  return (this.http.post(`${this.baseUrl}add-emp`,obj,{
    responseType:"text"
  }));
}

updateEmpData(obj:any){
 return (this.http.put(`${this.baseUrl}update-emp`,obj,{
    responseType:"text"
  }));
}

deleteEmpData(id:any){
 return (this.http.delete(`${this.baseUrl}delete-emp/${id}`,{
    responseType:"text"
  }));
}

  
}
