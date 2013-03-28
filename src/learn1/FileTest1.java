package learn1;

import java.io.File;

public class FileTest1 {
public static void main(String args[]){
	String path="D:/workspace";
//	if(args.length!=1){
//		System.err.println("Usage:java FileTest1<File or Dir>");
//		System.exit(-1);
//	}
//	File f=new File(args[0]);
	File f=new File(path);
	if(f.exists()){
		System.out.println("-------------");
		System.out.println("Absolute Path:"+f.getAbsolutePath());
		System.out.println("File Path:"+f.getName());
		System.out.println("Parent Dirtory:"+f.getParent());
		System.out.println("-------------");
		String canRead=f.canRead()?"Yes":"No";
		String canWrite=f.canWrite()?"Yes":"No";
		String isFile=f.isFile()?"Yes":"No";
		String isDir=f.isDirectory()?"Yes":"No";
		String isAbs=f.isAbsolute()?"Yes":"No";
		System.out.println("Readable:   "+canRead);
		System.out.println("Writable:   "+canWrite);
		System.out.println("Is directory   "+isDir);
		System.out.println("Is file   "+isFile);
		System.out.println("Is absolute path   "+isAbs);
		
	}else 
		System.out.println("Cannot found file:"+path);
}

}
