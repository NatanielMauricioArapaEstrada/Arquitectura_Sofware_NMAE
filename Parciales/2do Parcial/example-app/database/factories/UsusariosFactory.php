<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\ususarios>
 */
class UsuariosFactory extends Factory
{
    public function definition(): array
    {
        $tiposUsuario = ['administrador', 'recepcionista', 'cliente'];

        return [
            // 'id' no se incluye porque es auto-increment
            'nombre' => $this->faker->name(),
            'email' => $this->faker->unique()->safeEmail(),
            'password' => Hash::make('password123'), // contraseña default
            'telefono' => $this->faker->phoneNumber(),
            'direccion' => $this->faker->address(),
            'tipo_usario' => $this->faker->randomElement($tiposUsuario),
        ];
    }
}
