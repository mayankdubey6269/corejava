package CollectionInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionListSet1 {
public static void main(String[] args) {
	Set s = new LinkedHashSet();
	s.add(100);
	s.add(25);
	s.add(55);
	s.add(88);
	s.add(75);
	s.add(99);
	//System.out.println(s);
	Set s1 = new TreeSet();
	s1.add(44);
	s1.add(41);
	s1.add(25);
	s1.add(821);
	//System.out.println(s1);
	Set s2 = new HashSet();
	s2.add(87);
	s2.add(98);
	s2.add(952);
	s2.add(255);
	System.out.println(s2);
	
	
}
}
