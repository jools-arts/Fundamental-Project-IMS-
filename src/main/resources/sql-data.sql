INSERT INTO `ims`.`customer` (`first_name`, `surname`, `email_address`, `mobile_number`, `home_address`, `date_of_birth`) VALUES ('jordan', 'harrison', 'jordan.harrison@mail.com', '07384891369', '23 Sparrow Close, Manchester', '1997-06-29');
INSERT INTO `ims`.`customer` (`first_name`, `surname`, `email_address`, `mobile_number`, `home_address`, `date_of_birth`) VALUES ('steve', 'park', 'steve.park@mail.com', '07953605429', '64 Brown Way, Brighton', '1997-06-29');
INSERT INTO `ims`.`customer` (`first_name`, `surname`, `email_address`, `mobile_number`, `home_address`, `date_of_birth`) VALUES ('marcus', 'knight', 'marcus.knight@mail.com', '07789671335', '31 Park Avenue, Leeds', '1997-06-29');
INSERT INTO `ims`.`customer` (`first_name`, `surname`, `email_address`, `mobile_number`, `home_address`, `date_of_birth`) VALUES ('sally', 'stewart', 'sally.stewart@mail.com', '07224567412', '12 Horseshoe Lane, Oxford', '1997-06-29');
INSERT INTO `ims`.`customer` (`first_name`, `surname`, `email_address`, `mobile_number`, `home_address`, `date_of_birth`) VALUES ('lisa', 'smith', 'lisa.smith@mail.com', '07997655428', '2a Kensington Drive, London', '1997-06-29');

INSERT INTO `ims`.`item` (`name`, `description`, `colour`, `brand`, `price`) VALUES ('pillow_set', 'premium pillow set for those that are looking for the upmost comfort', 'white', 'Restland', 39.99);
INSERT INTO `ims`.`item` (`name`, `description`, `colour`, `brand`, `price`) VALUES ('candle_set', 'candle set for those looking to improve the ambience of their home', 'cream', 'Tranquility', 05.99);
INSERT INTO `ims`.`item` (`name`, `description`, `colour`, `brand`, `price`) VALUES ('duvet', 'luxurious duvet for those that are struggling to get down for the evening', 'white', 'Hippo', 25.99);
INSERT INTO `ims`.`item` (`name`, `description`, `colour`, `brand`, `price`) VALUES ('rug', 'single rug ideal for placing under the coffee table', 'rose', 'lindsey', 34.99 );
INSERT INTO `ims`.`item` (`name`, `description`, `colour`, `brand`, `price`) VALUES ('table', 'small table ideal for placing next to the sofa', 'black', 'mountain', 17.99);

INSERT INTO `ims`.`order` (`order_number`) VALUES (1238492);
INSERT INTO `ims`.`order` (`order_number`) VALUES (8347963);
INSERT INTO `ims`.`order` (`order_number`) VALUES (3249879);
INSERT INTO `ims`.`order` (`order_number`) VALUES (8904384);
INSERT INTO `ims`.`order` (`order_number`) VALUES (2390509);

INSERT INTO `ims`.`order_items` (`num_of_items`) VALUES (4);
INSERT INTO `ims`.`order_items` (`num_of_items`) VALUES (2);
INSERT INTO `ims`.`order_items` (`num_of_items`) VALUES (5);
INSERT INTO `ims`.`order_items` (`num_of_items`) VALUES (3);
INSERT INTO `ims`.`order_items` (`num_of_items`) VALUES (1);