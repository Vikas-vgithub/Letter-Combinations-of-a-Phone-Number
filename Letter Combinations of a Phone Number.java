class Solution {
    static String [] key = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.length() != 0)
            keypair(digits, "", list);
        return list;
    }

    public static void keypair(String ques, String ans, List<String> list){
        if(ques.length() == 0){
            list.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        String keys = key[ch - '0'];

        for(int i = 0; i < keys.length(); i++){
            keypair(ques.substring(1), ans + keys.charAt(i), list);
        }
    }
}
