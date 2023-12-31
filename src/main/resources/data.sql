/* populating db with initial data, in this case sample data for testing*/

/* admin testdata*/
INSERT INTO hm_admin (admin_name, admin_password) VALUES ('Yasch', '$2a$10$ITjGZ53Ps7bwRwS3zt/mjuCTi7t5nFll5XpFDl4gSD5uMwpGRI5Jm');
INSERT INTO hm_admin (admin_name, admin_password) VALUES ('Lara', '$2a$10$ITjGZ53Ps7bwRwS3zt/mjuCTi7t5nFll5XpFDl4gSD5uMwpGRI5Jm');
INSERT INTO hm_admin (admin_name, admin_password) VALUES ('Anastasia', '$2a$10$ITjGZ53Ps7bwRwS3zt/mjuCTi7t5nFll5XpFDl4gSD5uMwpGRI5Jm');
INSERT INTO hm_admin (admin_name, admin_password) VALUES ('Andy', '$2a$10$ITjGZ53Ps7bwRwS3zt/mjuCTi7t5nFll5XpFDl4gSD5uMwpGRI5Jm'); --real password: 1234

/*employee testdata*/
INSERT INTO employee (employee_name, employee_email) VALUES ('Anastasia Tatarinov', 'Anastasia.Tatarinov@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Yasch Gahi', 'Yasch.Gahi@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Lara Köchel', 'Lara.Koechel@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Mats Lindemann', 'Mats.Lindemann@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Marie Alm', 'Marie.Alm@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Nina Grünkorn', 'Nina.Gruenkorn@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Ralf Müller', 'Ralf.Mueller@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Konstantin Buchholz', 'Konstantin.Buchholz@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Julia Schneider', 'Julia.Schneider@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Horst Fischer', 'Horst.Fischer@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Florian Krehl', 'Florian.Krehl@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Max Muster', 'Max.Muster@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Moritz Test', 'Moritz.Test@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Christian Otto', 'Christian.Otto@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Karl Breuer', 'Karl.Breuer@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Renate Schnorr', 'Renate.Schnorr@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Claudia Kruse', 'Claudia.Kruse@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Andy Witt', 'Andy.Witt@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Michael Schröter', 'Michael.Schröter@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Klaus Wiese', 'Klaus.Wiese@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Juan Carlos', 'Juan.Carlos@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Gustav Tyson', 'Gustav.Tyson@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Rafael Wolf', 'Rafael.Wolf@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Tom Möller', 'Tom.Möller@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Eddy Herkules', 'Eddy.Herkules@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Manuel Weber', 'Manuel.Weber@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Luis Kraus', 'Luis.Kraus@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Marta Voss', 'Marta.Voss@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Alex Lange', 'Alex.Lange@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Robert Haus', 'Robert.Haus@hansemerkur.de');

/*event testdata*/
--Actual Events
INSERT INTO event_hsv (admin_id,match_name, match_details, event_date, location, picture, deadline,ticket_type, ticket_amount, registration_date) VALUES (1,'HSV vs. St. Pauli', 'Derby', current_timestamp + 20, 'Volksparkstadion', 'placeholder', current_date + 10, 2, 20, current_date - 20);
INSERT INTO event_hsv (admin_id,match_name, match_details, event_date, location, picture, deadline,ticket_type, ticket_amount, registration_date) VALUES (3,'HSV vs. Hertha', 'Derby', current_timestamp + 40, 'Volksparkstadion', 'placeholder', current_date + 30, 2, 20, current_date -5);
--Future Events
INSERT INTO event_hsv (admin_id,match_name, match_details, event_date, location, picture, deadline,ticket_type, ticket_amount, registration_date) VALUES (2,'HSV vs. BVB', 'Derby', current_timestamp +20, 'Volksparkstadion', 'placeholder', current_date + 15, 2, 20, current_date + 5);
INSERT INTO event_hsv (admin_id,match_name, match_details, event_date, location, picture, deadline,ticket_type, ticket_amount, registration_date) VALUES (1,'HSV vs. Fortuna', 'Derby', current_timestamp + 25, 'Volksparkstadion', 'placeholder', current_date +20, 2, 20, current_date + 10);
--Expired Events
INSERT INTO event_hsv (admin_id,match_name, match_details, event_date, location, picture, deadline,ticket_type, ticket_amount, registration_date) VALUES (2,'HSV vs. Rostock', 'Derby', CURRENT_TIMESTAMP + 2, 'Volksparkstadion', 'placeholder', current_date-2, 2, 10, current_date-10);

/*attendance testdata*/
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (1,5,'Lara', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (2,5,'Mats', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (3,5,'Karl', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (4,5,'Anastasia', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (5,5,'Yasch', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (6,5,'Paul', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (7,5,'Lara', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (8,5,'Mats', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (9,5,'Karl', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (10,5,'Anastasia', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (11,5,'Yasch', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (12,5,'Paul', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (13,5,'Yasch', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (14,5,'Paul', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (15,5,'Lara', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (16,5,'Mats', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (17,5,'Karl', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (18,5,'Anastasia', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (19,5,'Yasch', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (20,5,'Paul', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (21,5,'Anastasia', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (22,5,'Yasch', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (23,5,'Paul', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (24,5,'Yasch', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (25,5,'Paul', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (26,5,'Lara', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (27,5,'Mats', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (28,5,'Karl', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (29,5,'Anastasia', false, false);
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (30,5,'Yasch', false, false);


/*blacklist testdata*/
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (1,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (2,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (3,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (4,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (5,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (6,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (7,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (8,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (9,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (10,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (11,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (12,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (13,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (14,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (15,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (16,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (17,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (18,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (19,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (20,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (21,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (22,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (23,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (24,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (25,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (26,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (27,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (28,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (29,0);
INSERT INTO blacklist (employee_id, blacklist_counter) VALUES (30,0);