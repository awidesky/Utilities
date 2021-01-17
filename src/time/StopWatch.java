package time;

public class StopWatch {

	long start;
	long elapsed = 0L;
	
	long total = 0L;
	//double average = 0.0;
	
	long runcount = 0L;
	
	String name;
	
	public StopWatch(String message) {
		
		name = message;
		
	}
	
	public void start() {
		
		runcount++;
		start = System.nanoTime();
		
	}
	
	public void stop() {
		
		elapsed = System.nanoTime() - start;
		total += elapsed;
		
	}
	
	public void reset() {
		
		elapsed = 0L;
		total = 0L;
		runcount = 0L;
		
	}
	
	
	 /**
	  * 
	  * Return the latest measured nanoTime.
	  * 
	  * */
	public long getNano() {
		
		if(elapsed == 0L) stop();
		
		return elapsed;
		
	}
	
	 /**
	  * 
	  * Return the latest measured MilliTime.
	  * 
	  * */
	public double getMillis() {
		
		if(elapsed == 0L) stop();
		
		return elapsed / 1000000.0;
		
	}
	
	
	@Override
	public String toString() {
		
		return name + " - Run Count : " + runcount +", Total : " + (total / 1000000.0) + "ms, Everage : " + ( (total / runcount) / 1000000.0 );
		
	}
	
}
