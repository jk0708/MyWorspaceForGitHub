package learn1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class TestStream {

	public static void main(String args[]) throws IOException {
		System.out.println("文件读写好复杂啊，一堆stream和reader，太乱了");
		TestStream.rw1();// rw()是采用字节方式读写，rw1()是采用字符方式读写
	}

	public static void rw() throws IOException {
		File file = new File(
				"D:/workspace/GitHub/MyWorspaceForGitHub/src/learn1/TestStream.java");
		File file2 = new File(
				"D:/workspace/GitHub/MyWorspaceForGitHub/bin/TestStream.cp.java");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				file));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(file2));
		byte[] byt = new byte[1024];
		int len;
		while ((len = bis.read(byt)) != -1) {

			System.out.println(new String(byt, 0, len));
			bos.write(byt, 0, len);
			bos.flush();

		}
		bis.close();
		bos.close();
		/*
		 * BufferedReader bf=new BufferedReader(new FileReader(file)); String
		 * s=bf.readLine(); File file2=new
		 * File("D:/workspace/GitHub/MyWorspaceForGitHub/bin/TestStream.cp.java"
		 * ); FileWriter fw=new FileWriter(file2); BufferedWriter bw=new
		 * BufferedWriter(fw); while(s!=null){ System.out.println(s);
		 * bw.write(s); s=bf.readLine(); } bf.close(); fw.close();
		 */
	}

	public static void rw1() throws IOException {
		Long s = System.nanoTime();// 开始计时
		BufferedReader bf = null;
		PrintWriter pw = null;

		File file = new File(
				"D:/workspace/GitHub/MyWorspaceForGitHub/src/learn1/TestStream.java");
		File file2 = new File(
				"D:/workspace/GitHub/MyWorspaceForGitHub/bin/TestStream.cp.java");
		bf = new BufferedReader(new FileReader(file));
		pw = new PrintWriter(new BufferedWriter(new FileWriter(file2)));
		String line = null;
		while ((line = bf.readLine()) != null) {
			System.out.println(line);
			pw.println(line);
			

		}System.out.println((System.nanoTime()-s)/1.0e9);
		bf.close();
		pw.close();
	}
}
