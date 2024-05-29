package mysort.sort;

public class MergeSort extends Sort {

	@Override
	public void sort(int[] dataList) {
		setData(dataList);
		mergeSort(sortedData, 0, sortedData.length-1);
	}
	// 머지?소트 메소드
	void mergeSort(int[] dataList, int start, int end) {
		// 배열의 크기가 요소 하나씩 볼 수 있는 1일때 반환하는거
		if (start >= end) return;
		// mid 는 배열의 가운데
		int mid = (start + end) / 2;
		//배열의 왼쪽
		mergeSort(dataList, start, mid);
		//배열의 오른쪽
		mergeSort(dataList, mid+1, end);
		//병합
		merge(dataList, start, mid, end);
	}
	//데이터를 판별하여 작은 단위에서 정렬하는 메소드
	void merge(int[] dataList, int start, int mid, int end) {
		// 임시로 저장할 배열을 선언함
		int[] tempList = new int[end-start + 1];
		// 왼쪽 시작 지점 = i , 오른쪽 시작 지점 = j , k는 임시 저장할 배열
		int i = start, j = mid + 1, k = 0;
		
		while (i <= mid && j <= end) {
			// 정렬한 배열 i가 j보다 작다면 i의 값이 삽입 else j값이 삽입된다 
			if (dataList[i] <= dataList[j])
				tempList[k++] = dataList[i++];
			else
				tempList[k++] = dataList[j++];
		}
		// i 아니면 j 만 남아있는 데이터 리스트의 넣기 위한 식 
		while (i <= mid) tempList[k++] = dataList[i++];
		while (j <= end) tempList[k++] = dataList[j++];
		
		// 데이터 리스트에 templist 를 덮어씌우는 과정
		for (i = start, k = 0; k < tempList.length; i++, k++)
			dataList[i] = tempList[k];
		//System.arraycopy(dataList, start, tempList, 0, end-start+1);
	}

}
