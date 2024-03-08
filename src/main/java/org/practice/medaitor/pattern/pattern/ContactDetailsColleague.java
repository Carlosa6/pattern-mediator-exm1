package org.practice.medaitor.pattern.pattern;

import org.practice.medaitor.pattern.dto.ContactDetailsDTO;
import org.practice.medaitor.pattern.service.Coverages;

import java.util.List;
import java.util.stream.Collectors;

public class ContactDetailsColleague implements Command{
    private QuotationDetailMediator quotationDetailMediator;
    private List<Coverages> coveragesList;


    public ContactDetailsColleague(QuotationDetailMediator quotationDetailMediator, List<Coverages> coveragesList) {
        this.quotationDetailMediator = quotationDetailMediator;
        this.coveragesList = coveragesList;
    }

    @Override
    public void constructQuotationDetail() {

        List<ContactDetailsDTO> contactDetailsDTOS = coveragesList.stream()
                .map(this::getContactDetailsDTO).collect(Collectors.toList());

        quotationDetailMediator.setContactDetails(contactDetailsDTOS);
    }

    private ContactDetailsDTO getContactDetailsDTO(Coverages coverages) {
        ContactDetailsDTO contactDetailsDTO = new ContactDetailsDTO();
        contactDetailsDTO.setType(coverages.getId());
        contactDetailsDTO.setAddress(coverages.getDescription());
        return contactDetailsDTO;
    }
}
