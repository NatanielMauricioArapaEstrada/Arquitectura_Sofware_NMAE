<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\Habitaciones>
 */
class HabitacionesFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array<string, mixed>
     */
    public function definition(): array
    {
        
        return [
            
            'numero_habitacion' => $this->faker->unique()->numberBetween(100, 999),
            'tipo_habitacion_id' => tipo_habitaciones::inRandomOrder()->first()->id ?? TipoHabitaciones::factory(),
            'precio_por_noche' => $this->faker->randomFloat(2, 100, 500),
            'estado' => $this->faker->randomElement(['disponible', 'ocupada', 'mantenimiento']),
            'descripcion' => $this->faker->sentence(),
            'user_id' => 1,
        ];
    }
}
