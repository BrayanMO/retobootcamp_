import { Component } from '@angular/core';
import { DistritoService } from 'src/app/services/distrito.service';

@Component({
  selector: 'app-distrito-listar',
  templateUrl: './distrito-listar.component.html',
  styleUrls: ['./distrito-listar.component.css']
})
export class DistritoListarComponent {
distritos: any[] = [];

  constructor(private distritosService: DistritoService) {}

  ngOnInit(): void {
    this.cargarDistritos();
  }

  cargarDistritos(): void {
    this.distritosService.listarDistritos().subscribe(
      (data) => {
        this.distritos = data;
        console.log('Distritos cargadas:', this.distritos);
      },
      (error) => {
        console.error('Error al cargar los distritos:', error);
      }
    );
  }
}
