package com.example.propertyrating.form;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.propertyrating.utils.Constants;

@RestController
@RequestMapping("/property_rating/form_basic")
public class PropertyRatingFormController {
	@Autowired
	private PropertyRatingFormService service;

	@RequestMapping("/")
	public ResponseEntity<PropertyRatingFormModel> getForm() {
		PropertyRatingFormModel model = service.getFormWithSingleField(
				"Please provide your property name. (Ex: Govardhan Property)", Constants.PROPERTY_NAME_URL,
				Constants.PROPERTY_NAME_ID, "text");
		return new ResponseEntity<PropertyRatingFormModel>(model, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/{id}")
	public ResponseEntity<PropertyRatingFormModel> getForm(@PathVariable int id,
			@RequestParam HashMap<String, String> map) throws Exception {
		PropertyRatingFormModel model = null;
		System.out.println(map.toString());
		switch (id) {

		// the endpoint is for property name : capture the body and send to property
		// location endpoint
		case 0:
			model = service.getFormForLocation(map);
			break;

		// the endpoint is for location of property : capture the body and send to numeric
		// form end point
		case 1:
			model = service.getFormForNumeric(map);
			break;

		// the endpoint is for numeric form of property : capture the body and send to
		// toggle end point
		// toggles : isParkAvailable i.e. all options having values T/F
		case 2:
			model = service.getFormForToggles(map);
			break;

		// the endpoint is for toggles : capture the body and send to choices end
		// point
		// choices : furnishing i.e semi furnished/full/no
		case 3:
			model = service.getFormForChoices(map);
			break;

		// the endpoint is for choices : capture the body and send to double valued form end
		// point
		case 4:
			model = service.getFormForDoubleType(map);
			break;

		// the endpoint is for double valued form : capture the body and send to finish end
		// point
		case 5:
			model = service.getFinishForm(map);
			break;
		}
		return new ResponseEntity<PropertyRatingFormModel>(model, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/cancel")
	public ResponseEntity<PropertyRatingFormModel> cancelBasicForm(@RequestParam HashMap<String, String> map){
		PropertyRatingFormModel model = service.cancelBasicForm(map);
		return new ResponseEntity<PropertyRatingFormModel>(model, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/finish")
	public ResponseEntity<PropertyBasicDetailsModel> finishBasicForm(@RequestParam HashMap<String, String> map){
		PropertyBasicDetailsModel model = service.finishBasicForm(map);
		return new ResponseEntity<PropertyBasicDetailsModel>(model, HttpStatus.OK);
	}
	
}
