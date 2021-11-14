package ru.geekbrains.homework3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.geekbrains.homework3.entities.Product;
import ru.geekbrains.homework3.repositories.AbstractRepository;
import ru.geekbrains.homework3.repositories.ProductRepository;

@Slf4j
@SpringBootApplication
public class Homework3Application implements CommandLineRunner {

	private AbstractRepository repository;

	@Autowired
	public void context(AbstractRepository repository) { this.repository = repository; }

	public static void main(String[] args) {
		SpringApplication.run(Homework3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		log.info("Log: Product list init");
		long id = 0L;
		repository.add(new Product(id++,"Apple",10));
		repository.add(new Product(id++,"Watermelon",8));
		repository.add(new Product(id++,"Banana",6));
		repository.add(new Product(id++,"Orange",12));
		repository.add(new Product(id++,"Lemon",13));
		repository.add(new Product(id++,"Dragon fruit",20));
		repository.add(new Product(id++,"Blueberries",15));
		repository.add(new Product(id++,"Raspberry",21));
		repository.add(new Product(id++,"Strawberry",18));
		repository.add(new Product(id++,"Blackberry",17));
	}
}
