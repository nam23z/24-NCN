const express = require('express');
const app = express();
const port = 8000;

const bookRouter = require('./routes/book');
const userRouter = require('./routes/users');

app.use(express.json());
app.use(express.urlencoded({extended: true}));

app.use('/v1', bookRouter);
app.use('/v1', userRouter);

app.listen(port, () => {
    console.log(`Example app listening on port ${port} `);
});