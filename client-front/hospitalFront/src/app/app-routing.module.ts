import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HospitalListarComponent } from './components/hospital-listar/hospital-listar.component';
import { HospitalRegistrarComponent } from './components/hospital-registrar/hospital-registrar.component';
import { HospitalActualizarComponent } from './components/hospital-actualizar/hospital-actualizar.component';
import { RouterModule, Routes } from '@angular/router';
import { CondicionListarComponent } from './components/condicion-listar/condicion-listar.component';
import { GerenteListarComponent } from './components/gerente-listar/gerente-listar.component';
import { DistritoListarComponent } from './components/distrito-listar/distrito-listar.component';

const routes: Routes = [
  { path: '', redirectTo: '/hospitales', pathMatch: 'full' },
  { path: 'hospitales/listar', component: HospitalListarComponent },
  { path: 'hospitales/registrar', component: HospitalRegistrarComponent },
  { path: 'hospitales/actualizar/:id', component: HospitalActualizarComponent },
  { path: 'hospitales/listar-condiciones', component: CondicionListarComponent },
  { path: 'hospitales/listar-gerentes', component: GerenteListarComponent },
  { path: 'hospitales/listar-distritos', component: DistritoListarComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
