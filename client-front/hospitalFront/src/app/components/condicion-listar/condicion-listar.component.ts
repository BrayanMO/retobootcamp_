import { Component } from '@angular/core';
import { CondicionService } from 'src/app/services/condicion.service';

@Component({
  selector: 'app-condicion-listar',
  templateUrl: './condicion-listar.component.html',
  styleUrls: ['./condicion-listar.component.css']
})
export class CondicionListarComponent {
  condiciones: any[] = [];

  constructor(private condicionService: CondicionService) {}

  ngOnInit(): void {
    this.cargarCondiciones();
  }

  cargarCondiciones(): void {
    this.condicionService.listarCondiciones().subscribe(
      (data) => {
        this.condiciones = data;
        console.log('Condiciones cargadas:', this.condiciones);
      },
      (error) => {
        console.error('Error al cargar las condiciones:', error);
      }
    );
  }
}
