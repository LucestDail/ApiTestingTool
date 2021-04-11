package service;

import dto.B2BAllOrderCancelDTO;
import dto.B2BCSLSSendDTO;
import dto.B2BCouponDetailDTO;
import dto.B2BResendDTO;

public class ApiDTOMaker {

	private String type;
	private String eventId;
	private String goodsId;
	private String orderCnt;
	private String receivermobile;
	private String memberId;
	private String trId;
	private String tmessage;
	private String cmessage;
	
	
	public ApiDTOMaker(String type, String eventId, String goodsId, String orderCnt, String receivermobile,
			String memberId, String trId, String tmessage, String cmessage) {
		this.type = type;
		this.memberId = memberId;
		this.trId = trId;
		this.eventId = eventId;
		this.goodsId = goodsId;
		this.orderCnt = orderCnt;
		this.receivermobile = receivermobile;
		this.tmessage = tmessage;
		this.cmessage = cmessage;
	}
	
	public Object getDTO() {
		switch(this.type) {
		case "cslssend":
			System.out.println("it's cslssend!");
			B2BCSLSSendDTO CSLSSendDTO = new B2BCSLSSendDTO();
			CSLSSendDTO.setMemberId(this.memberId);
			CSLSSendDTO.setEventId(this.eventId);
			CSLSSendDTO.setGoodsId(this.goodsId);
			CSLSSendDTO.setTrId(this.trId);
			CSLSSendDTO.setOrderCnt(this.orderCnt);
			CSLSSendDTO.setReceivermobile(this.receivermobile);
			CSLSSendDTO.setTmessage(this.tmessage);
			CSLSSendDTO.setCmessage(this.cmessage);
			return CSLSSendDTO;
			
			
		case "resend":
			System.out.println("it's resend case!");
			B2BResendDTO ResendDTO = new B2BResendDTO();
			ResendDTO.setMemberId(this.memberId);
			ResendDTO.setEventId(this.eventId);
			ResendDTO.setTrId(this.trId);
			return ResendDTO;
		
			
		case "allordercancel":
			System.out.println("it's allordercancel case!");
			B2BAllOrderCancelDTO AllOrderCancelDTO = new B2BAllOrderCancelDTO();
			AllOrderCancelDTO.setMemberId(this.memberId);
			AllOrderCancelDTO.setEventId(this.eventId);
			AllOrderCancelDTO.setTrId(this.trId);
			return AllOrderCancelDTO;
		
			
		case "coupondetail":
			System.out.println("it's coupondetail case!");
			B2BCouponDetailDTO CouponDetailDTO = new B2BCouponDetailDTO();
			CouponDetailDTO.setMemberId(this.memberId);
			CouponDetailDTO.setEventId(this.eventId);
			CouponDetailDTO.setTrId(this.trId);
			return CouponDetailDTO;
			
		
		default:
			System.out.println("Invalid Type : " + type);
			break;
		}
		return null;
	}
}
