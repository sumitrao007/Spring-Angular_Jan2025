import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { HttpService } from '../http.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

    constructor(private service:HttpService,
                private router:Router
    ){}

  EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
  + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

  backendResponse:string='';

  onSubmit(loginForm:NgForm){
    // Call API 

    this.service.login(loginForm.value)
    .subscribe((response:any)=>{
      console.log(response);
      if(response.msg=='Valid User'){
        // alert("Login success")
          this.router.navigate(['/home']);

      }else{
        this.backendResponse=response.msg;
      }

    })


  }
  
}
