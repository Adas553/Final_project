package pl.coderslab.final_project.patient;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import pl.coderslab.final_project.security.User;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class PatientDto {

    private Long id = 0L;

    @NotNull
    private String userName;

    @Email
    private String email;

    private User user;

    private String gender;

    @Range(min = 0, max = 150)
    private int age;

    @Length(max = 140)
    private String chronicDiseases;

    @Length(max = 140)
    private String drugs;

    private boolean smoke;

    @Length(max = 140)
    private String diseasesOfRelatives;

    @Length(max = 140)
    private String medicalHistory;

    public PatientDto(Long id, String userName, String email, User user, String gender, int age,
                      String chronicDiseases, String drugs, boolean smoke, String diseasesOfRelatives, String medicalHistory) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.user = user;
        this.gender = gender;
        this.age = age;
        this.chronicDiseases = chronicDiseases;
        this.drugs = drugs;
        this.smoke = smoke;
        this.diseasesOfRelatives = diseasesOfRelatives;
        this.medicalHistory = medicalHistory;
    }

    public PatientDto(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public PatientDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getChronicDiseases() {
        return chronicDiseases;
    }

    public void setChronicDiseases(String chronicDiseases) {
        this.chronicDiseases = chronicDiseases;
    }

    public String getDrugs() {
        return drugs;
    }

    public void setDrugs(String drugs) {
        this.drugs = drugs;
    }

    public boolean isSmoke() {
        return smoke;
    }

    public void setSmoke(boolean smoke) {
        this.smoke = smoke;
    }

    public String getDiseasesOfRelatives() {
        return diseasesOfRelatives;
    }

    public void setDiseasesOfRelatives(String diseasesOfRelatives) {
        this.diseasesOfRelatives = diseasesOfRelatives;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
}