package com.kyaKhaaye.Controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kyaKhaaye.JDBC.fixedButRand;
import com.kyaKhaaye.JDBC.getRandom;
import com.kyaKhaaye.Models.AllFields;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class RestControllers {

	@PostMapping("/allRandom")
	public ResponseEntity<AllFields> allRandom() throws ClassNotFoundException, SQLException {
		AllFields all = new AllFields();
		all = getRandom.getRand();
		return new ResponseEntity<>(all, HttpStatus.OK);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<AllFields>> getAll() throws SQLException, ClassNotFoundException {
		List<AllFields> all = new ArrayList<>();
		all = com.kyaKhaaye.JDBC.getAll.getAllFields();
		return new ResponseEntity<>(all, HttpStatus.OK);
	}

	@PostMapping("/fixedButRandom")
	public ResponseEntity<AllFields> fixedButrandom(@RequestBody AllFields param)
			throws ClassNotFoundException, SQLException {
		AllFields a = new AllFields();
		a = fixedButRand.fixedButRandom(param);
		if (a.id == 0) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(a, HttpStatus.OK);
	}

	@GetMapping("/getDistinctCuisines")
	public ResponseEntity<List<String>> getDistinctCuisines() throws SQLException, ClassNotFoundException {
		List<String> all = new ArrayList<>();
		all.add("Cuisine 1");
		all.add("Cuisine 2");
		all.add("Cuisine 3");
		all.add("Cuisine 4");
		// all = com.kyaKhaaye.JDBC.getDistinct.getDistinctCuisine();
		return new ResponseEntity<>(all, HttpStatus.OK);
	}

	@GetMapping("/getDistinctCourse")
	public ResponseEntity<List<String>> getDistinctCourse() throws SQLException, ClassNotFoundException {
		List<String> all = new ArrayList<>();
		all = com.kyaKhaaye.JDBC.getDistinct.getDistinctCourse();
		return new ResponseEntity<>(all, HttpStatus.OK);
	}

	@GetMapping("/getDistinctRegion")
	public ResponseEntity<List<String>> getDistinctRegion() throws SQLException, ClassNotFoundException {
		List<String> all = new ArrayList<>();
		all = com.kyaKhaaye.JDBC.getDistinct.getDistinctRegion();
		return new ResponseEntity<>(all, HttpStatus.OK);
	}
}
