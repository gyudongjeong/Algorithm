import heapq

def solution(n, k, enemy):
    answer = 0
    
    heap = []
    
    for i, e in enumerate(enemy): # 데이터를 그냥 받아서 씀.
        # 매 라운드 마다 적의 수 저장(가장 작은 값이 맨 앞에 옴)
        heapq.heappush(heap, e)
        
        #무적권을 쓸 수 밖에 없는 상황(저장된 라운드가 무적권 수를 초과하면)
        if len(heap) > k:
            n -= heapq.heappop(heap) # 가장 작은 값이 꺼내지면서 # 가지고 있는 병사로 라운드를 처리
        # 더 이상 처리할 수 있는 병사가 없다면 끝!
        if n < 0:
            return i; # 0번 인덱스부터 사용했기 떄문에 -1을 하지 않음.
    
    return len(enemy)