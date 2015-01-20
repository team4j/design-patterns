package com.java.design.pattern.singleton;

public class Singleton
{
	private static Singleton instance = null;

	private Singleton()
	{
	}

	public static Singleton getInstance()
	{
		if (null == instance)
		{
			instance = new Singleton();
		}
		return instance;
	}
}
