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

public class DoctorPatient {

	private String id;

	private Date createdAt;

	private Date lastModifiedAt;

	private String createdBy;

	private String LastModifiedBy;

	private String doctorId;

	private String patientId;

	public DoctorPatient() {

	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the createdAt
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return the lastModifiedAt
	 */
	public Date getLastModifiedAt() {
		return lastModifiedAt;
	}

	/**
	 * @param lastModifiedAt the lastModifiedAt to set
	 */
	public void setLastModifiedAt(Date lastModifiedAt) {
		this.lastModifiedAt = lastModifiedAt;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the lastModifiedBy
	 */
	public String getLastModifiedBy() {
		return LastModifiedBy;
	}

	/**
	 * @param lastModifiedBy the lastModifiedBy to set
	 */
	public void setLastModifiedBy(String lastModifiedBy) {
		LastModifiedBy = lastModifiedBy;
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

	@Override
	public int hashCode() {
		return Objects.hash(LastModifiedBy, createdAt, createdBy, doctorId, id, lastModifiedAt, patientId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof DoctorPatient)) {
			return false;
		}
		DoctorPatient other = (DoctorPatient) obj;
		return Objects.equals(LastModifiedBy, other.LastModifiedBy) && Objects.equals(createdAt, other.createdAt)
				&& Objects.equals(createdBy, other.createdBy) && Objects.equals(doctorId, other.doctorId)
				&& Objects.equals(id, other.id) && Objects.equals(lastModifiedAt, other.lastModifiedAt)
				&& Objects.equals(patientId, other.patientId);
	}

	@Override
	public String toString() {
		return "DoctorPatient [id=" + id + ", createdAt=" + createdAt + ", lastModifiedAt=" + lastModifiedAt
				+ ", createdBy=" + createdBy + ", LastModifiedBy=" + LastModifiedBy + ", doctorId=" + doctorId
				+ ", patientId=" + patientId + "]";
	}

}
