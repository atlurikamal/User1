
package model;

public class BookModel {

    public BookModel(String uname, int bid, String bname, String author, int price) {
        this.uname = uname;
        this.bid = bid;
        this.bname = bname;
        this.author = author;
        this.price = price;
    }

    public BookModel() {
    }
    private String uname;
    private int bid;
    private String bname;
    private String author;
    private int price;
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
