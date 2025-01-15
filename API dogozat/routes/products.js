import express from "express";
import { dbAll, dbGet, dbRun } from "../data/database.js";

const router = express.Router();

router.get("/api/products", async (req, res) => {
    try {
        const rows = await dbAll("SELECT * FROM products");
        res.status(200).json(rows);
    } catch (err) {
        res.status(500).json({ message: err.message });
    }
});

router.post("/api/products", async (req, res) => {
    const { name, brand, description, price } = req.body;
    if (!name || !brand || !description || !price) {
        return res.status(400).json({ message: "Missing data" });
    }
    try {
        await dbRun(
            "INSERT INTO products (name, brand, description, price) VALUES (?, ?, ?, ?)",
            [name, brand, description, price]
        );
        res.status(201).json({ message: "Product created" });
    } catch (err) {
        res.status(500).json({ message: err.message });
    }
});

router.get("/api/products/:id", async (req, res) => {
    const { id } = req.params;
    try {
        const product = await dbGet("SELECT * FROM products WHERE id = ?", [id]);
        if (!product) {
            return res.status(404).json({ message: "Product not found" });
        }
        res.status(200).json(product);
    } catch (err) {
        res.status(500).json({ message: err.message });
    }
});
router.delete("/api/products/:id", async(req, res)=>{
    const {id} = req.params;
    try{
        const product = await dbGet("SELECT * FROM products WHERE id = ?", [id]);
        if (!product) {
            return res.status(404).json({ message: "Product not found" });
        }  
    await dbRun("DELETE FROM products WHERE id=?", [req.params.id])      
        res.status(200).json({message: "successfully deleted "})
    }catch(err){
        res.status(500).json({message: err.message})
    }
    


}
)
export default router;
