const express = require('express')

const router = express.Router();

const childrenControllers = require('../controllers/children');

router.post('/children', childrenControllers.sendData);

router.get('/children', childrenControllers.getAllChildren);

router.get('/search-country', childrenControllers.getDataByCountry);

module.exports = router;