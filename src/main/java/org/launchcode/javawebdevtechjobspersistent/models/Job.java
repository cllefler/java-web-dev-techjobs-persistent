package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    @Valid
    @NotNull
    @JoinColumn(name = "employerId")
    private Employer employer;
    private String skills;

    public Job() {
    }

    public Job(Employer employer, String someSkills) {
        this.employer = employer;
        this.skills = someSkills;
    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
