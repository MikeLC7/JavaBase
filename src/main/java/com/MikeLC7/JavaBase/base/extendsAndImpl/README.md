### simpleMode
- ClassDemoA类继承于AbstractClassDemoA并且实现了InterfaceDemoA接口；
- 依次访问所关联的“抽象类”和“接口”的成员变量和方法；
### cascadeMode
- AbstractClassDemoB**抽象类**继承于AbstractClassDemoA并且实现了InterfaceDemoA接口；
- AbstractClassDemoB进行了父级抽象类（AbstractClassDemoA）的部分成员方法重写和部分抽象方法实现，并且实现了接口（InterfaceDemoA）部分方法；
- 依次访问所关联的“抽象类”和“接口”的成员变量和方法；