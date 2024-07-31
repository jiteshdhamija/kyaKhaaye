package com.kyaKhaaye.Models;

import lombok.*;

@Data
public class AllFields {
	// id | dish | cuisine | beverage | hot | veg | course | region
	public int id = 0;
	public String dish = "random";
	public String cuisine = "random";
	public boolean beverage = true;
	public boolean hot = false;
	public boolean veg = true;
	public String course = "random";
	public String region = "random";
}
