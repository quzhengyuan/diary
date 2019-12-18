#在words删除包含输入字符的元素
#
words = ['hello','goods','gooo','word','digo']
w = input('请输入一个单词：')
i = 0      #表示下标
p = len(words)
    
while i<p:    #当前下标<列表长度
    if w in words[i]:
        del words[i]
        p -= 1    #删除一个元素后，列表长度-1
        continue  #此处解决漏删问题；
    i += 1        #若执行i+=1操作，会跳过一个元素

print(words)
