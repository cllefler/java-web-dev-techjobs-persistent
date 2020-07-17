package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @Size(min=1, max=100, message="Field cannot be blank, maximum 100 characters")
    private String location;

    public Employer(@Size(min=1, max=100, message="Field cannot be blank, maximum 100 characters")String location) {
        this.location = location;
    }

    @OneToMany(mappedBy = "employer")
    private final List<Job> jobs = new ArrayList<>();

    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    @Override
    public String toString() {
        return location;
    }
}
