#在words删除包含输入字符的元素
#
words = ['hello','goods','gooo','word','digo']
w = input('请输入一个单词')
i = 0      #表示下标
l = len(words)

while i<1:
	if w in words[i]
		del words[i]
		l -= 1
		continue  #此处解决漏删问题；
	i += 1        #若执行i+=1操作，会跳过一个元素

print(words)