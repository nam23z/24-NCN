const fs = require('fs');

// read file from ./src/...
var database = fs.readFileSync('./src/data/output.json');
var myObjects = JSON.parse(database);

const sendData = (req, res) => {
    const dataChildren = req.body;
    
    // write to file named "output.json"
    fs.writeFile('./src/data/output.json', JSON.stringify(dataChildren), err => {
        if(err){
            console.log(err);
        }
    })

    res.send("success")
}

const getAllChildren = (req, res) => {
    res.send(myObjects)
}

const getChildrenByCountry = (req, res) => {
    const searchCountry = req.query.country;
    
    var result = myObjects.filter( (children) => {
        if(children.country.toLowerCase().indexOf(searchCountry.toLowerCase()) !== -1){
            // res.send(children);
            console.log(children);
        }
    })
    // res.send();
    console.log(result);
}

module.exports = {
    sendData,
    getAllChildren,
    getChildrenByCountry
}