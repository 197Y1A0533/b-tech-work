def maxPoints(n:int,points: List[List[int]], x:int,y:int):
    
    i=0
    j=1
    count = set()
    while i<n:
        while j<n:
            if abs(points[i][0]-points[j][0]) <= x and abs(points[i][1]-points[j][1]) <= y:
                count.add((points[i][0],points[i][1]))
            j+=1
        i+=1
        j=i+1
    return len(count)