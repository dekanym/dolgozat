import sqlite from "sqlite3";

const db = new sqlite.Database("./data/database.sqlite");

async function initialize() {
    await dbRun("DROP TABLE IF EXISTS products");
    await dbRun("CREATE TABLE products (id INTEGER PRIMARY KEY, name TEXT, brand TEXT, description TEXT, price INTEGER)");
    await dbRun("INSERT INTO products (name, brand, description, price) VALUES ('Star Wars Millennium Falcon', 'Lego', 'LEGO - for adults, recommended for ages 18 and up, LEGO® Star Wars series, release year 2024, pack of 921 building blocks', 23760)")
}


function dbRun(sql, params = []) {
    return new Promise((resolve, reject) => {
      db.run(sql, params, function (err) {
        if (err) {
          reject(err);
        } else {
          resolve(this);
        }
      });
    });
  }
  function dbGet(sql, params = []) {
    return new Promise((resolve, reject) => {
      db.get(sql, params, (err, row) => {
        if (err) {
          reject(err);
        } else {
          resolve(row);
        }
      });
    });
  }
  
  function dbAll(sql, params = []) {
    return new Promise((resolve, reject) => {
      db.all(sql, params, (err, rows) => {
        if (err) {
          reject(err);
        } else {
          resolve(rows);
        }
      });
    });
  }
  
  export { db, dbRun, dbGet, dbAll, initialize };
  