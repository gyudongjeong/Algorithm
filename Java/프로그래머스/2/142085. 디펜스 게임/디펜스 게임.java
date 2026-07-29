import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        for(int i = 0; i < enemy.length; i++) {
            heap.offer(enemy[i]);
            
            if(heap.size() > k) {
                n -= heap.poll(); // 나의 병사 이용
            }
            
            if(n<0) {
                return i;
            }
            
        }
        
        return enemy.length;
    }
}