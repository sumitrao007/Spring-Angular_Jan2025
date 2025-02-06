import { Component } from '@angular/core';

@Component({
  selector: 'app-eventbinding1',
  templateUrl: './eventbinding1.component.html',
  styleUrls: ['./eventbinding1.component.css']
})
export class Eventbinding1Component {

  count:number=0;
  myclass:string='';


  onClick(){
    if(this.count==0){
      console.log("Click Event Occurs....");
      this.count++;
    }   
    
  }

  onImage(){
    console.log("on Image Click...")
  }

  onBtnClick(){
    this.myclass="bgClass";
  }

  onSend(myname:any){
    console.log(myname)
    console.log("Data is "+myname.value)
    myname.style.background='green';
    myname.style.color='white'
  }

  onSend1(value1:string){
    console.log("Data is "+value1);
  }




}
