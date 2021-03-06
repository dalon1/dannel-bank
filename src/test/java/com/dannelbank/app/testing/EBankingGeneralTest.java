package com.dannelbank.app.testing;

import com.dannelbank.app.providers.AuthenticationProvider;
import com.dannelbank.app.models.Authentication;
import com.dannelbank.app.testing.mocks.MockCustomer;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class EBankingGeneralTest {

	MockCustomer mockCustomer = new MockCustomer();
	@Test
	@Ignore
	public void test() {
		fail("Not yet implemented");
	}
	
	@Before
	public void setUp() {
		// Nothing for now!
	}
	
	@Test
	public void authenticateRegisteredCustomer() {
		Authentication auth = mockAuthentication(
				mockCustomer.getRegisteredCustomer().getEmailAddress(),
				mockCustomer.getRegisteredCustomer().getPassword());
		AuthenticationProvider provider = mockAuthenticationProvider(auth);
		provider.retrieveCustomer();
		assertEquals(true, auth.getIsAuthentic());
		assertNotNull(auth.getAuthenticCust());
		assertEquals("Dannel", auth.getAuthenticCust().getCustomerName().getFirstName());
		assertEquals("Alon", auth.getAuthenticCust().getCustomerName().getLastName());
	}
	
	@Test
	public void authenticateNonRegisteredCustomer() {
		Authentication auth = mockAuthentication(
				mockCustomer.getNonRegisteredCustomer().getEmailAddress(),
				mockCustomer.getNonRegisteredCustomer().getPassword());
		AuthenticationProvider provider = mockAuthenticationProvider(auth);
		provider.retrieveCustomer();
		assertEquals(false, auth.getIsAuthentic());
		assertNull(auth.getAuthenticCust());
	}
	
	public Authentication mockAuthentication(String emailAddress, String password) {
		Authentication auth = new Authentication();
		auth.setUsername(emailAddress);
		auth.setPassword(password);
		return auth;
	}
	
	public AuthenticationProvider mockAuthenticationProvider(Authentication authentication) {
		AuthenticationProvider provider = new AuthenticationProvider();
		provider.authentication = authentication;
		return provider;
	}
}
