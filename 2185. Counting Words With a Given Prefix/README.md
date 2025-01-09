# Count Prefix Strings

## Problem Description

Given an array of strings `words` and a string `pref`, return the number of strings in `words` that contain `pref` as a prefix.

A prefix of a string `s` is any leading contiguous substring of `s`.

## Examples

### Example 1:

```
Input: words = ["pay","attention","practice","attend"], pref = "at"
Output: 2
Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".
```

### Example 2:

```
Input: words = ["leetcode","win","loops","success"], pref = "code"
Output: 0
Explanation: There are no strings that contain "code" as a prefix.
```

## Constraints

- 1 <= words.length <= 100
- 1 <= words[i].length, pref.length <= 100
- words[i] and pref consist of lowercase English letters

## Approach

1. Initialize a counter variable to 0
2. Iterate through each word in the array
3. For each word, check if it starts with the given prefix
4. If it does, increment the counter
5. Return the final count

## Complexity Analysis

- **Time Complexity**: O(n × m)
  - where n is length of words array
  - m is length of prefix string
- **Space Complexity**: O(1)
  - only using a counter variable

## Notes

- Can use built-in string methods like `startsWith()` to check prefix
- All strings contain only lowercase English letters, so no special character handling needed
