import java.util.Scanner;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {

		System.out.print("Enter any animal's name :");
		/*Scanner input=new Scanner (System.in);
		String s=input.next();*/
		String sb=JOptionPane.showInputDialog(null);
		String s=sb;
		if(s=="Dog")
		{
			aboutDog ad=new aboutDog();
			ad.setVisible(true);
		}
		else if(s=="Snake")
		{
			aboutSnake as=new aboutSnake();
			as.setVisible(true);
		}
		else if(s=="Horse")
		{
			aboutHorse ah=new aboutHorse();
			ah.setVisible(true);
		}
		else if(s=="Bird")
		{
			aboutBird ab=new aboutBird();
			ab.setVisible(true);
		}
		else {
			AnimalInformation sc=new AnimalInformation();
			sc.setVisible(true);
		}
		/*Dog d=new Dog("Canis lupus familiaris",true,30.0,"husky");
		Cat c=new Cat("Felis catus",true,4,true);
		Bird b=new Bird("Aves",false,"yellow and green",true);
		Snake s=new Snake("Serpentes",false,"Reptilia",true);
		Horse h=new Horse("Equus caballus",false,25,45.5);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(s);
		System.out.println(h);*/
	}
}
