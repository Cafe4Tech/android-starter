# android_common
我们采用了目前较流行的开源框架构建了一个快速的Android项目脚手架，包括了这些内容
1. MVVM模式
2. RxJava异步模式
3. Retrofit+okhttp+volley
4. Glide
5. Butterknife+Dagger2
6. SQLite Orm
7. Android design library
8. Material design高star库

提供了一个通用的UI库，包括：
1. 底部弹出对话框
2. 底部导航栏，带凸起效果的底部导航栏
3. CoordinateLayout的toolbar
4. 支持sticky header的recyclerview
5. 可以周月模式切换的CollapseCalendarView
6. ripple effect装饰器

同时为了适应国内应用的特定应用，我们计划引入以下几个框架：
1. 支付接口
2. 社交登录与分享接口
3. 统计接口

此外，这个框架还包含了一个看上去还算合理的架构
1. 一个合理的通用package和module结构
2. 通用的proguard.pro声明
3. build.gradle
4. 测试类，包含UI与非UI测试
5. 线程管理
6. 通用Adapter接口

