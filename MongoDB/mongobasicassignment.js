Q1. db.movies.find()
Q2. db.movies.find({writer: "Quentin Tarantino"})
Q3. db.movies.find({"actors": "Brad Pitt"})
Q4. db.movies.find({franchise: "The Hobbit"})
Q5. db.movies.find({year: {$gte: 1990, $lte: 1999}})
Q6. db.movies.find({$or:[{year:{$lte:2000}}, {year:{$gte:2010}}]})

U1. db.movies.update({title: "The Hobbit: An Unexpected Journey"}, {$set: {synopsis: "A reluctant hobbit, Bilbo Baggins, sets out to the Lonely Mountain with a spirited group of dwarves to reclaim their mountain home - and the gold within it - from the dragon Smaug."}})
U2. db.movies.update({title: "The Hobbit: The Desolation of Smaug"}, {$set: {synopsis: "The dwarves, along with Bilbo Baggins and Gandalf the Grey, continue their quest to reclaim Erebor, their homeland, from Smaug. Bilbo Baggins is in possession of a mysterious and magical ring."}})
U3. db.movies.update({title: "Pulp Fiction"}, {$push: {actors: "Samuel L. Jackson"}})

TS1. db.movies.find({synopsis: /.Bilbo./})
TS2. db.movies.find({synopsis: /.Gandalf./})
TS3. db.movies.find({$and: [{synopsis: /Bilbo/}, {synopsis: {$not: /Gandalf/}}]})
TS4. db.movies.find({$or: [{synopsis: /dwarves/}, {synopsis: /hobbit/}]})
TS5. db.movies.find({$text:{$search:"gold and dragon"}})

D1. db.movies.remove({title: "Pee Wee Herman's Big Adventure"})
D2. db.movies.remove({title: "Avatar"})

R1. db.users.find({})
R2. db.posts.find({})
R3. db.posts.find({username: "GoodGuyGreg"})
R4. db.posts.find({username: "ScumbagSteve"})
R5. db.comments.find({})
R6. db.comments.find({username: "GoodGuyGreg"})
R7. db.comments.find({username: "ScumbagSteve"})
R8. db.comments.find({post: db.posts.findOne({title: "Reports a bug in your code"})._id})