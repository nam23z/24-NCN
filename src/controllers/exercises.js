const Sum2Num = (req, res) => {
    const {a , b} = req.query;
    let a1 = parseInt(a);
    let b1 = parseInt(b);
    let sum = a1 + b1;
    res.send("tong 2 so la: " + sum);
}

const TestPrimeNumber = (req, res) => {
    const {a} = req.query;
    let a1 = parseInt(a);
    let test = 0;
    if(a1 <= 0 || a1 === 1){
        res.send("Please input a number > 0 and dif 1");
        console.log(test);
        return test = 0;
    }
    if(a1 == 2){
        res.send(`${a1} is a prime number`);
        return;
    }else{
        for(let i = 2; i < a1; i++){
            if(a1%i == 0){
                break;
            }else{
                test += 1;
            }
        }
    }
    if(test == 0){
        res.send(`${a1} is not a prime number`)
    }else{
        res.send(`${a1} is a prime number`)
    }
}

const findMaxNumber = (req, res) => {
    const inp = req.query;

    const array = Object.values(inp)
    
    let max = 0;
    for(let i = 0; i< array.length; i++){
        if(array[i] > max){
            max = array[i];
        }
    }
    res.send(`${max} is maximun number in array`)
}

const ReverseString = (req,res) => {
    const {string} = req.query;

    let center= "";

    for(let i = string.length-1; i >=0; i--){
        center += string[i];
    }
    res.send(`reverse from ${string} to ${center}`)
}

const TestPalindrome = (req,res) => {
    const {string} = req.query;

    let test = 0;
    for(let i = 0; i < string.length/2; i++){
        if(string[i] !== string[string.length-1-i]){
            test++;
            break;
        }
    }

    if(test == 0){
        res.send(`${string} is a palindrome`)
    }else{
        res.send(`${string} is not a palindrome`)
    }
}

const CountAppearance = (req, res) => {
    const {string} = req.query;
    let arr = [];
    let arrCount = [];
    for(let i = 0; i < string.length; i++){
        if(arr.findIndex((val) => val === string[i]) == -1){
            arr.push(string[i]);
        }
    }

    for(let i = 0; i< arr.length; i++){
        arrCount.push(0);
    }
    for(let i = 0; i < arr.length; i++){
        for(let j = 0; j < string.length; j++){
            if(arr[i] == string[j]){
                arrCount[i]+=1;
            }
        }
    }
    for(let i = 0; i< arr.length; i++){
        console.log(`${arr[i]} has ${arrCount[i]} times`);
    }

    res.send("ahi");
}


const GenerateRandomStrings = (req, res) => {

    const {lengths} = req.query;
    const characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
    const generateStrings = (length) => {
        let result = '';
        const charactersLength = characters.length;
        for ( let i = 0; i < length; i++ ) {
            result += characters.charAt(Math.floor(Math.random() * charactersLength));
        }
        return result;
    }
    let string = generateStrings(lengths);

    console.log(string)
    res.send(`${string}`);
}

const ReverseText = (req, res) => {
    const {text} = req.query;

    const textRever = text.split(' ');

    //cach 1
    const b = textRever.reverse();

    const c = b.join(' ');

    res.send(c);

    // cach 2

    // let center= "";

    // for(let i = textRever.length-1; i >=0; i--){
    //     center += textRever[i];
    // }
    // res.send(`reverse from ${text} to ${center}`)

}
module.exports = {
    Sum2Num,
    TestPrimeNumber,
    findMaxNumber,
    ReverseString,
    TestPalindrome,
    CountAppearance,
    GenerateRandomStrings,
    ReverseText
}