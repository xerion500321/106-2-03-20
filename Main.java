import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Student[] studs = new Student[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("請輸入姓名、性別、系級、國文、數學、英文");
            studs[i] = new Student(scn.next(), scn.next(), scn.next(), scn.nextFloat(), scn.nextFloat(), scn.nextFloat());
        }
        System.out.println("請問您需要查詢什麼?");
        boolean a = true;
        while (a) {
            System.out.println("個別查詢同學請按1" + "\n" + "查詢所有同學資料請按2" + "\n" + "查詢某科目平均請按3" + "\n"
                    + "個別查詢同學總分與平均請按4" + "\n" + "結束請按5");
            int b = scn.nextInt();
            if (b == 1) {
                System.out.println("請輸入該位欲查詢同學");
                int c = scn.nextInt();
                switch (c) {
                    case 1:
                        System.out.println("國文:" + studs[0].getChinese() + "\n" + "數學:" + studs[0].getMath() + "\n" + "英文:" + studs[0].getEnglish());
                        break;
                    case 2:
                        System.out.println("國文:" + studs[1].getChinese() + "\n" + "數學:" + studs[1].getMath() + "\n" + "英文:" + studs[1].getEnglish());
                        break;
                    case 3:
                        System.out.println("國文:" + studs[2].getChinese() + "\n" + "數學:" + studs[2].getMath() + "\n" + "英文:" + studs[2].getEnglish());
                        break;
                    case 4:
                        System.out.println("國文:" + studs[3].getChinese() + "\n" + "數學:" + studs[3].getMath() + "\n" + "英文:" + studs[3].getEnglish());
                        break;
                    case 5:
                        System.out.println("國文:" + studs[4].getChinese() + "\n" + "數學:" + studs[4].getMath() + "\n" + "英文:" + studs[4].getEnglish());
                        break;
                }
            }
            if (b == 2) {
                for (int i = 0; i < 5; i++) {
                    studs[i].showAll();
                }
            }
            if (b == 3) {
                System.out.println("請輸入欲查詢科目:1.國文 2.數學 3.英文");
                int c = scn.nextInt();
                switch (c) {
                    case 1:
                        System.out.println((studs[0].getChinese() + studs[1].getChinese() + studs[2].getChinese() + studs[3].getChinese() + studs[4].getChinese()) / 5);
                        break;
                    case 2:
                        System.out.println((studs[0].getMath() + studs[1].getMath() + studs[2].getMath() + studs[3].getMath() + studs[4].getMath()) / 5);
                        break;
                    case 3:
                        System.out.println((studs[0].getEnglish() + studs[1].getEnglish() + studs[2].getEnglish() + studs[3].getEnglish() + studs[4].getEnglish()) / 5);
                        break;
                }
            }
            if (b == 4) {
                System.out.println("請輸入該位欲查詢同學");
                int c = scn.nextInt();
                switch (c) {
                    case 1:
                        System.out.println(("平均:" + (studs[0].getEnglish() + studs[0].getChinese() + studs[0].getMath()) / 3) + "\n" + "總分:" + (studs[0].getEnglish() + studs[0].getChinese() + studs[0].getMath()));
                        break;
                    case 2:
                        System.out.println(("平均:" + (studs[1].getEnglish() + studs[1].getChinese() + studs[1].getMath()) / 3) + "\n" + "總分:" + (studs[1].getEnglish() + studs[1].getChinese() + studs[1].getMath()));
                        break;
                    case 3:
                        System.out.println(("平均:" + (studs[2].getEnglish() + studs[2].getChinese() + studs[2].getMath()) / 3) + "\n" + "總分:" + (studs[2].getEnglish() + studs[2].getChinese() + studs[2].getMath()));
                        break;
                    case 4:
                        System.out.println(("平均:" + (studs[3].getEnglish() + studs[3].getChinese() + studs[3].getMath()) / 3) + "\n" + "總分:" + (studs[3].getEnglish() + studs[3].getChinese() + studs[3].getMath()));
                        break;
                    case 5:
                        System.out.println(("平均:" + (studs[4].getEnglish() + studs[4].getChinese() + studs[4].getMath()) / 3) + "\n" + "總分:" + (studs[4].getEnglish() + studs[4].getChinese() + studs[4].getMath()));
                        break;
                }
            }
                if (b == 5) {
                    a = false;
                }
            }
        System.out.println("謝謝您的使用!");
        }

}

