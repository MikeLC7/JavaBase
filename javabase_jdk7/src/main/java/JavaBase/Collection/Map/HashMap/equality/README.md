------
# 判断元素相等

------
## 示例
### HashMapEqualityDemo
#### hashSetEqualityDemo
- 元素相等比较
1. A类两个实例hashCode()返回值不同，添加成功
2. B类两个实例equals()方法不为true，添加成功
3. C类实例添加时，hashCode()方法返回值与B的实例相同，并且equals()方法返回始终为true，集合判定与B类实例“相等”，添加失败
4. D类两个实例，虽然hashCode()方法返回值在已有元素中存在相同项，但equals()方法返回始终为false，集合判定无相同项，添加成功
5. E类的第一个实例，hashCode()方法返回值在已有元素中无相同项，即使equals()返回true，仍然添加成功
6. E类的第二个实例，hashCode()方法和equals()方法返回值都与E类第一个实例相同，所以添加失败
7. 

------
