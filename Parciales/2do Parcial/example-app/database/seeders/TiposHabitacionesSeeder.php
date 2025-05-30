<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;

class TipoHabitacionesSeeder extends Seeder
{
    public function run(): void
    {
        $tipos = ['simple', 'doble', 'triple', 'matrimonio'];
        $precios = [100.00, 150.00, 200.00, 250.00];

        foreach ($tipos as $i => $tipo) {
            TipoHabitaciones::create([
                'nombre' => $tipo,
                'descripcion' => "Habitación tipo $tipo.",
                'precio' => $precios[$i],
            ]);
        }
    }
}
