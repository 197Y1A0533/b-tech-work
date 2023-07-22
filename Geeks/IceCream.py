""" n,k=map(int,input().split())
arr=list(map(int,input().split()))[:n]
l=[]
for i in range(n):
    l[arr[i]].append(i)
result=0
for i in l:
    for j in range(len(i)):
        for k in range(j+1,len(i)):
            if ( l[j][k] - l[j][i] >=k):
                result += """



n,k=map(int,input().split())
arr=list(map(int,input().split()))[:n]
l=[]
result=0
i=0
while i<len(arr):
    j=i
    while j<len(arr):
        if arr[i]==arr[j]:
            if j-i >=k:
                result +=1 
        j +=1
    i +=1
print(result)




""" result=0
for i in range(len(arr)):
    for j in range(i,len(arr)):
        if arr[i]==arr[j]:
            if j-i >=k:
                result +=1
print(result) """



""" result=0
        i=0
        while i<len(a):
            j=i
            while j<len(a):
                if a[i]==a[j]:
                    if j-i >=k:
                        result +=1 
                j +=1
            i +=1
        
        return result """



""" 
result=0
        i=0
        for i in range(len(a)):
            for j in range(i,len(a)):
                if a[i]==a[j]:
                    if j-i >=k:
                        result +=1
        
        return result """