/**
 * 
 */
package com.bits.assignment.universalt10.doctor.doctoralertservice.model;

import java.util.Date;
import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Vicky
 *
 */
@Document
public class PatientReport extends BaseEntity {

	private String patientId;

	private String reportId;

	private String patientName;

	private String patientContactNo;

	private String patientGender;

	private int age;

	private double height;

	private double weight;

	private String doctorId;

	private String doctorName;

	private String doctorEmail;

	private String hospitalName;

	private String bloodPressure;

	private String bloodPressureStatus;

	private String oxygenLevel;

	private String oxygenLevelStatus;

	private String bmi;

	private String bmiStatus;

	private String sleepTracking;

	private String sleepTrackingStatus;

	private String stepCount;

	private String stepCountStatus;

	private String temperature;

	private String temperatureStatus;

	private Date readingDate;

	public PatientReport() {

	}

	/**
	 * @param patientId
	 * @param patientName
	 * @param patientContactNo
	 * @param patientGender
	 * @param age
	 * @param height
	 * @param weight
	 * @param doctorId
	 * @param doctorName
	 * @param doctorEmail
	 * @param hospitalName
	 * @param bloodPressure
	 * @param bloodPressureStatus
	 * @param oxygenLevel
	 * @param oxygenLevelStatus
	 * @param bmi
	 * @param bmiStatus
	 * @param sleepTracking
	 * @param sleepTrackingStatus
	 * @param stepCount
	 * @param stepCountStatus
	 * @param temperature
	 * @param temperatureStatus
	 * @param readingDate
	 */
	public PatientReport(String patientId, String patientName, String patientContactNo, String patientGender, int age,
			double height, double weight, String doctorId, String doctorName, String doctorEmail, String hospitalName,
			String bloodPressure, String bloodPressureStatus, String oxygenLevel, String oxygenLevelStatus, String bmi,
			String bmiStatus, String sleepTracking, String sleepTrackingStatus, String stepCount,
			String stepCountStatus, String temperature, String temperatureStatus, Date readingDate) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientContactNo = patientContactNo;
		this.patientGender = patientGender;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorEmail = doctorEmail;
		this.hospitalName = hospitalName;
		this.bloodPressure = bloodPressure;
		this.bloodPressureStatus = bloodPressureStatus;
		this.oxygenLevel = oxygenLevel;
		this.oxygenLevelStatus = oxygenLevelStatus;
		this.bmi = bmi;
		this.bmiStatus = bmiStatus;
		this.sleepTracking = sleepTracking;
		this.sleepTrackingStatus = sleepTrackingStatus;
		this.stepCount = stepCount;
		this.stepCountStatus = stepCountStatus;
		this.temperature = temperature;
		this.temperatureStatus = temperatureStatus;
		this.readingDate = readingDate;
	}

	/**
	 * @return the reportId
	 */
	public String getReportId() {
		return reportId;
	}

	/**
	 * @param reportId the reportId to set
	 */
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	/**
	 * @return the patientId
	 */
	public String getPatientId() {
		return patientId;
	}

	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	/**
	 * @return the patientName
	 */
	public String getPatientName() {
		return patientName;
	}

	/**
	 * @param patientName the patientName to set
	 */
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	/**
	 * @return the patientContactNo
	 */
	public String getPatientContactNo() {
		return patientContactNo;
	}

	/**
	 * @param patientContactNo the patientContactNo to set
	 */
	public void setPatientContactNo(String patientContactNo) {
		this.patientContactNo = patientContactNo;
	}

	/**
	 * @return the patientGender
	 */
	public String getPatientGender() {
		return patientGender;
	}

	/**
	 * @param patientGender the patientGender to set
	 */
	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the doctorId
	 */
	public String getDoctorId() {
		return doctorId;
	}

	/**
	 * @param doctorId the doctorId to set
	 */
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	/**
	 * @return the doctorName
	 */
	public String getDoctorName() {
		return doctorName;
	}

	/**
	 * @param doctorName the doctorName to set
	 */
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	/**
	 * @return the doctorEmail
	 */
	public String getDoctorEmail() {
		return doctorEmail;
	}

	/**
	 * @param doctorEmail the doctorEmail to set
	 */
	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}

	/**
	 * @return the hospitalName
	 */
	public String getHospitalName() {
		return hospitalName;
	}

	/**
	 * @param hospitalName the hospitalName to set
	 */
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	/**
	 * @return the bloodPressure
	 */
	public String getBloodPressure() {
		return bloodPressure;
	}

	/**
	 * @param bloodPressure the bloodPressure to set
	 */
	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	/**
	 * @return the bloodPressureStatus
	 */
	public String getBloodPressureStatus() {
		return bloodPressureStatus;
	}

	/**
	 * @param bloodPressureStatus the bloodPressureStatus to set
	 */
	public void setBloodPressureStatus(String bloodPressureStatus) {
		this.bloodPressureStatus = bloodPressureStatus;
	}

	/**
	 * @return the oxygenLevel
	 */
	public String getOxygenLevel() {
		return oxygenLevel;
	}

	/**
	 * @param oxygenLevel the oxygenLevel to set
	 */
	public void setOxygenLevel(String oxygenLevel) {
		this.oxygenLevel = oxygenLevel;
	}

	/**
	 * @return the oxygenLevelStatus
	 */
	public String getOxygenLevelStatus() {
		return oxygenLevelStatus;
	}

	/**
	 * @param oxygenLevelStatus the oxygenLevelStatus to set
	 */
	public void setOxygenLevelStatus(String oxygenLevelStatus) {
		this.oxygenLevelStatus = oxygenLevelStatus;
	}

	/**
	 * @return the bmi
	 */
	public String getBmi() {
		return bmi;
	}

	/**
	 * @param bmi the bmi to set
	 */
	public void setBmi(String bmi) {
		this.bmi = bmi;
	}

	/**
	 * @return the bmiStatus
	 */
	public String getBmiStatus() {
		return bmiStatus;
	}

	/**
	 * @param bmiStatus the bmiStatus to set
	 */
	public void setBmiStatus(String bmiStatus) {
		this.bmiStatus = bmiStatus;
	}

	/**
	 * @return the sleepTracking
	 */
	public String getSleepTracking() {
		return sleepTracking;
	}

	/**
	 * @param sleepTracking the sleepTracking to set
	 */
	public void setSleepTracking(String sleepTracking) {
		this.sleepTracking = sleepTracking;
	}

	/**
	 * @return the sleepTrackingStatus
	 */
	public String getSleepTrackingStatus() {
		return sleepTrackingStatus;
	}

	/**
	 * @param sleepTrackingStatus the sleepTrackingStatus to set
	 */
	public void setSleepTrackingStatus(String sleepTrackingStatus) {
		this.sleepTrackingStatus = sleepTrackingStatus;
	}

	/**
	 * @return the stepCount
	 */
	public String getStepCount() {
		return stepCount;
	}

	/**
	 * @param stepCount the stepCount to set
	 */
	public void setStepCount(String stepCount) {
		this.stepCount = stepCount;
	}

	/**
	 * @return the stepCountStatus
	 */
	public String getStepCountStatus() {
		return stepCountStatus;
	}

	/**
	 * @param stepCountStatus the stepCountStatus to set
	 */
	public void setStepCountStatus(String stepCountStatus) {
		this.stepCountStatus = stepCountStatus;
	}

	/**
	 * @return the temperature
	 */
	public String getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the temperatureStatus
	 */
	public String getTemperatureStatus() {
		return temperatureStatus;
	}

	/**
	 * @param temperatureStatus the temperatureStatus to set
	 */
	public void setTemperatureStatus(String temperatureStatus) {
		this.temperatureStatus = temperatureStatus;
	}

	/**
	 * @return the readingDate
	 */
	public Date getReadingDate() {
		return readingDate;
	}

	/**
	 * @param readingDate the readingDate to set
	 */
	public void setReadingDate(Date readingDate) {
		this.readingDate = readingDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, bloodPressure, bloodPressureStatus, bmi, bmiStatus, doctorEmail, doctorId, doctorName,
				height, hospitalName, oxygenLevel, oxygenLevelStatus, patientContactNo, patientGender, patientId,
				patientName, readingDate, sleepTracking, sleepTrackingStatus, stepCount, stepCountStatus, temperature,
				temperatureStatus, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof PatientReport)) {
			return false;
		}
		PatientReport other = (PatientReport) obj;
		return age == other.age && Objects.equals(bloodPressure, other.bloodPressure)
				&& Objects.equals(bloodPressureStatus, other.bloodPressureStatus) && Objects.equals(bmi, other.bmi)
				&& Objects.equals(bmiStatus, other.bmiStatus) && Objects.equals(doctorEmail, other.doctorEmail)
				&& Objects.equals(doctorId, other.doctorId) && Objects.equals(doctorName, other.doctorName)
				&& Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Objects.equals(hospitalName, other.hospitalName) && Objects.equals(oxygenLevel, other.oxygenLevel)
				&& Objects.equals(oxygenLevelStatus, other.oxygenLevelStatus)
				&& Objects.equals(patientContactNo, other.patientContactNo)
				&& Objects.equals(patientGender, other.patientGender) && Objects.equals(patientId, other.patientId)
				&& Objects.equals(patientName, other.patientName) && Objects.equals(readingDate, other.readingDate)
				&& Objects.equals(sleepTracking, other.sleepTracking)
				&& Objects.equals(sleepTrackingStatus, other.sleepTrackingStatus)
				&& Objects.equals(stepCount, other.stepCount) && Objects.equals(stepCountStatus, other.stepCountStatus)
				&& Objects.equals(temperature, other.temperature)
				&& Objects.equals(temperatureStatus, other.temperatureStatus)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	@Override
	public String toString() {
		return "PatientReport [patientId=" + patientId + ", patientName=" + patientName + ", patientContactNo="
				+ patientContactNo + ", patientGender=" + patientGender + ", age=" + age + ", height=" + height
				+ ", weight=" + weight + ", doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorEmail="
				+ doctorEmail + ", hospitalName=" + hospitalName + ", bloodPressure=" + bloodPressure
				+ ", bloodPressureStatus=" + bloodPressureStatus + ", oxygenLevel=" + oxygenLevel
				+ ", oxygenLevelStatus=" + oxygenLevelStatus + ", bmi=" + bmi + ", bmiStatus=" + bmiStatus
				+ ", sleepTracking=" + sleepTracking + ", sleepTrackingStatus=" + sleepTrackingStatus + ", stepCount="
				+ stepCount + ", stepCountStatus=" + stepCountStatus + ", temperature=" + temperature
				+ ", temperatureStatus=" + temperatureStatus + ", readingDate=" + readingDate + "]";
	}

}
