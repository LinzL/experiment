package edu.cqu.datatransform;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LookupTable {
	private static final int TABLESIZE = (int)Math.pow(2,16);

	public static int[] getLookupTable(){
		List<Integer> list = new LinkedList<>();
		int[] lookupTable = new int[TABLESIZE];
		for(int i=0;i<TABLESIZE;i++){
			list.add(i);
		}
		Collections.shuffle(list);
		ListIterator<Integer> iter = list.listIterator();
		for(int i=0;i<TABLESIZE;i++){
			lookupTable[i] = iter.next().intValue();		
		}
		return lookupTable;
	}
	
	public static int[] getReverseLookupTable(int[] lookupTable){
		int[] rlt = new int[TABLESIZE];
		for(int i=0;i<TABLESIZE;i++){
			rlt[lookupTable[i]] = i;
		}
		return rlt;
	}
}
