package test09;


public class cytech09 {

	
	//設問９
    public static void main(String[] args) {

    	//スコアのセット
    	int[][] students_scores = new int[5][4];

        // スコアをランダムに
        for (int i = 0; i < students_scores.length; i++) {
            for (int ss = 0; ss < students_scores[i].length; ss++) {
            	students_scores[i][ss] = (int)(Math.random() * 100);
            }
        }

        String[] subjects = {"国語", "数学", "理科", "社会"};

        // 5人分の点数表示
        for (int i = 0; i < students_scores.length; i++) {
            System.out.println("学生" + (i + 1) + "人目の点数：");
            for (int ss = 0; ss < students_scores[i].length; ss++) {
                System.out.println(subjects[ss] + "：" + students_scores[i][ss] + "点");
            }
            System.out.println();
        }
    }
}