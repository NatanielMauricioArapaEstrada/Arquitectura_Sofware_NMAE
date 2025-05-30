@extends('layouts.app')

@section('title', 'Editar Producto')

@section('content')

<form action="{{ route("productos.update",$producto->id) }}" method="post">
        @csrf
        @method('PUT')
        <label for="nombre">Nombre</label>
        <input type="text" name="nombre" id="nombre" required value="{{ $producto->nombre }}">
        
        <label for="descripcion">Descripción</label>
        <input type="text" name="descripcion" id="descripcion" required value="{{ $producto->descripcion }}">
        
        <label for="precio">Precio</label>
        <input type="number" name="precio" id="precio" required value="{{ $producto->precio }}">
        
        <label for="stock">Stock</label>
        <input type="number" name="stock" id="stock" required value="{{ $producto->stock }}">
        
        <button type="submit">Editar Producto</button>

    </form>
    

@endsection