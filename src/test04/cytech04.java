package test04;

import java.time.Instant;

public class cytech04 {

	//設問４
	public static void main(String[] args) {
        long nowTime = Instant.now().getEpochSecond();
        System.out.println("1970年1/1 00:00:00から現在まで" + nowTime + "秒です。");

        switch (Long.toString(nowTime % 2)) {
            case "0":
                System.out.println("偶数です。");
                break;
            case "1":
                System.out.println("奇数です。");
                break;
            default:
                System.out.println("エラーです。");
        }
    }

}
