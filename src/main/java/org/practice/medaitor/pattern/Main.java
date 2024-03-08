package org.practice.medaitor.pattern;

import org.practice.medaitor.pattern.pattern.ContactDetailsColleague;
import org.practice.medaitor.pattern.pattern.EmployeesColleague;
import org.practice.medaitor.pattern.pattern.QuotationDetailMediator;
import org.practice.medaitor.pattern.service.Coverages;
import org.practice.medaitor.pattern.service.ExternalService;
import org.practice.medaitor.pattern.service.Plan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        QuotationDetailMediator mediator = new QuotationDetailMediator();
        ExternalService externalService = new ExternalService();

        externalService.setExternalId("456tfdgdgdf");
        externalService.setName("namedad");

        Plan plan = new Plan();
        plan.setName("plan xd");
        plan.setAmount(688D);
        plan.setId("aidi plan");
        plan.setEndDate(LocalDate.now());
        plan.setStartDate(LocalDate.now());
        externalService.setPlan(plan);

        List<Coverages> coveragesList = new ArrayList<>();
        Coverages coverage = new Coverages();
        coverage.setId("id coverage");
        coverage.setAmount(927828D);
        coverage.setDescription("desc covergae");
        coveragesList.add(coverage);
        externalService.setCoverages(coveragesList);

        EmployeesColleague employees = new EmployeesColleague(mediator,externalService);
        ContactDetailsColleague contactDetails = new ContactDetailsColleague(mediator,externalService.getCoverages());

        employees.constructQuotationDetail();
        contactDetails.constructQuotationDetail();

        System.out.println(mediator);
        System.out.println(mediator.getEmployees());
        System.out.println(mediator.getContactDetails());

    }
}