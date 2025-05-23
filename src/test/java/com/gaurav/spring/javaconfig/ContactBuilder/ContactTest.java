package com.gaurav.spring.javaconfig.ContactBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class ContactTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testBuilderCreatesCorrectContact() {
    	
    	Contact contact= new Contact.ContactBuilder()
    			.setName("Gaurav")
    			.setEmail("ramolegaurav9@gmail.com")
    			.setAddress("plot no 45 lokmanya tilak nagar")
    			.setPhone("9423494096")
    			.build();
    	
        assertEquals("Gaurav", contact.getName());
        assertEquals("ramolegaurav9@gmail.com", contact.getEmail());
        assertEquals("plot no 45 lokmanya tilak nagar", contact.getAddress());
        assertEquals("9423494096", contact.getPhone());
    }
    
    @Test
    public void testCloneContact() {
    	
    	Contact original= new Contact.ContactBuilder()
    			.setName("Gaurav")
    			.setEmail("ramolegaurav9@gmail.com")
    			.setAddress("plot no 45 lokmanya tilak nagar")
    			.setPhone("9423494096")
    			.build();
    	
    	Contact clonedContact=original.clone();
        assertEquals(original.getName(), clonedContact.getName());
        assertEquals(original.getEmail(), clonedContact.getEmail());
        assertEquals(original.getAddress(), clonedContact.getAddress());
        assertEquals(original.getPhone(), clonedContact.getPhone());
    }
}
