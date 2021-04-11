package dto;

public class B2BCSLSSendDTO extends B2BDTO{
	
	
	private String goodsId;
	private String orderCnt;
	private String receivermobile;
	private String tmessage;
	private String cmessage;
	
	
	protected final String GOODSID			=	"&GOODS_ID=";
	protected final String ORDERCNT			=	"&ORDER_CNT=";
	protected final String RECEIVERMOBILE	=	"&RECEIVERMOBILE=";
	protected final String TMESSAGE			=	"&TMESSAGE=";
	protected final String CMESSAGE			=	"&CMESSAGE=";
	
	
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getOrderCnt() {
		return orderCnt;
	}
	public void setOrderCnt(String orderCnt) {
		this.orderCnt = orderCnt;
	}
	public String getReceivermobile() {
		return receivermobile;
	}
	public void setReceivermobile(String receivermobile) {
		this.receivermobile = receivermobile;
	}
	public String getTmessage() {
		return tmessage;
	}
	public void setTmessage(String tmessage) {
		this.tmessage = tmessage;
	}
	public String getCmessage() {
		return cmessage;
	}
	public void setCmessage(String cmessage) {
		this.cmessage = cmessage;
	}
	
	public String toString() {
		if(this.tmessage == null || this.cmessage == null) {
			System.out.println("tmessage or cmessage is null");
			return super.EVENTID + super.getEventId()+
					super.MEMBERID + super.getMemberId()+
					super.TRID + super.getTrId()+
					GOODSID + this.goodsId+
					ORDERCNT + this.orderCnt+
					RECEIVERMOBILE + this.receivermobile;
		}
		else {
			System.out.println("tmessage or cmessage is not null");
			return super.EVENTID + super.getEventId()+
					super.MEMBERID + super.getMemberId()+
					super.TRID + super.getTrId()+
					GOODSID + this.goodsId+
					ORDERCNT + this.orderCnt+
					RECEIVERMOBILE + this.receivermobile+
					TMESSAGE + this.tmessage+
					CMESSAGE + this.cmessage;
		}
	}
}
