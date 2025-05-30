# Para hacer funcionar si se clona
## copiar el.env 
## desde la teminar git
cp .env.example .env

actualizar las variables a los datos propios 

## instalar paquetes

composer install


# ejecutar el server en pruebas
php artisan serve

# CRear Modelo, migracion, controlador, resorce, factory y seeder
php artisan make:model Producto -mcrfs

# Borrala base de datos hace correr todas las migraciones y los seeders declarados en el database seeder 

php artisan migrate:fresh --seed
