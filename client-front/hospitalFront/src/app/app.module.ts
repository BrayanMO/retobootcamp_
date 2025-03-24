import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { HospitalListarComponent } from './components/hospital-listar/hospital-listar.component';
import { HospitalRegistrarComponent } from './components/hospital-registrar/hospital-registrar.component';
import { ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { HospitalActualizarComponent } from './components/hospital-actualizar/hospital-actualizar.component';
import { FormsModule } from '@angular/forms';
import { CondicionListarComponent } from './components/condicion-listar/condicion-listar.component';
import { GerenteListarComponent } from './components/gerente-listar/gerente-listar.component';
import { DistritoListarComponent } from './components/distrito-listar/distrito-listar.component';


@NgModule({
  declarations: [
    AppComponent,
    HospitalListarComponent,
    HospitalRegistrarComponent,
    HospitalActualizarComponent,
    CondicionListarComponent,
    GerenteListarComponent,
    DistritoListarComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    ReactiveFormsModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
