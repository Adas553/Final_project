package pl.coderslab.final_project.patient;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Optional<Patient> findPatientByUser(String username) {
        return patientRepository.findPatientByUserName(username);
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
