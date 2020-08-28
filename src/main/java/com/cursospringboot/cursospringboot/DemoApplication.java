package com.cursospringboot.cursospringboot;

import com.cursospringboot.cursospringboot.services.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner{

	@Autowired
	private S3Service s3Service;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		s3Service.uploadFile("C:\\projects\\fotos\\filhotes.jpg");
	}

}
 