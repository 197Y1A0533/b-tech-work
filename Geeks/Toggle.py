t=int(input())
arr=list(map(int,input().split()))[:t]
# firstPoint=pos=maxi=count=0
firstPoint=pos=maxi=count=0
# print(firstPoint,pos,maxi,count)
n=0
while pos < len(arr):
    if arr[pos] == 1:
        count +=1
        maxi = max(maxi,count)
        pos +=1
        n+=1
    else:
        while ( pos < len(arr) and arr[pos] ==0 ):
            count+=1
            pos+=1
            maxi = max(maxi,count)
            n+=1
            
        firstPoint = pos
        while ( pos < len(arr) and arr[pos] ==1 ):
            count +=1
            pos +=1
            maxi = max(maxi,count)
            n=pos
            
        pos=firstPoint
        count=0

print(maxi)
             
            