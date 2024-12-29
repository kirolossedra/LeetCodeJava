class Solution:
    def numWays(self, words: List[str], target: str) -> int:
        W, T = len(words[0]), len(target)
       
        char_pos_count = defaultdict(int)
        for w in words:
            for pos,c in enumerate(w):
                char_pos_count[c, pos] += 1
    
        dp = [0] * T + [1]
        for k in reversed(range(W)):
            for i,t in enumerate(target):
                dp[i] += dp[i + 1] * char_pos_count[t, k]

        return dp[0] % (10 ** 9 + 7)