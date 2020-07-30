package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
//    @Valid
//    @NotNull
    @JoinColumn(name = "employerId")
    private Employer employer;

    @ManyToMany
//    @Valid
//    @NotNull
    @JoinColumn(name = "skillId")
    private List<Skill> skills = new ArrayList<>();

    public Job() {
    }

    public Job(Employer employer, List<Skill> skills) {
        this.employer = employer;
        this.skills = (List<Skill>) skills;
    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) { this.employer = employer; }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Skill skills) {
        this.skills = (List<Skill>) skills;
    }

    public void addSkills(List<Skill> skills) {
        this.skills.add((Skill) skills);
    }
}
