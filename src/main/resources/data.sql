INSERT INTO hm_admin (admin_name, admin_password) VALUES ('Yasch', '1234');
INSERT INTO hm_admin (admin_name, admin_password) VALUES ('Lara', '1234');
INSERT INTO hm_admin (admin_name, admin_password) VALUES ('Anastasia', '1234');
INSERT INTO employee (employee_name, employee_email) VALUES ('Anastasia', 'Anastasia.tatarinov@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('A', 'Anastasia.tatarinov@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('B', 'Anastasia.tatarinov@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('C', 'Anastasia.tatarinov@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('D', 'Anastasia.tatarinov@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('E', 'Anastasia.tatarinov@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('F', 'Anastasia.tatarinov@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('G', 'Anastasia.tatarinov@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('H', 'Anastasia.tatarinov@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('I', 'Anastasia.tatarinov@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('J', 'Anastasia.tatarinov@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('K', 'Anastasia.tatarinov@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('L', 'Anastasia.tatarinov@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('M', 'Anastasia.tatarinov@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('N', 'Anastasia.tatarinov@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('O', 'Anastasia.tatarinov@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('P', 'Anastasia.tatarinov@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('Q', 'Anastasia.tatarinov@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('R', 'Anastasia.tatarinov@hansemerkur.de');
INSERT INTO employee (employee_name, employee_email) VALUES ('S', 'Anastasia.tatarinov@hansemerkur.de');
INSERT INTO event_hsv (admin_id,match_name, match_details, event_date, event_time, location, picture, deadline,ticket_type, ticket_amount, registration_date) VALUES (1,'HSV vs. St. Pauli', 'Derby', '2023-11-13', '17:00:00', 'Volksparkstadion', 'placeholder', '2023-11-05', 2, 20, '2023-10-29');
INSERT INTO event_hsv (admin_id,match_name, match_details, event_date, event_time, location, picture, deadline,ticket_type, ticket_amount, registration_date) VALUES (2,'HSV vs. BVB', 'Derby', '2023-12-21', '17:00:00', 'Volksparkstadion', 'placeholder', '2023-12-15', 2, 20, '2023-11-30');
INSERT INTO event_hsv (admin_id,match_name, match_details, event_date, event_time, location, picture, deadline,ticket_type, ticket_amount, registration_date) VALUES (3,'HSV vs. Hertha', 'Derby', '2024-01-21', '17:00:00', 'Volksparkstadion', 'placeholder', '2024-01-17', 2, 20, '2023-12-24');
INSERT INTO event_hsv (admin_id,match_name, match_details, event_date, event_time, location, picture, deadline,ticket_type, ticket_amount, registration_date) VALUES (1,'HSV vs. Fortuna', 'Derby', '2023-11-21', '17:00:00', 'Volksparkstadion', 'placeholder', '2023-11-20', 2, 20, '2023-11-01');
INSERT INTO event_hsv (admin_id,match_name, match_details, event_date, event_time, location, picture, deadline,ticket_type, ticket_amount, registration_date) VALUES (2,'HSV vs. Rostock', 'Derby', '2023-11-30', '17:00:00', 'Volksparkstadion', 'placeholder', '2023-11-04', 2, 20, '2023-10-11');
INSERT INTO event_hsv (admin_id,match_name, match_details, event_date, event_time, location, picture, deadline,ticket_type, ticket_amount, registration_date) VALUES (3,'HSV vs. St. Pauli', 'Derby', '2023-10-21', '17:00:00', 'Volksparkstadion', 'placeholder', '2023-10-30', 2, 20, '2023-10-29');
INSERT INTO event_hsv (admin_id,match_name, match_details, event_date, event_time, location, picture, deadline,ticket_type, ticket_amount, registration_date) VALUES (1,'HSV vs. BVB', 'Derby', '2023-10-21', '17:00:00', 'Volksparkstadion', 'placeholder', '2023-10-30', 2, 20, '2023-11-30');
INSERT INTO event_hsv (admin_id,match_name, match_details, event_date, event_time, location, picture, deadline,ticket_type, ticket_amount, registration_date) VALUES (2,'HSV vs. Kiel', 'Derby', '2023-11-21', '17:00:00', 'Volksparkstadion', 'placeholder', '2023-11-10', 2, 20, '2023-10-30');
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
INSERT INTO blacklist (blacklist_id, employee_id, blacklist_counter) VALUES (1,1,0);
INSERT INTO blacklist (blacklist_id, employee_id, blacklist_counter) VALUES (2,2,0);
INSERT INTO blacklist (blacklist_id, employee_id, blacklist_counter) VALUES (3,3,0);
INSERT INTO blacklist (blacklist_id, employee_id, blacklist_counter) VALUES (4,4,0);
INSERT INTO blacklist (blacklist_id, employee_id, blacklist_counter) VALUES (5,5,0);
INSERT INTO blacklist (blacklist_id, employee_id, blacklist_counter) VALUES (6,6,0);
INSERT INTO blacklist (blacklist_id, employee_id, blacklist_counter) VALUES (7,7,0);
INSERT INTO blacklist (blacklist_id, employee_id, blacklist_counter) VALUES (8,8,0);
INSERT INTO blacklist (blacklist_id, employee_id, blacklist_counter) VALUES (9,9,0);
INSERT INTO blacklist (blacklist_id, employee_id, blacklist_counter) VALUES (10,10,0);
INSERT INTO blacklist (blacklist_id, employee_id, blacklist_counter) VALUES (11,11,0);
INSERT INTO blacklist (blacklist_id, employee_id, blacklist_counter) VALUES (12,12,0);
INSERT INTO blacklist (blacklist_id, employee_id, blacklist_counter) VALUES (13,13,0);
INSERT INTO blacklist (blacklist_id, employee_id, blacklist_counter) VALUES (14,14,0);
INSERT INTO blacklist (blacklist_id, employee_id, blacklist_counter) VALUES (15,15,0);
INSERT INTO blacklist (blacklist_id, employee_id, blacklist_counter) VALUES (16,16,0);
INSERT INTO blacklist (blacklist_id, employee_id, blacklist_counter) VALUES (17,17,0);
INSERT INTO blacklist (blacklist_id, employee_id, blacklist_counter) VALUES (18,18,0);
INSERT INTO blacklist (blacklist_id, employee_id, blacklist_counter) VALUES (19,19,0);
INSERT INTO blacklist (blacklist_id, employee_id, blacklist_counter) VALUES (20,20,0);