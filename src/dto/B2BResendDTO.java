package dto;

public class B2BResendDTO extends B2BDTO{
	public String toString() {
		return super.EVENTID + super.getEventId()+
				super.MEMBERID + super.getMemberId()+
				super.TRID + super.getTrId();
	}
}
