create database product_management_db;
create user 'product_manager_user' with encrypted password '123456';
grant connection on database product_management_db to product_manager_user;
grant create , select, insert, update, delete on product_management_db.* to 'product_manager_user';
flush privileges;



