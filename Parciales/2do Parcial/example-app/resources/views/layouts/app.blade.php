<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>@yield('title', 'Mi App')</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    @vite('resources/css/app.css') <!-- si estás usando Laravel con Vite -->
</head>
<body class="bg-gray-100 flex h-screen">

    <!-- Sidebar -->
    <aside class="w-64 bg-white border-r border-gray-200 p-4 flex-shrink-0">
        <h1 class="text-xl font-bold mb-6">Mi App</h1>
        <nav class="space-y-2">
            <a href="#" class="block text-gray-700 hover:bg-gray-200 px-3 py-2 rounded">Inicio</a>
            <a href="#" class="block text-gray-700 hover:bg-gray-200 px-3 py-2 rounded">Usuarios</a>
            <a href="#" class="block text-gray-700 hover:bg-gray-200 px-3 py-2 rounded">Reportes</a>
            <a href="#" class="block text-gray-700 hover:bg-gray-200 px-3 py-2 rounded">Configuración</a>
        </nav>
    </aside>

    <!-- Contenedor principal -->
    <div class="flex flex-col flex-1 overflow-hidden">
        <!-- Navbar -->
        <header class="bg-white border-b border-gray-200 p-4 flex items-center justify-between">
            <div class="text-lg font-semibold text-gray-800">Panel de Control</div>
            <div class="flex items-center space-x-4">
                <span class="text-sm text-gray-600">Hola, Usuario</span>
                <button class="text-sm text-red-500 hover:underline">Cerrar sesión</button>
            </div>
        </header>

        <!-- Contenido -->
        <main class="flex-1 overflow-y-auto p-6">
            @yield('content')
        </main>
    </div>

</body>
</html>

