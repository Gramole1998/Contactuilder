package com.gaurav.spring.javaconfig.ContactBuilder;

/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {
    	 Contact contact1 = new Contact.ContactBuilder()
                 .setName("Gaurav")
                 .setEmail("Gaurav@98.com")
                 .setPhone("8459774127")
                 .setAddress("45 lokmanya tilak nagar")
                 .build();

         System.out.println("Original Contact: " + contact1);
         System.out.println(contact1);         
         Contact clonedContact = contact1.clone();
         System.out.println("Cloned Contact: " + clonedContact);
         System.out.println(clonedContact);
    }
}
