package ru.geekbrains.homework3.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
	private long id;
	private String title;
	private int cost;
}
