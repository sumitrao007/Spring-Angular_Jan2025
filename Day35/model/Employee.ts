export interface Employees{
    id:number,
    name:string,
    department:string,
    status:string,
    mobileno:string,
    emailid:string,
    country:{
        cid:number,
        cname:string
    }
    createdDate:number,
    createdBy:string|null,
    updatedDate:number,
    updatedBy:string|null,
    salary:number  

}