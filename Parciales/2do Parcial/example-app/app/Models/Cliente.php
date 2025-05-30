<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Cliente extends Model
{
    /** @use HasFactory<\Database\Factories\ClienteFactory> */
    use HasFactory;
    protected $fillable = [
        'tipo_documento_id',
        'numero_documento',
        'razon_social',
        
    ];

    public function tipo_documento()
    {
        return $this->belongsTo(TipoDocumento::class);
    }
}
