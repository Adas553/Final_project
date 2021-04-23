package pl.coderslab.final_project.patient;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface PatientService {

    Optional<PatientDto> findPatientByUser(String username);
    Optional<PatientDto> findPatientByEmail(String email);
    void savePatient(PatientDto patientDto);
    void updatePatient(PatientDto patientDto);
}
