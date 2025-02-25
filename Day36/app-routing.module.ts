import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SignupComponent } from './signup/signup.component';
import { LoginComponent } from './login/login.component';
import { NotfoundComponent } from './notfound/notfound.component';
import { HomeComponent } from './home/home.component';
import { EmpdetailsComponent } from './empdetails/empdetails.component';
import { AddempComponent } from './addemp/addemp.component';

const routes: Routes = [
    {
        path:"",component:LoginComponent
    },
    {
      path:"signup" , component:SignupComponent
    },
    {
      path:"home",component:HomeComponent
    },
    {
      path:"empDetails/:id",component:EmpdetailsComponent
    },
    {
      path:"addemp",component:AddempComponent
    },
    {
      path:"**",component:NotfoundComponent
    }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
