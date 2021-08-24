-- --------------------------
-- CREATE NEW SCHEMA 
-- --------------------------
create schema if not exists `appointment_manager`;

-- -------------------------
-- USE THE SCHEMA AS DEFAULT 
-- --------------------------
use `appointment_manager`;

-- ---------------------------------------------
-- PATIENT TABLE 
-- --------------------------------------------
create table if not exists `patient` (
	`id` BIGINT NOT NULL AUTO_INCREMENT,
    `first_name` varchar(255) DEFAULT NULL, 
    `last_name` varchar(255) DEFAULT NULL,
    `email` varchar(255) default null , 
    primary key(`id`)
)engine=InnoDB AUTO_INCREMENT=1 CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



-- -----------------------------------------------
-- CANCELATION TABLE
-- -----------------------------------------------
create table if not exists `cancelation` (
	`id` BIGINT NOT NULL auto_increment,
    `patient_request` varchar(255) default NULL, 
	`physician_apology` varchar(255) default NULL, 
    primary key(`id`)
)engine=InnoDB AUTO_INCREMENT=1 CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- -----------------------------------------------------------------
-- APPOINTMENT TABLE   
-- ------------------------------------------------------------------
create table if not exists `appointment` (
	`id` BIGINT NOT NULL auto_increment,
    `review` varchar(255) DEFAULT NULL, 
	`date` DATETIME(6) default NULL, 
    `patient_id` BIGINT DEFAULT NULL, 
	`cancelation_id` BIGINT DEFAULT NULL, 
    primary key (`id`), 
    CONSTRAINT `fk_patient_appointment_details` FOREIGN KEY (`patient_id`) REFERENCES `patient`(`id`)
    ON DELETE NO ACTION ON UPDATE NO ACTION, 
    CONSTRAINT `fk_cancelation_appointment_details` FOREIGN KEY (`cancelation_id`) REFERENCES `cancelation`(`id`)
    ON DELETE NO ACTION ON UPDATE NO ACTION
)engine=InnoDB AUTO_INCREMENT=1 CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



