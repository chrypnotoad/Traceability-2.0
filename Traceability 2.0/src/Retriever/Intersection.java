package Retriever;
//testing netbeans
public class Intersection {
	private Token t;
	private Document d;
	private double weight;
	private int tfi;
	
	public Intersection(int tfi){
		this.tfi = tfi;
	}
	
	public void setWeight(double w){
		weight = w;
	}
	public int getTFI(){
		return tfi;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public Token getToken(){
		return t;
	}
	
}