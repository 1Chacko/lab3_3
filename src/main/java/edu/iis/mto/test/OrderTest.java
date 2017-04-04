package edu.iis.mto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;

public class OrderTest {

	@Test
	public void testThrowOfOrderExpiredException() {
		
		Order order = new Order();
		order.submit();
		order.confirm();
		
	}

}
