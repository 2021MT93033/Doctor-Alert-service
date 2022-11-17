/**
 * 
 */
package com.bits.assignment.universalt10.doctor.doctoralertservice.model;

import java.util.Date;
import java.util.Objects;

/**
 * @author Vicky
 *
 */
public class PatientData {

	private String patientId;
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

	public PatientData() {

	}

	/**
	 * @param patientId
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
	public PatientData(String patientId, String bloodPressure, String bloodPressureStatus, String oxygenLevel,
			String oxygenLevelStatus, String bmi, String bmiStatus, String sleepTracking, String sleepTrackingStatus,
			String stepCount, String stepCountStatus, String temperature, String temperatureStatus, Date readingDate) {
		super();
		this.patientId = patientId;
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
		return Objects.hash(bloodPressure, bloodPressureStatus, bmi, bmiStatus, oxygenLevel, oxygenLevelStatus,
				patientId, readingDate, sleepTracking, sleepTrackingStatus, stepCount, stepCountStatus, temperature,
				temperatureStatus);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof PatientData)) {
			return false;
		}
		PatientData other = (PatientData) obj;
		return Objects.equals(bloodPressure, other.bloodPressure)
				&& Objects.equals(bloodPressureStatus, other.bloodPressureStatus) && Objects.equals(bmi, other.bmi)
				&& Objects.equals(bmiStatus, other.bmiStatus) && Objects.equals(oxygenLevel, other.oxygenLevel)
				&& Objects.equals(oxygenLevelStatus, other.oxygenLevelStatus)
				&& Objects.equals(patientId, other.patientId) && Objects.equals(readingDate, other.readingDate)
				&& Objects.equals(sleepTracking, other.sleepTracking)
				&& Objects.equals(sleepTrackingStatus, other.sleepTrackingStatus)
				&& Objects.equals(stepCount, other.stepCount) && Objects.equals(stepCountStatus, other.stepCountStatus)
				&& Objects.equals(temperature, other.temperature)
				&& Objects.equals(temperatureStatus, other.temperatureStatus);
	}

	@Override
	public String toString() {
		return "PatientData [patientId=" + patientId + ", bloodPressure=" + bloodPressure + ", bloodPressureStatus="
				+ bloodPressureStatus + ", oxygenLevel=" + oxygenLevel + ", oxygenLevelStatus=" + oxygenLevelStatus
				+ ", bmi=" + bmi + ", bmiStatus=" + bmiStatus + ", sleepTracking=" + sleepTracking
				+ ", sleepTrackingStatus=" + sleepTrackingStatus + ", stepCount=" + stepCount + ", stepCountStatus="
				+ stepCountStatus + ", temperature=" + temperature + ", temperatureStatus=" + temperatureStatus
				+ ", readingDate=" + readingDate + "]";
	}

}
