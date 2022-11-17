/**
 * 
 */
package com.bits.assignment.universalt10.doctor.doctoralertservice.service;

import java.util.List;

import com.bits.assignment.universalt10.doctor.doctoralertservice.model.PatientData;
import com.bits.assignment.universalt10.doctor.doctoralertservice.model.PatientReport;

/**
 * @author Vicky
 *
 */
public interface DoctorAlertService {

	PatientReport updatePatientReport(PatientReport patientReport, String id) throws Exception;

	void deletePatientReport(String id) throws Exception;

	List<PatientReport> getAllPatientReport() throws Exception;

	List<PatientReport> getPatientReportByPatientName(String patientName) throws Exception;

	List<PatientReport> getPatientReportByPatientId(String patientId) throws Exception;

	PatientReport getPatientReportByReportId(String reportId) throws Exception;

	PatientReport getPatientReportById(String id) throws Exception;

	List<PatientReport> getAllPatientReportByDoctorId(String doctorId) throws Exception;

	List<PatientReport> getAllPatientReportByHospitalName(String hospitalName) throws Exception;

	PatientReport createPatientReport(PatientData data) throws Exception;

}
