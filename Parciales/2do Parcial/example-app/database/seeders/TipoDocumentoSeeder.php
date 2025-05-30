<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use App\Models\TipoDocumento;

class TipoDocumentoSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        TipoDocumento::create([
            'id' => 1,
            'nombre' => 'Documento de Identidad',
        ]);
        TipoDocumento::create([
            'id' => 2,
            'nombre' => 'CArnetExtranjero',
        ]);
        TipoDocumento::create([
            'id' => 3,
            'nombre' => 'Pasaporte',
        ]);
        TipoDocumento::create([
            'id' => 4,
            'nombre' => 'OtroTipo DOcumento',
        ]);
        TipoDocumento::create([
            'id' => 5,
            'nombre' => 'NIT',
        ]);
        
    }
}
