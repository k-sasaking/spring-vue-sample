package com.sample.api.conrtoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.api.entity.Article;
import com.sample.api.service.PostService;

@RestController
@CrossOrigin
@RequestMapping(path = "/api", produces =  MediaType.APPLICATION_JSON_VALUE)
public class SampleController {
	
	@Autowired
	PostService postService;
	
	@GetMapping("/hello")
	String hello(){
		return "Hello Springboot Restful";
				
	}
	
	@GetMapping("/list")
	List<Article> getAllArticles(){
		return postService.getAllArticles();
				
	}
	
	@GetMapping("/detail/{id}")
	Optional<Article> getArticle(
			@PathVariable("id")
			Integer id
		){
		
		return postService.getArticleById(id);				
	}

	@PostMapping("/create")
	Integer createArticle(			){

		return 201;
	}

	@PostMapping("/update")
	Integer updateArticle(){
		
		
		return 201;
	}
	
	@PostMapping("/delete/{id}")
	Integer deleteArticle(
			@PathVariable("id")
			Integer id
		){
		
		return 201;
	}


}
