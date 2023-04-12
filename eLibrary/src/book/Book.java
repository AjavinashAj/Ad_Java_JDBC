package book;

public class Book {
	private String bId;
	private String bname;
	private String bauthor;
	private Double bprice;
	private Integer qty;
	public String getbId() {
		return bId;
	}
	public void setbId(String bId) {
		this.bId = bId;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public Double getBprice() {
		return bprice;
	}
	public void setBprice(Double bprice) {
		this.bprice = bprice;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bname=" + bname + ", bauthor=" + bauthor + ", bprice=" + bprice + ", qty=" + qty
				+ "]";
	}
	

}
