package ru.geekbrains.homework3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.homework3.repositories.AbstractRepository;

@Controller
@RequestMapping("/products")
@AllArgsConstructor
public class ProductContoller {

	private final AbstractRepository repository;

	@GetMapping()
	public String index(Model model) {
		model.addAttribute("products", repository.findAll());
		return "products/index";
	}

	@GetMapping("/{id}")
	public String show(@PathVariable("id") long id, Model model) {
		model.addAttribute("product", repository.findById(id));
		return "products/show";
	}

}
