package edu.iis.mto.fakeclock;

public class FakeClock implements IClockInterface {

	private static final long DAY = 24*60*60*1000;
	
	@Override
	public long currentTimeMillis() {
		return System.currentTimeMillis() + DAY;
	}

}
