package com.example.propertyrating.form;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.propertyrating.form.PropertyRatingFormModel.Field;
import com.example.propertyrating.utils.Constants;

@Service
public class PropertyRatingFormService {

	@Autowired
	private PropertyBasicDetailsRepository repo;

	public PropertyRatingFormModel getFormWithSingleField(String message, String actionUrl, String fieldId,
			String fieldType) {
		Field field = new Field(fieldId);
		PropertyRatingFormModel model = new PropertyRatingFormModel(message, actionUrl, Constants.URL_CANCEL_FORM,
				field);
		model.setAction(Constants.ACTION_TEXT);
		return model;
	}

	public PropertyRatingFormModel getFormForLocation(HashMap<String, String> map) {
		PropertyBasicDetailsModel propertyBasicDetails = new PropertyBasicDetailsModel();
		propertyBasicDetails.setPropertyName(map.get(Constants.PROPERTY_NAME_ID));
		propertyBasicDetails = repo.save(propertyBasicDetails);
		String message = "Please provide your property location. You have to provide permission to access your location!";
		Field fieldLat = new Field(Constants.PROPERTY_HOSP_ID);
		Field fieldLong = new Field(Constants.PROPERTY_METRO_ID);
		List<Field> fields = Arrays.asList(fieldLat, fieldLong);
		String actionUrl = Constants.PROPERTY_LOCATION_URL;
		PropertyRatingFormModel model = new PropertyRatingFormModel(message, actionUrl, Constants.URL_CANCEL_FORM,
				fields);
		model.setAction("location");
		model.setPropertyId(propertyBasicDetails.getId());
		return model;
	}

	public PropertyRatingFormModel getFormForNumeric(HashMap<String, String> map) {
		int propertyId = Integer.parseInt(map.get(Constants.PROPERTY_ID));
		PropertyBasicDetailsModel propertyBasicModel = getModelById(propertyId);
		int metro = Integer.parseInt(map.get(Constants.PROPERTY_METRO_ID));
		int hosp = Integer.parseInt(map.get(Constants.PROPERTY_HOSP_ID));
		propertyBasicModel.setMetroCount(metro);
		propertyBasicModel.setHospitalCount(hosp);
		propertyBasicModel = repo.save(propertyBasicModel);
		String message = "Please enter following details. Ex : 2/3/4";
		Field fieldBhk = new Field(Constants.PROPERTY_BHK_COUNT_ID, 2);
		Field fieldAge = new Field(Constants.PROPERTY_AGE_ID, 3);
		String actionUrl = Constants.PROPERTY_NUMERIC_TYPE_URL;
		PropertyRatingFormModel model = new PropertyRatingFormModel(message, actionUrl, Constants.URL_CANCEL_FORM,
				Arrays.asList(fieldBhk, fieldAge));
		model.setPropertyId(propertyId);
		model.setAction("numeric");
		return model;
	}

	public PropertyRatingFormModel getFormForToggles(HashMap<String, String> map) {
		int propertyId = Integer.parseInt(map.get(Constants.PROPERTY_ID));
		PropertyBasicDetailsModel propertyBasicModel = getModelById(propertyId);
		propertyBasicModel.setBhkCount(Integer.parseInt(map.get(Constants.PROPERTY_BHK_COUNT_ID)));
		propertyBasicModel.setAge(Integer.parseInt(map.get(Constants.PROPERTY_AGE_ID)));
		propertyBasicModel = repo.save(propertyBasicModel);
		String message = "Please select all the boxes that are valid for your property.";
		Field fieldPark = new Field(Constants.PROPERTY_PARK_TOGGLE_ID);
		Field fieldMarket = new Field(Constants.PROPERTY_MARKET_TOGGLE_ID);
		Field fieldParking = new Field(Constants.PROPERTY_PARKING_TOGGLE_ID);
		Field fieldVentilation = new Field(Constants.PROPERTY_VENTILATION_TOGGLE_ID);
		Field fieldElectricity = new Field(Constants.PROPERTY_ELECTRICITY_TOGGLE_ID);
		Field fieldWater = new Field(Constants.PROPERTY_WATER_TOGGLE_ID);
		Field fieldGas = new Field(Constants.PROPERTY_GAS_TOGGLE_ID);
		Field fieldFridge = new Field(Constants.PROPERTY_FRIDGE_TOGGLE_ID);
		Field fieldRO = new Field(Constants.PROPERTY_RO_TOGGLE_ID);
		String actionUrl = Constants.PROPERTY_TOGGLES_URL;
		List<Field> fields = Arrays.asList(fieldPark, fieldMarket, fieldParking, fieldVentilation, fieldElectricity,
				fieldWater, fieldGas, fieldFridge, fieldRO);
		PropertyRatingFormModel model = new PropertyRatingFormModel(message, actionUrl, Constants.URL_CANCEL_FORM,
				fields);
		model.setPropertyId(propertyId);
		model.setAction(Constants.ACTION_TOGGLE);
		return model;
	}

