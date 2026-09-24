class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<Integer>();
        // let's have a fixed sliding window of k size.
        int min = 10_001;
        int index = -1;
        for (int i = 0; i < arr.length - k; i++) {
            if (min > Math.abs(arr[i] - x)) {
                min = arr[i];
                index = i;
            }
        }

        for (int i = index+1; i < index +1 + k; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}