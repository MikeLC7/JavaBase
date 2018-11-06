------
# 判断元素相等

------
## 示例
### HashMapEqualityDemo
- 元素相等比较
#### hashMapEqualityDemo
2. 链表排序跟JDK7不同，JDK7保持最后一个元素在链表头；
JDK8保持在链表尾；
3. 遍历链表顺序无变化；仍然为自头向尾；
### HashMapValueEqualityDemo
- 遍历链表时是否仍需要判断hashCode()
#### hashMapValyeEqualityDemo
11. hash值1和17在Hash表中的索引值相同，虽然两个实例equals()方法始终返回true；但是他们各自取的是自己同类实例存放的值；
说明在遍历链表去判断key是否equals()的时候，仍需要判断hashCode()的返回值；

------
