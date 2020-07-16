package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(min=1, max=500, message="Field cannot be blank, maximum 100 characters")
    private String description;

    public Skill(@Size(min=1, max=500, message="Field cannot be blank, maximum 100 characters")String description) {
        this.description = description;
    }

    public Skill() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}