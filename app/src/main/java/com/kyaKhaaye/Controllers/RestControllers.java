package com.kyaKhaaye.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.kyaKhaaye.Models.AllFields;

@Controller
public class RestControllers {

	@PostMapping("/allRandom")
	public ResponseEntity<AllFields> allRandom(){
		AllFields all=new AllFields();
		return new ResponseEntity<>(all,HttpStatus.OK);
	}
	
}
