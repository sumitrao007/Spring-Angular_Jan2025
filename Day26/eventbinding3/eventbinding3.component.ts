import { Component } from '@angular/core';

@Component({
  selector: 'app-eventbinding3',
  templateUrl: './eventbinding3.component.html',
  styleUrls: ['./eventbinding3.component.css']
})
export class Eventbinding3Component {
name:string='';
  onChange(){
    if(this.name.length>6){
      console.log("Change Event Occur...");
      alert("U entered charcter is exceeed by 6 charter");
    }
    
  }

  onChange1(myname:string){
    if(myname.length>6){
      console.log("Change Event Occur...");
      alert("U entered charcter is exceeed by 6 charter");
    }
  }


}
