package mysort.sort;

public class QuickSort extends Sort {

	@Override
	public void sort(int[] dataList) {
		setData(dataList);
		quickSort(sortedData, 0, sortedData.length - 1);
	}

	void quickSort(int[] dataList, int start, int end) {
		if (start >= end)
			return;
		// 파티션으로 나눠짐
		int p = partition(dataList, start, end);
		// 나뉘어진 파티션을 정렬하기
		quickSort(dataList, start, p - 1);
		quickSort(dataList, p + 1, end);
	}

	int partition(int[] dataList, int start, int end) {
		int pivot = dataList[end]; // 1. 피벗을 배열의 마지막 요소로 설정
		int leftEnd = start - 1; // 2. 왼쪽 부분 배열의 끝 인덱스를 초기화
		for (int i = start; i <= end - 1; i++) { // 3. 배열을 순회하여 피벗과 비교
			if (dataList[i] < pivot) {
				swap(dataList, ++leftEnd, i); // 4. 피벗보다 작은 요소를 왼쪽 부분 배열로 이동
			}
		}
		swap(dataList, leftEnd + 1, end); // 5. 피벗을 최종 위치로 이동
		return leftEnd + 1; // 6. 피벗의 최종 위치를 반환
	}
}