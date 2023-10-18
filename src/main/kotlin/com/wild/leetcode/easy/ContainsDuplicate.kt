package com.wild.leetcode.easy

/**
 * [Problem N°217](https://leetcode.com/problems/contains-duplicate/description)
 *
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 */
class ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {
        val hashSet = HashSet<Int>()
        nums.forEach {
            if (!hashSet.add(it)) {
                return true
            }
        }
        return false
    }
}