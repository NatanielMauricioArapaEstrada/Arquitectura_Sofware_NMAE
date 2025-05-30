<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Habitaciones extends Model
{
    /** @use HasFactory<\Database\Factories\HabitacionesFactory> */
    use HasFactory;
    protected $fillable = [
        
        'numero_habitacion',
        'tipo_habitacion_id',
        "precio_por_noche",
        "estado",
        "descripcion",
        'user_id'
    ];
public function tipoHabitacion()
    {
        return $this->belongsTo(TipoHabitacion::class, 'tipo_habitacion_id');
    }

    public function usuario()
    {
        return $this->belongsTo(Usuario::class, 'user_id');
    }

}
