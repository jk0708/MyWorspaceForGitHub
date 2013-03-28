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

public class TestStream {

	/*D:/workspace/2013JAVALEARN/bin/TestStream.cp.java 目标：在TestStream.java中写一段java代码，运行时将当前的TestStream.java文件内容读取出来，并输出到项目bin文件夹下的TestStream.cp.java文件。D:\workspace\GitHub\MyWorspaceForGitHub\src\learn1\TestStream.java*/
	public static void main(String args[]) throws IOException{
		System.out.println("文件读写好复杂啊，一堆stream和reader，太乱了");
		TestStream.rw();
	}
	public static void rw() throws IOException{
		File file=new File("D:/workspace/GitHub/MyWorspaceForGitHub/src/learn1/TestStream.java");
		File file2=new File("D:/workspace/GitHub/MyWorspaceForGitHub/bin/TestStream.cp.java");
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(file2));
		byte[] byt = new byte[1024];
		while(bis.read(byt)!=-1){
			System.out.println(bis);
			bos.write(byt,0,byt.length);
			bos.flush();
			
		}
		bis.close();
		bos.close();
		/*BufferedReader bf=new BufferedReader(new FileReader(file));
		String s=bf.readLine();
		File file2=new File("D:/workspace/GitHub/MyWorspaceForGitHub/bin/TestStream.cp.java");
		FileWriter fw=new FileWriter(file2);
		BufferedWriter bw=new BufferedWriter(fw);
		while(s!=null){
			System.out.println(s);
			bw.write(s);     
			s=bf.readLine();
		}
		bf.close();
		fw.close();*/
	}
	
}
