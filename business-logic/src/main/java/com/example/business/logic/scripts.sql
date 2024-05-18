INSERT INTO clients (login, password) VALUES
('Иван', 'password1'),
('Алексей', 'password2'),
('Михаил', 'password3');


################################################



INSERT INTO cashback (category, percent) VALUES
('Groceries', 5.0),
('Electronics', 10.0),
('Restaurants', 7.0);



################################################


INSERT INTO wallet (description, is_archive, name, client_id) VALUES
('Main Wallet', FALSE, 'Wallet1', 1),
('Savings Wallet', FALSE, 'Wallet2', 2),
('Business Wallet', FALSE, 'Wallet3', 3);


################################################



INSERT INTO cashback_list (wallet_id, cashback_id) VALUES
(1, 1),
(1, 2),
(2, 3),
(3, 1);



################################################




INSERT INTO transaction (amount, category, date_time, description, is_with_cashback, wallet_id) VALUES
(100, 'Groceries', '2024-05-18 10:00:00', 'Bought groceries', TRUE, 1),
(250, 'Electronics', '2024-05-18 12:00:00', 'Bought a new phone', TRUE, 1),
(50, 'Restaurants', '2024-05-18 14:00:00', 'Lunch at restaurant', TRUE, 2),
(500, 'Electronics', '2024-05-18 16:00:00', 'Bought a laptop', TRUE, 3),
(30, 'Groceries', '2024-05-18 18:00:00', 'Bought snacks', FALSE, 1);





################################################

