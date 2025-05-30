<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Usuario extends Model
{
    /** @use HasFactory<\Database\Factories\UsusariosFactory> */
    use HasFactory;
    protected $fillable = [
        'id',
        "nombre",
        'email',
        "password",
        "telefono",
        "direccion",
        "tipo_usario"
    ];
    
}
