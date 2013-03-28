package learn1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class Demo3 {
	/* 增强for循环 */
	@Test
	public void test1() {
		int arr[] = { 1, 2, 3 };
		for (int n : arr) {
			System.out.println(n);
		}
	}

	@Test
	public void test2() {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		for (Object obj : list) {
			int i = (Integer) obj;
			System.out.println(obj);
		}
	}
	

	@Test
	public void test3() {
		// HashMap提取的时候不是按存的顺序,LinkedHashMap按顺序存放，可用于做购物车时使用
		/* Map map = new HashMap(); */
		Map map = new LinkedHashMap();
		map.put("1", "aaa");
		map.put("2", "bbb");
		map.put("3", "ccc");
		// 传统方式1
		Set set = map.keySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			String value = (String) map.get(key);
			System.out.println(key + "-" + value);
		}
	}

	@Test
	public void test4() {
		Map map = new LinkedHashMap();
		map.put("1", "aaa");
		map.put("2", "bbb");
		map.put("3", "ccc");
		// 传统方式2
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			String key = (String) entry.getKey();
			String value = (String) entry.getValue();
			System.out.println(key + "-" + value);
		}
	}

	@Test
	public void test5() {
		Map map = new LinkedHashMap();
		map.put("1", "aaa");
		map.put("2", "bbb");
		map.put("3", "ccc");
		// 增强for取map的第1种方式
		for (Object obj : map.keySet()) {
			String key = (String) obj;
			String value = (String) map.get(key);
			System.out.println(key + "-" + value);
		}
	}

	@Test
	public void test6() {
		Map map = new LinkedHashMap();
		map.put("1", "aaa");
		map.put("2", "bbb");
		map.put("3", "ccc");
		// 增强for取map的第2种方式
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			String key = (String) entry.getKey();
			String value = (String) entry.getValue();
			System.out.println(key + "-" + value);
		}
	}
	//使用增强for需要注意的问题：增强for只适合取数据，不适合改数据
	/*要修改数据或者集合中的数据只适合用传统方法*/
	@Test
	public void test7() {
		int arr[]={1,2,3};
	for(int i:arr){
		i=10;
	}
	/*for(int i=0;i<arr.length;i++){
		arr[i]=10;
	}*/
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	}
	
}
