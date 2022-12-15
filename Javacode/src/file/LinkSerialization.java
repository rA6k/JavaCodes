package file;

import java.io.*;

class Link implements Serializable {
	private String commons;
	private int favorites;
	public Link(String commons, int favorites) {
		this.commons = commons;
		this.favorites = favorites;
	}
	public void printLink() {
		System.out.println("Link : " + this.commons);
	}
}

public class LinkSerialization {
	public static void SerializeLink(Link inputLink, String fileName) throws IOException{
		FileOutputStream file = new FileOutputStream(fileName);
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(inputLink);
		out.close();
		file.close();
	}
		public static Link deserializeLink (String fileName) throws IOException, ClassNotFoundException{
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream on = new ObjectOutputStream(file);
			return(Link) on.readOject();
		}

	public static void main (String[] args) throws IOException, ClassNotFoundException {
		Link randomLink = new Link("My first link", 6);
		final String fileName = "D:\\JAVA\\test.txst";
		System.out.println("Prior to Serialization : ");
		randomLink.printLink();
		SerializeLink(randomLink, fileName);
		Link linkFromFile = deserializeLink(fileName);
		System.out.println("Following Serilization");
		linkFromFile.printLink();
		

	}

}
