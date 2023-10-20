package com.wild.leetcode.easy

/**
 * [Problem N°242](https://leetcode.com/problems/valid-anagram/description)
 *
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or
 * phrase, typically using all the original letters exactly once.
 *
 * Follow up: What if the inputs contain Unicode characters? How would you adapt your
 * solution to such a case?
 */
class ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }
        val countS = mutableMapOf<Char, Int>()
        val countT = mutableMapOf<Char, Int>()
        for (i in s.indices) {
            countS[s[i]] = 1 + countS.getOrDefault(s[i], 0)
            countT[t[i]] = 1 + countT.getOrDefault(t[i], 0)
        }
        for (c in countS.keys) {
            if (countS[c] != countT.getOrDefault(c, 0)) {
                return false
            }
        }
        return true
    }
}