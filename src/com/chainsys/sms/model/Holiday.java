package com.chainsys.sms.model;

import java.time.LocalDate;

public class Holiday {
	private LocalDate fromdate;
	private LocalDate todate;
	private LocalDate leaveDate;
	public LocalDate getLeaveDate() {
		return leaveDate;
	}
	public void setLeaveDate(LocalDate leaveDate) {
		this.leaveDate = leaveDate;
	}
	private String reason;
	public LocalDate getFromdate() {
		return fromdate;
	}
	public void setFromdate(LocalDate fromdate) {
		this.fromdate = fromdate;
	}
	public LocalDate getTodate() {
		return todate;
	}
	public void setTodate(LocalDate todate) {
		this.todate = todate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "Holiday [fromdate=" + fromdate + ", todate=" + todate + ", reason=" + reason + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fromdate == null) ? 0 : fromdate.hashCode());
		result = prime * result + ((reason == null) ? 0 : reason.hashCode());
		result = prime * result + ((todate == null) ? 0 : todate.hashCode());
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
		Holiday other = (Holiday) obj;
		if (fromdate == null) {
			if (other.fromdate != null)
				return false;
		} else if (!fromdate.equals(other.fromdate))
			return false;
		if (reason == null) {
			if (other.reason != null)
				return false;
		} else if (!reason.equals(other.reason))
			return false;
		if (todate == null) {
			if (other.todate != null)
				return false;
		} else if (!todate.equals(other.todate))
			return false;
		return true;
	}
	
	
}