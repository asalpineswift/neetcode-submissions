class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> arrList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                if (j > i+1 && nums[j] == nums[j - 1])
                    continue;
                int a = j + 1, b = n - 1;
                while (a < b) {
                    long sum = (long) nums[i] + nums[j] + nums[a] + nums[b];
                    if (sum > target) {
                        b--;
                    } else if (sum < target) {
                        a++;
                    } else {
                        arrList.add(Arrays.asList(nums[i], nums[j], nums[a], nums[b]));
                        a++;
                        b--;
                        while (a < b && nums[a] == nums[a - 1])
                            a++;
                        while (a < b && nums[b] == nums[b + 1])
                            b--;
                    }
                }
            }
        }
        return arrList;
    }
}