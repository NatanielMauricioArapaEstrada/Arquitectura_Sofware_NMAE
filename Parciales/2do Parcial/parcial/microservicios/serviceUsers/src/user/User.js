const dbConnection = require('../config/db').pool;

let userModel = {};

userModel.getUser = (callback) => {
  if (dbConnection) {
    dbConnection.query('SELECT * FROM usuarios ORDER BY id', (err, rows) => {
      if(err){
        throw err;
      }else{
        callback(null, rows);
      }
    });
  }
};


userModel.searchUser = (filter, callback) => {
  if (dbConnection) {
    
    const email = filter.email ? dbConnection.escape(filter.email) : `'%'`;

    const sql = `
      SELECT * 
      FROM usuarios 
      WHERE email LIKE ${email}
      LIMIT 1
    `;

    console.log(sql);

    dbConnection.query(sql, (err, rows) => {
      if (err) {
        callback(err, null);
      } else {
        
        callback(null, rows.length > 0 ? rows[0] : null);
      }
    });
  } else {
    callback(new Error("No database connection"), null);
  }
};
