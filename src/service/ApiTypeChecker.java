package service;

import dto.B2BAllOrderCancelDTO;
import dto.B2BCSLSSendDTO;
import dto.B2BCouponDetailDTO;

public class ApiTypeChecker {
	
	public ApiTypeChecker(String type, String eventId, String goodsId,
			String orderCnt, String receivermobile, String memberId,
			String trId, String tmessage, String cmessage) {
		switch(type) {
		case "cslssend":
			System.out.println("it's cslssend!");
			break;
		case "resend":
			System.out.println("it's resend case!");
			break;
		case "allordercancel":
			break;
		case "coupondetail":
			break;
			default:
				System.out.println("Invalid Type : " + type);
				break;
		}
	}

	public B2BCouponDetailDTO getDTO() {
		// TODO Auto-generated method stub
		return null;
	}
}
