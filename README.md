# [387. First Unique Character in a String](https://leetcode.com)

## 📝 Description
The objective is to find the index of the first character in a string that does not repeat anywhere else. If every character repeats, return `-1`.

### Examples
- **Input**: `s = "leetcode"` -> **Output**: `0` ( 'l' is the first unique char)
- **Input**: `s = "loveleetcode"` -> **Output**: `2` ( 'v' is the first unique char)
- **Input**: `s = "aabb"` -> **Output**: `-1`

## 💡 My Approach
I utilized the built-in [String Methods](https://docs.oracle.com) in Java to verify uniqueness:
1. **Iterate** through the string character by character.
2. For each character, check its **first index** using `indexOf()` and its **last index** using `lastIndexOf()`.
3. If both indices are the **same**, it means the character appears exactly once in the entire string.
4. Return the current index immediately as it will be the "first" unique occurrence.

## ⚙️ Complexity Analysis
- **Time Complexity**: $O(N^2)$. While the loop runs $N$ times, `indexOf` and `lastIndexOf` both take $O(N)$ time in the worst case.
- **Space Complexity**: $O(1)$. No additional data structures like HashMaps or frequency arrays were used.
