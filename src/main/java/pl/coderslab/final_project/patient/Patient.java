package pl.coderslab.final_project.patient;


import pl.coderslab.final_project.security.User;

import javax.persistence.*;

@Entity(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private long id;

//    @Column(name = "user_id")
    @OneToOne
    private User user;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "email")
    private String email;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private int age;

    @Column(name = "chronic_diseases")
    private String chronicDiseases;

    @Column(name = "drugs")
    private String drugs;

    @Column(name = "smoke")
    private boolean smoke;

    @Column(name = "medical_history")
    private String medicalHistory;

    @Column(name = "diseases_of_relatives")
    private String diseasesOfRelatives;

    public Patient() {
    }

    public Patient(long id, User user,String userName, String email, String gender, int age, String chronicDiseases,
                   String drugs, boolean smoke, String medicalHistory, String diseasesOfRelatives) {
        this.id = id;
        this.user = user;
        this.userName = userName;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.chronicDiseases = chronicDiseases;
        this.drugs = drugs;
        this.smoke = smoke;
        this.medicalHistory = medicalHistory;
        this.diseasesOfRelatives = diseasesOfRelatives;
    }

    public Patient(String userName) {
        this.userName = userName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getDiseasesOfRelatives() {
        return diseasesOfRelatives;
    }

    public void setDiseasesOfRelatives(String diseasesOfRelatives) {
        this.diseasesOfRelatives = diseasesOfRelatives;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", chronicDiseases='" + chronicDiseases + '\'' +
                ", drugs='" + drugs + '\'' +
                ", smoke=" + smoke +
                ", medicalHistory='" + medicalHistory + '\'' +
                ", diseasesOfRelatives='" + diseasesOfRelatives + '\'' +
                '}';
    }
}
