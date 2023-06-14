const fs = require('fs');

var database = fs.readFileSync('./src/data/data.json');
var myObjects = JSON.parse(database);
const getAllUsers = (req, res) => {
    res.send(myObjects)
}

const getUserById = (req, res) => {
    const userId = req.params.userId;
    console.log("userID: ", userId);
    res.send({
        userId
    });
}

const getUserByNameAndCountry = (req, res) => {
    const queryObj = req.query;

    console.log("name", queryObj.name);
    console.log("country", queryObj.country);
    res.send({
        name: queryObj.name,
        country: queryObj.country
    });
}
const validate = (req, res, next) => {
    const {username, password} = req.body;
    if(username === undefined || username === ""){
        next("username is required");
    }
    if(password === undefined || password === ""){
        next("password is required");
    }
    if(username.length > 20 ){
        next("username is not greater than 20 letters");
    }
    if(password.length > 8){
        next("password is not greater than 8 letters");
    }
    next();
}

const createUser = (req, res) => {
    const ManyUser = req.body;
    res.send(ManyUser);
}

const jsonReader = (filePath, cb) => {
    fs.readFile(filePath, 'utf-8', (err, fileData) => {
        if(err){
            return cb && cb(err);
        }
        try{
            const object = JSON.parse(fileData);
            return cb && cb(null, object);
        } catch (err){
            return cb && cb(err);
        }
    })
}

const sendData = (req, res) => {

    jsonReader('./src/data/data.json', (err) => {
        if(err) {
            console.log(err);
        }else{
            const ManyUser = req.body;
            let newData = {
                "id" : ManyUser.id,
                "name" : ManyUser.name,
                "country" :  ManyUser.country
            }
            myObjects.push(newData);
            console.log(myObjects);
            res.send("New user added");
            fs.writeFile('./src/data/data.json', JSON.stringify(myObjects, null, 2), err => {
                if(err){
                    console.log(err);
                }
            })
        }
    })
}



module.exports = {
    getAllUsers,
    getUserById,
    getUserByNameAndCountry,
    createUser,
    sendData,
    validate
};