//Program to demonstrate inter-thread communication
package org.tnsif.interthreadcommunication;

public class InterThreadCommunicationDemo {

	public static void main(String[] args) {
		
		//Shared Resource
		Q obj = new Q();
		
		Producer producerThread = new Producer(obj); //Producer Thread
		Consumer consumerThread = new Consumer(obj); //Consumer thread
		
		try {
			producerThread.join(); 
			consumerThread.join();
		}
		catch(InterruptedException e){
			System.out.println(e);
		}

		System.out.println("--------- End of main() -------------");
	}

}
