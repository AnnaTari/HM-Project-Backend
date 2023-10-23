//Fill the hm_admin table with test data
INSERT INTO hm_admin (admin_name, admin_password) values ('Yasch','1234');
INSERT INTO hm_admin (admin_name, admin_password) values ('Lara','1234');

INSERT INTO event_type (event_hsv) VALUES ('HSV-Spiel');
INSERT INTO event_hsv (event_type_id,admin_id,match_name, match_details, event_date, event_time, location, picture, deadline, ticket_amount) VALUES (1,1,'HSV vs. St. Pauli', 'Derby', '2023-10-21', '16:00:00', 'Volksparkstadion', 'placeholder', '2023-10-30', '20');
