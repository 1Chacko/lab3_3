package edu.iis.mto.fakeclock;

public class RealClock implements IClockInterface {

	@Override
	public long currentTimeMillis() {
		return System.currentTimeMillis();
	}

}
