import java.awt.*;
import java.applet.*;

public class ThreadTest extends Applet implements Runnable{
   String str = "This is a simple Banner ";
   Thread t ;
   boolean b;
   public void init() {
      setBackground(Color.gray);
      setForeground(Color.yellow);
   }
   public void start() {
      t = new Thread(this);
      b = false;
      t.start();
   }
   public void run () {
      char ch;
      for( ; ; ) {
      try {
         repaint();
         Thread.sleep(250);
         ch = str.charAt(0);
         str = str.substring(1, str.length());
         str = str + ch;
      }
      catch(InterruptedException e) {}
      }
   }
   public void paint(Graphics g) {
      g.drawRect(1,1,300,150);
      g.setColor(Color.yellow);
      g.fillRect(1,1,300,150);
      g.setColor(Color.red);
      g.drawString(str, 1, 150);
   }
}
//
//
////Javavids welcome program Java multi threads  (video 11)
//public class Banner extends Applet implements Runnable 
//{
// Threat t;
// String s = " Welcome to Banner Program";
// public void start ()
// {
//   if ( t == null){
//    t =  new Thread (this);
//    t.start();
//    }
// }
// public void stop()
// {
//   if ( 1 ~= null) {
//     t.stop();
//   }
// }
//public void Paint(Graphics g)
//{
//   g.drawString (s, 10, 50);
//} 
//public void run()
//{
//	 char ch;
//   while(true){
//    ch = s.charAt(0);
//    s = s.substring(1, s.length);
//    s += ch;
//    repaint();
//    try {
//      Thread.sleep(500);
//    } catch (InterruptedException e){}
//   }
//}
//
//public class ThreadTest {
//	public static void main(String args[]) {
//	
////	  DispThread dt1 = new DispThread("Hello");
////	  DispThread dt2 = new DispThread("World");
////	  dt1.start();  // call user thread from main thread 
////	  dt2.start();
//	
//	}  
//
//}
//}