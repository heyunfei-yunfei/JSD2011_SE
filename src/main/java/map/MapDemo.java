package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * java.util.Map 查找表
 * Map是非常常用的数据结构，它体现的样子是一个多行两列的表格
 * 左列成为key，右列成为value
 * Map总是根据key获取对应的value
 *
 * 常用实现类：java.util.HashMap 使用散列算法实现的Map，一般称它
 *                       为散列表哈希表。他也是当今查询速度最快的数据结构
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
       /**
        *   V put(K k,V v)
        *  将一组键值对存入Map中
        *
        *  Map有一个要求：key不允许重复（equals比较）
        *  如果使用重复的key存入value时则是替换value操作。那么
        *  put方法的返回值为这个key原来的value
        *  如果这个key不存在则返回值为null
        *
        *  获取put方法返回值时，如果Value的类型是包装类，那么尽量
        *  不要用基本类型去接受，因为方法可能返回null，如果出现自动
        *  拆箱会导致空指针
        *
        */
       Integer num = map.put("语文",99);
        System.out.println(num);
        map.put("语文",99);
        map.put("数学",98);
        map.put("英语",99);
        map.put("物理",96);
        map.put("化学",99);
        System.out.println(map);
     System.out.println("******");
        map.put("数学",55);
        num = map.put("数学",55);
        System.out.println(num);
        System.out.println(map);
     System.out.println("********");
        /*
          V get(Object key)
          根据key获取Map中对应的value
          如果给定的key不存在则返回值为null
         */

        num = map.get("英语");
        System.out.println("英语："+num);

        num = map.get("体育");
        System.out.println("体育："+num);

        /**
         * V remove(Object key)
         * 删除Map中给定的key所对应的键值对，返回值为这个key
         * 所对应的value
         */
        num = map.remove("英语");
        System.out.println(map);
        System.out.println(num);
        //获取Map中的元素个数
        int size = map.size();
        System.out.println("size；"+size);


        boolean ck = map.containsKey("物理");
        System.out.println("包含key："+ck);
        //判断Map是否包含给定的value
        boolean cv = map.containsKey(99);
        System.out.println("包含value："+cv);

        /* 静夜思李白
        床前明月光，
        疑是地上霜。
        举头望明月，
        低头思故乡。

        桃花源记
                晋太元中，武陵人以捕鱼为业。缘溪行，忘路之远近，忽逢桃花林
                夹岸数百步，中无杂树，芳草鲜美，落英缤纷，渔人甚异之。复前行，欲穷其林
                。林尽水源，便得一山，山有小口，仿佛若有光，便舍船，从口入。初极狭，才通人，复行数十步，
        豁然开朗。土地平旷，屋舍俨然，有良田美池桑竹之属，阡陌交通，鸡犬相闻，其中
                其中往来种作，男女衣着，悉如外人，黄发垂髫，并怡然自得
                见渔人，乃大惊，问所从来。具答之，便要还家，设酒杀鸡做食
                村中

         */




   }







}
