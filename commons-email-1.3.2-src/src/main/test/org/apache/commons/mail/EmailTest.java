package org.apache.commons.mail;

import java.util.Date;
import org.junit.Test;
import junit.framework.TestCase;

public class EmailTest extends TestCase {

	protected SimpleEmail email;
	
	@Override
	protected void setUp() {
		System.out.println("Running: setUp");
		email = new SimpleEmail();
	}
	
	@Test
	public void testAddBcc() throws EmailException {
		System.out.println("Running: testAddBcc");
		assertEquals(email.addBcc("lucastiedeman@gmail.com"), email);
	}
	
	@Test
	public void testAddCc() throws EmailException {
		System.out.println("Running: testAddCc");
		assertEquals(email.addCc("lucastiedeman@gmail.com"),email);
	}
	
	@Test
	public void testAddHeader() {
		System.out.println("Running: testAddHeader");
	}
	
	@Test
	public void testAddReplyTo() throws EmailException {
		System.out.println("Running: testAddReplyTo");
		assertEquals(email.addReplyTo("lucastiedeman@gmail.com"), email);
	}
	
	@Test
	public void testBuildMimeMessage() {
		System.out.println("Running: testBuildMimeMessage");
		
	}
	
	@Test
	public void testGetHostName() {
		System.out.println("Running: testGetHostName");
		
	}
	
	@Test
	public void testGetMailSession() {
		System.out.println("Running: testGetMailSession");
		
	}
	
	@Test
	public void testGetSentDate() {
		System.out.println("Running: testGetSentDate");
		assertEquals(email.getSentDate(), new Date());
		email.setSentDate(new Date());
		assertEquals(email.getSentDate(), new Date());
	}
	
	@Test
	public void testGetSocketConnectionTimeout() {
		System.out.println("Running: testGetSocketConnectionTimeout");
		
	}
	
	@Test
	public void testSend() {
		System.out.println("Running: testSend");
		
	}
	
	@Test
	public void testSetFrom() throws EmailException {
		System.out.println("Running: testSetFrom");
		assertEquals(email.setFrom("lucastiedeman@gmail.com"), email);
	}
	
	@Test
	public void testUpdateContentType() {
		System.out.println("Running: testContentType");
		
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
