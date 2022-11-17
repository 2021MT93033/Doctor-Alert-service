/**
 * 
 */
package com.bits.assignment.universalt10.doctor.doctoralertservice.service.impl;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bits.assignment.universalt10.doctor.doctoralertservice.model.DoctorPatient;
import com.bits.assignment.universalt10.doctor.doctoralertservice.model.PatientData;
import com.bits.assignment.universalt10.doctor.doctoralertservice.model.PatientReport;
import com.bits.assignment.universalt10.doctor.doctoralertservice.model.UserDetail;
import com.bits.assignment.universalt10.doctor.doctoralertservice.repository.DoctorAlertRepository;
import com.bits.assignment.universalt10.doctor.doctoralertservice.service.DoctorAlertService;

/**
 * @author Vicky
 *
 */
@Service
public class DoctorAlertServiceImpl implements DoctorAlertService {

	@Autowired
	private DoctorAlertRepository repo;

	@Value("${gateway.url}")
	private String gatewayURL;

	@Autowired
	private RestTemplate restTemplate;

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public PatientReport createPatientReport(PatientData data) throws Exception {

		PatientReport patientReport = new PatientReport();
		UserDetail patient = getUserDetail(data.getPatientId());
		DoctorPatient doctorPatient = getUserRelationDetail(patient.getId())[0];
		String doctorId = doctorPatient.getDoctorId();
		UserDetail doctor = getUserDetail(doctorId);
		mapPatientReport(patientReport, data, patient, doctor);

		return repo.save(patientReport);
	}

	private void mapPatientReport(PatientReport patientReport, PatientData data, UserDetail patient,
			UserDetail doctor) {
		patientReport.setAge(patient.getAge());
		patientReport.setBloodPressure(data.getBloodPressure());
		patientReport.setBloodPressureStatus(data.getBloodPressureStatus());
		patientReport.setBloodPressureStatus(data.getBloodPressureStatus());
		patientReport.setBmi(data.getBmi());
		patientReport.setBmiStatus(data.getBmiStatus());
		patientReport.setCreatedAt(new Date());
		patientReport.setCreatedBy(patient.getUserName());
		patientReport.setDoctorEmail(doctor.getEmail());
		patientReport.setDoctorId(doctor.getId());
		patientReport.setDoctorName(doctor.getFirstName());
		patientReport.setHeight(patient.getHeight());
		patientReport.setHospitalName(doctor.getHospitalName());
		patientReport.setOxygenLevel(data.getOxygenLevel());
		patientReport.setOxygenLevelStatus(data.getOxygenLevelStatus());
		patientReport.setPatientContactNo(patient.getContactNo());
		patientReport.setPatientId(patient.getId());
		patientReport.setPatientName(patient.getFirstName());
		patientReport.setReadingDate(data.getReadingDate());
		patientReport.setSleepTracking(data.getSleepTracking());
		patientReport.setSleepTrackingStatus(data.getSleepTrackingStatus());
		patientReport.setStepCount(data.getStepCount());
		patientReport.setStepCountStatus(data.getStepCountStatus());
		patientReport.setTemperature(data.getTemperature());
		patientReport.setTemperatureStatus(data.getTemperatureStatus());
		patientReport.setWeight(patient.getWeight());

	}

	private DoctorPatient[] getUserRelationDetail(String patientId) {
		String endpoint = gatewayURL + "/user-service/doctorpatient/patient/" + patientId;
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		HttpEntity request = new HttpEntity<>(headers);
		ResponseEntity<DoctorPatient[]> entity = restTemplate.exchange(endpoint, HttpMethod.GET, request,
				DoctorPatient[].class);
		return entity.getBody();
	}

	private UserDetail getUserDetail(String userId) {
		String endpoint = gatewayURL + "/user-service/user/" + userId;
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		HttpEntity request = new HttpEntity<>(headers);
		ResponseEntity<UserDetail> entity = restTemplate.exchange(endpoint, HttpMethod.GET, request, UserDetail.class);
		return entity.getBody();
	}

	@Override
	public PatientReport updatePatientReport(PatientReport patientReport, String id) throws Exception {

		if (!id.equals(patientReport.getId())) {
			throw new Exception("Illegal Request Exception, The id in the url and request is not matching");
		}

		PatientReport existingReport = getPatientReportById(patientReport.getId());

		if (existingReport == null) {
			throw new Exception("unable to find the record to update");
		}

		return repo.save(patientReport);
	}

	@Override
	public void deletePatientReport(String id) throws Exception {
		PatientReport existingReport = getPatientReportById(id);

		if (existingReport == null) {
			throw new Exception("unable to find the record to delete");
		}

		repo.delete(existingReport);

	}

	@Override
	public List<PatientReport> getAllPatientReport() throws Exception {

		return repo.findAll();
	}

	@Override
	public List<PatientReport> getPatientReportByPatientName(String patientName) throws Exception {

		return repo.findByPatientName(patientName);
	}

	@Override
	public List<PatientReport> getPatientReportByPatientId(String patientId) throws Exception {

		return repo.findByPatientId(patientId);
	}

	@Override
	public PatientReport getPatientReportByReportId(String reportId) throws Exception {

		return repo.findByReportId(reportId);
	}

	@Override
	public PatientReport getPatientReportById(String id) throws Exception {
		Optional<PatientReport> opt = repo.findById(id);
		return opt.orElse(null);
	}

	@Override
	public List<PatientReport> getAllPatientReportByDoctorId(String doctorId) throws Exception {

		return repo.findByDoctorId(doctorId);
	}

	@Override
	public List<PatientReport> getAllPatientReportByHospitalName(String hospitalName) throws Exception {

		return repo.findByHospitalName(hospitalName);
	}

}
