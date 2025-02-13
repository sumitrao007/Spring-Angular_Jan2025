import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-child2',
  templateUrl: './child2.component.html',
  styleUrls: ['./child2.component.css']
})
export class Child2Component {

  @Output() childDateEvent=new EventEmitter();

  @Output() childArrEvent=new EventEmitter();

  @Output() childRangeEvent=new EventEmitter();

  arrProduct:any[]=[
    {
      name:"Motorolla",
      price:30000,
      qty:1
    },
    {
      name:"Realme",
      price:18000,
      qty:1
    },
    {
      name:"Iphone",
      price:120000,
      qty:1
    },
    {
      name:"Samsung",
      price:25000,
      qty:1
    },
    {
      name:"Vivo",
      price:15000,
      qty:1
    }

  ];


  onSend(inputDate:string){
    console.log(inputDate);

    this.childDateEvent.emit(inputDate)
    this.childArrEvent.emit(this.arrProduct);

  }

  onSendRange(rangeValue:any){
    console.log(rangeValue);
    this.childRangeEvent.emit(rangeValue);
  }


}
