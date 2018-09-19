package polyForm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class userForm {
  
  public static void printForm(List<Field> form) {
    System.out.println();
    System.out.println("------------- SIGN UP FORM ------------");
    for (Field field : form) {
      System.out.println(field.displayLabel() + field.displayValue());
    }    
  }
  
  public static void main(String[] args) {
//    Field myField = new Field("Sample Field");
//    
//    System.out.println(myField.getFieldDefinition());
//    
//    System.out.println(myField.displayLabel());
//    Field myField2 = new Field("Another short Label");
//    System.out.println(myField2.displayLabel());
    
    TextField name = new TextField("Name");
    name.setDefaultValue("Full Name");
    name.setValue("Halil Aslan");
    
    System.out.println(name.getFieldDefinition());
    System.out.println(name.displayLabel() + name.displayValue());
    
    TextField company = new TextField("Company");
    company.setDefaultValue("Company Name");
    //name.setValue("Halil Aslan");
    System.out.println(company.displayLabel() + company.displayValue());
    
    System.out.println("------------- SIGN UP FORM ------------");
    
    List<Field> signUpForm = new ArrayList<>();
    signUpForm.add(name);
    signUpForm.add(company);
    
    for (Field field : signUpForm) {
      System.out.println(field.getFieldDefinition());
    }
    
    printForm(signUpForm);
    
    
  }
}
