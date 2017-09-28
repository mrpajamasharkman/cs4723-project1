package org.apache.commons.mail;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
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
	
	//  Done
	//  Email addBcc(String... emails) 
	@Test
	public void testAddBcc() throws Exception {
		System.out.println("Running: testAddBcc");
		
		List<InternetAddress> aCollection = new ArrayList<InternetAddress>();		
		aCollection.add(new InternetAddress("qqa368@gmail.com"));
		aCollection.add(new InternetAddress("lucas.tiedeman@gmail.com"));
		aCollection.add(new InternetAddress("ryne@swbell.net"));
		
		email.addBcc(new String[] {"qqa368@gmail.com","lucas.tiedeman@gmail.com","ryne@swbell.net"});
		
		assertEquals(aCollection, email.getBccAddresses());
	}

	//	Done
	//  Email addCc(String email)
	@Test
	public void testAddCc() throws EmailException {
		System.out.println("Running: testAddCc");
		
		assertEquals(email.addCc("lucastiedeman@gmail.com"),email);
	}

	//	Done
	//  void addHeader(String name, String value)
	@Test (expected = IllegalArgumentException.class)
	public void testAddHeader1() throws IllegalArgumentException {
		System.out.println("Running: testAddHeader1");
		
		email.addHeader("Lucas Tiedeman", "Test");
	}
	
	@Rule
	ExpectedException exception = ExpectedException.none();	

	//	Done
	// void addHeader(String name, String value)
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
	//  void addHeader(String name, String value)
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
	//  Email addReplyTo(String email, String name)
	@Test
	public void testAddReplyTo() throws EmailException {
		System.out.println("Running: testAddReplyTo");
		
		assertEquals(email.addReplyTo("lucastiedeman@gmail.com"), email);
	}
	
	//  void buildMimeMessage()
	@Test
	public void testBuildMimeMessage1() throws EmailException{
		System.out.println("Running: testBuildMimeMessage1");
		
		email.setHostName("Test Host");
		email.setFrom("qqa368@asap.utsa.edu");
		email.addTo("lucas.tiedeman@gmail.com");
		email.addCc("mrpajamasharkman@yahoo.com");
		email.addBcc("the_dunadan@swbell.net");
		email.addReplyTo("randall.munroe@xkcd.com");
		email.addHeader("Test Header", "Test Header Value");email.setSubject("Test Subject");
		email.setCharset("UTF-8");
		try {
			email.buildMimeMessage();
		}
		catch (EmailException emailException) {
			System.out.println(emailException.toString());
		}
		catch (IllegalStateException stateException) {
			System.out.println(stateException);
		}
		}
	
	@Test
	public void testBuildMimeMessage2() throws EmailException{
		System.out.println("Running: testBuildMimeMessage2");
		
		String string = new String();
		
		email.setHostName("Test Host");
		email.addTo("lucas.tiedeman@gmail.com");
		email.setSubject("Test Subject");
		email.setCharset("UTF-8");
		email.setContent(null, null);
		try {
			email.buildMimeMessage();
		}
		catch (EmailException emailException) {
			System.out.println(emailException.toString());
		}
		catch (IllegalStateException stateException) {
			System.out.println(stateException);
		}
		email.setContent(new String(), "String");
		try {
			email.buildMimeMessage();
		}
		catch (EmailException emailException) {
			System.out.println(emailException.toString());
		}
		catch (IllegalStateException stateException) {
			System.out.println(stateException);
		}
	}
	
	@Test
	public void testBuildMimeMessage3() throws EmailException{
		System.out.println("Running: testBuildMimeMessage3");
		
		String string = new String();
		
		email.setHostName("Test Host");
		email.setFrom("qqa368@asap.utsa.edu");
		email.setSubject("Test Subject");
		email.setCharset("UTF-8");
		email.setContent("A Test String", EmailConstants.TEXT_PLAIN);
		try {
			email.buildMimeMessage();
		}
		catch (EmailException emailException) {
			System.out.println(emailException.toString());
		}
		catch (IllegalStateException stateException) {
			System.out.println(stateException);
		}
	}
	
	//	Done
	//  String getHostName()
	@Test
	public void testGetHostName() {
		System.out.println("Running: testGetHostName");
		
		assertEquals(null, email.getHostName());
		email.setHostName("Host name");
		assertEquals("Host name", email.getHostName());
		email.setMailSession(Session.getInstance(System.getProperties()));
		assertEquals(null, email.getHostName());
	}
	
	//	Done
	//  Session getMailSession()
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
	//  Date getSentDate()
	@Test
	public void testGetSentDate() {
		System.out.println("Running: testGetSentDate");
		
		assertEquals(email.getSentDate(), new Date());
		
		Date date = new Date();
		email.setSentDate(date);
		assertEquals(email.getSentDate(), date);
	}
	
	//	Done
	//  int getSocketConnectionTimeout()
	@Test
	public void testGetSocketConnectionTimeout() {
		System.out.println("Running: testGetSocketConnectionTimeout");
		
		assertEquals(email.getSocketConnectionTimeout(), (int)email.getSocketConnectionTimeout());
	}
	
	//  String send()
	@Test
	public void testSend() throws EmailException {
		System.out.println("Running: testSend");
		
		String messageID = email.send();
		email.buildMimeMessage();
		
		assertEquals(messageID, email.sendMimeMessage());
	}

	//	Done
	//  Email setFrom(String email)
	@Test
	public void testSetFrom() throws EmailException {
		System.out.println("Running: testSetFrom");
		
		assertEquals(email.setFrom("lucastiedeman@gmail.com"), email);
	}
	
	//	Done
	//  void updateContentType(String aContentType)
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
