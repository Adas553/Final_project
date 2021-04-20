package pl.coderslab.final_project.patient;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface PatientService {

    Optional<Patient> findPatientByUser(String username);
    Optional<Patient> findPatientByEmail(String email);
    void savePatient(Patient patient);
    void updatePatient(Patient patient);
}
