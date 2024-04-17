package task1;

public class Library {

	private String title;
	private String author;
	private long ISBN;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Library(String title, String author, long iSBN) {
		super();
		this.title = title;
		this.author = author;
		ISBN = iSBN;
	}

	@Override
	public String toString() {
		return "Library [title=" + title + ", author=" + author + ", ISBN=" + ISBN + "]";
	}

}
