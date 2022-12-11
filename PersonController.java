package com.mycompany.mvc_project;
class PersonController {
    
    //deklarasi model dan view
    private final Person model;
    private final PersonView view;
    
    //inisiasi konstruktor
    public PersonController(Person model, PersonView view){
        this.model = model;
        this.view = view;
    }
    
    //membuat method getter dan setter
    public void setPersonName(String name){
        model.setName(name);
    }
    
    public String getPersonName(){
        return model.getName();
    }
    
        public void setPersonAge(String age){
        model.setAge(age);
    }
    
    public String getPersonAge(){
        return model.getAge();
    }
    
    
    //method untuk mengupdate view
    public void updateView(){
        view.printPersonDetails(model.getName(), model.getAge());
    }
}
