
-- ---------------
-- predefined data 
-- ----------------

INSERT INTO `appointment_manager`.`patient` (`id`, `first_name`, `last_name`, `email`) VALUES (1, 'mohamed', 'ghareeb', 'ghareeb@gmail.cm');

INSERT INTO `appointment_manager`.`cancelation` (`id`, `desc`) VALUES (1, 'phone cancel');

INSERT INTO `appointment_manager`.`appointment` (`id`, `review`, `date`, `patient_id`, `cancelation_id`) VALUES (1, 'Childbirth Injuries ', now(), 1, 1);


