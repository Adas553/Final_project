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
    public Optional<PatientDto> findPatientByUser(String username) {
        return patientRepository.findPatientByUserName(username).map(this::convertToPatientDto);
    }

    @Override
    public Optional<PatientDto> findPatientByEmail(String email) {
        return patientRepository.findPatientByEmail(email).map(this::convertToPatientDto);
    }

    @Override
    public void savePatient(PatientDto patientDto) {
        Patient patient = convertToPatient(patientDto);
        patientRepository.save(patient);
    }

    @Override
    public void updatePatient(PatientDto patientDto) {
        Patient patient = convertToPatient(patientDto);
        patientRepository.save(patient);
    }

    public Patient convertToPatient(PatientDto patientDto) {
        Patient patient = new Patient();

        patient.setId(patientDto.getId());
        patient.setUserName(patientDto.getUserName());
        patient.setEmail(patientDto.getEmail());
        patient.setUser(patientDto.getUser());
        patient.setGender(patientDto.getGender());
        patient.setAge(patientDto.getAge());
        patient.setChronicDiseases(patientDto.getChronicDiseases());
        patient.setDrugs(patientDto.getDrugs());
        patient.setSmoke(patientDto.isSmoke());
        patient.setDiseasesOfRelatives(patientDto.getDiseasesOfRelatives());
        patient.setMedicalHistory(patientDto.getMedicalHistory());

        return patient;
    }

    public PatientDto convertToPatientDto(Patient patient) {
        PatientDto patientDto = new PatientDto(
                patient.getId(),
                patient.getUserName(),
                patient.getEmail(),
                patient.getUser(),
                patient.getGender(),
                patient.getAge(),
                patient.getChronicDiseases(),
                patient.getDrugs(),
                patient.isSmoke(),
                patient.getDiseasesOfRelatives(),
                patient.getMedicalHistory()
        );
        return patientDto;
    }
}
