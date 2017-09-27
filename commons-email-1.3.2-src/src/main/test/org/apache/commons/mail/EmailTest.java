package org.apache.commons.mail;

import java.util.Date;

import javax.mail.Session;
import javax.naming.NamingException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import junit.framework.TestCase;

public class EmailTest extends TestCase {

	protected SimpleEmail email;
	
	@Override
	protected void setUp() {
		System.out.println("Running: setUp");
		email = new SimpleEmail();
	}
	
	
	//	Done
	@Test
	public void testAddBcc() throws EmailException {
		System.out.println("Running: testAddBcc");
		
		assertEquals(email.addBcc("lucastiedeman@gmail.com"), email);
	}

	//	Done
	@Test
	public void testAddCc() throws EmailException {
		System.out.println("Running: testAddCc");
		
		assertEquals(email.addCc("lucastiedeman@gmail.com"),email);
	}

	//	Done
	@Test (expected = IllegalArgumentException.class)
	public void testAddHeader1() throws IllegalArgumentException {
		System.out.println("Running: testAddHeader1");
		
		email.addHeader("Lucas Tiedeman", "Test");
	}
	
	@Rule
	ExpectedException exception = ExpectedException.none();	

	//	Done
	@Test (expected = IllegalArgumentException.class)
	public void testAddHeader2() throws IllegalArgumentException {
		System.out.println("Running: testAddHeader2");
		
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("name can not be null or empty");
		try {
			email.addHeader(null, "Test");
			fail("Expected an IllegalArgumentException to be thrown");
		}
		catch (IllegalArgumentException argumentException) {
			assertTrue(argumentException.getMessage().equals("name can not be null or empty"));
		}
	}	

	//	Done
	@Test (expected = IllegalArgumentException.class)
	public void testAddHeader3() throws IllegalArgumentException {
		System.out.println("Running: testAddHeader3");
		
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("name can not be null or empty");
		try {
			email.addHeader("Lucas Tiedeman", null);
			fail("Expected an IllegalArgumentException to be thrown");
		}
		catch (IllegalArgumentException argumentException) {
			assertTrue(argumentException.getMessage().equals("value can not be null or empty"));
		}
	}

	//	Done
	@Test
	public void testAddReplyTo() throws EmailException {
		System.out.println("Running: testAddReplyTo");
		
		assertEquals(email.addReplyTo("lucastiedeman@gmail.com"), email);
	}
	
	@Test
	public void testBuildMimeMessage() throws EmailException{
		System.out.println("Running: testBuildMimeMessage");
		
		exception.expect(IllegalStateException.class);
		email.setMsg("Test message test message test message");
		email.buildMimeMessage();
	}
	
	//	Done
	@Test
	public void testGetHostName() {
		System.out.println("Running: testGetHostName");
		
		assertEquals(null, email.getHostName());
		email.setHostName("Host name");
		assertEquals("Host name", email.getHostName());
	}
	
	//	Done
	@Test
	public void testGetMailSession() throws EmailException, NamingException {
		System.out.println("Running: testGetMailSession");
		
		try {
			email.setHostName("HostName");
			email.getMailSession();
		}
		catch (EmailException emailException) {
			assertTrue(emailException.getMessage().equals("Cannot find valid hostname for mail session"));
		}
	}

	//	Done
	@Test
	public void testGetSentDate() {
		System.out.println("Running: testGetSentDate");
		
		assertEquals(email.getSentDate(), new Date());
		email.setSentDate(new Date());
		assertEquals(email.getSentDate(), new Date());
	}
	
	//	Done
	@Test
	public void testGetSocketConnectionTimeout() {
		System.out.println("Running: testGetSocketConnectionTimeout");
		
		email.getSocketConnectionTimeout();
	}
	
	@Test
	public void testSend() throws EmailException {
		System.out.println("Running: testSend");
		
		email.send();
	}

	//	Done
	@Test
	public void testSetFrom() throws EmailException {
		System.out.println("Running: testSetFrom");
		
		assertEquals(email.setFrom("lucastiedeman@gmail.com"), email);
	}
	
	//	Done
	@Test
	public void testUpdateContentType() {
		System.out.println("Running: testContentType");
		
		email.updateContentType("Content Type");
		email.updateContentType(null);
		email.updateContentType("Content T; charset=ype");
		email.updateContentType("text/");
	}
	
	@Override
	protected void tearDown() {
		System.out.println("Running: tearDown");
		try{
			email = null;
			assertNull(email);
		}catch (NullPointerException npe){
			System.err.println("Failed: tearDown");
			System.err.println(npe);
		}
	}
}
