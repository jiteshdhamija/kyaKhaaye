package com.kyaKhaaye.Controllers;

import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyaKhaaye.Models.AllFields;

@RestController
public class RestControllers {

	@PostMapping("/allRandom")
	public ResponseEntity<AllFields> allRandom() {
		AllFields all = new AllFields();
		return new ResponseEntity<>(all, HttpStatus.OK);
	}

	@GetMapping("/getAll")
	public ResponseEntity<AllFields> getAll() throws SQLException, ClassNotFoundException {
		AllFields all = new AllFields();
		all = JDBC.getAll.getAllFields();
		return new ResponseEntity<>(all, HttpStatus.OK);
	}
}
