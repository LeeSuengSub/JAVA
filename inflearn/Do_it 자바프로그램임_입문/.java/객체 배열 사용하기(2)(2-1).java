package array;

public class Book {
	private String BookName;
	private String author;
	
	public Book() {}
	public Book(String BookName, String author) {
		this.BookName = BookName;
		this.author = author;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(BookName+","+author);
	}
}
