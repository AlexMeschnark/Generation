package atividade0810.minhaLojaDeGames.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import atividade0810.minhaLojaDeGames.model.ProdutoModel;
import atividade0810.minhaLojaDeGames.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repository;
	@GetMapping
	public ResponseEntity<List<ProdutoModel>> GetAll(){
			return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProdutoModel> GetById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());		
	}
	
	@GetMapping("/nome/{nomeProduto}")
	public ResponseEntity<List<ProdutoModel>> GetByProduto(@PathVariable String nomeProduto){
			return ResponseEntity.ok(repository.findAllBynomeProdutoContainingIgnoreCase(nomeProduto));
	}
	
	@PostMapping
	public ResponseEntity<ProdutoModel> post (@RequestBody ProdutoModel nomeProduto){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(nomeProduto));
	}
	
	@PutMapping
	public ResponseEntity<ProdutoModel> put (@RequestBody ProdutoModel nomeProduto){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(nomeProduto));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
			repository.deleteById(id);
	}
}