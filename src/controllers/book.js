const getAllBooks = (req, res) => {
    res.send([
        {name: "book cook", price: 200},
        {name: "book cook 2", price: 300},
        {name: "book cook 3", price: 200},
        {name: "book cook 4", price: 300}
    ])
}
module.exports = {getAllBooks};