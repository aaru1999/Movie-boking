package com.cinema_package.cinema_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
@RequestMapping("/movie")
public class CinemaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemaProjectApplication.class, args);
	}

    static class NewMovieRequest {

        public NewMovieRequest() {
        }
    }

    static class NewMovieRequest {

        public NewMovieRequest() {
        }
    }

    public class NewMovieRequest {
    }


}