package com.java.design.pattern.singleton;

public class SecuritySingleton
{
	private static volatile SecuritySingleton instance = null;

	private SecuritySingleton()
	{
	}

	public static SecuritySingleton getInstance()
	{
		if (null == instance)
		{
			synchronized (SecuritySingleton.class)
			{
				if (null == instance)
				{
					instance = new SecuritySingleton();
				}
			}
		}
		return instance;
	}
}
