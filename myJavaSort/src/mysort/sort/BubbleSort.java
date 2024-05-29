package mysort.sort;

public class BubbleSort extends Sort {

	@Override
	public void sort(int[] dataList) {
		setData(dataList);
		// 배열의 마지막에서 부터 실행함 last는 정렬되지 않은 배열의 마지막
		for (int last = sortedData.length - 1; last >= 1; last--) {
			// 인접한 두 요소씩 비교하며 정렬함
			for (int i = 0; i <= last - 1; i++) {
				// 정렬 조건 첫번째 요소가 두번째 보다 크다면 스왑함
				if (sortedData[i] > sortedData[i+1])
					swap(sortedData, i, i+1);
			}
		}
	}

}
