package pl.coderslab.final_project.patient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.coderslab.final_project.patient.Patient;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    @Query("SELECT p FROM patients p JOIN p.user WHERE p.user.userName = :userName")
    Optional<Patient> findPatientByUserName(@Param("userName") String username);

    @Query("SELECT p FROM patients p JOIN p.user WHERE p.user.email = :email")
    Optional<Patient> findPatientByEmail(@Param("email") String email);
}
