import { Component } from '@angular/core';
import { GerenteService } from 'src/app/services/gerente.service';

@Component({
  selector: 'app-gerente-listar',
  templateUrl: './gerente-listar.component.html',
  styleUrls: ['./gerente-listar.component.css']
})
export class GerenteListarComponent {
gerentes: any[] = [];

  constructor(private GerenteService: GerenteService) {}

  ngOnInit(): void {
    this.cargarGerente();
  }

  cargarGerente(): void {
    this.GerenteService.listarGerentes().subscribe(
      (data) => {
        this.gerentes = data;
        console.log('Condiciones cargadas:', this.gerentes);
      },
      (error) => {
        console.error('Error al cargar las condiciones:', error);
      }
    );
  }
}
