package LeeCode.linkedList;

/**
 * 搜索旋转排序数组  33
 * @author msht
 * 核心是判断，那部分区间是排序区间，左边还是右边的判断条件
 */
public class ArrayBinarrySearch_33 {

	public static int search(int[] a, int value) {
		if(a.length == 0) return -1;
		int low = 0,high = a.length - 1;
		while(low <= high){
			int mid = low + ((high - low) >> 1);
			if(a[mid] == value) return mid;
			if(a[mid] >= a[low]){//左边升序
				if(a[mid] >= value && value >= a[low]){//左边区间查找
					high = mid - 1;
				}else{
					low = mid + 1;//右边找
				}
			}else{//右边升序
				if(a[mid] <= value && a[high] >= value){//左边区间查找
					low = mid + 1;
				}else{
					high = mid - 1;
				}
			}
		}
		return -1;
	}

	
	public static void main(String[] args) {
		int[] a = new int[]{4,5,6,7,8,1,2,3};
		// [4,5,6,7,8,1,2,3]  8/2 = 8
		// 3,1
		a = new int[]{1,3};
		System.out.println(search(a,1));
	}

}
