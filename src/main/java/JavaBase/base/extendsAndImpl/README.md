------
# 继承与实现

------
## 理论
### 接口
1. 成员变量：默认都是public、static、final类型的，必须被显式初始化
2. 成员方法：默认都是public、abstract类型的。
3. 接口中只能包含public、static、final类型的成员变量和public、abstract类型的成员方法（接口中没有方法体。）。
4. 实例化：不能被实例化；
5. 构造方法：接口没有构造方法，不能被实例化，在接口中定义构造方法是非法的。
6. 一个接口不能实现另一个接口，但它可以继承多个其他接口。interface C extends A, B{} // A和B都是接口
7. 当类实现某个接口时，它必须实现接口中所有的抽象方法，否则这个类必须被定义为抽象类。 
### 抽象类
1. 成员变量：与普通类无异；
2. 成员方法：与普通类无异；
3. 抽象类中可以没有抽象方法，但包含了抽象方法的类必须被定义为抽象类。
4. 实例化：抽象类不能被实例化。因为抽象类可能含有没有方法体的抽象方法。
5. 构造方法：没有抽象构造方法，抽象类中可以有非抽象的构造方法，创建子类的实例时可能会调用这些构造方法。 
- static和abstract不能连用,没有抽象静态方法。
> static修饰的是累本身的方法，与子类无关；而abstract修饰的是需要子类来实现的方法；逻辑冲突；
- final和abstract不能连用，抽象类及抽象方法不能被final修饰符修饰。
> final修饰的方法不能被子类继承，与abstract逻辑冲突；
- private和abstract不能连用。
> private修饰的方法在子类继承时访问不到，即与abstract逻辑冲突；

------
## 代码示例

------
### simpleMode
- ClassDemoA类继承于AbstractClassDemoA并且实现了InterfaceDemoA接口；
- 在ClassDemoA中依次访问所关联的“抽象类”和“接口”的成员变量和方法；
### cascadeMode
- AbstractClassDemoB**抽象类**继承于AbstractClassDemoA并且实现了InterfaceDemoA接口；
- AbstractClassDemoB进行了父级抽象类（AbstractClassDemoA）的部分成员方法重写和部分抽象方法实现，并且实现了接口（InterfaceDemoA）部分方法；
- 在ClassDemoB中依次访问所关联的“抽象类”和“接口”的成员变量和方法；

------
