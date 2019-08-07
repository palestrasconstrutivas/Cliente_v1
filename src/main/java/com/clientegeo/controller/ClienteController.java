package com.clientegeo.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.clientegeo.entity.Cliente;
import com.clientegeo.repository.ClienteRepository;




@RestController
public class ClienteController {


	@Autowired
	ClienteRepository clienteRepository;

	


	public ClienteController() {
		// TODO Auto-generated constructor stub
	}




	/*
	 * Salva um cliente
	 * */
	
	@RequestMapping(method = RequestMethod.POST, value = "/salvar")
	public  @ResponseBody Cliente salvarCliente(Cliente cliente,HttpServletRequest request) {
		Cliente saveCliente = clienteRepository.save(cliente);
		clienteRepository.save(saveCliente); //acrescentar Objeto cliente da Classe Cliente

			return saveCliente;
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/alterar/{id}")
	public  void atualizarCliente(@PathVariable("id") Long id) {

		Optional<Cliente> cliente =  clienteRepository.findById(id);

		if (cliente.isPresent()){
			Cliente c = cliente.get();
			clienteRepository.save(c);




		}





	}




	@GetMapping("/{id}") 
	public Cliente getOneCliente(@PathVariable("id") Long id)

	{

		Cliente c=null;

		Optional<Cliente> cliente =  clienteRepository.findById(id);

		if (cliente.isPresent()){
			c = cliente.get();

		}


	
		return c;
	}




	@GetMapping("/listar") 
	public List<Cliente> getAllClientes() {

		List<Cliente> resultado = (List<Cliente>) clienteRepository.findAll();

		return resultado;
	}


	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteCliente/{id}")
	public void deletarCliente(@PathVariable("id") Long id) {

		clienteRepository.deleteById(id);

	}










}
