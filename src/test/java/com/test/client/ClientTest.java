package com.test.client;


public class ClientTest {

	public static void main(String[] args) {
		HelloServiceImplService service = new HelloServiceImplService();
		HelloService hello = service.getHelloServiceImplPort();
		String res = hello.getName("ID123");
		System.out.println("Result :" + res);
	}

}
