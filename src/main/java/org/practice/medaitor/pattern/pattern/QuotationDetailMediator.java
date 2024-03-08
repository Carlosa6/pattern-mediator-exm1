package org.practice.medaitor.pattern.pattern;

import org.practice.medaitor.pattern.dto.ContactDetailsDTO;
import org.practice.medaitor.pattern.dto.EmployeesDTO;

import java.util.List;

public class QuotationDetailMediator {

    private EmployeesDTO employees;
    private List<ContactDetailsDTO> contactDetails;

    public EmployeesDTO getEmployees() {
        return employees;
    }

    public List<ContactDetailsDTO> getContactDetails() {
        return contactDetails;
    }

    public void setEmployees(EmployeesDTO employees) {
        this.employees = employees;
    }

    public void setContactDetails(List<ContactDetailsDTO> contactDetails) {
        this.contactDetails = contactDetails;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("QuotationDetailMediator{");
        sb.append("employees=").append(employees);
        sb.append(", contactDetails=").append(contactDetails);
        sb.append('}');
        return sb.toString();
    }
}
