package edu.iis.mto.fakeclock;

public class FakeClock implements IClockInterface {

	private static final long THREE_DAYS = 72*60*60*1000;
	
	@Override
	public long currentTimeMillis() {
		return System.currentTimeMillis() + THREE_DAYS;
	}

}
