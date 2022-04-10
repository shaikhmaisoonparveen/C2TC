package com.tns.corejava;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamAndLambda {

	public static void main(String[] args) {
	
		List<Integer> orignal =List.of(33,40,25,54,87,100,83,96,17,15);
		
	/*	List<Integer> orignal=new ArrayList<Integer>();
		orignal.add(1);
		orignal.add(1);
		orignal.add(1);*/
		
    System.out.println(orignal);
    
    Stream<Integer> stream=orignal.stream();
    List<Integer>l= stream.filter(i->i<33).collect(Collectors.toList());
    System.out.println(l);
    
    List<Integer> fail=l.stream().filter(i->i<30).collect(Collectors.toList());
    System.out.println(fail);
    
    List<Integer> updatedlist=orignal.stream().map(i->i+5).collect(Collectors.toList());
    System.out.println(updatedlist);
	}

}
