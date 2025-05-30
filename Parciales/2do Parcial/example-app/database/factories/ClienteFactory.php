<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;
use App\Models\TipoDocumento;

/**
 * @extends \Illuminate\Database\Eloquent\Factories\Factory<\App\Models\Cliente>
 */
class ClienteFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array<string, mixed>
     */
    public function definition(): array
    {
        $tipo_documento_id = TipoDocumento::all()->random()->id;
        
        return [
            'tipo_documento_id'=>$tipo_documento_id,
            'numero_documento'=>fake()->ruc(),
            'razon_social'=>fake()->name()
        
            //
        ];
    }
}
