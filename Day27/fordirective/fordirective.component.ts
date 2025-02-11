import { Component } from '@angular/core';

@Component({
  selector: 'app-fordirective',
  templateUrl: './fordirective.component.html',
  styleUrls: ['./fordirective.component.css']
})
export class FordirectiveComponent {

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
  selected:string='';

  onMouseOver(item:any){
    console.log("Mouse Over Event Occur...")
    
    this.selected=item.name;
  }

  onMouseOut(){
    this.selected='';
  }

}
