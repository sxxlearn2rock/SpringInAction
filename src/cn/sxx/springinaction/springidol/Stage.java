package cn.sxx.springinaction.springidol;

public class Stage {
	
	private Stage() {
		
	}
	
	//ÑÓ³Ù³õÊ¼»¯ÊµÀý
	private static class StageSingletonHolder{
		static Stage instance = new Stage();
	}
	
	public static Stage getInstance(){
		return StageSingletonHolder.instance;
	}
}
