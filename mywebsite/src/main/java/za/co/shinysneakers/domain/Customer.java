package za.co.shinysneakers.domain;

import jakarta.persistence.*;

import java.util.Locale;

@Entity
public class Customer {
    @Id
    private String customerID;
    private String firstName;
    private String lastName;
    private String mobile;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressID")
    private HomeAddress homeAddress;

    protected Customer(){
    }

    private Customer(Builder builder){
        this.customerID = builder.customerID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.mobile = builder.mobile;
        this.email = builder.email;
        this.homeAddress = builder.homeAddress;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public HomeAddress getHomeAddress() {return homeAddress;}

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", homeAddress=" + homeAddress +
                '}';
    }
    public static class Builder {
        private String customerID;
        private String firstName;
        private String lastName;
        private String mobile;
        private String email;
        private HomeAddress homeAddress;


        public Builder setCustomerID(String customerID) {
            this.customerID = customerID;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder setHomeAddress(HomeAddress homeAddress) {
            this.homeAddress = homeAddress;
            return this;
        }

        public Builder copy(Customer customer) {
            this.customerID = customer.customerID;
            this.firstName = customer.firstName;
            this.lastName = customer.lastName;
            this.mobile = customer.mobile;
            this.email = customer.email;
            this.homeAddress = customer.homeAddress;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}
