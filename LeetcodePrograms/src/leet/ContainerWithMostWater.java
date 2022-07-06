package leet;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] height = { 2, 3, 10, 5, 7, 8, 9 };
		// int maxHeight = (height[0] > height[1]) ? 0 : 1;
		int start = 0;
		int end = height.length - 1;
		int maxWater = 0;
		int volume = 0;
		while (start != end) {
			volume = Math.min(height[start], height[end]) * (end - start);
			if (volume > maxWater)
				maxWater = volume;
			if (height[start] > height[end])
				end--;
			else
				start++;
		}
		System.out.println("water =  " + maxWater);
		System.out.println("End = " + end);

	}

}
