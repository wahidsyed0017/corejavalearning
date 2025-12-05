package Static;

public class Book {
	 
		String title;
		String author;

		Book(String t, String a) {
			title = t;
			author = a;
		}

		Book(Book b) {
			title = b.title;
			author = b.author;
		}

		public void showBook() {
			System.out.println(title + " - " + author);
		}

		public static void main(String[] args) {

			Book book1 = new Book("Java", "James");
			Book book2 = new Book(book1);
			book1.showBook();
			book2.showBook();
		}

}
