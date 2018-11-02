------
# ArrayList

------
## 示例
### ArrayListDemoListA
#### listEqualDemo
- 元素相等判断
1. 虽然判断的字符串是new出来的新对象，但是equals()方法返回是相等的，所以返回“abc”的索引值
2. Lee类实例的equals()方法始终返回true，则在跟集合中第一个元素比较时即判定成功；
3. 同2，成功删除第一个元素；
#### ensureCapacitySimpleDemo
- 容量扩容示例
1. JDK1.8中默认初始容量为0
    - 当第一次添加元素时分配内存，容量为默认容量10；
    - 当第十一次添加元素的时候发现容量不够，扩充为原容量的1.5倍；
    - 依次类推;需参考源码
#### ensureCapacityInitDemo
- 指定容量示例
1. 指定容量大小的构造方法在实例化对象时即分配指定大小的内存空间，容量为本例中的20；
2. 添加时依次判断当前容量是否够用，即本例中在添加时不再扩容；
> 参考源码，undo有出入

------
## 目录
###

------