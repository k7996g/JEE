package com.mobileDetails.bean;

public class MobileDetails {
	private int mobId;
	private String mobName;
	private double mobPrice;
	private int stock;

	public MobileDetails(int mobId, String mobName, double mobPrice, int stock) {
		super();
		this.mobId = mobId;
		this.mobName = mobName;
		this.mobPrice = mobPrice;
		this.stock = stock;
	}

	public int getMobId() {
		return mobId;
	}

	public void setMobId(int mobId) {
		this.mobId = mobId;
	}

	public String getMobName() {
		return mobName;
	}

	public void setMobName(String mobName) {
		this.mobName = mobName;
	}

	public double getMobPrice() {
		return mobPrice;
	}

	public void setMobPrice(double mobPrice) {
		this.mobPrice = mobPrice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mobId;
		result = prime * result + ((mobName == null) ? 0 : mobName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(mobPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + stock;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MobileDetails other = (MobileDetails) obj;
		if (mobId != other.mobId)
			return false;
		if (mobName == null) {
			if (other.mobName != null)
				return false;
		} else if (!mobName.equals(other.mobName))
			return false;
		if (Double.doubleToLongBits(mobPrice) != Double.doubleToLongBits(other.mobPrice))
			return false;
		if (stock != other.stock)
			return false;
		return true;
	}

}
