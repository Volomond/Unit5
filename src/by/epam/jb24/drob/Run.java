package by.epam.jb24.drob;

public class Run {

	public static void main(String[] args) {
		String mas[] = new String[5];
		
		Drob d0 = new Drob(1,2);
		Drob d1 = new Drob(3,4);
		Drob d2 = new Drob(5,6);
		Drob d3 = new Drob(7,8);
		Drob d4 = new Drob(9,10);
		mas[0] = d0.getViewDrop();
		mas[1] = d1.getViewDrop();
		mas[2] = d2.getViewDrop();
		mas[3] = d3.getViewDrop();
		mas[4] = d4.getViewDrop();
		printArray(mas);
	}

	public static void printArray (String[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas[" + i + "]=" + mas[i] + ";");
			
		}System.out.println();
	}
}
