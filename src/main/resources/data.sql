INSERT INTO hm_admin (admin_name, admin_password) VALUES ('Yasch', '1234');
INSERT INTO hm_admin (admin_name, admin_password) VALUES ('Lara', '1234');
INSERT INTO hm_admin (admin_name, admin_password) VALUES ('Anastasia', '1234');
INSERT INTO employee (employee_name, employee_email) VALUES ('Anastasia', 'Anastasia.tatarinov@hansemerkur.de');
INSERT INTO event_hsv (admin_id,match_name, match_details, event_date, event_time, location, picture, deadline,ticket_type, ticket_amount, registration_date) VALUES (1,'HSV vs. St. Pauli', 'Derby', '2023-11-13', '17:00:00', 'Volksparkstadion', 'placeholder', '2023-11-05', 2, 20, '2023-10-29');
INSERT INTO event_hsv (admin_id,match_name, match_details, event_date, event_time, location, picture, deadline,ticket_type, ticket_amount, registration_date) VALUES (1,'HSV vs. BVB', 'Derby', '2023-12-21', '17:00:00', 'Volksparkstadion', 'placeholder', '2023-12-15', 2, 20, '2023-11-30');
INSERT INTO event_hsv (admin_id,match_name, match_details, event_date, event_time, location, picture, deadline,ticket_type, ticket_amount, registration_date) VALUES (1,'HSV vs. Hertha', 'Derby', '2024-01-21', '17:00:00', 'Volksparkstadion', 'placeholder', '2024-01-17', 2, 20, '2023-12-24');
INSERT INTO event_hsv (admin_id,match_name, match_details, event_date, event_time, location, picture, deadline,ticket_type, ticket_amount, registration_date) VALUES (1,'HSV vs. Fortuna', 'Derby', '2023-11-21', '17:00:00', 'Volksparkstadion', 'placeholder', '2023-11-20', 2, 20, '2023-11-01');
INSERT INTO hm_attendance (employee_id, event_hsv_id, escort_name, winner, substitute_winner) VALUES (1,1,'Lara', true, false);
