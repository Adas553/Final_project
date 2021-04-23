package pl.coderslab.final_project.patient;

public class PatientDto {

    private String email;
    private String gender;
    private int age;
    private String chronicDiseases;
    private String drugs;
    private boolean smoke;
    private String diseasesOfRelatives;
    private String medicalHistory;

    public PatientDto(String email, String gender, int age, String chronicDiseases, String drugs, boolean smoke, String diseasesOfRelatives, String medicalHistory) {
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.chronicDiseases = chronicDiseases;
        this.drugs = drugs;
        this.smoke = smoke;
        this.diseasesOfRelatives = diseasesOfRelatives;
        this.medicalHistory = medicalHistory;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getChronicDiseases() {
        return chronicDiseases;
    }

    public String getDrugs() {
        return drugs;
    }

    public boolean isSmoke() {
        return smoke;
    }

    public String getDiseasesOfRelatives() {
        return diseasesOfRelatives;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }
}
