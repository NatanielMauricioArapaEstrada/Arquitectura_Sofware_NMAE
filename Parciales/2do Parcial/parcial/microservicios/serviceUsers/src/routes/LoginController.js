var VerifyToken = require('./VerifyToken');
var express = require('express');
var router = express.Router();
var bodyParser = require('body-parser');
router.use(bodyParser.urlencoded({ extended: true }));
router.use(bodyParser.json());
var User = require('../user/User');

var jwt = require('jsonwebtoken');
var bcrypt = require('bcryptjs');
var config = require('../config/config');
var logger = require('../config/log');

// LOGIN
router.post('/', (req, res) => {
  const { email, password } = req.body;

  userModel.searchUser({ email }, (err, user) => {
    if (err) return res.status(500).send("Error en el servidor.");
    if (!user) return res.status(404).send('Usuario no encontrado.');

    const passwordIsValid = bcrypt.compareSync(password, user.password);
    if (!passwordIsValid) return res.status(401).send({ auth: false, token: null });

    const token = jwt.sign(
      {
        id: user.id,
        isSeller: user.isSeller,
         isBuyer: user.isBuyer,
          isAdmin: user.isAdmin
      },
      config.secret,
      { expiresIn: 86400 }
    );

    res.status(200).send({ auth: true, token: token });
  });
});


// Listar todos usuarios
router.get('/', VerifyToken, function(req, res, next) {
    logger.info("Begin ");
    User.findById(req.userId, { password: 0 }, function(err, user) {
        if (err) return res.status(500).send("There was a problem finding the user.");
        if (!user) return res.status(404).send("No user found.");
        res.status(200).send(user);
        logger.info("End ");
    });
});

// Crear usuario de prueba automáticamente
router.get('/create-test-user', async function(req, res) {
    const email = "maria@gmail.com";
    const password = "12345";
    const hashedPassword = bcrypt.hashSync(password, 8);

    let user = await User.findOne({ email });
    if (user) {
        return res.status(200).send({ message: "El usuario ya existe", email });
    }

    user = new User({
        name: "Maria",
        email,
        password: hashedPassword,
        dateCreate: new Date(),
        state: "active",
        isSeller: "yes",
        isBuyer: "yes",
        isAdmin: "yes"
    });

    await user.save();
    res.status(201).send({ message: "Usuario creado", email, password });
});

// add the middleware function
router.use(function(user, req, res, next) {
    res.status(200).send(user);
});

module.exports = router;