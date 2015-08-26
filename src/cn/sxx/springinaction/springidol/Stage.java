package cn.sxx.springinaction.springidol;

public class Stage {
	
	private Stage() {
		
	}
	
	//�ӳٳ�ʼ��ʵ��
	private static class StageSingletonHolder{
		static Stage instance = new Stage();
	}
	
	public static Stage getInstance(){
		return StageSingletonHolder.instance;
	}
}
