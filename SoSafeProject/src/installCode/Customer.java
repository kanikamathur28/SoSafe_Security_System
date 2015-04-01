package installCode;

public class Customer {
	private final String firstName; 
    private final String lastName; 
    private final int contractId; 
    private final String emgrPhone1; 
    private final String emgrPhone2; 
    private final String address; 
    private final String startDate;
    private final String endDate;
    private final String email;
    private final String password;
    
    private Customer(CustBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.contractId = builder.contractId;
        this.emgrPhone1 = builder.emgrPhone1;
        this.emgrPhone2 = builder.emgrPhone2;
        this.address = builder.address;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.email = builder.email;
        this.password = builder.password;
    }
    
    public static class CustBuilder implements Validateable{
    	private final String firstName; 
        private final String lastName; 
        private final int contractId; 
        private String emgrPhone1; 
        private String emgrPhone2; 
        private String address; 
        private final String startDate;
        private final String endDate;
        private final String email;
        private final String password;
 
        public CustBuilder(String firstName, String lastName, int contractId, String startDate, String endDate, String email, String password) {
        	super();
            this.firstName = firstName;
            this.lastName = lastName;
            this.contractId = contractId;
            this.startDate = startDate;
            this.endDate = endDate;
            this.email = email;
            this.password = password;
            
             }
 
        
       public CustBuilder emgrPhone1(String emgrPhone1) {
            this.emgrPhone1 = emgrPhone1;
            return this;
        }
        
        public CustBuilder emgrPhone2(String emgrPhone2) {
            this.emgrPhone2 = emgrPhone2;
            return this;
        }
 
        public CustBuilder address(String address) {
            this.address = address;
            return this;
        }
        
        public String getFirstName() {
            return firstName;
        }
     
        public String getLastName() {
            return lastName;
        }
     
        public int getContractId() {
            return contractId;
        }
     
        public String getEmgrPhone1() {
            return emgrPhone1;
        }
        
        public String getEmgrPhone2() {
            return emgrPhone2;
        }
     
     
        public String getAddress() {
            return address;
        }
        
        public String getStartDate() {
            return startDate;
        }

        public String getEndDate() {
            return endDate;
        }
        
        public String getEmail(){
        	return email;
        }
        
        public String getPassword(){
        	return password;
        }
        
         public Customer build() {
            return new Customer(this);
        }
         
         public void validateWith( AbstractValidator validator )
      	        throws AttributeValidatorException
      	    {
      	        validator.validate(this);
      	    }
         
 
    }
}

