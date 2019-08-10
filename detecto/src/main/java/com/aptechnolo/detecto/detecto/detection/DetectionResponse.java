package com.aptechnolo.detecto.detecto.detection;

import java.util.Optional;

import com.aptechnolo.detecto.detecto.GeneralResponse;

public class DetectionResponse {

	private GeneralResponse generalResponse;
	private Detection detection;
	public DetectionResponse() {
	}
	public DetectionResponse( Optional<Detection> optional,int statusCode, String message) {
		this.generalResponse=new GeneralResponse(statusCode,message);
		this.detection = optional.get();
	}
	public Detection getdetection() {
		return detection;
	}
	public void setdetection(Detection detection) {
		this.detection = detection;
	}
}
