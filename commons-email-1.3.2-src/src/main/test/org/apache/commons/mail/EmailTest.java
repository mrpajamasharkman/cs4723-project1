package org.apache.commons.mail;

import junit.framework.TestCase;

public class EmailTest extends TestCase {

	protected String email;
	
	public void testAddBcc() {
		System.out.println("Running: testAddBcc");
	}
	
	public void testAddCc() {
		System.out.println("Running: testAddCc");
	}
	
	public void testAddHeader() {
		System.out.println("Running: testAddHeader");
	}
	
	public void testAddReplyTo() {
		System.out.println("Running: testAddReplyTo");
	}
	
	public void testBuildMimeMessage() {
		System.out.println("Running: testBuildMimeMessage");
	}
	
	public void testGetHostName() {
		System.out.println("Running: testGetHostName");
	}
	
	public void testGetMailSession() {
		System.out.println("Running: testGetMailSession");
	}
	
	public void testGetSentDate() {
		System.out.println("Running: testGetSentDate");
	}
	
	public void testGetSocketConnectionTimeout() {
		System.out.println("Running: testGetSocketConnectionTimeout");
	}
	
	public void testSend() {
		System.out.println("Running: testSend");
	}
	
	public void testSetFrom() {
		System.out.println("Running: testSetFrom");
	}
	
	public void testUpdateContentType() {
		System.out.println("Running: testContentType");
	}
	
	@Override
	protected void setUp() {
		System.out.println("Running: setUp");
		email = "lucastiedeman@gmail.com";
	}
	
	@Override
	protected void tearDown() {
		System.out.println("Running: tearDown");
		email = null;
		assertNull(email);
	}
}
