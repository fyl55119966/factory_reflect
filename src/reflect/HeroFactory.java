package reflect;

/**
 * 简单工厂
 */
public class HeroFactory {
    public static ISkill getHero(String name) throws Exception {
        // 反射技术，可以通过输入的名字，可以得到类
        // 类是对象的抽象，元类是用来描述一个类的
        // 通过名称拿到一个元类型
        // reflect.hero.Irelia
        String classStr = "reflect.hero." + name;
        System.out.println(classStr);
        Class<?> cla = Class.forName(classStr);
        // 通过一个元类型，可以拿到基类型
        Object obj = cla.newInstance();
        //强制类型转换
        return (ISkill) obj;
    }
}
