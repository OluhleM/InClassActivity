package za.co.shinysneakers.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HomeAddress {
    @Id
    protected Long addressID;
    protected short streetNumber;
    protected String streetName;
    protected String suburb;
    protected String city;
    protected String province;
    protected String country;
    protected short postalCode;

    protected HomeAddress() {}

    private HomeAddress(Builder builder) {
        this.addressID = builder.addressID;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.suburb = builder.suburb;
        this.city = builder.city;
        this.province = builder.province;
        this.country = builder.country;
        this.postalCode = builder.postalCode;
    }

    public Long getAddressID() {
        return addressID;
    }

    public short getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getCountry() {
        return country;
    }

    public Short getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return "HomeAddress{" +
                "addressID=" + addressID +
                ", streetNumber=" + streetNumber +
                ", streetName='" + streetName + '\'' +
                ", suburb='" + suburb + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }

    public static class Builder {
        private Long addressID;
        private short streetNumber;
        private String streetName;
        private String suburb;
        private String city;
        private String province;
        private String country;
        private short postalCode;


        public Builder setAddressID(Long addressID) {
            this.addressID = addressID;
            return this;
        }

        public Builder setStreetNumber(short streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setSuburb(String suburb) {
            this.suburb = suburb;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setProvince(String province) {
            this.province = province;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setPostalCode(short postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder copy(HomeAddress HomeAddress) {
            this.addressID = HomeAddress.addressID;
            this.streetNumber = HomeAddress.streetNumber;
            this.streetName = HomeAddress.streetName;
            this.suburb = HomeAddress.suburb;
            this.city = HomeAddress.city;
            this.province = HomeAddress.province;
            this.country = HomeAddress.country;
            this.postalCode = HomeAddress.postalCode;
            return this;
        }
        public HomeAddress build() {
            return new HomeAddress(this);
        }
    }
}
