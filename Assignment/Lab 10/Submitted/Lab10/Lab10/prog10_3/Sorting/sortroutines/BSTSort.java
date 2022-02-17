package sortroutines;

import java.util.Arrays;

import runtime.Sorter;

public class BSTSort extends Sorter {

	@Override
	public int[] sort(int[] arr) {
		MyBST bst = new MyBST();
		bst.insertAll(arr);
		bst.printTree();
		int[] sortedArr = bst.readIntoArray(arr.length);
		return sortedArr;
	}
	public static void main(String[] args) {
		int[] arr = {9,8,7,4,6,5,2,1,3,10};
		System.out.println(Arrays.toString(arr));
		BSTSort mySort = new BSTSort();
		System.out.println(Arrays.toString(mySort.sort(arr)));
	}
}
