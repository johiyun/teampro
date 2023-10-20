create table member
(
 id bigint generated by default as identity,
 name varchar(255),
 email varchar(255),
 primary key (id)
);

create table member(
   id bigint generated by default as identity,
   name varchar(20) not null,
   email varchar(100) unique not null,
   password varchar(20) not null,
   primary key(id)
);

drop table if exists article;
create table article(
    id bigint generated by default as identity,
    title varchar(50) not null,
    content varchar(500) not null,
    deadline timestamp,
    post_time datetime(3) not null,
    author varchar(20),
    email varchar(100) not null,
    foreign key(email) references member(email)
);

drop table if exists comment;
create table comment(
    article_id bigint,
    content varchar(100) not null,
    author_id bigint not null,
    foreign key(article_id) references article(id),
    foreign key(author_id) references member(id)
);