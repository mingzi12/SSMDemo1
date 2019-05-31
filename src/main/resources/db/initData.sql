DROP DATABASE IF EXISTS ssm;
CREATE DATABASE ssm DEFAULT CHARACTER SET utf8;

use ssm;

CREATE TABLE user(
  id int(11) NOT NULL AUTO_INCREMENT,
  username varchar(50) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user VALUES(1,'Kobe');