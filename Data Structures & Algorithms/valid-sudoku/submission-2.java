class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> [] parts = new HashSet [27];
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if(board[i][j] != '.')
                {
                    int boxIdx = ((i) / 3) * 3 + ((j) / 3) + 18;
                    if(parts[i] != null && parts[i].contains(board[i][j]))    
                        return false;
                    if(parts[j+9] != null && parts[j+9].contains(board[i][j]))
                        return false;
                    if(parts[boxIdx] != null && parts[boxIdx].contains(board[i][j]))
                        return false;
                    if(parts[i] == null)
                        parts[i] = new HashSet<Character>();
                    if(parts[j+9] == null)
                        parts[j+9] = new HashSet<Character>();
                    if(parts[boxIdx] == null)
                        parts[boxIdx] = new HashSet<Character>();
                    parts[i].add(board[i][j]);
                    parts[j+9].add(board[i][j]);
                    parts[boxIdx].add(board[i][j]);
                }
            }
        }
        return true;
    }
}
