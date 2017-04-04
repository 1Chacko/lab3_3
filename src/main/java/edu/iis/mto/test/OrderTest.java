package edu.iis.mto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.time.Order;

public class OrderTest {

	@Test
	public void testThrowOfOrderExpiredException() {
		Order order = new Order();
		order.submit();
		order.confirm();
	}

}
