package by.epam.jb24.drob;

public class Drob {
 private int num;
 private int den;
 private String viewDrob;
	
public  Drob (int newNum,int newDen) {
	num = newNum;
	den = newDen;
	viewDrob = num + "/" + den; 
}
public String getViewDrop() {
	return viewDrob;
}
 
 
}