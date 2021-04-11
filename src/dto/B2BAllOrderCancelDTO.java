package dto;

public class B2BAllOrderCancelDTO extends B2BDTO{
	
	public String toString() {
		return super.EVENTID + super.getEventId()+
				super.MEMBERID + super.getMemberId()+
				super.TRID + super.getTrId();
	}
}
