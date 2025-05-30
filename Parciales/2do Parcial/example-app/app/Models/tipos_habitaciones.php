<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class TipoHabitacion extends Model
{
    /** @use HasFactory<\Database\Factories\TiposHabitacionesFactory> */
    use HasFactory;
    protected $fillable = [
        'id',
        "nombre",
        "descripcion",
        "precio"
    ];
public function habitaciones()
{
    return $this->hasMany(Habitaciones::class, 'tipo_habitacion_id');
}

}
