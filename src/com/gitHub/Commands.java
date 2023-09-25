package com.gitHub;

public class Commands 
{
	public static void main(String[] args) 
	{
		System.out.println("usage: git [-v | --version] [-h | --help] [-C <path>] [-c <name>=<value>]\r\n"
				+ "           [--exec-path[=<path>]] [--html-path] [--man-path] [--info-path]\r\n"
				+ "           [-p | --paginate | -P | --no-pager] [--no-replace-objects] [--bare]\r\n"
				+ "           [--git-dir=<path>] [--work-tree=<path>] [--namespace=<name>]\r\n"
				+ "           [--config-env=<name>=<envvar>] <command> [<args>]\r\n"
				+ "\r\n"
				+ "These are common Git commands used in various situations:\r\n"
				+ "\r\n"
				+ "clone     Clone a repository into a new directory\r\n"
				+ "init      Create an empty Git repository or reinitialize an existing one\r\n"
				+ "add       Add file contents to the index\r\n"
				+ "restore   Restore working tree files\r\n"
				+ "bisect    Use binary search to find the commit that introduced a bug\r\n"
				+ "diff      Show changes between commits, commit and working tree, etc\r\n"
				+ "log       Show commit logs\r\n"
				+ "'git help -a' and 'git help -g' list available subcommands");
	}
}