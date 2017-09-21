# android-starter
## 一个基于主流开源框架的Android项目脚手架

这是一个Android项目模板，我希望能够在这个脚手架下面尽可能地用最新的Android技术构建一个可以投放生产环境的Android项目架构。
这个项目至少包含两部分内容：
1. Project模板
2. 编码规范

我们将采用的框架包括：
1. MVVM
2. RxJava异步模式
3. Retrofit+okhttp+volley
4. Glide
5. Butterknife+Dagger2
6. SQLite Orm
7. Android design library
8. Material design高star库

同时，提供了一个通用的UI库，包括：
1. 底部弹出对话框
2. 底部导航栏，带凸起效果的底部导航栏
3. CoordinateLayout的toolbar
4. 支持sticky header的recyclerview
5. 可以周月模式切换的CollapseCalendarView
6. ripple effect装饰器

为了适应国内应用的特定应用，计划引入以下几个框架：
1. 支付接口
2. 社交登录与分享接口
3. 统计接口与腾讯bugly

架构方面，包含的内容有：
1. 一个合理的通用package和module结构
2. 通用的proguard.pro声明
3. build.gradle
4. 测试类，包含UI与非UI测试
5. 线程管理
6. 通用Adapter接口

持续更新中。
