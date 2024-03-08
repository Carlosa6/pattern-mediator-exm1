package org.practice.medaitor.pattern.pattern;

import org.practice.medaitor.pattern.dto.EmployeesDTO;
import org.practice.medaitor.pattern.service.ExternalService;

public class EmployeesColleague implements Command{

    private QuotationDetailMediator quotationDetailMediator;
    private ExternalService externalService;

    public EmployeesColleague(QuotationDetailMediator quotationDetailMediator, ExternalService externalService) {
        this.quotationDetailMediator = quotationDetailMediator;
        this.externalService = externalService;
    }

    @Override
    public void constructQuotationDetail() {
        EmployeesDTO employeesDTO = new EmployeesDTO();
        employeesDTO.setAreMajority(externalService.getExternalId() != null);
        employeesDTO.setAmount(externalService.getPlan().getAmount());
        employeesDTO.setEmployeeNumber(622L);

        quotationDetailMediator.setEmployees(employeesDTO);
    }
}
