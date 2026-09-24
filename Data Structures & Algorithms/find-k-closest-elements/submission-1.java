class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int r = k;
        int currSum = 0, minSum = 0, minR = r - 1;
        for (int i = 0; i < k; i++) {
            currSum += Math.abs(arr[i] - x);
        }
        minSum = currSum;
        while (r < arr.length) {
            currSum = currSum + Math.abs(arr[r] - x) - Math.abs(arr[r - k + 1] - x);
            if (currSum < minSum) {
                minSum = currSum;
                minR = r;
            }
            r++;
        }

        int l = minR - k + 1;
        List<Integer> list = new ArrayList<>();
        while (l <= minR) {
            list.add(arr[l]);
            l++;
        }
        return list;
    }
}