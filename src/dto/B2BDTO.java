package dto;

public class B2BDTO extends RootDTO{
	private String trId;
	private String eventId;
	private String memberId;
	
	protected final String EVENTID 		= 	"?EVENT_ID=";
	protected final String MEMBERID		=	"&MEMBER_ID=";
	protected final String TRID			=	"&TR_ID=";
	
	public String getTrId() {
		return trId;
	}
	public void setTrId(String trId) {
		this.trId = trId;
	}
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	
}
