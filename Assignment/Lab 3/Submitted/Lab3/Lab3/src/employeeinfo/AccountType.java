package employeeinfo;

public enum AccountType {
	CHECKING,SAVINGS,RETIREMENT;
	
	@Override
    public String toString() {
        return name().toLowerCase();
    }
}
