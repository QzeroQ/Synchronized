# Synchronized
**Synchronized关键字的用法**
多线程访问同步方法的7种情况
1. 两个线程同时访问一个对象的同步方法
他们即是同一个实例，两个线程争抢的是同一把锁，只能有一个线程持有，会互相等待。
2. 两个线程访问的是两个对象的同步方法
此时synchronized是不起作用的，因为他们锁的是不同的实例
3. 两个线程访问的是synchronized的静态方法
他们会一个一个的执行， 锁是生效的
4. 同时访问同步方法与非同步方法
非同步方法不受到影响
5. 访问同一个对象的不同的普通同步方法
默认指定this对象作为锁，他们是同一个实例，他们会一个一个的执行
6. 同时访问静态synchronized和非静态synchronized方法
类锁的时候，锁住的对象是class对象，对象锁的时候锁是实例本身this,  这两个锁是不一样的， 所以拿到这两个锁之间没有冲突
7. 方法抛出异常后，会释放锁
synchronized 两个特性：可重入性、不可中断性
