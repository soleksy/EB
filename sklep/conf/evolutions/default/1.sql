# --- !Ups

CREATE TABLE "user" (
    "id"    INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
    "login" VARCHAR NOT NULL,
    "email" VARCHAR NOT NULL,
    "password" VARCHAR NOT NULL
);

CREATE TABLE "category" (
    "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
    "name" VARCHAR NOT NULL
);

CREATE TABLE "course" (
    "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
    "name" VARCHAR NOT NULL,
    "description" TEXT NOT NULL,
    "category" INT NOT NULL,
    FOREIGN KEY(category) references category(id)
);


CREATE TABLE "order" (
    "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
    "user" INTEGER NOT NULL,
    FOREIGN KEY (user) REFERENCES user (id)
);

CREATE TABLE "cart" (
    "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
    "value" DOUBLE NOT NULL,
    "user" INTEGER NOT NULL,
    "order" INTEGER NOT NULL,
    FOREIGN KEY (user) REFERENCES user (id),
    FOREIGN KEY ("order") REFERENCES "order" (id)
);

CREATE TABLE "profile" (
    "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
    "description" TEXT NOT NULL,
    "user" INTEGER NOT NULL,
    FOREIGN KEY (user) REFERENCES user (id)
);

CREATE TABLE "review" (
    "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
    "reviewer_id" INTEGER NOT NULL,
    "reviewed_id" INTEGER NOT NULL,
    "course_id" INTEGER NOT NULL,
    "description" TEXT NOT NULL,
    FOREIGN KEY (reviewer_id) REFERENCES user (id),
    FOREIGN KEY (reviewed_id) REFERENCES user (id),
    FOREIGN KEY (course_id) REFERENCES course (id)

);

CREATE TABLE "comment" (
    "id" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
    "user" INTEGER NOT NULL,
    "review" INTEGER NOT NULL,
    "description" TEXT NOT NULL,
    FOREIGN KEY (user) REFERENCES user (id),
    FOREIGN KEY (review) REFERENCES review (id)
);


# --- !Downs

DROP TABLE "user";
DROP TABLE "category";
DROP TABLE "course";
DROP TABLE "order";
DROP TABLE "cart";
DROP TABLE "profile";
DROP TABLE "review";
DROP TABLE "comment";
