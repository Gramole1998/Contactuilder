package com.gaurav.spring.javaconfig.ContactBuilder;

public class Contact implements Cloneable {
	 private String name;
	    private String email;
	    private String phone;
	    private String address;

	    private Contact(ContactBuilder builder) {
	        this.name = builder.name;
	        this.email = builder.email;
	        this.phone = builder.phone;
	        this.address = builder.address;
	    }

	    @Override
	    public Contact clone() {
	        try {
	            return (Contact) super.clone();
	        } catch (CloneNotSupportedException e) {
	            throw new RuntimeException("Clone not supported", e);
	        }
	    }

	    @Override
	    public String toString() {
	        return "Contact{name='" + name + "', email='" + email + "', phone='" + phone + "', address='" + address + "'}";
	    }

	   
	    public static class ContactBuilder {
	        private String name;
	        private String email;
	        private String phone;
	        private String address;

	        public ContactBuilder setName(String name) {
	            this.name = name;
	            return this;
	        }

	        public ContactBuilder setEmail(String email) {
	            this.email = email;
	            return this;
	        }

	        public ContactBuilder setPhone(String phone) {
	            this.phone = phone;
	            return this;
	        }

	        public ContactBuilder setAddress(String address) {
	            this.address = address;
	            return this;
	        }

	        public Contact build() {
	            return new Contact(this);
	        }
	    }


		public String getName() {
			// TODO Auto-generated method stub
			return this.name;
		}
		public String getEmail() {
			// TODO Auto-generated method stub
			return this.email;
		}

		public String getAddress() {
			// TODO Auto-generated method stub
			return this.address;
		}
		public String getPhone() {
			// TODO Auto-generated method stub
			return this.phone;
		}

}
