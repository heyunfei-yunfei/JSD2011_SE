package xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

//使用DOM4J解析XLM文档
public class ParseXmlDemo {
    public static void main(String[] args) {
        /*
        使用DOM4J解析XML的大致步骤
        1：实例化SAXReader
        2：使用SAXReader读取xml文档并生成Document对象
        这一步也是DOM解析耗时耗资源的地方，因为要先读取整个XML文档内奸完整的树结构到
        Document对象中保存
        3：通过Document对象获取根元素
        4：从根元素开始按照XML文档的结构逐级获取子元素最终达到遍历XML文档数据的目的
         */
        try{
            //1
            SAXReader reader = new SAXReader();

            //2此步骤执行完毕后，dom解析会将xml文档结构以树状结构形式保存Document对象中
           Document doc =  reader.read("./emplist.xml");

            //3获取根标签
            /**
             * Element的每一个实例用于表示XML文档中的一个元素（一对标签）
             * Element提供了获取其表示的元素的相关信息方法，常用的有：
             * String getName()
             * 获取元素名（标签名）
             *
             *
             *
             * String getText（）
             * 获取元素体中的文本（开始与结束标签中间的文本信息）
             *
             * Element element(String name）
             * 获取指定名字的子元素
             *
             * List elements（）
             * 获取当前标签中所有的子标签，，集合中每个元素是一个Element实例表示其中一个子标签
             *
             * List elements（String name）
             * 获取当前标签下的所有指定的同名子标签
             *
             */

            Element root = doc.getRootElement();
            String name = root.getName();
            System.out.println(name);

            //获取跟标签下所有名为<emp>的子标签
            List<Element> list = root.elements("emp");
            System.out.println(list.size());

            //遍历集合获取每个员工的信息
            for (Element empEle: list){
                //获取员工姓名
                //1获取<name>标签
                Element nameEle  = empEle.element("name");
                //获取<name>子标签中间的文本
                String ename = nameEle.getText();
              //  System.out.println(ename);

                //获取年龄，性别，工资并输出

                Element ageEle  = empEle.element("age");
                //获取<age>子标签中间的文本
               int age = Integer.parseInt(ageEle.getText());
               //获取性别
//                Element genderEle = empEle.element("gender");
//                String gender = genderEle.getText();
//
//                String gender= empEle.element("gender").getText();
                /*
                String elementText(String name)
                该方法可以获取当前标签下的额指定名字的子标签中间的文本，等同上面的操作

                 */

                String gender = empEle.elementText("gender");
                //获取工资
                int salary = Integer.parseInt(empEle.elementText("salary"));
                //System.out.println(ename+","+age+","+gender+","+salary);

                //获取<emp>的id属性
//                Attribute attr = empEle.attribute("id");
//                int id = Integer.parseInt(attr.getValue());//获取属性值

                //连写
               // int id = Integer.parseInt(empEle.attribute("id").getValue());
                int id = Integer.parseInt(empEle.attributeValue("id"));
                System.out.println(id+","+ename+","+age+","+gender+","+salary);

//                for (Element emoEle : list){
//                    Element ageEle = emoEle.element("age");
//                    Element genderEle = emoEle.element("gender");
//                    Element salaryrEle = emoEle.element("salary");
//                    String eage = ageEle.getText();
//                    String esalaryr = salaryrEle.getText();
//                    System.out.println(esalaryr);
//
//
//
//                    int i = Integer.parseInt(eage);
//
//                    System.out.println( i);
//                }









            }




        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
