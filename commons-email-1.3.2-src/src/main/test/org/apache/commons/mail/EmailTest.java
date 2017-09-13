package org.apache.commons.mail;

import org.junit.Test;
import junit.framework.TestCase;
import org.easymock.*;

public class EmailTest extends TestCase {

	protected String email;
	
	@Override
	protected void setUp() {
		System.out.println("Running: setUp");
		//EmailConstants testEmail = new EmailConstants();
		email = "lucastiedeman@gmail.com";
	}
	
	@Test
	public void testAddBcc() {
		System.out.println("Running: testAddBcc");
	}
	
	@Test
	public void testAddCc() {
		System.out.println("Running: testAddCc");
		Email testEmail = EasyMock.createMock(Email.class);
		
	}
	
	@Test
	public void testAddHeader() {
		System.out.println("Running: testAddHeader");
	}
	
	@Test
	public void testAddReplyTo() {
		System.out.println("Running: testAddReplyTo");
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
	public void testSetFrom() {
		System.out.println("Running: testSetFrom");
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
			System.out.println("Failed: tearDown");
			System.out.println(npe);
		}
	}
}
