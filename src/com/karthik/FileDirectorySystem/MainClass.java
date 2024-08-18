package com.karthik.FileDirectorySystem;

public class MainClass
{

	public static void main(String[] args)
	{
		FileSystem file1 = new File("file1");
		FileSystem file2 = new File("file2");

		Directory dir1 = new Directory("parent");
		Directory dir2 = new Directory("child");

		dir1.add(file1);
		dir1.add(dir2);
		dir2.add(file2);

		dir1.ls();
	}

}
