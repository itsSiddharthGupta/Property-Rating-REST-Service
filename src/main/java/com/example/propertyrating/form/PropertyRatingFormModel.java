package com.example.propertyrating.form;

import java.util.LinkedList;
import java.util.List;

public class PropertyRatingFormModel {
	private int propertyId;
	private String message;
	private String actionUrl;
	private List<Field> fields;
	private String cancelUrl;
	private String action;

	public PropertyRatingFormModel() {

	}

	public PropertyRatingFormModel(String message) {
		this.message = message;
	}

	public PropertyRatingFormModel(String message, String actionUrl, String cancelUrl) {
		super();
		this.message = message;
		this.actionUrl = actionUrl;
		this.setCancelUrl(cancelUrl);
	}

	public PropertyRatingFormModel(String message, String actionUrl, String cancelUrl, Field field) {
		super();
		this.message = message;
		this.actionUrl = actionUrl;
		this.setCancelUrl(cancelUrl);
		this.fields = new LinkedList<>();
		this.fields.add(field);
	}

	public PropertyRatingFormModel(String message, String actionUrl, String cancelUrl, List<Field> fields) {
		super();
		this.message = message;
		this.actionUrl = actionUrl;
		this.fields = fields;
		this.setCancelUrl(cancelUrl);
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getCancelUrl() {
		return cancelUrl;
	}

	public void setCancelUrl(String cancelUrl) {
		this.cancelUrl = cancelUrl;
	}

	public String getMessage() {
		return message;
	}

	public String getActionUrl() {
		return actionUrl;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<Field> getFields() {
		return fields;
	}

	public static class Field {
		private String id;
		private int limit;
		private List<String> choices;

		public Field(String id) {
			super();
			this.id = id;
		}

		public Field(String id, int limit) {
			super();
			this.id = id;
			this.limit = limit;
		}

		public Field(String id, List<String> choices) {
			super();
			this.id = id;
			this.choices = choices;
		}

		public String getId() {
			return id;
		}

		public int getLimit() {
			return limit;
		}

		public List<String> getChoices() {
			return choices;
		}

	}
}
