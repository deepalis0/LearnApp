package com.ms.learnapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.List;

/**
 * A Course.
 */
@Document(collection = "course")
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @NotNull
    @Field("course_name")
    private String courseName;

    @NotNull
    @Field("sme_skills")
    private List<String> smeSkills;

    @Field("course_smes")
    private List<String> courseSMEs;

    @Field("pre_requisites")
    private String preRequisites;

    @NotNull
    @Field("smePoints")
    private Integer smePoints;

    @Field("participantPoints")
    private Integer participantPoints;

    @Field("image_path")
    private String imagePath;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public Course courseName(String courseName) {
        this.courseName = courseName;
        return this;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<String> getSmeSkills() {
        return smeSkills;
    }

    public Course smeSkills(List<String> smeSkills) {
        this.smeSkills = smeSkills;
        return this;
    }

    public void setSmeSkills(List<String> smeSkills) {
        this.smeSkills = smeSkills;
    }

    public String getPreRequisites() {
        return preRequisites;
    }

    public Course preRequisites(String preRequisites) {
        this.preRequisites = preRequisites;
        return this;
    }

    public void setPreRequisites(String preRequisites) {
        this.preRequisites = preRequisites;
    }

    public Course smePoints(Integer smePoints) {
        this.smePoints = smePoints;
        return this;
    }

    public Course participantPoints(Integer participantPoints) {
        this.participantPoints = participantPoints;
        return this;
    }

    public String getImagePath() {
        return imagePath;
    }

    public Course imagePath(String imagePath) {
        this.imagePath = imagePath;
        return this;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Course)) {
            return false;
        }
        return id != null && id.equals(((Course) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Course{" +
            "id=" + getId() +
            ", courseName='" + getCourseName() + "'" +
            ", smeSkills='" + getSmeSkills() + "'" +
            ", courseSMEs='" + getCourseSMEs() + "'" +
            ", preRequisites='" + getPreRequisites() + "'" +
            ", smePoints=" + getSmePoints() +
            ", participantPoints=" + getParticipantPoints() +
            ", imagePath='" + getImagePath() + "'" +
            "}";
    }

    public Integer getSmePoints() {
        return smePoints;
    }

    public void setSmePoints(Integer smePoints) {
        this.smePoints = smePoints;
    }

    public Integer getParticipantPoints() {
        return participantPoints;
    }

    public void setParticipantPoints(Integer participantPoints) {
        this.participantPoints = participantPoints;
    }

    public List<String> getCourseSMEs() {
        return courseSMEs;
    }

    public void setCourseSMEs(List<String> courseSMEs) {
        this.courseSMEs = courseSMEs;
    }

    public Course courseSMEs(List<String> courseSMEs) {
        this.courseSMEs = courseSMEs;
        return this;
    }

}
