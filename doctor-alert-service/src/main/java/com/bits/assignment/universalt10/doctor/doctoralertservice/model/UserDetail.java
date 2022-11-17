/**
 *
 */
package com.bits.assignment.universalt10.doctor.doctoralertservice.model;

import java.util.Objects;

/**
 * @author Vicky
 *
 */

public class UserDetail extends BaseEntity {

	public enum UserType {
		DOCTOR("DOCTOR"), PATIENT("PATIENT"), NURSE("NURSE"), STAFF("STAFF"), APP_ADMIN("APP_ADMIN");

		private String type;

		private UserType(String type) {
			this.type = type;
		}

		public String getType() {
			return this.type;
		}
	}

	private String firstName;
	private String lastName;
	private int age;
	private String userName;
	private String password;
	private boolean blocked;
	private String hospitalName;
	private UserType type;
	private double height;
	private double weight;
	private String contactNo;
	private String email;

	public UserDetail() {

	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param userName
	 * @param password
	 * @param blocked
	 * @param hospitalName
	 * @param type
	 * @param height
	 * @param weight
	 * @param contactNo
	 * @param email
	 */
	public UserDetail(String firstName, String lastName, int age, String userName, String password, boolean blocked,
			String hospitalName, UserType type, double height, double weight, String contactNo, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.userName = userName;
		this.password = password;
		this.blocked = blocked;
		this.hospitalName = hospitalName;
		this.type = type;
		this.height = height;
		this.weight = weight;
		this.contactNo = contactNo;
		this.email = email;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the blocked
	 */
	public boolean isBlocked() {
		return blocked;
	}

	/**
	 * @param blocked the blocked to set
	 */
	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
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
	 * @return the type
	 */
	public UserType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(UserType type) {
		this.type = type;
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
	 * @return the contactNo
	 */
	public String getContactNo() {
		return contactNo;
	}

	/**
	 * @param contactNo the contactNo to set
	 */
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(age, blocked, contactNo, email, firstName, height, hospitalName,
				lastName, password, type, userName, weight);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof UserDetail)) {
			return false;
		}
		UserDetail other = (UserDetail) obj;
		return age == other.age && blocked == other.blocked && Objects.equals(contactNo, other.contactNo)
				&& Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
				&& Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Objects.equals(hospitalName, other.hospitalName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(password, other.password) && type == other.type
				&& Objects.equals(userName, other.userName)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	@Override
	public String toString() {
		return "UserDetail [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", userName="
				+ userName + ", password=" + password + ", blocked=" + blocked + ", hospitalName=" + hospitalName
				+ ", type=" + type + ", height=" + height + ", weight=" + weight + ", contactNo=" + contactNo
				+ ", email=" + email + "]";
	}

}
