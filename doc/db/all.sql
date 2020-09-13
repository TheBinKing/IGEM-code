-- 小节
drop table if exists `section`;
create table `section` (
  `id` char(8) not null default '' comment 'id',
  `title` varchar(50) not null comment '标题',
  `course_id` char(8) comment '课程|course.id',
  `chapter_id` char(8) comment '大章|chapter.id',
  `video` varchar(200) comment '视频',
  `time` int comment '时长|单位秒',
  `charge` char(1) comment '收费|C 收费；F 免费',
  `sort` int comment '顺序',
  `created_at` datetime(3) comment '创建时间',
  `updated_at` datetime(3) comment '修改时间',
  primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='小节';

insert into `section` (id, title, course_id, chapter_id, video, time, charge, sort, created_at, updated_at)
values ('00000001', '测试小节01', '00000001', '00000000', '', 500, 'f', 1, now(), now());


-- 大章
drop table if exists chapter;
create table chapter (
id char(8) not null comment 'ID',
course_id char(8) comment '课程ID',
name varchar(50) comment '名称',
primary key (id)
) engine=innodb default charset=utf8mb4 comment='大章';

insert into chapter (id, course_id, name) values ('00001','00001','测试大章一');
insert into chapter (id, course_id, name) values ('00002','00002','测试大章二');
insert into chapter (id, course_id, name) values ('00003','00003','测试大章三');
insert into chapter (id, course_id, name) values ('00004','00004','测试大章四');
insert into chapter (id, course_id, name) values ('00005','00005','测试大章五');
insert into chapter (id, course_id, name) values ('00006','00006','测试大章六');
insert into chapter (id, course_id, name) values ('00007','00007','测试大章七');
insert into chapter (id, course_id, name) values ('00008','00008','测试大章八');



-- 测试

drop table if exists `test`;
create table `test`(
`id` char(8) not null default '' comment 'id',
`name` varchar(50) comment '名称',
primary key(`id`)
) engine=innodb default charset=utf8mb4 comment='测试';

insert into `test`(`id`, `name`) values(1,'测试');