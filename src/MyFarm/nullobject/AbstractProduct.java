package MyFarm.NullObject;

import MyFarm.creature.Creature;

public abstract class AbstractProduct {
	//1、创建一个抽象类
	protected String name;
	public abstract boolean isNil();
	public abstract String getName();
}