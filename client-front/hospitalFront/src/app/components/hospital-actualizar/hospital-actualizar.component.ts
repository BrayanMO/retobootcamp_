import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { HospitalService } from 'src/app/services/hospital.service';

@Component({
  selector: 'app-hospital-actualizar',
  templateUrl: './hospital-actualizar.component.html',
  styleUrls: ['./hospital-actualizar.component.css']
})
export class HospitalActualizarComponent implements OnInit {
  hospitalForm: FormGroup;
  distritos: any[] = [];
  sedes: any[] = [];
  gerentes: any[] = [];
  condiciones: any[] = [];
  mensaje: string = '';

  constructor(
    private fb: FormBuilder,
    private route: ActivatedRoute,
    private router: Router,
    private hospitalService: HospitalService
  ) {
    this.hospitalForm = this.fb.group({
      idHospital: [{ value: '', disabled: true }, Validators.required],
      nombre: ['', Validators.required],
      antiguedad: ['', Validators.required],
      area: ['', Validators.required],
      idDistrito: ['', Validators.required],
      idSede: ['', Validators.required],
      idGerente: ['', Validators.required],
      idCondicion: ['', Validators.required],
      fechaRegistro: ['', Validators.required],
    });
  }

  ngOnInit(): void {
    this.cargarDatosHospital();
    this.cargarReferencias();
  }

  cargarDatosHospital(): void {
    const hospitalId = Number(this.route.snapshot.paramMap.get('id')); // Obtén el ID del hospital desde la URL
    this.hospitalService.getHospitalById(hospitalId).subscribe(
      (hospital: any) => {
        this.hospitalForm.patchValue(hospital); // Carga los datos al formulario
      },
      (error) => {
        this.mensaje = 'Error al cargar los datos del hospital.';
        console.error(error);
      }
    );
  }

  cargarReferencias(): void {
    this.hospitalService.listarDistritos().subscribe(data => this.distritos = data);
    this.hospitalService.listarSedes().subscribe(data => this.sedes = data);
    this.hospitalService.listarGerentes().subscribe(data => this.gerentes = data);
    this.hospitalService.listarCondiciones().subscribe(data => this.condiciones = data);
  }

  actualizarHospital(): void {
    if (this.hospitalForm.invalid) {
      this.mensaje = 'Por favor, completa todos los campos requeridos.';
      return;
    }

    const hospitalActualizado = this.hospitalForm.getRawValue(); // Extrae los datos del formulario
    this.hospitalService.actualizarHospital(hospitalActualizado).subscribe(
      () => {
        this.mensaje = 'Hospital actualizado correctamente.';
        this.router.navigate(['/hospitales/listar']);
      },
      (error) => {
        this.mensaje = 'Error al actualizar el hospital.';
        console.error(error);
      }
    );
  }
}
