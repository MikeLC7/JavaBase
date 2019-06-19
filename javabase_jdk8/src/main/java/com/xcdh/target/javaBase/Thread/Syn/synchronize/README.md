------
# synchronized关键字

------
## 代码示例

------
### MySynMethodThread
- synchronized修饰普通方法示例
1. 对象锁，多线程操作一个示例会依次进入方法，静态变量cout整体累加；
    - 多个线程串行执行；
2. 对象锁，多线程分别操作自己的实例，则会各自同步自己的对象锁，静态变量count累加出现覆盖；
    - 多个线程整体看是并行；
    - 同一个对象锁的多个线程是串行；
> 当然，如果是变量count是普通成员变量，上述2的情况各自对象锁会生效，效果类似@1；
### MySynThisThread
- synchronized修饰当前对象示例
1. 效果同上（MySynMethodThread）
### MySynStaticMethodThread
- synchronize修饰静态方法
1. 类锁，多线程操作一个示例会依次进入方法，静态变量cout整体累加；
    - 多个线程串行执行；
2. 类锁，多线程虽然分别操作自己的实例，但是同步的锁仍然是唯一的类锁；静态变量count整理累加；
    - 多个线程整体看仍然是串行执行；
### MySynClassThread
- synchronized修饰当前类对象
1. 效果同上（MySynStaticMethodThread）
 
------
## 理论

------

------
## 目录

------

------
