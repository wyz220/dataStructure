package LeeCode.linkedList;

/**
 * 接雨水
 * https://leetcode-cn.com/problems/trapping-rain-water/solution/jie-yu-shui-by-leetcode/
 *方法 4：使用双指针
 */
public class DoublePointSoluationTrap {

	/**
	 * 方法 4：使用双指针
	 * @param height
	 * @return
	 */
	 public int trap(int[] height) {
	        int leftIndex = 0;
	        int rightIndex = height.length - 1;
	        int capcity = 0;
	        int leftMax = 0;
	        int rightMax = 0;
	        while(leftIndex < rightIndex){//指针下标重叠，循环结束
	        	if(height[leftIndex] < height[rightIndex]){//右指针大于左指针，左指针动
	        		if(height[leftIndex] >= leftMax)leftMax = height[leftIndex];
	        		else capcity += (leftMax - height[leftIndex]);
	        		
	        		++leftIndex;//左指针右滑
	        	}else{//如果左指针大于等于右指针，保持右指针水位至高，往左移动
	        		if(height[rightIndex] >= rightMax ){//保持右侧指针最大值
	        			rightMax = height[rightIndex] ;
	        		}else{
	        			capcity += (rightMax-height[rightIndex]);
	        		}
	        		--rightIndex;//右指针左滑
	        	}
	        }
	        return capcity;
	 }
}
