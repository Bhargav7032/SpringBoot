package com.ciq;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.ciq.entity.Role;
import com.ciq.entity.User;
import com.ciq.repository.RoleRepository;
import com.ciq.repository.UserRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		Role role1 = Role.builder().rname("USER").build();
		Role role2 = Role.builder().rname("ADMIN").build();

		roleRepository.save(role1);
		roleRepository.save(role2);

		User user1 = User.builder().uname("ciq").password(bCryptPasswordEncoder.encode("ciq")).email("ciq@gmail.com")
				.roles(Set.of(roleRepository.findByRname("USER"))).build();
		User user2 = User.builder().uname("vidvaan").password(bCryptPasswordEncoder.encode("vidvaan"))
				.email("vidvaan@gmail.com").roles(Set.of(roleRepository.findByRname("USER"))).build();
		User user3 = User.builder().uname("admin").password(bCryptPasswordEncoder.encode("admin"))
				.email("admin@gmail.com").roles(Set.of(roleRepository.findByRname("ADMIN"))).build();

		userRepository.save(user1);
		userRepository.save(user2);
		userRepository.save(user3);

	}

}
