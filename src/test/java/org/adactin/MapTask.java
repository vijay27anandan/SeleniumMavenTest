package org.adactin;

import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class MapTask {

	@Test
	public void Meth() {
		Map<Integer, List<String>> m = new HashMap<Integer, List<String>>();
		List<String> l = new ArrayList<String>();
		m.put(1, l);
		m.get(1).add("vj");
		m.get(1).add("prabhu");
		
		Set<Entry<Integer,List<String>>> entrySet = m.entrySet();
		for (Entry<Integer, List<String>> entry : entrySet) {
			
			System.out.println(entry);
		}
	}
	
}
