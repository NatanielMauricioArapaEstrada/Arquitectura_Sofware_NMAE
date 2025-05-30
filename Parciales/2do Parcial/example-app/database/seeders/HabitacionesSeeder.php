<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;

class HabitacionesSeeder extends Seeder
{
    public function run(): void
    {
        $adminId = User::where('email', 'admin@hotel.com')->first()->id;

        $tipos = TipoHabitaciones::pluck('id', 'nombre');

        
        Habitaciones::factory()->count(28)->create([
            'tipo_habitacion_id' => $tipos['simple'],
            'user_id' => $adminId,
        ]);

       
        Habitaciones::factory()->count(5)->create([
            'tipo_habitacion_id' => $tipos['doble'],
            'user_id' => $adminId,
        ]);

        
        Habitaciones::factory()->count(5)->create([
            'tipo_habitacion_id' => $tipos['triple'],
            'user_id' => $adminId,
        ]);

        
        Habitaciones::factory()->count(8)->create([
            'tipo_habitacion_id' => $tipos['matrimonio'],
            'user_id' => $adminId,
        ]);
    }
}
