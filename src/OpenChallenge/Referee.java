package OpenChallenge;

/**
 * Author : 정준호
 * Date : 2022-09-27
 */

public class Referee {
    private int num;                             // 게임의 난수가 저장될 필드

    public int judge(int i) {
        int result;
        if (i < num)
            result = 1;
        else if (i > num)
            result = -1;
        else
            result = 0;
        return result;
    }

    public void setNum() {
        num = (int) (Math.random() * 99);       // 0 ~ 99 난수
    }
}
