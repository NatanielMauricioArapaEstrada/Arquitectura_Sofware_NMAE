<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;

class TipoHabitacionesFactory extends Factory
{
    public function definition(): array
    {
        $nombres = ['simple', 'doble', 'triple', 'matrimonio'];
        $nombre = $this->faker->unique()->randomElement($nombres);

        return [
            'nombre' => $nombre,
            'descripcion' => "Habitación tipo $nombre.",
            'precio' => match ($nombre) {
                'simple' => 100.00,
                'doble' => 150.00,
                'triple' => 200.00,
                'matrimonio' => 250.00,
            },
        ];
    }
}
