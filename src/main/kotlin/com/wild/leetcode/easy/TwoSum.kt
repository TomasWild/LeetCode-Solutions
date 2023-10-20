package com.wild.leetcode.easy

/**
 * [Problem N°1](https://leetcode.com/problems/two-sum/description)
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers
 * such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use
 * the same element twice.
 *
 * You can return the answer in any order.
 *
 * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        nums.forEachIndexed { index, int ->
            map[int]?.let {
                return intArrayOf(it, index)
            }
            map[target - int] = index
        }
        return intArrayOf()
    }
}