package mysort;

import mysort.sort.BubbleSort;
import mysort.sort.InsertionSort;
import mysort.sort.MergeSort;
import mysort.sort.QuickSort;
import mysort.sort.SelectionSort;
import mysort.sort.Sort;

public class SortClassTest {

	public static void main(String[] args) {
		int[] dataList = {5, 21, 14, 3, 31, 8, 27, 15};
		//데이터 리스트를 생성
		sortData(dataList);
		// 하위 메소드를 통해 결과 출력
	}
	
	static void sortData(int[] dataList) {
		Sort sort;
		
		//선택정렬
		sort = new SelectionSort();
		sort.sort(dataList);
		System.out.printf("%-20s %s\n", "Input Data", sort.getOrgData());
		System.out.printf("%-20s %s\n", sort.getClass().getSimpleName() + " Result", sort.getSortedData());
		System.out.println();
		
		//삽입 정렬
		sort = new InsertionSort();
		sort.sort(dataList);
		System.out.printf("%-20s %s\n", "Input Data", sort.getOrgData());
		System.out.printf("%-20s %s\n", sort.getClass().getSimpleName() + " Result", sort.getSortedData());
		System.out.println();
		
		//버블 정렬
		sort = new BubbleSort();
		sort.sort(dataList);
		System.out.printf("%-20s %s\n", "Input Data", sort.getOrgData());
		System.out.printf("%-20s %s\n", sort.getClass().getSimpleName() + " Result", sort.getSortedData());
		System.out.println();
		
		//고급 정렬
		
		//병합 정렬
		sort = new MergeSort();
		sort.sort(dataList);
		System.out.printf("%-20s %s\n", "Input Data", sort.getOrgData());
		System.out.printf("%-20s %s\n", sort.getClass().getSimpleName() + " Result", sort.getSortedData());
		System.out.println();
		
		//퀵 정렬
		sort = new QuickSort();
		sort.sort(dataList);
		System.out.printf("%-20s %s\n", "Input Data", sort.getOrgData());
		System.out.printf("%-20s %s\n", sort.getClass().getSimpleName() + " Result", sort.getSortedData());
		System.out.println();	
	}
}
