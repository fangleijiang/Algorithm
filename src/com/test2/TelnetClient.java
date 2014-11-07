package com.test2;

import java.net.*;
import java.io.*;

public class TelnetClient {
	String host = "pop.tom.com"; // Telnet��������ַ
	int port = 110; // �˿ں�

	public TelnetClient() {
		System.out.println("Host " + host + "; port " + port);
		try {
			Socket socket = new Socket(host, port); // ʵ�����׽���
			new Listener(socket.getInputStream(), System.out).start(); // �����������Ϣ������̨
			new Listener(System.in, socket.getOutputStream()).start(); // �������̨��Ϣ��������
		} catch (IOException ex) {
			ex.printStackTrace(); // ���������Ϣou
			return;
		}
		System.out.println("Connected Success");
	}

	class Listener extends Thread {
		BufferedReader reader; // ������
		PrintStream ps; // �����

		Listener(InputStream is, OutputStream os) {
			reader = new BufferedReader(new InputStreamReader(is)); // ʵ������ ����
			ps = new PrintStream(os); // ʵ���������
		}

		public void run() {
			String line;
			try {
				while ((line = reader.readLine()) != null) { // ��ȡ����
					ps.print(line); // �������
					ps.print("\r\n");
					ps.flush();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void main(String[] argv) {
		new TelnetClient();
	}
}