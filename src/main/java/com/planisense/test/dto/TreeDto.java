package com.planisense.test.dto;

import com.planisense.test.entity.Point;

public class TreeDto {
    private Long id;
    private String locationType;
    private String domain;
    private String district;
    private String additionalAddress;
    private String number;
    private String address;
    private String locationId;
    private String labelFr;
    private String type;
    private String space;
    private String varietyOrCultivar;
    private float circumference;
    private float height;
    private String developmentStage;
    private Boolean remarkable;
    private Point geoPoint;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAdditionalAddress() {
        return additionalAddress;
    }

    public void setAdditionalAddress(String additionalAddress) {
        this.additionalAddress = additionalAddress;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getLabelFr() {
        return labelFr;
    }

    public void setLabelFr(String labelFr) {
        this.labelFr = labelFr;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public String getVarietyOrCultivar() {
        return varietyOrCultivar;
    }

    public void setVarietyOrCultivar(String varietyOrCultivar) {
        this.varietyOrCultivar = varietyOrCultivar;
    }

    public float getCircumference() {
        return circumference;
    }

    public void setCircumference(float circumference) {
        this.circumference = circumference;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getDevelopmentStage() {
        return developmentStage;
    }

    public void setDevelopmentStage(String developmentStage) {
        this.developmentStage = developmentStage;
    }

    public Boolean getRemarkable() {
        return remarkable;
    }

    public void setRemarkable(Boolean remarkable) {
        this.remarkable = remarkable;
    }

    public Point getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(Point geoPoint) {
        this.geoPoint = geoPoint;
    }
}
