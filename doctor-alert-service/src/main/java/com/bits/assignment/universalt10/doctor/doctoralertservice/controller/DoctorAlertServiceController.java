/**
 * 
 */
package com.bits.assignment.universalt10.doctor.doctoralertservice.controller;

import java.util.List;

import org.apache.logging.log4j.message.SimpleMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bits.assignment.universalt10.doctor.doctoralertservice.model.PatientData;
import com.bits.assignment.universalt10.doctor.doctoralertservice.model.PatientReport;
import com.bits.assignment.universalt10.doctor.doctoralertservice.service.DoctorAlertService;

/**
 * @author Vicky
 *
 */
@RestController
public class DoctorAlertServiceController {

	@Autowired
	private DoctorAlertService service;

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/health")
	public ResponseEntity<?> getHealthOfTheService() {
		return ResponseEntity.ok(new SimpleMessage("The Service is Functioning"));
	}

	// GET EndPoints

	@GetMapping("/patientRecord")
	public ResponseEntity<List<PatientReport>> getAllPaitentRecords() throws Exception {

		return ResponseEntity.ok(service.getAllPatientReport());

	}

	@GetMapping("/patientRecord/doctor/{doctorId}")
	public ResponseEntity<List<PatientReport>> getAllPaitentRecordsByDoctorId(@PathVariable String doctorId)
			throws Exception {

		return ResponseEntity.ok(service.getAllPatientReportByDoctorId(doctorId));

	}

	@GetMapping("/patientRecord/hospital/{hospitalName}")
	public ResponseEntity<List<PatientReport>> getAllPaitentRecordsByHospitalName(@PathVariable String hospitalName)
			throws Exception {

		return ResponseEntity.ok(service.getAllPatientReportByHospitalName(hospitalName));

	}

	@GetMapping("/patientRecord/report/{reportId}")
	public ResponseEntity<PatientReport> getAllPaitentRecordsByReportId(@PathVariable String reportId)
			throws Exception {

		return ResponseEntity.ok(service.getPatientReportByReportId(reportId));

	}

	@GetMapping("/patientRecord/patient/{patientName}")
	public ResponseEntity<List<PatientReport>> getAllPaitentRecordsByPatientName(@PathVariable String patientName)
			throws Exception {

		return ResponseEntity.ok(service.getPatientReportByPatientName(patientName));

	}

	@GetMapping("/patientRecord/patient/I/{patientId}")
	public ResponseEntity<List<PatientReport>> getAllPaitentRecordsByPatientId(@PathVariable String patientId)
			throws Exception {

		return ResponseEntity.ok(service.getPatientReportByPatientId(patientId));

	}

	// POST

	@PostMapping("/patientRecord")
	public ResponseEntity<PatientReport> createBloodPressure(@RequestBody PatientData patientData) throws Exception {
		return ResponseEntity.ok(service.createPatientReport(patientData));
	}

	// PUT

	@PutMapping("/patientRecord/{id}")
	public ResponseEntity<PatientReport> updateBloodPressure(@RequestBody PatientReport patientReport,
			@PathVariable String id) throws Exception {
		return ResponseEntity.ok(service.updatePatientReport(patientReport, id));
	}

	// DELETE

	@DeleteMapping("/patientRecord/{id}")
	public ResponseEntity<?> deletePatientReport(@PathVariable String id) throws Exception {
		service.deletePatientReport(id);
		return ResponseEntity.noContent().build();
	}
}
