package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class LottoConsole {
    public String inputMoney(){
        System.out.println("구입금액을 입력해 주세요.");
        String money = Console.readLine();
        System.out.println();
        return money;
    }

    public void outputLottoList(List<Lotto> lottoList) {
        System.out.println(lottoList.size()+"개를 구매했습니다.");
        for (Lotto lotto : lottoList) {
            System.out.println(lotto.getNumbers());
        }
        System.out.println();
    }

    public String inputLuckyNumber(){
        System.out.println("당첨 번호를 입력해 주세요.");
        String luckyNumber = Console.readLine();
        System.out.println();

        return luckyNumber;
    }

    public String inputBonusNumber(){
        System.out.println("보너스 번호를 입력해 주세요.");
        String bonusNumbers = Console.readLine();
        System.out.println();

        return bonusNumbers;
    }
}
