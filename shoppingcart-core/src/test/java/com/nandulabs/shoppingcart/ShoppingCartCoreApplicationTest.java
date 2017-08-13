/**
 * 
 */
package com.nandulabs.shoppingcart;

import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nandulabs.shoppingcart.common.services.EmailService;

/**
 * @author Nandu
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ShoppingCartCoreApplication.class)
public class ShoppingCartCoreApplicationTest {
	
	@Autowired
	DataSource dataSource;
	@Autowired
	EmailService emailService;

	@Test
	public void testDummy() throws SQLException {
		String schema = dataSource.getConnection().getCatalog();
		assertTrue("shoppingcart".equalsIgnoreCase(schema));
	}

	@Test
	@Ignore
	public void testSendEmail() {
		emailService.sendEmail("admin@gmail.com", "ShoppingCart - Test Mail", "This is a test email from ShoppingCart");
	}

}