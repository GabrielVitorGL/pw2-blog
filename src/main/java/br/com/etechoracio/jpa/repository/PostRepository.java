package br.com.etechoracio.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.jpa.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}
