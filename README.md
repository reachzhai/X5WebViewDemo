# X5WebViewDemo
##### use tencent x5 service
### 1.Key store is in “/other/my.keystore”，AndroidManifest.xml已经配置好了
### 2.应该先安装X5内核，比如wechat，qq浏览器或者本案中的TBSdemo.apk

# 无法使用的问题

### 1.App接入TBS后为什么还是无法使用x5？

可能是如下原因:

##### 原因1，手机上没有x5内核

解决方法是 查看官网http://x5.tencent.com/doc?id=1003 接入文档中“SDK集成步骤”-->“第一步”

##### 原因2，App没有杀掉重启，由于x5内核初始化耗时，所以TBS第一次启动强制加载系统webview，需要您的App杀掉重启后才可以使用x5内核

##### 原因3，App没有按照规则混淆了 TBS jar，具体规则见

http://x5.tencent.com/doc?id=1003 SDK集成步骤 第十一步

##### 原因4，手机是64bit
如果运行app的手机是64bit，那么app将无法共享使用宿主的X5内核。解决办法是将app进行32bit库编译。

步骤：在android工程下libs目录新建armeabi文件夹，然后在其中放入任意一个32bit的so动态库，这样编译的app就能在32bit手机上使用X5内核了
