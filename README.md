# SpringBoot+Vue前后端分离开发

因为他要求创建一个README.md，所以我先创建一个！

嫌弃了git本地仓库直接建立在桌面，浪费了C盘的空间，我在D盘又新建了文件夹，将git仓库初始化。发现clone下载速度巨慢，通过设置代理socks：1080的方式，让下载速度变快：

```c
git config --global http.proxy 'socks5://127.0.0.1:1080'
git config --global https.proxy 'socks5://127.0.0.1:1080'
```

可是这个方法只能加速 https 的速度，我再想要push的时候，每次都需要输入密码。

把换成了SSH的方式：

```c
$ git remote -v                   //查看传输方式
```

```c
$ git remote rm origin            //移除当前方式
```

```c
$ git remote add origin git@github.com:hex39/SpringBoot_Vue_Book_CRUD.git
//设置成SSH方式
```

```c
$ git branch --set-upstream
```

```c
$ git push -u origin master
```

接下来就能无脑 git push 命令了！