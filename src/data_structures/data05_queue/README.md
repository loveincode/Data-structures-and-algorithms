## 队列

用array[n]数组实现的至多含有n-1个元素的队列的方法.
队列具有属性head[Q],指向队列的头. 属性tail[Q]指向新元素要被插入的地方

head[Q] = tail[Q]时，队列空；
head[Q] = tail[Q]+1时，队列满；
初始head[Q] = tail[Q] = 1


先进先出
入队，出队都是O(1)