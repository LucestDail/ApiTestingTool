package service;

import util.Type;

/**
 * 3.0����
 * @author ������
 *
 */
public class ApiStarter {
	public static void main(String[] args) {
		
		//메모장으로 파라매터 넣어서 가져올 수 있게 만들기
//		String type 			= Type.CSLSSEND.getType();
//		String type 			= Type.ALLORDERCANCEL.getType();
		String type 			= Type.RESEND.getType();
//		String type 			= Type.COUPONDETAIL.getType();
		String eventId 			= "1234";
		String goodsId 			= "0000000055";
		String orderCnt 		= "1";
		String receivermobile 	= "01012345678";
		String memberId 		= "ZLGOON";
		String trId 			= "ZLGOON201501010101";
		String tmessage 		= "tmessage test";
		String cmessage 		= "cmessage test";
		
		
		ApiDTOMaker adm = new ApiDTOMaker(type,
				eventId, goodsId, orderCnt, receivermobile,memberId,
				trId, tmessage, cmessage);
		ApiMaker am = new ApiMaker(adm.getDTO());
		System.out.println(am.getSendUri());
	}
}
