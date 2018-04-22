# learn-collection
---

## 简介
这是我的文章 [实现一个双向链表的倒置功能（1->2->3 变成 3->2->1)](https://since1986.github.io/blog/17c527fd.html) 对应的工程。

## 背景
对应了一道题目，原题目为：
> 实现一个双向链表的倒置功能（1->2->3 变成 3->2->1)
> 请勿直接使用JDK的LinkedList。完成一个完整的可运行的Java工程，包含单元测试。

## 结构
```
.
├── LICENSE
├── README.md
├── build.gradle
├── settings.gradle
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── github
    │   │           └── since1986
    │   │               └── learn
    │   │                   └── collection
    │   │                       ├── Deque.java #双向表接口
    │   │                       ├── LinkedList.java #（双向）链表
    │   │                       ├── LinkedListUtils.java #（双向）链表工具类
    │   │                       └── List.java #线性表接口
    │   └── resources
    └── test
        ├── java
        │   └── com
        │       └── github
        │           └── since1986
        │               └── learn
        │                   └── collection
        │                       ├── LinkedListTest.java #（双向）链表单元测试
        │                       └── LinkedListUtilsTest.java #（双向）链表工具类单元测试
        └── resources

```