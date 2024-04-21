package com.kyaKhaaye.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyaKhaaye.Models.AllFields;

@RestController
public class RestControllers {

	@PostMapping("/allRandom")
	public ResponseEntity<AllFields> allRandom(){
		AllFields all=new AllFields();
		return new ResponseEntity<>(all,HttpStatus.OK);
	}
	
}
