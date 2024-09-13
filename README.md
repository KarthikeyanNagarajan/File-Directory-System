# File Directory System

This Repository contains codebase for File Directory System which uses **Composite Design Pattern** . 

This system is designed to handle files and directories in a hierarchical structure. 

Each directory can contain files and other directories, allowing for a tree-like structure.

## Design Overview

The key components are:

**Component:** An abstract class/interface for files and directories. Here it is **FileSystem.class**

**Leaf:** Represents individual files. Here it is **File.class**

**Composite:** Represents directories containing files and other directories. Here it is **Directory.class**
