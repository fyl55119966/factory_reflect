import reflect.HeroFactory;
import reflect.ISkill;


import java.util.Scanner;

public class Main {
    //        public static void main(String[] args) {
//        String name = Main.getPlaverInput();
//        switch (name){
//            case "Diana":
//                Diana diana = new Diana();
//                diana.r();
//                break;
//            case "Irelia":
//                Irelia irelia = new Irelia();
//                irelia.r();
//                break;
//            case "Camille":
//                Camille camille = new Camille();
//                camille.r();
//                break;
//        }
//    }
//    public static void main(String[] args) throws Exception {
//        String name = Main.getPlaverInput();
//        ISkill iSkill;
//        switch (name) {
//            case "Diana":
//                iSkill = new Diana();
//                break;
//            case "Irelia":
//                iSkill = new Irelia();
//                break;
//            case "Camille":
//                iSkill = new Camille();
//                break;
//            default:
//                throw new Exception();
//        }
//        iSkill.r();
//    }

    public static void main(String[] args) throws Exception {
        String name = Main.getPlaverInput();
        ISkill iSkill =  HeroFactory.getHero(name);
        iSkill.r();
        // 抽象工厂
    }

    private static String getPlaverInput() {
        System.out.println("Enter a Hero's Name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }
}
