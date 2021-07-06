## renren-fast-vue
- renren-fast-vue基于vue、element-ui构建开发，实现[renren-fast](https://gitee.com/renrenio/renren-fast)后台管理前端功能，提供一套更优的前端解决方案
- 前后端分离，通过token进行数据交互，可独立部署
- 主题定制，通过scss变量统一一站式定制
- 动态菜单，通过菜单管理统一管理访问路由
- 数据切换，通过mock配置对接口数据／mock模拟数据进行切换
- 发布时，可动态配置CDN静态资源／切换新旧版本
- 演示地址：[http://demo.open.renren.io/renren-fast](http://demo.open.renren.io/renren-fast) (账号密码：admin/admin)

![输入图片说明](https://images.gitee.com/uploads/images/2019/0305/133529_ff15f192_63154.png "01.png")
![输入图片说明](https://images.gitee.com/uploads/images/2019/0305/133537_7a1b2d85_63154.png "02.png")


## 说明文档
项目开发、部署等说明都在[wiki](https://github.com/renrenio/renren-fast-vue/wiki)中。


## 更新日志
每个版本的详细更改都记录在[release notes](https://github.com/renrenio/renren-fast-vue/releases)中。


1.一般大部分报错都是报的node-sass安装失败

2.解决办法：如果你之前安装失败过的，请先清理缓存

使用命令：
npm rebuild node-sass
npm uninstall node-sass

3.之后执行：

npm i node-sass --sass_binary_site=https://npm.taobao.org/mirrors/node-sass/
执行成功后看看有没有报错，要是没有报错就可以执行安装命令了

4.安装

npm install
npm run dev

作者：陈住气I
链接：https://www.jianshu.com/p/2be02670484e
来源：简书
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
