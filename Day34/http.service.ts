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


  
}
