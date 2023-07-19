open module zoo.animal.talks {
exports zoo.animal.talks.content to zoo.staff;
exports zoo.animal.talks.media;
exports zoo.animal.talks.schedule;
//requires zoo.animal.feeding
// requires zoo.animal.care;
requires transitive zoo.animal.care;

//opens zoo.animal.talks.schedule;
//opens zoo.animal.talks.media to zoo.staff;
}