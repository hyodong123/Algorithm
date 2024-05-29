package mysort.sort;

public class InsertionSort extends Sort {

	@Override
	public void sort(int[] dataList) {
		setData(dataList);
		
		for (int i = 1; i < sortedData.length; i++) {
			int loc = findLessFromLast(sortedData, sortedData[i], i-1);
			if (loc != i-1)
				insertData(sortedData, loc+1, i);
		}

	}
	// 데이터 삼입하는 메서드
	private void insertData(int[] dataList, int target, int source) {
		// 임시 변수인 temp에 source(이동할 데이터)를 저장
		int temp = dataList[source];
		// 소스가 타겟까지 역순으로 반복 비교 후
 		for (int i = source; i > target; i--) {
			dataList[i] = dataList[i-1];
		}
 		// 데이터 리스트 타켓 위치에 임시변수 데이터를 넣음
		dataList[target] = temp;
	}
	// 삽입할 데이터 data를 정렬된 부분에 삽입할 위치를 탐색함
	private int findLessFromLast(int[] dataList, int data, int last) {
		//배열의 라스트 부터 범위를 탐색함
		for (int i = last; i >= 0; i--) {
			// 인덱스 i의 요소가 data 보다 작으면 i를 반환함
			if (dataList[i] <= data) 
				return i; 
		}
		//그게 아니라면 삽입을 할 위치가 없음
		return -1;
	}
	
	 

}
