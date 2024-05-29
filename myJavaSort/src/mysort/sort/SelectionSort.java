package mysort.sort;

//선택정렬
public class SelectionSort extends Sort {
	
	@Override
	public void sort(int[] dataList) {
		setData(dataList);
		//정렬할 데이터의 맨끝을 기준을 삼는게 선택정렬 최대값을 기준으로 정렬하므로 가장 오른쪽 sortedDate의 가장 오른쪽 
		//sortedData.length-1 을 가장 마지막으로 설정하고 배역의 마지막을 하나씩 줄이면서 실행함
		for (int last = sortedData.length-1; last >= 1; last--) {
			// 현재의 부분배열에서 maxIndex를 selectMax 메소드를 통해 찾음
			int maxIndex = selectMax(sortedData, last);
			
			// 찾은 배열이 마지막 요소와 다르면 교환함
			if (maxIndex != last)
				swap(sortedData, maxIndex, last);
		}
	}
	// 정렬되지않은 배열에서 최대값의 인덱스를 찾는 메서드임
	int selectMax(int[] dataList, int last) {
		int max = dataList[0]; //최대값을 처음의 요소로 지정함
		int maxIndex = 0; // 최대값의 위치를 첫번째로 초기화함
		// 해당 배열의 처음부터 마지막 last의 위치까지 최대값을 탐색함
		for (int i = 1 ; i <= last; i++) {
			//만약 데이터리스트가 최대라면 최대값을 갱신함
			if (dataList[i] > max) {
				max = dataList[i];
				maxIndex = i;
			}
		}
		// 갱신된 최대값을 반환함
		return maxIndex;
	}

	
}
