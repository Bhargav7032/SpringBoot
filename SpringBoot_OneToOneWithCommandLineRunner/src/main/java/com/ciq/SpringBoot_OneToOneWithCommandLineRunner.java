package com.ciq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ciq.entity.Profile;
import com.ciq.entity.User;
import com.ciq.repositroy.ProfileRepositroy;
import com.ciq.repositroy.UserRepositroy;

@SpringBootApplication
public class SpringBoot_OneToOneWithCommandLineRunner  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot_OneToOneWithCommandLineRunner.class, args);
		
	}
	
	@Autowired
	private UserRepositroy userRepositroy;
	
	@Autowired
	private ProfileRepositroy profilerepositroy;

	@Override
	public void run(String... args) throws Exception {
		
		Profile profile=new Profile();
		profile.setPbio("welcom to Bhargav profile...!");
		//profilerepositroy.save(profile);
		
		User user= new User();
		user.setUname("bhargav");
		user.setProfile(profile);
		
		
		Profile profile1=new Profile();
		profile1.setPbio("welcom to bhagyam profile...!");
		
		
		User user1= new User();
		user1.setUname("bhagyam");
		user1.setProfile(profile1);
		
		Profile profile2=new Profile();
		profile2.setPbio("welcom to bhagyam profile...!");
		
		User user2= new User();
		user2.setUname("BhargavRaj");
		user2.setProfile(profile2);
		
		userRepositroy.save(user);
		userRepositroy.save(user1);
		userRepositroy.save(user2);
		
		System.out.println(user);
		System.out.println(user1);
		System.out.println(user2);
	}

}
