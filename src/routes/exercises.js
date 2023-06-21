const express = require('express');

const router = express.Router();

const exercisesController = require('../controllers/exercises');


router.post('/sum-two-num', exercisesController.Sum2Num);

router.post('/test-prime-number', exercisesController.TestPrimeNumber)

router.post('/find-max', exercisesController.findMaxNumber)

router.post('/reverse-string', exercisesController.ReverseString)

router.post('/test-palindrome', exercisesController.TestPalindrome)

router.post('/count-appearance', exercisesController.CountAppearance)

router.post('/generate-string', exercisesController.GenerateRandomStrings)

router.post('/reverse-text', exercisesController.ReverseText)

module.exports = router;