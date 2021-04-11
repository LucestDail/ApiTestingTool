package util;

public enum Type {
	
	CSLSSEND("cslssend"),
    RESEND("resend"),
    ALLORDERCANCEL("allordercancel"),
    COUPONDETAIL("coupondetail");

    private String type;

    Type(String type) {
        this.type = type;
    }
    
    public String getType(){
    	return type;
    }
}
