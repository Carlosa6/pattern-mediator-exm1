package org.practice.medaitor.pattern.dto;

public class EmployeesDTO {

    private Boolean areMajority;
    private Long employeeNumber;
    private Double amount;

    public Boolean getAreMajority() {
        return areMajority;
    }

    public void setAreMajority(Boolean areMajority) {
        this.areMajority = areMajority;
    }

    public Long getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Long employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("EmployeesDTO{");
        sb.append("areMajority=").append(areMajority);
        sb.append(", employeeNumber=").append(employeeNumber);
        sb.append(", amount=").append(amount);
        sb.append('}');
        return sb.toString();
    }
}
