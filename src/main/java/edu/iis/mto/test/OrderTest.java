package edu.iis.mto.test;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsEqual.equalTo;

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
		assertThat(order.getOrderState(), is(equalTo(Order.State.CANCELLED)));
	}
	
	@Test(expected = OrderStateException.class)
	public void testThrowOfOrderStateException() {
		
		Order order = new Order();
		order.confirm(new RealClock());
		
	}
	
	@Test
	public void testStateIsConfirmed() {
		
		Order order = new Order();
		order.submit();
		order.confirm(new RealClock());
		assertThat(order.getOrderState(), is(equalTo(Order.State.CONFIRMED)));
	}
	
	@Test
	public void testStateIsRealized() {
		
		Order order = new Order();
		order.submit();
		order.confirm(new RealClock());
		order.realize();
		assertThat(order.getOrderState(), is(equalTo(Order.State.REALIZED)));
	}
	
}
