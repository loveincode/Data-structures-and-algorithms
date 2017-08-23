package data_structures.data01_string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则
 * @author huyifan
 *
 */
public class Regular {
	
	public static void main(String args[]){
        String str = "abcdfdfsabcdfdsf abc fdfdabcabc";

        //1. 用这则表达式处理, 不过好像一点都不省事.. 
        Pattern p = Pattern.compile("abc",Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(str);
        int count = 0;
        while(m.find()){
              count ++;
        }
        System.out.println("abc的个数 : " + count);

        //2. 用普通方法来做,比较省事
        String [] ary = ("," + str + ",").split("abc");
        System.out.println("abc的个数 : " + (ary.length - 1));
        //用split方法,以"abc"做分隔符将字串拆分成数组,这样比较简单.不过上面的代码(第二种方法)只能判断小写"abc"的个数, 
        //如果需要将"ABC"或者"aBc"或者"abC"这样的字串都找出来, 只需要将第二种方法的代码修改成下面这样的就可以了:
        //String [] ary = ("," + str.toLowerCase() + ",").split("abc");
        //System.out.println("ABC的个数 : " + (ary.length - 1));
    }

}
