package test03;

import java.time.Instant;

public class cytech03 {

	//設問３
	public void calculateNowTime() {

		long nowTime = Instant.now().getEpochSecond();
		System.out.println("1970年1/1 00:00:00から現在まで" + nowTime + "秒です。");
		//偶数なら偶数と出力。奇数なら奇数と出力
		if(nowTime % 2 == 0) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}
	}
}
