package com.aptechnolo.detecto.detecto.detection;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aptechnolo.detecto.detecto.CommonUtils;
import com.aptechnolo.detecto.detecto.GeneralResponse;
import com.aptechnolo.detecto.detecto.login.UserRepository;

@RestController

public class DetectionController {
	
	@Autowired
	private DetectionRepository detectionRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(path = "/api/users/history/{userId}")// - To get all the posts posted by user
	public @ResponseBody DetectionListResponse getUserDetectionsByUserId(@PathVariable(value="userId") Integer userId) {
		return new DetectionListResponse(CommonUtils.optionalToListConverter(detectionRepository.findDetectionsByUserId(userId)),
				200,"Success");
	}
	@GetMapping(path = "/api/users/history/{userId}/{location}")// - To get all the posts posted by user
	public @ResponseBody DetectionListResponse getUserDetectionsByLocation(@PathVariable(value="userId") Integer userId,
			@PathVariable(value="location") Integer location) {
		return new DetectionListResponse(CommonUtils.optionalToListConverter(detectionRepository.findDetectionsByUserId(userId)),
				200,"Success");
	}//location thing not implemented for now
	
	@PostMapping(path = "/api/users/{userId}/detection")
	public @ResponseBody GeneralResponse addNewDetection(@PathVariable (value = "userId") Integer userId,
			@RequestParam String detectionImgUrl,
			@RequestParam int actionStatus,
			@RequestParam Timestamp detectionTimestamp,
			@RequestParam String location) {
		detectionRepository.save(new Detection(userId,detectionImgUrl,actionStatus,detectionTimestamp,location));
		return new GeneralResponse(201,"New Post Added");
	}
	
	@PostMapping(path = "/api/users/test")
	public @ResponseBody GeneralResponse addNew(@RequestBody String fileName) {
		detectionRepository.save(new Detection(1001,fileName,1,new Timestamp(15000),"Testing"));
		return new GeneralResponse(201,"New Post Added");
	}
}
