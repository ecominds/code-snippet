mysql> create database boot_webapp;
Query OK, 1 row affected (0.03 sec)

mysql> CREATE USER 'app_user'@'%' IDENTIFIED BY 'secured_passwd123';
mysql> GRANT ALL PRIVILEGES ON boot_webapp.* TO 'app_user'@'%' WITH GRANT OPTION;
mysql> FLUSH PRIVILEGES;