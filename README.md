## Data-structures-and-algorithms
### 数据结构与排序算法基础

数据结构：数组，链表，哈希表，堆，队列，栈，二叉树，B树/B+树，红黑树，图(研发 图不多)

常见的排序算法(冒泡，插入，快排，堆排，归并排序…)

简单的动态规划问题(背包，上楼梯)

各种时间空间复杂度分析

所含知识点：

* 1 字符串

    查找匹配 KMP 正则

* 2 数组

* 3 链表

* 4 栈   
    java.util.Stack 实现
    ```java
    //取栈顶值（不出栈）
    stack.peek();
    //进栈
    stack.push(Object);
    //出栈
    stack.pop();
    ```
    
* 5 队列 
    java.util.Queue 接口
    
```java

    add         增加一个元索                     如果队列已满，则抛出一个IIIegaISlabEepeplian异常
　　remove   移除并返回队列头部的元素    如果队列为空，则抛出一个NoSuchElementException异常
　　element  返回队列头部的元素             如果队列为空，则抛出一个NoSuchElementException异常
　　offer       添加一个元素并返回true       如果队列已满，则返回false
　　poll         移除并返问队列头部的元素    如果队列为空，则返回null
　　peek       返回队列头部的元素             如果队列为空，则返回null
　　put         添加一个元素                      如果队列满，则阻塞
　　take        移除并返回队列头部的元素     如果队列为空，则阻塞

```

* 6 树

    二叉树 [二叉树实现 及三种遍历](https://github.com/loveincode/Data-structures-and-algorithms/blob/master/src/data_structures/data06_tree/Binarytree/BinaryTree.java)
    
    ``` 
    前序遍历 根左右
    中序遍历 左根右
    后序遍历 左右根
    ```
    B Tree / B+ Tree

    红黑树

* 7 哈希

    哈希冲突 k-v

* 8 图

    BFS
    DFS [BFS和DFS优先搜索算法](http://www.cnblogs.com/pengyingh/articles/2396432.html)

* 9 排序

    插入排序（直接插入排序、希尔排序）
    
    选择排序（简单选择排序、堆排序）
    
    交换排序（冒泡排序、快速排序）
    
    归并排序

    基数排序


