package 依赖倒转原则;

public class test {
	/**
	 * 依赖倒转原则
       抽象不应该依赖细节，细节应该依赖于抽象，针对接口编程，不要对实现编程；针对抽象编程，而不是针对细节编程
       A.高层模块不应该依赖低层模块。两个都应该依赖抽象。
       B.抽象不应该依赖细节。细节应该依赖抽象。
里氏代换原则：
        子类型必须能够替换掉它们的父类型（好比学习继承的概念时，子类继承了父类，子类就可以以父类的身份出现）
        一个软件实体如果使用的是一个父类的话，那么一定适用于其子类，而且它察觉不出父类对象和子类对象的区别。也就是说，在软件里面，把父类都替换成它的子类，程序的行为没有变化。
        依赖倒转其实可以说是面向对象设计的标志，用哪种语言来编写程序不重要，如果编写时考虑的都是如何针对抽象编程而不是针对细节编程，即程序中所有的依赖关系都是终止于抽象类或者借口，那就是面向对象的设计，反之那就是过程化的设计了。*/

}
