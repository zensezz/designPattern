## 命令模式
数据驱动设计模式，请求以命令的形式包裹在对象中，并传给调用的对象，调用对象寻找可以处理该命令
的对象，然后执行。  

---
调用者 -> 接受者 -> 命令
 
--- 
###### 优点
* 降低系统的耦合度
* 新的命令可以很容易添加到系统中去

---
activiti使用了命令模式