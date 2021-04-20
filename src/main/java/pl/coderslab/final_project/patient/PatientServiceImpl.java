package pl.coderslab.final_project.patient;

import java.util.Optional;

public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Optional<Patient> findPatientByUser(String username) {
        return patientRepository.findPatientByUser(username);
    }

    @Override
    public Optional<Patient> findPatientByEmail(String email) {
        return patientRepository.findPatientByEmail(email);
    }

    @Override
    public void savePatient(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public void updatePatient(Patient patient) {
        patientRepository.save(patient);
    }
}
