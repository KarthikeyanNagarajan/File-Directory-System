package com.karthik.FileDirectorySystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem
{
	String directoryName;
	List<FileSystem> fileSystemList;

	public Directory(String directoryName)
	{
		this.directoryName = directoryName;
		this.fileSystemList = new ArrayList<>();
	}

	public void add(FileSystem fileSystem)
	{
		fileSystemList.add(fileSystem);
	}

	@Override
	public void ls()
	{
		System.out.println("Directory Name :" + directoryName);
		for (FileSystem sys : fileSystemList)
		{
			sys.ls();
		}
	}

}
