package com.springtweaks.cart.core;

import static org.junit.Assert.*;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoppingCartCoreApplicationTests {

	@Autowired DataSource dataSource;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testDummy() throws SQLException {
		String schema = dataSource.getConnection().getCatalog();
		assertEquals("shopping-cart", schema);
	}

}
