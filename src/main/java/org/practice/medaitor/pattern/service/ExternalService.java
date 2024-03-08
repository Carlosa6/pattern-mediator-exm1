package org.practice.medaitor.pattern.service;

import java.util.List;

public class ExternalService {

    private String name;
    private String externalId;
    private List<Coverages> coverages;
    private Plan plan;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public List<Coverages> getCoverages() {
        return coverages;
    }

    public void setCoverages(List<Coverages> coverages) {
        this.coverages = coverages;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}
