import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { HospitalService } from 'src/app/services/hospital.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-hospital-registrar',
  templateUrl: './hospital-registrar.component.html',
  styleUrls: ['./hospital-registrar.component.css']
})
export class HospitalRegistrarComponent implements OnInit {
  hospitalForm: FormGroup;
  message: string = '';

  constructor(
    private fb: FormBuilder,
    private hospitalService: HospitalService,
    private router: Router
  ) {
    // Inicializamos el formulario
    this.hospitalForm = this.fb.group({
      idHospital: [null, Validators.required],
      idDistrito: [null, Validators.required],
      nombre: ['', Validators.required],
      antiguedad: [null, Validators.required],
      area: [null, [Validators.required, Validators.min(0)]],
      idSede: [null, Validators.required],
      idGerente: [null, Validators.required],
      idCondicion: [null, Validators.required],
      fechaRegistro: ['', Validators.required]
    });
  }

  ngOnInit(): void {}

  onSubmit(): void {
    if (this.hospitalForm.valid) {
      const hospitalData = this.hospitalForm.value;
      // Si es necesario, convierte la fecha a java.sql.Date o al formato adecuado:
      // hospitalData.fechaRegistro = new Date(hospitalData.fechaRegistro);
      this.hospitalService.registrarHospital(hospitalData).subscribe(
        (res) => {
          this.message = 'Hospital registrado correctamente.';
          // Se puede redirigir o limpiar el formulario
          this.hospitalForm.reset();
          // this.router.navigate(['/ruta-deseada']);
        },
        (err) => {
          console.error('Error al registrar hospital', err);
          this.message = 'Error al registrar hospital: ' + err.error;
        }
      );
    }
  }
}
