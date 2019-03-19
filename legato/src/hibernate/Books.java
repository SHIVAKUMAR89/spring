package hibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name="Books_Details")
public class Books {
	@Id
	@Column (name="BookId")
	@GeneratedValue
	private int bookId;
	@Column (name="IssueDate")
	private Date bookingDate;
	

	
	@Column (name="BookName")
	private String bookName;
	
public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
public int getBookId() {
		return bookId;
	}
	public void setBookId() {
		this.bookId = bookId;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date date) {
		this.bookingDate = date;
	}
public Books() {


}
public String toString() {
	return "book Id:"+this.bookId+"Book Name:"+this.bookName+"Issu Date:"+this.bookingDate;
}
}