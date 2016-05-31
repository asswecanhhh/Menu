# Menu
选项菜单和上下文菜单使用方法
menu.add(groupId, itemId, order, title)//添加菜单 groupId进行分组操作   itemId标识唯一选项   order 设置显示顺序，越小越在前

OnCreateOptionsMenu //设置选项菜单
OnCreateContextMenu //设置上下文菜单

两个菜单ItemId相互不影响

onOptionsItemSelected(MenuItem item) //对选项菜单进行点击操作
onContextItemSelected(MenuItem item) //对上下文菜单进行点击操作