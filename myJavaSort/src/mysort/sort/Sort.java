package mysort.sort;

import java.util.Arrays;

public abstract class Sort {
	//오리지널 데이터 선언
	int[] orgData;
	//정렬된 데이터 선언
	int[] sortedData;
	
	// 추상 메서드로 정렬 매서드
	public abstract void sort(int[] dataList);
	
	// 스왑 메서드 : 데이터 리스트에서 두 정수 a,b의 위치 교환
	// temp를 선언해 데이터를 임시 저장할 공간을 만듦
	void swap(int[] dataList, int a, int b) {
		if (a == b) return;  
		int temp;
		temp = dataList[a];
		dataList[a] = dataList[b];
		dataList[b] = temp;
	}
	
	// 원본 데이터를 백업 후 정렬될 데이터를 저장한 sortedData를 생성함
	public void setData(int[] dataList) {
		this.orgData = dataList;
		this.sortedData = dataList.clone();
	}
	
	// toString 으로 문자열로 출력
	public String getOrgData() {
		return Arrays.toString(orgData);
	}
	
	// toString 으로 문자열로 출력
	public String getSortedData() {
		return Arrays.toString(sortedData);
	}

}
