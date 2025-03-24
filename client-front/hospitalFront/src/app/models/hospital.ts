export class Hospital {
  idHospital: number;
  idDistrito?: number;
  nombre?: string;
  antiguedad?: number;
  area?: number;
  idSede?: number;
  idGerente?: number;
  idCondicion?: number;
  fechaRegistro?: Date; 

  constructor(idHospital: number) {
    this.idHospital = idHospital;
  }
}
