const express = require('express');
const app = express();
const port = 8000;

const bookRouter = require('./routes/book');
const userRouter = require('./routes/users');
const childrenRouter = require('./routes/children');

app.use(express.json({limit: '50mb'}));
app.use(express.urlencoded({limit: '50mb',extended: true}));

app.use('/v1', bookRouter);
app.use('/v1', userRouter);
app.use('/v1', childrenRouter);

app.listen(port, () => {
    console.log(`Example app listening on port ${port} `);
});