package com.ww.suanfa;

import java.util.HashSet;
import java.util.Set;

public class ArithmeticTest {
    public static void main(String[] args) {
        String[] dictionary = {"looked","just","like","her","brother"};  // 词典
        String sentence = "jesslookedjustliketimherbrother";  // 文章
        // dp[i]=dp[i-dictionary[j]]+dictionary[j].length()
        // dp[i] = Math.max(dp[i - dictionary[j].length()] + dictionary[j].length(), dp[i])
        int n = sentence.length();
        int m = dictionary.length;
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i-1];
            for (int j = 0; j < m ; j++) { // 循环词典
                if (i < dictionary[j].length()) // 在文章中组装出与单词长度相同的单词出来
                    continue;
                if (sentence.substring(i - dictionary[j].length(), i).equals(dictionary[j])) {
                    dp[i] = Math.max(dp[i - dictionary[j].length()] + dictionary[j].length(), dp[i]);
                }
            }
        }
        System.out.println(n - dp[n]);
    }
}
