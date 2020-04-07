package shapes;

public class MyPic {
	public static void main(String[] args) 
	{
		Picture pic = new Picture(800,450);
		Circle c1 = new Circle(550,220,100);
		Circle c2 = new Circle(400,165,60);
		Circle c3 = new Circle(365,170,7);
		
		Triangle t1 = new Triangle(330, 235, 345, 190, 360, 210);
		Triangle t2 = new Triangle(490, 230, 540, 170, 580, 240);

		Line l1 = new Line(320,235,340,235);
		Line l2 = new Line(290,260,315,260);
		Line l3 = new Line(130,350,150,350);
		Line l4 = new Line(100,320,140,320);
		Line l5 = new Line(190,300,210,300);
		Line l6 = new Line(240,310,260,310);
		
		Line l7 = new Line(515,313,515,380);
		Line l8 = new Line(495,376,515,360);
		Line l9 = new Line(500,382,515,360);
		Line l10 = new Line(585,313,585,380);
		Line l11 = new Line(565,376,585,360);
		Line l12 = new Line(570,382,585,360);
		
		pic.add(c1);
		pic.add(c2);
		pic.add(c3);

		pic.add(t1);
		pic.add(t2);
		
		pic.add(l1);
		pic.add(l2);
		pic.add(l3);
		pic.add(l4);
		pic.add(l5);
		pic.add(l6);
		
		pic.add(l11);
		pic.add(l12);
		pic.add(l7);
		pic.add(l8);
		pic.add(l9);
		pic.add(l10);
		
//		Rectangle rect = new Rectangle(300, 300, 10, 10);
//		pic.add(rect);
		pic.draw();	
	}
}
