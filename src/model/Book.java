package model;

import java.time.LocalDate;

public class Book {
	private int id;
	private String title;
	private String kinds;
	private LocalDate deadline;
	private boolean loan;

	public Book(String title, String kinds) {
		this.id += BookRegister.getMaxId() + 1;
		this.title = title;
		this.kinds = kinds;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	public boolean isLoan() {
		return loan;
	}

	public void setLoan(boolean loan) {
		this.loan = loan;
	}

	@Override
	public String toString() {
		return "ID: " + id
				+ ", タイトル: " + title
				+ ", ジャンル: " + kinds;
	}

}
