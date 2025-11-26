--V1 create event table
CREATE TABLE events (
 id SERIAL PRIMARY KEY,
name VARCHAR(255) NOT NULL,
description TEXT,
ticket_identifier VARCHAR(255) NOT NULL UNIQUE,
begin_at TIMESTAMP NOT NULL,
end_at TIMESTAMP NOT NULL,
capacity INTEGER,
location VARCHAR(255) NOT NULL,
event_organizer VARCHAR(255),
type VARCHAR(100)
);
