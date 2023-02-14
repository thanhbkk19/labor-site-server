CREATE SEQUENCE HIBERNATE_SEQUENCE
    INCREMENT 1
    MINVALUE 100
    MAXVALUE 9223372036854775807
    START 100
    CACHE 1;

CREATE TABLE VIDEOCAPTURE (
    FRAME_ID SERIAL PRIMARY KEY,
    PERSON_LIST VARCHAR(65535)[],
    ACTION_LIST VARCHAR(65535)[],
    BOUNDING_BOX VARCHAR(65535)[]
);

CREATE TABLE USER (
    ID SERIAL PRIMARY KEY,
    USERNAME VARCHAR(255),
    PASSWORD VARCHAR(255)
);

CREATE TABLE CONTROLLER (
    SIGNAL_ID SERIAL PRIMARY KEY,
    REGION VARCHAR(128),
    WARNING_SIGNAL VARCHAR(128),
    PUBLISHED_DAY DATE
)

INSERT INTO VIDEOCAPTURE(PERSON_LIST, ACTION_LIST, BOUNDING_BOX)
    VALUES (1, ['1','3','2'], ['FIGHT,SMOKING,FIGHT,WORKING', '150,100,150,200']);

INSERT INTO USER(USERNAME, PASSWORD)
    VALUES ('admin', 'admin')

INSERT INTO CONTROLLER(REGION, WARNING_SIGNAL, PUBLISHED_DAY)
    VALUES ('11,22,33,44,55,66,77,88','BUZZ','1922-02-02')