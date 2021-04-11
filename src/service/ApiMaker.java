package service;

import dto.B2BAllOrderCancelDTO;
import dto.B2BCSLSSendDTO;
import dto.B2BCouponDetailDTO;
import dto.B2BResendDTO;
import util.Type;

public class ApiMaker {
	private static final String HOST 			= 	"http://tcorp.zlgoon.com/";
	
	private static final String LSSEND 			= 	"lssend/";
	private static final String DOTHC 			= 	".hc";
	
	private static final String EVENTID 		= 	"?EVENT_ID=";
	private static final String GOODSID			=	"&GOODS_ID=";
	private static final String ORDERCNT		=	"&ORDER_CNT=";
	private static final String RECEIVERMOBILE	=	"&RECEIVERMOBILE=";
	private static final String MEMBERID		=	"&MEMBER_ID";
	private static final String TRID			=	"&TR_ID";
	private static final String TMESSAGE		=	"&TMESSAGE=";
	private static final String CMESSAGE		=	"&CMESSAGE=";
	
	private String type;
	private String eventId;
	private String goodsId;
	private String orderCnt;
	private String receivermobile;
	private String memberId;
	private String trId;
	private String tmessage;
	private String cmessage;
	
	
	B2BCSLSSendDTO B2BCSLSSendReturnDTO;
	B2BResendDTO B2BResendReturnDTO;
	B2BAllOrderCancelDTO B2BAllOrderCancelReturnDTO;
	B2BCouponDetailDTO B2BCouponDetailReturnDTO;

	
	
	public ApiMaker(B2BCouponDetailDTO DTO){
		this.type = DTO.getType();
		this.memberId = DTO.getMemberId();
		this.trId = DTO.getTrId();
		this.eventId = DTO.getEventId();
	}
	
	public ApiMaker(B2BCSLSSendDTO DTO){
		this.type = DTO.getType();
		this.memberId = DTO.getMemberId();
		this.trId = DTO.getTrId();
		this.eventId = DTO.getEventId();
		this.goodsId = DTO.getGoodsId();
		this.orderCnt = DTO.getOrderCnt();
		this.receivermobile = DTO.getReceivermobile();
		this.tmessage = DTO.getTmessage();
		this.cmessage = DTO.getCmessage();
	}
	
	public ApiMaker(B2BResendDTO DTO){
		this.type = DTO.getType();
		this.memberId = DTO.getMemberId();
		this.trId = DTO.getTrId();
		this.eventId = DTO.getEventId();
	}
	
	public ApiMaker(B2BAllOrderCancelDTO DTO){
		this.type = DTO.getType();
		this.memberId = DTO.getMemberId();
		this.trId = DTO.getTrId();
		this.eventId = DTO.getEventId();
	}
	
	
	public ApiMaker(Object dto) {
		if(dto instanceof B2BCSLSSendDTO) {
			B2BCSLSSendReturnDTO = new B2BCSLSSendDTO();
			this.type = "cslssend";
			B2BCSLSSendReturnDTO.setMemberId(((B2BCSLSSendDTO) dto).getMemberId());
			B2BCSLSSendReturnDTO.setTrId(((B2BCSLSSendDTO) dto).getTrId());
			B2BCSLSSendReturnDTO.setEventId(((B2BCSLSSendDTO) dto).getEventId());
			B2BCSLSSendReturnDTO.setGoodsId(((B2BCSLSSendDTO) dto).getGoodsId());
			B2BCSLSSendReturnDTO.setOrderCnt(((B2BCSLSSendDTO) dto).getOrderCnt());
			B2BCSLSSendReturnDTO.setReceivermobile(((B2BCSLSSendDTO) dto).getReceivermobile());
			B2BCSLSSendReturnDTO.setTmessage(((B2BCSLSSendDTO) dto).getTmessage());
			B2BCSLSSendReturnDTO.setCmessage(((B2BCSLSSendDTO) dto).getCmessage());
		}else if(dto instanceof B2BResendDTO){
			
			B2BResendReturnDTO = new B2BResendDTO();
			this.type = "resend";
			B2BResendReturnDTO.setEventId(((B2BResendDTO) dto).getEventId());
			B2BResendReturnDTO.setMemberId(((B2BResendDTO) dto).getMemberId());
			B2BResendReturnDTO.setTrId(((B2BResendDTO) dto).getTrId());
		}else if(dto instanceof B2BAllOrderCancelDTO) {
			B2BAllOrderCancelReturnDTO = new B2BAllOrderCancelDTO();
			this.type = "allordercancel";
			B2BAllOrderCancelReturnDTO.setEventId(((B2BAllOrderCancelDTO) dto).getEventId());
			B2BAllOrderCancelReturnDTO.setMemberId(((B2BAllOrderCancelDTO) dto).getMemberId());
			B2BAllOrderCancelReturnDTO.setTrId(((B2BAllOrderCancelDTO) dto).getTrId());
		}else if(dto instanceof B2BCouponDetailDTO) {
			B2BCouponDetailReturnDTO = new B2BCouponDetailDTO();
			this.type = "coupondetail";
			B2BCouponDetailReturnDTO.setEventId(((B2BCouponDetailDTO) dto).getEventId());
			B2BCouponDetailReturnDTO.setMemberId(((B2BCouponDetailDTO) dto).getMemberId());
			B2BCouponDetailReturnDTO.setTrId(((B2BCouponDetailDTO) dto).getTrId());
		}
	}

	String getCslssendUri(){
		return HOST + LSSEND + Type.CSLSSEND.getType() + DOTHC + B2BCSLSSendReturnDTO.toString();
	}
	
	String getResendUri(){
		return HOST + LSSEND + Type.RESEND.getType() + DOTHC + B2BResendReturnDTO.toString();
	}
	
	String getAllOrderCancelUri(){
		return HOST + LSSEND + Type.ALLORDERCANCEL.getType() + DOTHC + B2BAllOrderCancelReturnDTO.toString();
	}
	
	String getCouponDetailUri(){
		return HOST + LSSEND + Type.COUPONDETAIL.getType() + DOTHC + B2BCouponDetailReturnDTO.toString();
	}

	String getSendUri() {
		switch(this.type) {
		case "cslssend":
			return getCslssendUri();
		case "resend":
			return getResendUri();
		case "allordercancel":
			return getAllOrderCancelUri();
		case "coupondetail":
			return getCouponDetailUri();
		default:
			return "invalid type request >>>>> type : " + this.type;
		}
	}
	
}
