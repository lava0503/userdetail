package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.userentity;
import com.example.demo.repository.userrepository;
import java.util.List;
@RestController
public class usercontroller {
	 @Autowired
	   public userrepository Repo;
	   @PostMapping("/user")
	   public userentity adddata(@RequestBody userentity user) {
		   try {
			   Repo.save(user);
			   return user;
		   }catch(Exception e) {
			   e.printStackTrace();
		   }
		   return null;
}

	   @GetMapping("/getuser")
	   public List<userentity>get(){
		   try {
			   return Repo.findAll();
		   }catch(Exception e) {
			   e.printStackTrace();
			   return null;
		   }
		   
	   }
	   public userentity updateuser(@RequestBody userentity user) {
		   try {
			   Repo.save(user);
			   return user;
		   }catch(Exception e) {
			   e.printStackTrace();
		   }
		   return user;
	   }
	   @DeleteMapping("/getdele/{userid}")
	   public String del(@PathVariable int id) {
		   @SuppressWarnings("depreciation")
		   userentity user=Repo.getOne(id);
		   Repo.delete(user);
		   return "DELETE";
	   }
}

