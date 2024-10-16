package library.books;
class books{
	String title;
	String author;
	String isbn;
	books(String t,String a,String i){
		title=t;
		author=a;
		isbn=i;
	}
	void getdetails(){
		System.out.println("Tittle:"+title);
		System.out.println("Author:"+author);
		System.out.println("Isbn:"+isbn);	
	}
}		
		
	package library.members;
class members{
	 String name;
	 String memberid;
	 members(String n,String mid){
	 	name=n;
	 	memberid=mid;
	 }
	 void getmemberinfo(){
	 	System.out.println("Name:"+name);
	 	System.out.println("MemberId:"+memberid);
	 }
}	
	
