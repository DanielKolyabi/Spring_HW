create table if not exists ebanarot(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    task_name VARCHAR(50),
    description VARCHAR(255) NOT NULL,
    task_Status VARCHAR(50) NOT NULL,
    created_Date TIMESTAMP
);