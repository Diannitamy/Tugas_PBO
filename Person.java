package com.mycompany.mvc_project;
class Person {
    
    //deklarasi variabel
    private String PersonName;
    private String PersonAge;
    
    
    //definisi method getter dan setter 
    public String getAge(){
        return PersonAge;
    }
    
    public void setAge(String Age){
        this.PersonAge = Age;
    }
    
    public String getName(){
        return PersonName;
    }
    
    public void setName(String Name){
        this.PersonName = Name;
    }
}
