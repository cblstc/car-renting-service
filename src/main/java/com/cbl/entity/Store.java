package com.cbl.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Store {
    private Integer id;

    private Integer storeUserId;

    private String storename;

    private String phone;

    @DateTimeFormat(pattern="HH:mm")
    private Date starttime;
    
    @DateTimeFormat(pattern="HH:mm")
    private Date endtime;

    private String address;

    private Float longitude;

    private Float latitude;

    private String description;

    private String traffic;

    private Integer totalstar;

    private Integer totalcomment;

    private Float avgstar;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStoreUserId() {
        return storeUserId;
    }

    public void setStoreUserId(Integer storeUserId) {
        this.storeUserId = storeUserId;
    }

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename == null ? null : storename.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic == null ? null : traffic.trim();
    }

    public Integer getTotalstar() {
        return totalstar;
    }

    public void setTotalstar(Integer totalstar) {
        this.totalstar = totalstar;
    }

    public Integer getTotalcomment() {
        return totalcomment;
    }

    public void setTotalcomment(Integer totalcomment) {
        this.totalcomment = totalcomment;
    }

    public Float getAvgstar() {
        return avgstar;
    }

    public void setAvgstar(Float avgstar) {
        this.avgstar = avgstar;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

	@Override
	public String toString() {
		return "Store [id=" + id + ", storeUserId=" + storeUserId
				+ ", storename=" + storename + ", phone=" + phone
				+ ", starttime=" + starttime + ", endtime=" + endtime
				+ ", address=" + address + ", longitude=" + longitude
				+ ", latitude=" + latitude + ", description=" + description
				+ ", traffic=" + traffic + ", totalstar=" + totalstar
				+ ", totalcomment=" + totalcomment + ", avgstar=" + avgstar
				+ ", status=" + status + "]";
	}
    
    
}