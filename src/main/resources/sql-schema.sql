drop schema ims;

CREATE SCHEMA IF NOT EXISTS `ims`;

USE `ims` ;

CREATE TABLE IF NOT EXISTS `ims`.`customer` (
    `customer_id` INT(10) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    `email_address` VARCHAR(40) DEFAULT NULL,
    `mobile_number` INT(20) DEFAULT NULL,
    `home_address` VARCHAR(100) DEFAULT NULL,
    `date_of_birth` DATE DEFAULT NULL,
    PRIMARY KEY(`customer_id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`item` (
	`item_id` INT(10) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(40) DEFAULT NULL,
    `description` VARCHAR(200) DEFAULT NULL,
    `colour` VARCHAR(30) DEFAULT NULL,
    `brand` VARCHAR(30) DEFAULT NULL,
    `price` DECIMAL(5, 2) DEFAULT NULL,
    PRIMARY KEY(`item_id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`order` (
	`order_id` INT(10) NOT NULL AUTO_INCREMENT,
    `order_number` INT(30) NOT NULL,
    PRIMARY KEY(`order_id`),
    FOREIGN KEY(`customer_id`) REFERENCES `customer`(`customer_id`),
    FOREIGN KEY(`item_id`) REFERENCES `item`(`item_id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`order_items` (
	`order_id` INT(10),
    `item_id` INT(10),
	`num_of_items` INT(30) NOT NULL,
    PRIMARY KEY (`order_id`, `item_id`),
    FOREIGN KEY(`order_id`) REFERENCES `order`(`order_id`),
    FOREIGN KEY(`item_id`) REFERENCES `item`(`item_id`)
);

SELECT `customer`.`customer_id` FROM `customer` JOIN `order_items` ON `customer`.`customer_id` = `order_items`.`order_id`;
SELECT `order`.`order_id` FROM `order` JOIN `order_items` ON `order`.`order_id` = `order_items`.`order_id`;
SELECT `item`.`item_id` FROM `item` JOIN `order_items` ON `item`.`item_id` = `order_items`;