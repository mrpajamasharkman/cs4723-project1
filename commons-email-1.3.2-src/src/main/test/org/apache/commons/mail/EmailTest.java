package org.apache.commons.mail;

import java.util.Date;
import org.junit.Test;
import junit.framework.TestCase;

import org.easymock.*;

public class EmailTest extends TestCase {

	protected String email;
	protected Email testEmail;
	
	@Override
	protected void setUp() {
		System.out.println("Running: setUp");
		testEmail = EasyMock.createMock(Email.class);
		email = "lucastiedeman@gmail.com";
	}
	
	@Test
	public void testAddBcc() {
		System.out.println("Running: testAddBcc");
		/*
		//record
		EasyMock.expect(testEmail.).andReturn(testEmail.);
		
		//replay
		EasyMock.replay(testEmail);
		
		//verify
		assertEquals(,testEmail.);
		EasyMock.verify(testEmail);
		*/
	}
	
	@Test
	public void testAddCc() throws EmailException {
		System.out.println("Running: testAddCc");
		/*
		//record
		EasyMock.expect(testEmail.).andReturn(testEmail.);
		
		//replay
		EasyMock.replay(testEmail);
		
		//verify
		assertEquals(,testEmail.);
		EasyMock.verify(testEmail);
		*/
		}
	
	@Test
	public void testAddHeader() {
		System.out.println("Running: testAddHeader");
		/*
		//record
		EasyMock.expect(testEmail.).andReturn(testEmail.);
		
		//replay
		EasyMock.replay(testEmail);
		
		//verify
		assertEquals(,testEmail.);
		EasyMock.verify(testEmail);
		*/
	}
	
	@Test
	public void testAddReplyTo() {
		System.out.println("Running: testAddReplyTo");
		/*
		//record
		EasyMock.expect(testEmail.).andReturn(testEmail.);
		
		//replay
		EasyMock.replay(testEmail);
		
		//verify
		assertEquals(,testEmail.);
		EasyMock.verify(testEmail);
		*/
	}
	
	@Test
	public void testBuildMimeMessage() {
		System.out.println("Running: testBuildMimeMessage");
		/*
		//record
		EasyMock.expect(testEmail.).andReturn(testEmail.);
		
		//replay
		EasyMock.replay(testEmail);
		
		//verify
		assertEquals(,testEmail.);
		EasyMock.verify(testEmail);
		*/
	}
	
	@Test
	public void testGetHostName() {
		System.out.println("Running: testGetHostName");
		/*
		//record
		EasyMock.expect(testEmail.).andReturn(testEmail.);
		
		//replay
		EasyMock.replay(testEmail);
		
		//verify
		assertEquals(,testEmail.);
		EasyMock.verify(testEmail);
		*/
	}
	
	@Test
	public void testGetMailSession() {
		System.out.println("Running: testGetMailSession");
		/*
		//record
		EasyMock.expect(testEmail.).andReturn(testEmail.);
		
		//replay
		EasyMock.replay(testEmail);
		
		//verify
		assertEquals(,testEmail.);
		EasyMock.verify(testEmail);
		*/
	}
	
	@Test
	public void testGetSentDate() {
		System.out.println("Running: testGetSentDate");
		
		//record
		EasyMock.expect(testEmail.getSentDate()).andReturn(testEmail.sentDate);
		
		//replay
		EasyMock.replay(testEmail);
		
		//verify
		assertEquals(testEmail.sentDate,testEmail.getSentDate());
		EasyMock.verify(testEmail);
	}
	
	@Test
	public void testGetSentDateNull() {
		System.out.println("Running: testGetSentDate");
		Email testEmail = EasyMock.createMock(Email.class);
		//record
		EasyMock.expect(testEmail.getSentDate()).andReturn(new Date());
		
		//replay
		EasyMock.replay(testEmail);
		
		//verify
		assertEquals(new Date(),testEmail.getSentDate());
		EasyMock.verify(testEmail);
	}
	
	@Test
	public void testGetSocketConnectionTimeout() {
		System.out.println("Running: testGetSocketConnectionTimeout");
		/*
		//record
		EasyMock.expect(testEmail.).andReturn(testEmail.);
		
		//replay
		EasyMock.replay(testEmail);
		
		//verify
		assertEquals(,testEmail.);
		EasyMock.verify(testEmail);
		*/
	}
	
	@Test
	public void testSend() {
		System.out.println("Running: testSend");
		/*
		//record
		EasyMock.expect(testEmail.).andReturn(testEmail.);
		
		//replay
		EasyMock.replay(testEmail);
		
		//verify
		assertEquals(,testEmail.);
		EasyMock.verify(testEmail);
		*/
	}
	
	@Test
	public void testSetFrom() {
		System.out.println("Running: testSetFrom");
		/*
		//record
		EasyMock.expect(testEmail.).andReturn(testEmail.);
		
		//replay
		EasyMock.replay(testEmail);
		
		//verify
		assertEquals(,testEmail.);
		EasyMock.verify(testEmail);
		*/
	}
	
	@Test
	public void testUpdateContentType() {
		System.out.println("Running: testContentType");
		/*
		//record
		EasyMock.expect(testEmail.).andReturn(testEmail.);
		
		//replay
		EasyMock.replay(testEmail);
		
		//verify
		assertEquals(,testEmail.);
		EasyMock.verify(testEmail);
		*/
	}
	
	@Override
	protected void tearDown() {
		System.out.println("Running: tearDown");
		try{
			email = null;
			assertNull(email);
			testEmail = null;
			assertNull(testEmail);
		}catch (NullPointerException npe){
			System.out.println("Failed: tearDown");
			System.out.println(npe);
		}
	}
}
