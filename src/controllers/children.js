// const fs = require('fs');

// // read file from ./src/... after send data work
// const database = require('../data/output.json');

// const sendData = (req, res) => {
//     const dataChildren = req.body;
    
//     // write to file named "output.json"
//     fs.writeFile('./src/data/output.json', JSON.stringify(dataChildren), err => {
//         if(err){
//             console.log(err);
//         }
//     })

//     res.send("success")
// }

// const getAllChildren = (req, res) => {
//     res.send(database)
// }

// const getDataByCountry = (req, res) => {
//     // bug : only search 1 time
//     const {country} = req.query;

//     let children1 = database.children;
//     // console.log(children1);
//     // console.log("=================test============")
//     // const start = performance.now();
//     children1.map((e) => {
//         let children2 = e;
//         // console.log(children2);

//         children2.children.map((e) => {
//             let children3 = e;
//             // console.log(children3)
//             children3.children = children3.children.map((e) => {

//                 return e.children.filter((el) => el.country.toLowerCase().startsWith(country));
//             })
//             children3.children = children3.children.filter((e) => e.length > 0);
//             return children3;
//         })
//         return children2;
//     })
//     res.send(children1)
//     // console.log(performance.now() - start)
// }

// module.exports = {
//     sendData,
//     getAllChildren,
//     getDataByCountry
// }