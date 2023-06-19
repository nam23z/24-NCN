const express = require('express');

const router = express.Router();

const userControllers = require('../controllers/users');

router.get('/users', userControllers.getAllUsers);

router.get('/users/:id', userControllers.getUserById);

router.get('/search', userControllers.getUserByNameAndCountry);

router.post('/users', userControllers.validate , userControllers.createUser);


router.post('/datas', userControllers.sendData);

module.exports = router;