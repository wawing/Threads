
//One way to create threads is using the 'Runnable' interface
//	Create Thread by Implementing Runnable Interface
	public class RunnableDemo implements Runnable {
		   private Thread t;
		   private String threadName;
		   
		   RunnableDemo( String name){
		       threadName = name;
		       System.out.println("Creating " +  threadName );
		   }
		   public void run() {// this method is called when the thread start method is called
		      System.out.println("Running " +  threadName );
		      try {
		         for(int i = 4; i > 0; i--) {
		            System.out.println("Thread: " + threadName + ", " + i);
		            // Let the thread sleep for a while.
		            Thread.sleep(50);
		         }
		     } catch (InterruptedException e) {
		         System.out.println("Thread " +  threadName + " interrupted.");
		     }
		     System.out.println("Thread " +  threadName + " exiting.");
		   }
		   
		   public void start ()
		   {
		      System.out.println("Starting " +  threadName );
		      if (t == null)
		      {
		         t = new Thread (this, threadName);
			   /*
			    * calling start( ) method, which executes a call to run( ) method. 
			    */
		         t.start ();
		      }
		   }
}
