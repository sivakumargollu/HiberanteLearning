| emp_attendence | CREATE TABLE `emp_attendence` (
  `date` datetime DEFAULT NULL,
  `in_time` datetime DEFAULT NULL,
  `out_time` datetime DEFAULT NULL,
  `emp_id` int(4) DEFAULT NULL,
  `record_id` int(4) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 |