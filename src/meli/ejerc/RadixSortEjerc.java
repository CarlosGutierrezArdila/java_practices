package meli.ejerc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;

public class RadixSortEjerc
{

	public static ArrayList<String> getMatches(String[] arr,int position, char c){
		ArrayList<String> result = new ArrayList<String>();
		for (String elem: arr) {
			if (elem.charAt(position) == c) result.add(elem);
		}
		return result;
	}
	public static void radixSort(int []arr)
	{
		char[] lists = {'0','1','2','3','4','5','6','7','8','9'};
		String[] preparedArray = StringUtil.lNormalize(StringUtil.toStringArray(arr),'0');
		int elementLength = preparedArray[0].length();
		for (int i = elementLength-1; i >= 0 ; i--) {
			HashMap <Character,ArrayList<String>> listGroup = new HashMap<Character,ArrayList<String>>();

			for (Character key:lists) {
				int finalI = i;
				ArrayList<String> matches = getMatches(preparedArray,finalI, key);
				listGroup.put(key, matches);
			}
			ArrayList<String> tempArray = new ArrayList<String>();
			for (Character key:lists) {
				tempArray.addAll(listGroup.get(key));
			}
			preparedArray = tempArray.toArray(new String[0]);

		}
		System.out.println(Arrays.toString(preparedArray));
		// PROGRAMAR AQUI
	}

	public static void main(String[] args)
	{
		int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
		radixSort(arr);
		/*
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+(i<arr.length-1?",":""));
		}*/

	}
}
