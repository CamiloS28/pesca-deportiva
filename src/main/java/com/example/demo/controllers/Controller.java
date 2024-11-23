package com.example.demo.controllers;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.Repository;
import com.example.demo.service.AfiliadoService;

import com.example.demo.service.CaucesService;
import com.example.demo.service.EventosService;
import com.example.demo.service.LicenciasService;
import com.example.demo.service.LugaresPorPezService;
import com.example.demo.service.LugaresService;
import com.example.demo.service.MinPosicionParticipacionesService;
import com.example.demo.service.ParticipacionesService;
import com.example.demo.service.PecesService;
import com.example.demo.service.PermisoService;
import com.example.demo.service.PermisoServiceImpl;
import com.example.demo.service.TopAfiliadosEventoService;
import com.example.demo.service.VistaAfiliadosEventos1995Service;
import com.example.demo.service.VistaPermisoService;
import com.example.demo.models.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	private Repository repo;

	@Autowired
	private AfiliadoService servicio;

	@Autowired
	private PecesService servicioPeces;

	@Autowired
	private LicenciasService servicioLicencia;

	@Autowired
	private CaucesService cauceService;

	@Autowired
	private PermisoService permisoService;

	@Autowired
	private VistaPermisoService viewService;

	@Autowired
	private ParticipacionesService participacionService;

	@Autowired
	private MinPosicionParticipacionesService vistaParticipacionesService;

	@Autowired
	private LugaresPorPezService lugaresPorPezService;

	@Autowired
	private VistaAfiliadosEventos1995Service afiliadosEventos1995Service;

	@Autowired
	private TopAfiliadosEventoService afiliadosEventoService;

	@Autowired
	private EventosService eventoService;

	@Autowired
	private LugaresService lugaresService;
	

	// APARTADO DE AFILIADOS
	@GetMapping("/index")
	public String listarAfiliado(Model modelo) {
		modelo.addAttribute("listaafiliados", servicio.listarAfiliados());
		modelo.addAttribute("conteoAfiliados", servicio.contarAfiliados());
		return "index";

	}

	@GetMapping("/index/crear")
	public String mostrarCrearAfiliado(Model model) {
		Afiliados afiliados = new Afiliados();
		model.addAttribute("afiliados", afiliados); 
		return "crearAfiliado"; 
	}

	@GetMapping("/inicio")
	public String mostrarInicio(Model modelo) {
		return "inicio";
	}

	@GetMapping({ "/sesion", "/" })
	public String mostrarInicioSesion(Model mod) {
		return "sesion";
	}

	@PostMapping("/index")
	public String guardarAfiliado(@ModelAttribute("afiliados") Afiliados afiliados) {
		servicio.guardarAfiliado(afiliados);
		return "redirect:/index";
	}

	@GetMapping("/index/editar/{id}")
	public String mostrarEditarAfiliado(@PathVariable Integer id, Model modelo) {
		modelo.addAttribute("afiliados", servicio.obtenerAfiliadoId(id));
		return "editarAfiliado";
	}

	@PostMapping("/index/{id}")
	public String actualizarAfiliado(@PathVariable Integer id, @ModelAttribute("afiliados") Afiliados afiliado,
			Model modelo) {
		Afiliados afiliadoExistente = servicio.obtenerAfiliadoId(id);
		afiliadoExistente.setId(id);
		afiliadoExistente.setNombreAfiliado(afiliado.getNombreAfiliado());
		afiliadoExistente.setApellidosAfiliado(afiliado.getApellidosAfiliado());
		afiliadoExistente.setDireccionAfiliado(afiliado.getDireccionAfiliado());
		afiliadoExistente.setTelefonoAfiliado(afiliado.getTelefonoAfiliado());
		afiliadoExistente.setSexoAfiliado(afiliado.getSexoAfiliado());
		afiliadoExistente.setNacimientoAfiliado(afiliado.getNacimientoAfiliado());
		afiliadoExistente.setOdAfiliado(afiliado.getOdAfiliado());

		servicio.actualizarAfiliado(afiliadoExistente);
		return "redirect:/index";

	}

	@GetMapping("/index/{id}")
	public String eliminarAfiliado(@PathVariable Integer id) {
		servicio.eliminarAfiliado(id);
		return "redirect:/index";

	}

	// APARTADO DE EVENTOS
	@GetMapping("/eventos")
	public String listarEventos(Model modelo) {
		modelo.addAttribute("listaeventos", eventoService.listarEventos());
		modelo.addAttribute("conteoEventos", eventoService.contarEventos());
		return "eventos";
	}

	@GetMapping("/eventos/crearEvento")
	public String mostrarCrearEvento(Model model) {
		Eventos eventos = new Eventos();
		model.addAttribute("eventos", eventos); // Asegúrate de que el nombre del atributo coincida en la vista
		return "crearEvento"; // El nombre de la vista debe ser sin la extensión .html
	}

	@PostMapping("/eventos")
	public String guardarEvento(@ModelAttribute("eventos") Eventos eventos) {
		eventoService.guardarEvento(eventos);
		return "redirect:/eventos";
	}

	@GetMapping("/eventos/eliminar/{nEvento}")
	public String eliminarEventos(@PathVariable String nEvento) {
		eventoService.eliminarEvento(nEvento);
		return "redirect:/eventos";
	}

	@GetMapping("/eventos/editar/{nEvento}")
	public String mostrarEditarEvento(@PathVariable String nEvento, Model modelo) {
		Eventos eventoExistente = eventoService.obtenerEventoNom(nEvento);
		modelo.addAttribute("eventos", eventoExistente);
		return "editarEvento";
	}

	@PostMapping("/eventos/{nEvento}")
	public String actualizarEvento(@PathVariable String nEvento, @ModelAttribute("eventos") Eventos evento,
			Model modelo) {
		Eventos eventoExistente = eventoService.obtenerEventoNom(nEvento);
		eventoExistente.setFechaEvento(evento.getFechaEvento());
		eventoExistente.setLugar(evento.getLugar());
		eventoExistente.setOdEvento(evento.getOdEvento());
		eventoService.actualizarEvento(eventoExistente);
		return "redirect:/eventos";
	}

	// Lugares
	@GetMapping("/lugares")
	public String listarLugares(Model modelo) {
		modelo.addAttribute("listalugares", lugaresService.listarLugares());
		modelo.addAttribute("conteoLugares", lugaresService.contarLugares());
		return "lugares";
	}

	@GetMapping("/lugares/crearLugar")
	public String mostrarCrearLugar(Model model) {
		Lugares lugares = new Lugares();
		model.addAttribute("lugares", lugares); 
		model.addAttribute("nombresCauces", cauceService.obtenerNombrCauce());
		return "crearLugar"; 
	}

	@PostMapping("/lugares")
	public String guardarLugar(@ModelAttribute("lugares") Lugares lugar) {
		lugaresService.guardarLugares(lugar);
		return "redirect:/lugares";
	}

	@GetMapping("/lugares/eliminar/{nLugar}")
	public String eliminarLugares(@PathVariable String nLugar) {
		lugaresService.eliminarLugar(nLugar);
		return "redirect:/lugares";
	}

	@GetMapping("/lugares/editar/{nLugar}")
	public String mostrarEditarLugar(@PathVariable String nLugar, Model modelo) {
		Lugares lugarExistente = lugaresService.obtenerLugarId(nLugar);
		modelo.addAttribute("lugares", lugarExistente);
		return "editarLugar";
	}

	@PostMapping("/lugares/{nLugar}")
	public String actualizarLugar(@PathVariable String nLugar, @ModelAttribute("lugares") Lugares lugar,
			Model modelo) {
		Lugares lugarExistente = lugaresService.obtenerLugarId(nLugar);
		lugarExistente.setComunidad(lugar.getComunidad());
		lugarExistente.setOdLugar(lugar.getOdLugar());
		lugarExistente.setCauce(lugar.getCauce());
		lugaresService.actualizarLugar(lugarExistente);
		return "redirect:/lugares";
	}
	// APARTADO DE PECES

	@GetMapping("/peces")
	public String listarPeces(Model modelo) {
		modelo.addAttribute("listapeces", servicioPeces.listarPeces());
		modelo.addAttribute("conteoPeces", servicioPeces.contarPeces());
		return "peces";
	}

	@GetMapping("/peces/crearPez")
	public String mostrarCrearPez(Model modelo) {
		Peces pez = new Peces();
		modelo.addAttribute("peces", pez);
		return "crearPez";
	}

	@PostMapping("/peces")
	public String guardarPez(@ModelAttribute("peces") Peces pez) {
		servicioPeces.guardarPez(pez);
		return "redirect:/peces";
	}

	@GetMapping("/peces/eliminar/{nPez}")
	public String eliminarPez(@PathVariable String nPez) {
		servicioPeces.eliminarPez(nPez);
		return "redirect:/peces";
	}

	@GetMapping("/peces/editar/{nPez}")
	public String mostrarEditarPez(@PathVariable String nPez, Model modelo) {
		Peces pezExistente = servicioPeces.obtenerPezNombre(nPez);
		modelo.addAttribute("peces", pezExistente);
		return "editarPez";
	}

	@PostMapping("/peces/{nPez}")
	public String actualizarPez(@PathVariable String nPez, @ModelAttribute("peces") Peces pez, Model modelo) {
		Peces pezExistente = servicioPeces.obtenerPezNombre(nPez);
		pezExistente.setOdPez(pez.getOdPez());
		servicioPeces.actualizarPez(pezExistente);
		return "redirect:/peces";
	}

	// APARTADO LICENCIAS

	@GetMapping("/licencias")
	public String listarLicencias(Model modelo) {
		modelo.addAttribute("listalicencias", servicioLicencia.listarLicencias());
		return "licencias";
	}

	@GetMapping("/licencias/crearLicencia")
	public String mostrarCrearLicencias(Model modelo) {
		Licencias licencia = new Licencias();
		modelo.addAttribute("licencias", licencia);
		return "crearLicencia";
	}

	@PostMapping("/licencias")
	public String guardarLicencia(@ModelAttribute("licencias") Licencias licencia) {
		servicioLicencia.guardarLicencias(licencia);
		return "redirect:/licencias";
	}

	@GetMapping("/licencias/{nLicencia}")
	public String eliminarLicencia(@PathVariable String nLicencia) {
		servicioLicencia.eliminarLicencia(nLicencia);
		return "redirect:/licencias";
	}
	// Parte cauces

	@GetMapping("/cauces")
	public String listarCauces(Model modelo) {
		modelo.addAttribute("listaCauces", cauceService.listar());
		modelo.addAttribute("conteoCauces", cauceService.contarCauces());
		return "cauces";
	}

	@GetMapping("/cauces/crearCauce")
	public String mostrarCrearCauce(Model modelo) {
		Cauces cauce = new Cauces();
		modelo.addAttribute("cauces", cauce);
		return "crearCauce";
	}

	@PostMapping("/cauces")
	public String saveCauce(@ModelAttribute("cauces") Cauces cauce) {
		cauceService.guardarCauce(cauce);
		return "redirect:/cauces";
	}

	@GetMapping("/cauces/editarC/{cauce}")
	public String mostrarEditarCauce(@PathVariable String cauce, Model modelo) {
		Cauces cauceExistente = cauceService.obtenerCauceId(cauce);
		System.out.println(cauceExistente);
		modelo.addAttribute("cauces", cauceExistente);
		return "editarCauce"; 
	}

	@PostMapping("/cauces/{cauce}")
	public String actualizarCauce(@PathVariable String cauce, @ModelAttribute("cauces") Cauces cauce1) {
		Cauces cauceExistente = cauceService.obtenerCauceId(cauce);
		cauceExistente.setOd_cause(cauce1.getOd_cause());
		cauceService.actualizarCauce(cauceExistente);
		return "redirect:/cauces"; // Redirige a la lista de cauces después de actualizar
	}

	@GetMapping("/cauces/buscar")
	public String buscarCauces(@RequestParam("query") String query, Model modelo) {
		List<Cauces> resultados = (List<Cauces>) cauceService.obtenerCauceId(query);
		modelo.addAttribute("resultados", resultados);
		return "fragmentos/listaCauces";
	}

	@GetMapping("/cauces/{cauce}")
	public String eliminarCauce(@PathVariable String cauce) {
		cauceService.eliminarCauce(cauce);
		return "redirect:/cauces";

	}

	@GetMapping("/cauces/eliminar/{nombreCauce}")
	public String procedureEliminarCauce(@PathVariable("nombreCauce") String nombreCauce) {
		cauceService.eliminarRegistroCauces(nombreCauce);
		return "redirect:/cauces";
	}

	// apartado permisos
	@GetMapping("/buscarPermisos")
	public String buscarPermisosForm() {
		return "buscarPermisos"; // Retorna la vista del formulario de búsqueda.
	}

	@GetMapping("/listaPermisos")
	public String getPermisosByApellido(@RequestParam("apellido") String apellido, Model model) {
		List<Permisos> permisos = permisoService.findPermisosByApellidoAfiliado(apellido);
		model.addAttribute("permisos", permisos);
		return "listaPermisos"; // Retorna la vista que muestra los permisos.
	}

	// Apartado participaciones
	@GetMapping("/buscarParticipaciones")
	public String mostrarBuscarParticipaciones() {
		return "buscarParticipaciones";
	}

	@GetMapping("/listaParticipaciones")
	public String participacionPorFicha(@RequestParam("ficha") int ficha, Model model) {
		List<Participaciones> participaciones = participacionService.buscarParticipacionesPorFicha(ficha);
		model.addAttribute("participaciones", participaciones);
		return "listaParticipaciones";
	}

	// VISTA MinPosicionParticipaciones

	@GetMapping("/buscarVistaParticipaciones")
	public String mostrarBuscarVistaParticipaciones() {
		return "buscarVistaParticipaciones";
	}

	@GetMapping("/listaVistaParticipaciones")
	public String vistaParticipacionPorFicha(@RequestParam("ficha") int ficha, Model model) {
		List<MinPosicionParticipaciones> participaciones = vistaParticipacionesService.obtenerPorFicha(ficha);
		model.addAttribute("vistaparticipaciones", participaciones);
		return "listaVistaParticipaciones";
	}

	// VISTA PRIMERA

	// apartado permisos
	@GetMapping("/buscarViewLicencia")
	public String buscarViewPag() { // METODO PARA TOMAR LA PAGINA DE LA VISTA DE LICENCIA
		return "buscarViewLicencia"; //
	}

	// metodo que toma un APELLIDO "GARCIA" PARA TOMAR LA VISTA
	@GetMapping("/listarViewLicencia")
	public String getPermisosByApellidoView(@RequestParam("apellido") String apellido, Model model) {
		List<Vlicencia> vlicencia = viewService.obtenerPermisosPorApellido(apellido);
		System.out.println(vlicencia.toString());
		model.addAttribute("vlicencia", vlicencia);
		return "listarViewLicencia"; //
	}

	// Apartado VistaLuagresPorPez

	@GetMapping("/buscarLugaresPorPez")
	public String mostrarFormularioBusqueda(Model model) {
		List<String> peces = servicioPeces.getDistinctPezNames();
		model.addAttribute("peces", peces);
		return "buscarLugaresPorPez";
	}

	@GetMapping("/listaLugaresPorPez")
	public String listaLugaresPorPez(@RequestParam("pez") String pez, Model model) {
		List<String> peces = servicioPeces.getDistinctPezNames();
		model.addAttribute("peces", peces);
		List<VistaLugaresPorPez> lugares = lugaresPorPezService.buscarPez(pez);
		model.addAttribute("lugares", lugares);
		return "listaLugaresPorPez";
	}

	// VistaAfiliadosEventos1995
	@GetMapping("/vistaAfiliadosEventos1995")
	public String mostrarVistaAfiliadosEventos1995(Model model) {
		model.addAttribute("afiliadosEventos1995", afiliadosEventos1995Service.listarAfiliadosEventos1995());
		return "vistaAfiliadosEventos1995";
	}

	// TopAfilidosEventos

	@GetMapping("/buscarTopAfiliadosEventos")
	public String mostrarFormularioTopAfiliadosEventos(Model model) {
		List<String> eventos = participacionService.nombreEventos();
		model.addAttribute("eventosN", eventos);
		return "buscarTopAfiliadosEventos";
	}

	@GetMapping("/listaTopAfiliadosEventos")
	public String listaTopAfiliadosEventos(@RequestParam("evento") String evento, Model model) {
		List<String> eventos = participacionService.nombreEventos();
		model.addAttribute("eventosN", eventos);
		List<TopAfiliadosEvento> topAfiliados = afiliadosEventoService.buscarTop(evento);
		model.addAttribute("topAfiliados", topAfiliados);
		return "listaTopAfiliadosEventos";
	}

}