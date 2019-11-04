package com.comp.designmodel.creational.factory.eazy;

/**
 * 生成手机类
 * @author Zouwx
 * @create 2019-10-13 11:59
 * @desc
 **/
public class FactoryMoble  {

    /**
     * @Description: 根据phoneName new出相应的对象，拓展性不好
     * @param: [phoneName]
     * @Auther: Zouwx
     * @Date: 2019/10/13 12:23
     * @return: Phone
     */
    public Phone getPhone(String phoneName) {

        if("IPhone".equals(phoneName)){
            return new IPhone();
        }else if("XiaoMi".equals(phoneName)){
            return new XiaoMi();
        }
        return null;
    }

    /**
     * @Description: 通过反射实现的简单工厂
     * @param:
     * @Auther: Zouwx
     * @Date: 2019/10/13 12:28
     * @return:
     */
    public Phone reflexPhone(Class c){
        Phone phone = null;
        try {
            phone = (Phone)Class.forName(c.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return phone;
    }

}
