### Builder模式（创建者模式又叫建造者模式）
Builder模式可以将一个类的构建和表示进行分离

---
###### 前言
什么是builder，Director


---
###### 问题
当一个类的内部数据过于复杂的时候（通常是负责持有数据的类，比如Config、VO、PO、Entity...），
要创建的话可能就需要了解这个类的内部结构，还有这些东西是怎么组织装配等一大坨乱七八糟的东西，
这个时候就会增加学习成本而且会很混乱，这个时候就想啊想一种什么法子来管理一下这个类中的数据呢，
怎么在创建的时候让它按部就班的来，并且代码可读性很好别让我看花了眼啊，我要的东西也能都很好设
置进来，这就是Builder模式的应用场景。

---
###### 作用
在用户不知道对象的建造过程和细节的情况下就可以直接创建复杂的对象。
