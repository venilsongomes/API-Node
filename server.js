import express from 'express'
import cors from 'cors'
import { PrismaClient } from '@prisma/client'


const prisma = new PrismaClient()

const app = express()
app.use(express.json())
app.use(cors())


app.post('/produtos', async (req, res) => {
    await prisma.produto.create({
        data: {
            name: req.body.name,
            quantidade: req.body.quantidade
        }
    })
    res.status(201).json({ mensagem: 'Produto criado com sucesso!' })
})

app.post('/usuarios', async (req, res)=>{
    await prisma.user.create({
        data:{
            email:req.body.email,
            name: req.body.name,
            age: req.body.age
        }
    })
    res.status(201).json
})


app.post('/Baixa', async (req, res) => {

    await prisma.Baixa.create({
        data: {
            produto: req.body.produto,
            quantidade: req.body.quantidade,
            nome: req.body.nome,
            setor: req.body.setor,
            data: req.body.data
 }
    })
    res.status(201).json({ mensagem: 'Baixa criada com sucesso!' })
})

app.get('/produtos', async (req, res) => {
    const products = await prisma.produto.findMany()
    res.status(200).json(products)
})

app.get('/usuarios',async (req, res) => {
 
    let users = []
    if(req.query){
     users = await prisma.user.findMany({
        where: {
       name: req.query.name,
       age: req.query.age
        }
     })
    }else{
        users = await prisma.user.findMany()
    }
    
      res.status(200).json(users)
  })

    app.get('/baixa', async (req, res) => { 
        const baixa = await prisma.baixa.findMany()
        res.status(200).json(baixa)
    }
)


/*app.get('/usuarios',async (req, res) => {

        const users = await prisma.user.findMany()
          res.status(200).json(users)
      })
*/

app.put('/usuarios/:id', async (req, res)=>{
        await prisma.user.update({
           where: {
            id: req.params.id
           },
           data: {
            email: req.body.email,
            name: req.body.name,
            age: req.body.age
    
           }
        })
    })

app.delete('/usuarios/:id', async (req, res)=> {

        await prisma.user.delete({
            where: {
                id: req.params.id,
            },
        })
        res.status(200).json({ message:'Usuario deletado com Sucesso!'})
    })

    app.delete('/produtos/:id', async (req, res)=> {

        await prisma.produto.delete({
            where: {
                id: req.params.id,
            },
        })
        res.status(200).json({ message:'Produto deletado com Sucesso!'})
    })



app.listen(3000)