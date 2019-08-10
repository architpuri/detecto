package com.aptechnolo.detecto.detecto.detection;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Detection {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer detectionId;
	private Integer userId;
	private String dectectionImgUrl;
    private int actionStatus;
    private Timestamp detectionTimeStamp;
    private String location;

    public Detection() {
	}

	public Detection(Integer userId, String dectectionImgUrl, int actionStatus,
			Timestamp detectionTimeStamp, String location) {
		this.userId = userId;
		this.dectectionImgUrl = dectectionImgUrl;
		this.actionStatus = actionStatus;
		this.detectionTimeStamp = detectionTimeStamp;
		this.location = location;
	}

	public String getDectectionImgUrl() {
        return dectectionImgUrl;
    }

    public void setDectectionImgUrl(String dectectionImgUrl) {
        this.dectectionImgUrl = dectectionImgUrl;
    }

    public int getActionStatus() {
        return actionStatus;
    }

    public void setActionStatus(int actionStatus) {
        this.actionStatus = actionStatus;
    }

    public Timestamp getDetectionTimeStamp() {
        return detectionTimeStamp;
    }

    public void setDetectionTimeStamp(Timestamp detectionTimeStamp) {
        this.detectionTimeStamp = detectionTimeStamp;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

	@Override
	public String toString() {
		return "Detection [detectionId=" + detectionId + ", userId=" + userId + ", dectectionImgUrl=" + dectectionImgUrl
				+ ", actionStatus=" + actionStatus + ", detectionTimeStamp=" + detectionTimeStamp + ", location="
				+ location + "]";
	}
    
    
}
