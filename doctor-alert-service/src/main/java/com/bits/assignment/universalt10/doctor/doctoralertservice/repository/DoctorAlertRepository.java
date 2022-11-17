/**
 * 
 */
package com.bits.assignment.universalt10.doctor.doctoralertservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bits.assignment.universalt10.doctor.doctoralertservice.model.PatientReport;

/**
 * @author Vicky
 *
 */
@Repository
public interface DoctorAlertRepository extends MongoRepository<PatientReport, String> {

	List<PatientReport> findByDoctorId(String doctorId);

	List<PatientReport> findByPatientId(String patientId);

	PatientReport findByReportId(String reportId);

	List<PatientReport> findByHospitalName(String hospitalName);

	List<PatientReport> findByPatientName(String patientName);

}
