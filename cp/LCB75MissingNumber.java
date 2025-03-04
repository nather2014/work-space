public class LCB75MissingNumber {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        boolean isThere = false;
        int i;
        for (i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (nums[j] == i) {
                    isThere = true;
                }
            }
            if (!isThere) {
                break;
            isThere = false;
        }git config --global user.name
        return i;
    }

    public static void main(String[] args) {
        LCB75MissingNumber mn = new LCB75MissingNumber();
        System.out.println(mn.missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 }));
    }

}
