import { Component } from '@angular/core';

@Component({
  selector: 'app-eventbinding2',
  templateUrl: './eventbinding2.component.html',
  styleUrls: ['./eventbinding2.component.css']
})
export class Eventbinding2Component {

  result:number=0;  
  evenOdd:string='';
  iseven!:boolean;
  name:string='';

  onAddition(num1:any,num2:any){
      let n1=+num1;
      let n2=+num2;
      this.result=n1+n2;
    // this.result=num1+num2;
  }

  onEvenOdd(myvalue:any){
    let n1=+myvalue;

    if(n1%2==0){
      this.evenOdd="number is even";
      this.iseven=true;
    }else{
      this.evenOdd="number is odd";
      this.iseven=false;
    }


  }

}
