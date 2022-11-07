package br.com.etechoracio.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.etechoracio.jpa.repository.PostRepository;
import br.com.etechoracio.jpa.entity.Post;

@SpringBootApplication
public class Pw2BlogApplication implements CommandLineRunner{
	@Autowired
	private PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(Pw2BlogApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List <Post> posts;
		
		posts = postRepository.findAll();
		//4.6
		
	}

}
