package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location is required")
    @Size(min = 3, max = 150, message = "location must be between 3 and 150 characters")
    private String location;

    public String getLocation() {
        return location;
    }
    public Employer() {}
}
