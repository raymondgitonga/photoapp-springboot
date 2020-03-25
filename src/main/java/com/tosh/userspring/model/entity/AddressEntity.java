package com.tosh.userspring.model.entity;


import com.tosh.userspring.shared.dto.UserDto;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "addresses")
public class AddressEntity implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id;

    @Column(length = 35, nullable = false)
    private String addressId;

    @Column(length = 35, nullable = false)
    private String city;

    @Column(length = 35, nullable = false)
    private String country;

    @Column(length = 35, nullable = false)
    private String postalCode;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private UserDto userDetails;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public UserDto getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDto userDetails) {
        this.userDetails = userDetails;
    }
}
