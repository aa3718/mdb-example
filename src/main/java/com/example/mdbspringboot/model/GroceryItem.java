package com.example.mdbspringboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;

/**
 * The Document annotation specifies the collection name that will be used by the model. If the collection does not
 * exist, MongoDB will create it.
 */
@Document("groceryitems")
@AllArgsConstructor
public class GroceryItem {

	// Primary specified
	@Id
	private String id;
	private String name;
	private int quantity;
	private String category;
}
