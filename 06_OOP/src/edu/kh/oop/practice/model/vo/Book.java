package edu.kh.oop.practice.model.vo;

public class Book {
	private String title;
	private int price;
	private double discoumtRate;
	private String author;
	
	
	public Book() {
		// TODO Auto-generated constructor stub
	}


	public Book(String title, int price, double discoumtRate, String author) {
		this.title = title;
		this.price = price;
		this.discoumtRate = discoumtRate;
		this.author = author;
	}


	@Override
	public String toString() {
		return title + " / " + price + " / " + discoumtRate + " / "+ author;
	}


	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public double getDiscoumtRate() {
		return discoumtRate;
	}


	public void setDiscoumtRate(double discoumtRate) {
		this.discoumtRate = discoumtRate;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
