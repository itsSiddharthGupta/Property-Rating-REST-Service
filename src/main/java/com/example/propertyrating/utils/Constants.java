package com.example.propertyrating.utils;

public class Constants {
	public static final String BASE_URL = "https://heroku-property-rating.herokuapp.com";
	public static final String BASE_URL_BASIC_FORM = BASE_URL + "/property_rating/form_basic";
	public static final String URL_CANCEL_FORM = BASE_URL_BASIC_FORM + "/cancel";
	public static final String URL_FINISH_FORM = BASE_URL_BASIC_FORM + "/finish";
	public static final String PROPERTY_NAME_URL = BASE_URL_BASIC_FORM + "/0";
	public static final String PROPERTY_LOCATION_URL = BASE_URL_BASIC_FORM + "/1";
	public static final String PROPERTY_NUMERIC_TYPE_URL = BASE_URL_BASIC_FORM + "/2";
	public static final String PROPERTY_TOGGLES_URL = BASE_URL_BASIC_FORM + "/3";
	public static final String PROPERTY_CHOICE_URL = BASE_URL_BASIC_FORM + "/4";
	public static final String PROPERTY_DOUBLE_URL = BASE_URL_BASIC_FORM + "/5";
	
	public static final String PROPERTY_ID = "Property ID";
	public static final String PROPERTY_NAME_ID = "Property Name";
	public static final String PROPERTY_HOSP_ID = "Hospitals";
	public static final String PROPERTY_METRO_ID = "Metro Stations";
	public static final String PROPERTY_BHK_COUNT_ID = "BHK Count";
	public static final String PROPERTY_ELECTRICITY_TOGGLE_ID = "Electricity 24 X 7";
	public static final String PROPERTY_WATER_TOGGLE_ID = "Water 24 X 7";
	public static final String PROPERTY_GAS_TOGGLE_ID = "Gas Pipelines";
	public static final String PROPERTY_FRIDGE_TOGGLE_ID = "Fridge";
	public static final String PROPERTY_RO_TOGGLE_ID = "RO Water";
	public static final String PROPERTY_PARKING_TOGGLE_ID = "Parking Space";
	public static final String PROPERTY_PARK_TOGGLE_ID = "Park/Garden Nearby";
	public static final String PROPERTY_MARKET_TOGGLE_ID = "Food Market Nearby";
	public static final String PROPERTY_VENTILATION_TOGGLE_ID = "Well Ventilated";
	public static final String PROPERTY_FURNISHING_CHOICE_ID = "Furnishing";
	public static final String PROPERTY_AGE_ID = "Property Age";
	public static final String PROPERTY_PRICE_ID = "Property Price";
	public static final String PROPERTY_AREA_ID = "Property Area (in sqft)";
	
	public static final String ACTION_LOCATION = "location";
	public static final String ACTION_NUMERIC = "numeric";
	public static final String ACTION_DOUBLE = "double";
	public static final String ACTION_TOGGLE = "toggle";
	public static final String ACTION_CHOICES = "choice";
	public static final String ACTION_TEXT = "text";
	public static final String ACTION_FINISH = "finish";
	
	public static final String PROPERTY_FURNISHING_CHOICE_VALUE_NO = "No Furnishing";
	public static final String PROPERTY_FURNISHING_CHOICE_VALUE_SEMI = "Semi Furnished";
	public static final String PROPERTY_FURNISHING_CHOICE_VALUE_FULL = "Fully Furnished";
}
