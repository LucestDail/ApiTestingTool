package dto;

public class B2BCouponDetailDTO extends B2BDTO{
	public String toString() {
		return super.EVENTID + super.getEventId()+
				super.MEMBERID + super.getMemberId()+
				super.TRID + super.getTrId();
	}
}
