package cn.sxx.springinaction.springidol;

import cn.sxx.springinaction.exceptions.PerformanceException;

public class Juggler implements Performer{
	
	private int beanBags = 3;
	
	public Juggler() {
	}
	
	public Juggler(int beanBags){
		this.beanBags = beanBags;
	}

	@Override
	public void perform() {
		System.out.println("JUGGLING " + beanBags + " BENGBAGS");
	}
	
}
