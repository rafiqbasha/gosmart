package com.gosmart.repository.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * <h2>EmployeeEntity</h2> This entity class maps to employee_tl
 * 
 * @author Mohamad Rafiq Basha
 * @version 1.0
 * @since 2022-12-17
 */
@Entity
@Table(name = "EMPLOYEE_TL")
@Data
public class EmployeeEntity {
	// Primary key
	@Id
	@GeneratedValue

	@Column(name = "EMPLOYEE_ID")

	private Integer employeeId;
	// name of the employee first name
	@Column(name = "EMPLOYEE_FIRST_NAME")
	private String employeeFirstName;
	// name of the employee last name
    @Column(name = "EMPLOYEE_LAST_NAME")
	private String employeeLastName;
	// name of the employee managerId
    @Column(name = "EMPLOYEE_MANAGER_ID")
	private Integer employeeManagerId;
    // name of the employee mobileNumber
    @Column(name = "EMPLOYEE_MOBILE_NUMBER")
	private String employeeMobileNumber;
     //name of the employee emailId
    @Column(name = "EMPLOYEE_EMAIL_ID")
	private String employeeEmailId;
    //name of the employee status
	@Column(name = "EMPLOYEE_STATUS")
	private String employeeStatus;
	@Column(name = "EMPLOYEE_CREATED_ON")
	private Date employeeCreatedOn;
	@Column(name = "EMPLOYEE_UPDATED_ON")
	private Date employeeUpdatedOn;
	@Column(name = "EMPLOYEE_CREATED_BY")
	private Integer employeeCreatedBy;
	@Column(name = "EMPLOYEE_UPDATED_BY")
	private Integer employeeUpatedBy;
	@Column(name = "EMPLOYEE_DESIGNATION_ID")
	private Integer employeeDesignationId;
	@Column(name = "EMPLOYEE_BRANCH_ID")
	private Integer employeeBranchId;

	

}
