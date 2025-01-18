---

# Best Time to Buy and Sell Stock - Solution Explanation

This repository contains a solution to the **"Best Time to Buy and Sell Stock"** problem, where the objective is to maximize profit by choosing a single day to buy and a different day in the future to sell a stock.

## Problem Statement

You are given an array `prices` where:
- `prices[i]` represents the stock price on the `i`-th day.

Your task is to find the maximum profit you can achieve by performing at most one transaction:
- Buy one stock on one day.
- Sell it on another day.

If no profit is possible, return `0`.

---

## Approach

The solution iterates through the `prices` array while keeping track of:
1. **The minimum price** encountered so far.
2. **The maximum profit** that can be achieved up to the current day.

### Algorithm
1. Initialize `minPrice` to a very large value (`Integer.MAX_VALUE`).
2. Initialize `maximumProfit` to `0`.
3. Iterate through the `prices` array:
   - Update `minPrice` if the current price is smaller.
   - Calculate the profit if the stock is sold on the current day: `profit = price - minPrice`.
   - Update `maximumProfit` if the calculated `profit` is greater.
4. Return `maximumProfit`.

---

## Code Explanation

### Method Signature
```java
public int maxProfit(int[] prices)
```

### Parameters
- `prices`: An integer array representing stock prices on different days.

### Returns
- An integer representing the maximum profit achievable.

---

## Complexity Analysis

### Time Complexity
- **O(n)**: The algorithm processes each element in the `prices` array exactly once.

### Space Complexity
- **O(1)**: No additional data structures are used; only two integer variables (`minPrice` and `maximumProfit`) are maintained.

---

## Example

### Input
```java
int[] prices = {7, 1, 5, 3, 6, 4};
```

### Execution
1. Start with `minPrice = Integer.MAX_VALUE` and `maximumProfit = 0`.
2. Traverse through the `prices` array:
   - Day 1: `price = 7`, `minPrice = 7`, `profit = 0`, `maximumProfit = 0`.
   - Day 2: `price = 1`, `minPrice = 1`, `profit = 0`, `maximumProfit = 0`.
   - Day 3: `price = 5`, `profit = 5 - 1 = 4`, `maximumProfit = 4`.
   - Day 4: `price = 3`, `profit = 3 - 1 = 2`, `maximumProfit = 4`.
   - Day 5: `price = 6`, `profit = 6 - 1 = 5`, `maximumProfit = 5`.
   - Day 6: `price = 4`, `profit = 4 - 1 = 3`, `maximumProfit = 5`.
3. Return `maximumProfit = 5`.

### Output
```java
Solution solution = new Solution();
int result = solution.maxProfit(prices);
// Output: 5
```

---

## Edge Cases
1. **Empty or Single Element Array**: 
   - Input: `prices = []` or `prices = [3]`.
   - Output: `0` (No transactions possible).
2. **Decreasing Prices**:
   - Input: `prices = [7, 6, 4, 3, 1]`.
   - Output: `0` (No profit possible).

---

## Key Insights

- The problem is solved in a single pass using the greedy approach, keeping track of the minimum price and the maximum profit so far.
- It avoids nested loops, ensuring optimal performance.

---