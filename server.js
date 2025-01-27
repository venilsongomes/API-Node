import express from 'express'

const app = express()

app.use(express.json()) // Usar Json

const users  = []
app.post('/usuarios', (req, res)=>{
    users.push(req.body)
    res.status(201).json
})
app.get('/usuarios', (req,res)=> {

    res.status(200).json(users)

})

app.listen(3000)