package com.example.propertyrating.form;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "property_basic_details")
public class PropertyBasicDetailsModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String propertyName;
	private int hospitalCount;
	private int metroCount;
	private int bhkCount;
	private boolean isParkNearby;
	private boolean isParkingAvailable;
	private boolean isVentilated;
	private boolean isMarketNearby;
	private boolean isElectricity;
	private boolean isWaterSupply;
	private boolean isFridge;
	private boolean isRO;
	private boolean isGasSupply;
	private String furnishing;
	private int age;
	private double price;
	private double area;

	public PropertyBasicDetailsModel() {
	}

	public int getId() {
		return id;
	}

	public int getBhkCount() {
		return bhkCount;
	}

	public boolean isParkNearby() {
		return isParkNearby;
	}

	public boolean isParkingAvailable() {
		return isParkingAvailable;
	}

	public boolean isVentilated() {
		return isVentilated;
	}

	public boolean isMarketNearby() {
		return isMarketNearby;
	}

	public String getFurnishing() {
		return furnishing;
	}

	public int getAge() {
		return age;
	}

	public double getPrice() {
		return price;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public int getHospitalCount() {
		return hospitalCount;
	}

	public int getMetroCount() {
		return metroCount;
	}

	public double getArea() {
		return area;
	}

	public boolean isElectricity() {
		return isElectricity;
	}

	public boolean isWaterSupply() {
		return isWaterSupply;
	}

	public boolean isFridge() {
		return isFridge;
	}

	public boolean isRO() {
		return isRO;
	}

	public boolean isGasSupply() {
		return isGasSupply;
	}

	public void setElectricity(boolean isElectricity) {
		this.isElectricity = isElectricity;
	}

	public void setWaterSupply(boolean isWaterSupply) {
		this.isWaterSupply = isWaterSupply;
	}

	public void setFridge(boolean isFridge) {
		this.isFridge = isFridge;
	}

	public void setRO(boolean isRO) {
		this.isRO = isRO;
	}

	public void setGasSupply(boolean isGasSupply) {
		this.isGasSupply = isGasSupply;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void setHospitalCount(int hospitalCount) {
		this.hospitalCount = hospitalCount;
	}

	public void setMetroCount(int metroCount) {
		this.metroCount = metroCount;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBhkCount(int bhkCount) {
		this.bhkCount = bhkCount;
	}

	public void setParkNearby(boolean isParkNearby) {
		this.isParkNearby = isParkNearby;
	}

	public void setParkingAvailable(boolean isParkingAvailable) {
		this.isParkingAvailable = isParkingAvailable;
	}

	public void setVentilated(boolean isVentilated) {
		this.isVentilated = isVentilated;
	}

	public void setMarketNearby(boolean isMarketNearby) {
		this.isMarketNearby = isMarketNearby;
	}

	public void setFurnishing(String furnishing) {
		this.furnishing = furnishing;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PropertyBasicDetailsModel [id=" + id + ", propertyName=" + propertyName + ", hospitalCount="
				+ hospitalCount + ", metroCount=" + metroCount + ", bhkCount=" + bhkCount + ", isParkNearby="
				+ isParkNearby + ", isParkingAvailable=" + isParkingAvailable + ", isVentilated=" + isVentilated
				+ ", isMarketNearby=" + isMarketNearby + ", isElectricity=" + isElectricity + ", isWaterSupply="
				+ isWaterSupply + ", isFridge=" + isFridge + ", isRO=" + isRO + ", isGasSupply=" + isGasSupply
				+ ", furnishing=" + furnishing + ", age=" + age + ", price=" + price + ", area=" + area + "]";
	}

}
