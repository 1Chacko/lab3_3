package edu.iis.mto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.fakeclock.FakeClock;
import edu.iis.mto.fakeclock.RealClock;
import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;
import edu.iis.mto.time.OrderStateException;

public class OrderTest {

	@Test(expected = OrderExpiredException.class)
	public void testThrowOfOrderExpiredException() {
		
		Order order = new Order();
		order.submit();
		order.confirm(new FakeClock());
		
	}
	
	@Test(expected = OrderStateException.class)
	public void testThrowOfOrderStateException() {
		
		Order order = new Order();
		order.confirm(new RealClock());
		
	}
	
}
