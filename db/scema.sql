drop table if EXISTS tbProduct;
create table tbProduct(
  id int not null auto_increment comment '主键',
  name varchar(200) comment '商品名称',
  cover_image varchar(1000) comment '商品封面图片',
  price int not null default 0 comment '价格',
  primary key (id)

);
drop table if EXISTS tbProduct_Comment;
create table tbProduct_Comment(
  id int not null auto_increment comment '主键',
  product_id int comment '商品Id',
  author_id int comment '作者id',
  content varchar(200) comment '评论',
  created TIMESTAMP comment '时间',
  primary key (id)

);
drop table if EXISTS tbUser;
create table tbUser(
 id int not null auto_increment comment '主键',
 nickname varchar(2000) comment '昵称',
 avatar varchar(2000) comment '头像',
 primary key (id)
)

