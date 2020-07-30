package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(min=1, max=500, message="Field cannot be blank, maximum 100 characters")
    private String description;

    public Skill(@Size(min=1, max=500, message="Field cannot be blank, maximum 100 characters")String description) {
        this.description = description;
    }

    @ManyToMany(mappedBy = "skills")
//    @JoinColumn(name = "jobId")
    private final List<Job> jobs = new ArrayList<>();

    public Skill() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    @Override
    public String toString() {
        return description;
    }
}