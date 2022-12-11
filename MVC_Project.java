package com.mycompany.mvc_project;
public class MVC_Project {

    public static void main(String[] args) {
        
        //mengambil data person database
        Person model = retrivePersonFromDatabase();
        
        //membuat view untuk menulis nama person baru di console
        PersonView view = new PersonView();
        
        PersonController controller = new PersonController(model, view);
        
        controller.updateView();
        
        //mengupdate model data
        controller.setPersonName("Dian");
        System.out.println("\n Person Details after updating: ");
        
        controller.updateView();
    }
    
    private static Person retrivePersonFromDatabase(){
        Person Person = new Person();
        Person.setName("Andriani");
        Person.setAge("21");
        return Person;
    }
      
}
