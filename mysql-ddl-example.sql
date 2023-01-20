CREATE TABLE IF NOT EXISTS movie_info(
    record_id INT NOT NULL auto_increment, 
    name VARCHAR(128) NOT NULL,
    release_year VARCHAR(4) DEFAULT NULL,
    remarks VARCHAR(256) DEFAULT NULL,
    insert_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (record_id)
)ENGINE=MyISAM  DEFAULT CHARSET=latin1 COMMENT='Table to contain movie details' AUTO_INCREMENT=100;