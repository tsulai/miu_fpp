package prog4_1_department;

public final class Professor extends DeptEmployee {
	
	 private int numberOfPublications;

	Professor(String name, double salary, int yearOfHire, int monthOfHire, int dayOfHire, int numberOfPublications) {
		super(name, salary, yearOfHire, monthOfHire, dayOfHire);
		this.numberOfPublications = numberOfPublications;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
		
	}
	public void setNumberOfPublications(int n) {
		this.numberOfPublications = n;
	}
}
