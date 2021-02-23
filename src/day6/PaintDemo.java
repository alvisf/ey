package day6;

public class PaintDemo {
	 public static void main(String[] args) throws Exception{
		PaintBrush brush = Container.getBrush(args[0]);
		brush.doPaint();
		
	}
}
	class PaintBrush{
		Paint paint;
		public void doPaint() {
			System.out.println(paint);
		}
		
	}
	
	class Container{
		public static PaintBrush getBrush(String className) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
			PaintBrush brush= new PaintBrush();
			Paint paint=(Paint)Class.forName(className).newInstance();
			brush.paint=paint;
			return brush;
			
		}
	}
	
	abstract class Paint{
		
	}
	
	class RedPaint extends Paint{
		
	}
	
	class BluePaint extends Paint{
		
	}