	public PropertyRatingFormModel getFormForChoices(HashMap<String, String> map) {
		int propertyId = Integer.parseInt(map.get(Constants.PROPERTY_ID));
		PropertyBasicDetailsModel propertyBasicModel = getModelById(propertyId);
		propertyBasicModel.setMarketNearby(Boolean.parseBoolean(map.get(Constants.PROPERTY_MARKET_TOGGLE_ID)));
		propertyBasicModel.setParkingAvailable(Boolean.parseBoolean(map.get(Constants.PROPERTY_PARKING_TOGGLE_ID)));
		propertyBasicModel.setParkNearby(Boolean.parseBoolean(map.get(Constants.PROPERTY_PARK_TOGGLE_ID)));
		propertyBasicModel.setVentilated(Boolean.parseBoolean(map.get(Constants.PROPERTY_VENTILATION_TOGGLE_ID)));
		propertyBasicModel.setElectricity(Boolean.parseBoolean(map.get(Constants.PROPERTY_ELECTRICITY_TOGGLE_ID)));
		propertyBasicModel.setWaterSupply(Boolean.parseBoolean(map.get(Constants.PROPERTY_WATER_TOGGLE_ID)));
		propertyBasicModel.setGasSupply(Boolean.parseBoolean(map.get(Constants.PROPERTY_GAS_TOGGLE_ID)));
		propertyBasicModel.setFridge(Boolean.parseBoolean(map.get(Constants.PROPERTY_FRIDGE_TOGGLE_ID)));
		propertyBasicModel.setRO(Boolean.parseBoolean(map.get(Constants.PROPERTY_RO_TOGGLE_ID)));

		propertyBasicModel = repo.save(propertyBasicModel);
		String message = "Please choose from the following : ";
		Field fieldFurnishing = new Field(Constants.PROPERTY_FURNISHING_CHOICE_ID,
				Arrays.asList(Constants.PROPERTY_FURNISHING_CHOICE_VALUE_NO,
						Constants.PROPERTY_FURNISHING_CHOICE_VALUE_SEMI,
						Constants.PROPERTY_FURNISHING_CHOICE_VALUE_FULL));
		String actionUrl = Constants.PROPERTY_CHOICE_URL;
		PropertyRatingFormModel model = new PropertyRatingFormModel(message, actionUrl, Constants.URL_CANCEL_FORM,
				Arrays.asList(fieldFurnishing));
		model.setPropertyId(propertyId);
		model.setAction(Constants.ACTION_CHOICES);
		return model;
	}

	public PropertyRatingFormModel getFormForDoubleType(HashMap<String, String> map) {
		int propertyId = Integer.parseInt(map.get(Constants.PROPERTY_ID));
		PropertyBasicDetailsModel propertyBasicModel = getModelById(propertyId);
		propertyBasicModel.setFurnishing(map.get(Constants.PROPERTY_FURNISHING_CHOICE_ID));
		propertyBasicModel = repo.save(propertyBasicModel);
		String message = "Please fill following details.";
		Field fieldPrice = new Field(Constants.PROPERTY_PRICE_ID);
		Field fieldArea = new Field(Constants.PROPERTY_AREA_ID);
		String actionUrl = Constants.PROPERTY_DOUBLE_URL;
		PropertyRatingFormModel model = new PropertyRatingFormModel(message, actionUrl, Constants.URL_CANCEL_FORM,
				Arrays.asList(fieldPrice, fieldArea));
		model.setPropertyId(propertyId);
		model.setAction("double");
		return model;
	}

	public PropertyRatingFormModel getFinishForm(HashMap<String, String> map) {
		int propertyId = Integer.parseInt(map.get(Constants.PROPERTY_ID));
		PropertyBasicDetailsModel propertyBasicModel = getModelById(propertyId);
		propertyBasicModel.setPrice(Double.parseDouble(map.get(Constants.PROPERTY_PRICE_ID)));
		propertyBasicModel.setArea(Double.parseDouble(map.get(Constants.PROPERTY_AREA_ID)));
		propertyBasicModel = repo.save(propertyBasicModel);
		String message = "Thanks for the co-operation. Now we will rate your property. Please wait while the rating process finishes.";
		String actionUrl = Constants.URL_FINISH_FORM;
		PropertyRatingFormModel model =  new PropertyRatingFormModel(message, actionUrl, Constants.URL_CANCEL_FORM);
		model.setPropertyId(propertyId);
		model.setAction(Constants.ACTION_FINISH);
		return model;
	}

	public PropertyRatingFormModel cancelBasicForm(HashMap<String, String> map) {
		int propertyId = Integer.parseInt(map.get(Constants.PROPERTY_ID));
		repo.deleteById(propertyId);
		String message = "Thanks for the co-operation. Your property is not rated as you cancelled the procedure.";
		return new PropertyRatingFormModel(message);
	}

	public PropertyBasicDetailsModel finishBasicForm(HashMap<String, String> map) {
		int propertyId = Integer.parseInt(map.get(Constants.PROPERTY_ID));
		PropertyBasicDetailsModel propertyBasicModel = getModelById(propertyId);
		System.out.println(propertyBasicModel.toString());
		return propertyBasicModel;
	}

	private PropertyBasicDetailsModel getModelById(int id) {
		PropertyBasicDetailsModel propertyBasicModel = repo.findById(id).get();
		return propertyBasicModel;
	}
}