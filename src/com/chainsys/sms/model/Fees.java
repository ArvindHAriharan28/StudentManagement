package com.chainsys.sms.model;

import java.time.LocalDate;

public class Fees {
	
	private Student_details details;
	private long fees;
	private LocalDate createdDate;
	public Student_details getDetails() {
		return details;
	}
	public void setDetails(Student_details details) {
		this.details = details;
	}
	public long getFees() {
		return fees;
	}
	public void setFees(long fees) {
		this.fees = fees;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	@Override
	public String toString() {
		return "Fees [details=" + details + ", fees=" + fees + ", createdDate=" + createdDate + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((details == null) ? 0 : details.hashCode());
		result = prime * result + (int) (fees ^ (fees >>> 32));
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
		Fees other = (Fees) obj;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (details == null) {
			if (other.details != null)
				return false;
		} else if (!details.equals(other.details))
			return false;
		if (fees != other.fees)
			return false;
		return true;
	}	
		
}
