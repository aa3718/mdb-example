package com.example.mdbspringboot.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * The Document annotation specifies the collection name that will be used by the model. If the collection does not
 * exist, MongoDB will create it.
 */
@Document("statements")
@AllArgsConstructor
@Getter
public class Statement {

	// Primary specified
	@Id
	private String id;

	//@Indexed
	private Actor actor;
	private Verb verb;
	private Object object;

	public static class Actor {
		public String objectType;
		public String name;
		public String mbox;
	}

	public static class Verb {
		public String id;
		public String display;
	}

	public static class Object {
		public String objectType;
		public String id;
	}
}
