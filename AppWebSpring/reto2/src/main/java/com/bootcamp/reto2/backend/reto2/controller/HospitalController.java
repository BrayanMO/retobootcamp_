package com.bootcamp.reto2.backend.reto2.controller;

import com.bootcamp.reto2.backend.reto2.dto.HospitalDTO;
import com.bootcamp.reto2.backend.reto2.models.Distrito;
import com.bootcamp.reto2.backend.reto2.models.Sede;
import com.bootcamp.reto2.backend.reto2.models.Gerente;
import com.bootcamp.reto2.backend.reto2.models.Condicion;
import com.bootcamp.reto2.backend.reto2.service.DistritoService;
import com.bootcamp.reto2.backend.reto2.service.SedeService;
import com.bootcamp.reto2.backend.reto2.service.GerenteService;
import com.bootcamp.reto2.backend.reto2.service.CondicionService;

import com.bootcamp.reto2.backend.reto2.service.HospitalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/hospitales")
public class HospitalController {

    private final HospitalService hospitalService;

    @Autowired
    private DistritoService distritoService; // Inyección del servicio correctamente

    @Autowired
    private SedeService sedeService; // Añadir la anotación @Autowired

    @Autowired
    private GerenteService gerenteService; // Añadir la anotación @Autowired

    @Autowired
    private CondicionService condicionService; // Añadir la anotación @Autowired

    public HospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    @PostMapping("/registrar")
    public ResponseEntity<String> SP_HOSPITAL_REGISTRAR(@RequestBody HospitalDTO hospitalDTO) {
        try {
            hospitalService.SP_HOSPITAL_REGISTRAR(hospitalDTO);
            return ResponseEntity.ok("Hospital registrado correctamente.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al registrar hospital: " + e.getMessage());
        }
    }

    @PutMapping("/actualizar")
    public ResponseEntity<?> SP_HOSPITAL_ACTUALIZAR(@RequestBody HospitalDTO hospitalDTO) {
        System.out.println("Datos recibidos: " + hospitalDTO); // Para depuración
        try {
            hospitalService.SP_HOSPITAL_ACTUALIZAR(hospitalDTO);
            return ResponseEntity.ok(Map.of(
                    "message", "Hospital actualizado correctamente.",
                    "hospital", hospitalDTO));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(Map.of(
                            "message", "Error al actualizar el hospital.",
                            "error", e.getMessage()));
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Map<String, String>> SP_HOSPITAL_ELIMINAR(@PathVariable Long id) {
        try {
            hospitalService.SP_HOSPITAL_ELIMINAR(id);
            Map<String, String> response = new HashMap<>();
            response.put("message", "Hospital eliminado correctamente");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("error", "Error al eliminar hospital: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }

    @GetMapping("/listar")
    public List<Object[]> listarHospitales(@RequestParam(required = false) Long idHospital) {
        return hospitalService.listarHospitales(idHospital);
    }

    ///

    @GetMapping("/listar-distritos")
    public ResponseEntity<?> listarDistritos() {
        try {
            List<Distrito> distritos = distritoService.obtenerTodosLosDistritos(); // Llamada no estática
            return ResponseEntity.ok(distritos);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al listar distritos: " + e.getMessage());
        }
    }

    @GetMapping("/listar-sedes")
    public ResponseEntity<?> listarSedes() {
        try {
            List<Sede> sedes = sedeService.obtenerTodasLasSedes();
            return ResponseEntity.ok(sedes);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al listar sedes: " + e.getMessage());
        }
    }

    @GetMapping("/listar-gerentes")
    public ResponseEntity<?> listarGerentes() {
        try {
            List<Gerente> gerentes = gerenteService.obtenerTodoslosGerentes();
            System.out.println("Datos de los gerentes: " + gerentes); // Depuración
            return ResponseEntity.ok(gerentes); // Devuelve la lista en JSON
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al listar gerentes: " + e.getMessage());
        }
    }

    @GetMapping("/listar-condiciones")
    public ResponseEntity<?> listarCondiciones() {
        try {
            List<Condicion> condiciones = condicionService.obtenerTodasLasCondiciones();
            return ResponseEntity.ok(condiciones);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al listar condiciones: " + e.getMessage());
        }
    }
}
