const fs = require('fs');

// const children = 
const sendData = (req, res) => {
    const dataChildren = req.body;

    fs.writeFile('./src/data/output.json', JSON.stringify(dataChildren), err => {
        if(err){
            console.log(err);
        }
    })

    res.send("success")
}

module.exports = {sendData}