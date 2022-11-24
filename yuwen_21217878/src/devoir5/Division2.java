package devoir5;

import java.rmi.RemoteException;

public class Division2 extends Division{
	
	public static void main(String[] args) { try {
		division();
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} }
	
	public static void division() throws RemoteException{ 
		int i = 1000, j;
		do {i--; j = 1 / i;} while (true);
	}
		}
	

	

