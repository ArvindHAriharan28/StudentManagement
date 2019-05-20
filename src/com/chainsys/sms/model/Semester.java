package com.chainsys.sms.model;

public class Semester {
int sem_no;

public int getSem_no() {
	return sem_no;
}

public void setSem_no(int sem_no) {
	this.sem_no = sem_no;
}

@Override
public String toString() {
	return "Semester [sem_no=" + sem_no + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + sem_no;
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
	Semester other = (Semester) obj;
	if (sem_no != other.sem_no)
		return false;
	return true;
}

}
