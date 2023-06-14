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

const getDataByCountry = (req, res, next) => {

    //search 1
    // try{

    //     const searchCountry = req.query;
        
    //     const filteredCountry = myObjects.filter((info) => {
    //         let isValid = true;
    //         for(key in searchCountry){
    //             isValid = isValid && info[key] === searchCountry[key];
    //         }
    //         return isValid;
    //     });

    //     res.json({data : filteredCountry});
    //     console.log(json({data : filteredCountry}));

    // }catch(err){
    //     res.send(err.message)
    // }
    // console.log(myObjects.children[0].children[0]);
    // return;
    //Search 2
    const children = myObjects.children[0].children[0].children.find(m => console.log(m.children)  );

    if(!children) {
        return next(`Country ${country} does not exist`)
    }
    res.json(children);
    //search 3
    // const searchCountry = req.query
    // var result = myObjects.filter( (children) => {
    //     if(children.country.toLowerCase().indexOf(searchCountry.toLowerCase()) !== -1){
    //         // res.send(children);
    //         console.log(children.value);
    //     }
    // })
    // // res.send();
    // console.log(result);
    // return;
}

module.exports = {
    sendData,
    getAllChildren,
    getDataByCountry
}