import express from "express";
import cors from "cors";
import {initialize} from "./data/database.js";


const PORT = 3000;

const app = express();

app.use(cors());
app.use(express.json());

app.get("/api/products", (req, res) => {
    res.send("Hello World!");
});
app.get("/api/products", (req, res) => {
    res.send("Hello World!");
});
app.get("/api/products/:id", (req, res) => {
    res.send("Hello World!");
});
app.get("/api/products/:id", (req, res) => {
    res.send("Hello World!");
});
app.get("/api/products/:id", (req, res) => {
    res.send("Hello World!");
});


app.listen(PORT, async () => {
    await initialize();
    console.log(`Server is running on port ${PORT}`);
})
