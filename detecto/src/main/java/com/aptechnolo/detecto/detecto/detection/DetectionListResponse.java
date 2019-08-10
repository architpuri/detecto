package com.aptechnolo.detecto.detecto.detection;

import java.util.List;

import com.aptechnolo.detecto.detecto.GeneralResponse;

public class DetectionListResponse {

	private GeneralResponse generalResponse;
	private List<Detection> detections;
	
	protected DetectionListResponse() {
	}
	
	public DetectionListResponse(List<Detection> detections, int statusCode, String message) {
		this.detections = detections;
		this.generalResponse=new GeneralResponse(statusCode,message);
	}
	public List<Detection> getDetections() {
		return detections;
	}
	public void setDetections(List<Detection> detections) {
		this.detections = detections;
	}
}
