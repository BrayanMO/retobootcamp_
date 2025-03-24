import { Component, OnInit } from '@angular/core';
import { HospitalService } from 'src/app/services/hospital.service';
import { Hospital } from 'src/app/models/hospital';
import { Router } from '@angular/router';

@Component({
  selector: 'app-hospital-listar',
  templateUrl: './hospital-listar.component.html',
  styleUrls: ['./hospital-listar.component.css']
})
export class HospitalListarComponent implements OnInit {
  hospitales: Hospital[] = [];
  hospitalesFiltrados: Hospital[] = [];
  criterioBusqueda: string = ''; // Criterio de búsqueda
  mensaje: string = ''; // Mensaje para resultados

  constructor(private hospitalService: HospitalService, private router: Router) {}

  ngOnInit(): void {
    this.obtenerHospitales();
  }

  irAActualizar(id: number): void {
    this.router.navigate([`/hospitales/actualizar/${id}`]); // Redirigir al formulario
  }

  // Obtener la lista de hospitales desde el servicio
  obtenerHospitales(): void {
    this.hospitalService.listarHospitales().subscribe(
      (data: any[]) => {
        console.log('Datos recibidos:', data);
        this.hospitales = data.map(item => ({
          idHospital: item[0],
          nombre: item[1],
          area: item[2],
          antiguedad: item[3],
          idDistrito: item[4],
          idSede: item[5],
          idGerente: item[6],
          idCondicion: item[7],
          fechaRegistro: item[8]
        }));
        this.hospitalesFiltrados = [...this.hospitales]; // Copia inicial
      },
      (error) => {
        console.error('Error al obtener hospitales', error);
        this.mensaje = 'Error al cargar los hospitales.';
      }
    );
  }

  // Filtrar la lista de hospitales según el criterio de búsqueda
  filtrarHospitales(): void {
    const criterio = this.criterioBusqueda.trim().toLowerCase(); // Convertir a minúsculas y eliminar espacios en blanco
    this.hospitalesFiltrados = this.hospitales.filter(hospital =>
      hospital.nombre?.toLowerCase().includes(criterio) || // Filtrar por nombre
      hospital.area?.toString().includes(criterio) || // Filtrar por área
      hospital.antiguedad?.toString().includes(criterio) || // Filtrar por antigüedad
      hospital.idDistrito?.toString().includes(criterio) || // Filtrar por distrito
      hospital.idSede?.toString().includes(criterio) || // Filtrar por sede
      hospital.idGerente?.toString().includes(criterio) || // Filtrar por gerente
      hospital.idCondicion?.toString().includes(criterio) // Filtrar por condición
    );
  }


  // Eliminar un hospital
  eliminarHospital(id: number): void {
    if (confirm(`¿Estás seguro de que deseas eliminar el hospital con ID ${id}?`)) {
      this.hospitalService.eliminarHospital(id).subscribe(
        (response: any) => {
          console.log(response.message);
          this.mensaje = response.message;
          this.obtenerHospitales(); // Volver a cargar los hospitales
          this.router.navigate(['/hospitales/listar']);
        },
        (error) => {
          console.error('Error al eliminar hospital', error);
          this.mensaje = 'Error al eliminar el hospital.';
        }
      );
    }
  }
}
