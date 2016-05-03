//http://www.tutorialspoint.com/java/java_multithreading.htm

public class myMainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create thread using the Runnable interface
	     RunnableDemo R1 = new RunnableDemo( "thr#1");
	      R1.start();
	      RunnableDemo R2 = new RunnableDemo( "thr#2");
	      R2.start();
	      
	      //create thread by extending class from Thread Class
	      ThreadDemo T1 = new ThreadDemo( "Thread#1");
	      T1.start();
	      ThreadDemo T2 = new ThreadDemo( "Thread#2");
	      T2.start();	      
	}

}
