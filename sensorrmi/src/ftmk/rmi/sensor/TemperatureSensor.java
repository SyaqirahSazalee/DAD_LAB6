package ftmk.rmi.sensor;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * This interface represents temperature sensor
 * 
 * @author emalianakasmuri
 *
 */
public interface TemperatureSensor extends Remote {
	
	/**
	 * This method gets current temperature
	 * 
	 * @return current temperature
	 * 
	 * @throws RemoteException
	 */
	public int getTemperature() throws RemoteException;

	/**
	 * This method gets temperature for a specific day
	 * 
	 * @return current temperature
	 * 
	 * @throws RemoteException
	 */
	
	public int getTemperatureDay(String Day)throws RemoteException;
	
	public float getAverageTemperature() throws RemoteException;
}
