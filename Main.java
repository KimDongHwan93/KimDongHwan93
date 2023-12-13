package 농장텍스트게임만들기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Crop[] crop = new Crop[5];

        int behaviorInput = 1;
        int howFarm;
        int myMoney = 0;

        while (true) {
            System.out.println("\n\n");
            System.out.println("행동을 선택하여 주십시오.");
            System.out.println("1. 채소심기 2. 물주기 3. 팔기 4. 종료");
            behaviorInput = sc.nextInt();
            switch (behaviorInput) {
                case 1:
                    System.out.println("\n");
                    System.out.println("몇번 밭에 채소를 심으시겠습니까?");
                    int howFarmInput = sc.nextInt();
                    System.out.println("\n------------------------------------------------");
                    System.out.println("현재 " + howFarmInput + "번 밭에 들어왔습니다.");
                    System.out.println("어떤 채소를 심으시겠습니까?");
                    System.out.println("1. 옥수수 2. 콩 3. 밀");
                    int howCropInput = sc.nextInt();
                    if(howCropInput == 1){
                        crop[howFarmInput] = new Corn(howFarmInput);
                        System.out.println("\n------------------------------------------------");
                        System.out.println("현재 " + howFarmInput + "번밭에 " + "옥수수가 심어졌습니다.");
                    }
                    if(howCropInput == 2) {
                        crop[howFarmInput] = new Soybean(howFarmInput);
                        System.out.println("\n------------------------------------------------");
                        System.out.println("현재 " + howFarmInput + "번밭에 " + "콩이 심어졌습니다.");
                    }
                    if(howCropInput == 3) {
                        crop[howFarmInput] = new Wheat(howFarmInput);
                        System.out.println("\n------------------------------------------------");
                        System.out.println("현재 " + howFarmInput + "번밭에 " + "밀가루가 심어졌습니다.");
                    }
                    break;

                case 2:
                    System.out.println("\n\n");
                    System.out.println("몇번 밭에 물을 주시겠습니까?");
                    System.out.println("1. 1번밭 2. 2번밭 3. 3번밭 4. 4번밭 5. 5번밭");
                    howFarm = sc.nextInt();

                        crop[howFarm].giveWaterCrop();

                    break;

                case 3:
                    System.out.println("\n\n");
                    System.out.println("몇번 밭에 작물을 파시겠습니까?");
                    System.out.println("1. 1번밭 2. 2번밭 3. 3번밭 4. 4번밭 5. 5번밭");
                    howFarm = sc.nextInt();
                    myMoney += crop[howFarm].price;
                    System.out.println("\n------------------------------------------------");
                    System.out.println(howFarm + "번 작물을 팔았습니다.");
                    System.out.println("현재 금액은 " + myMoney + "원 입니다.");
                    crop[howFarm] = new Crop();
                    break;

                case 4:
                    System.out.println("게임이 종료되었습니다.");
                    System.exit(0);
                    break;
            }
        }



    }

}






