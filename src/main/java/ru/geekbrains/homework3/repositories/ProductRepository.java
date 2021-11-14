package ru.geekbrains.homework3.repositories;

import org.springframework.stereotype.Repository;
import ru.geekbrains.homework3.entities.Product;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

@Repository
public class ProductRepository implements AbstractRepository<Product, Long> {

	private final CopyOnWriteArrayList<Product> productList = new CopyOnWriteArrayList<>();

	@Override
	public List<Product> findAll() {
		return productList.stream()
				.collect(Collectors.toList());
	}

	@Override
	public Optional<Product> findById(Long id) {
		return productList.stream().filter(pr->pr.getId()==id).findFirst();
	}

	@Override
	public void add(Product product) {
		productList.add(product);
	}
}
