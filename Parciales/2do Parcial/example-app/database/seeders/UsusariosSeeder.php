<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;

class UsuariosSeeder extends Seeder
{
    public function run(): void
    {
        
        Usuarios::create([
            'nombre' => 'Administrador',
            'email' => 'admin@hotel.com',
            'password' => Hash::make('admin123'),
            'telefono' => '123456789',
            'direccion' => 'Calle Principal 123',
            'tipo_usario' => 'administrador',
        ]);

 
        Usuarios::factory()->count(10)->create();
    }
}
