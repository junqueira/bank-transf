package com.bank.apirest.resources;

import com.bank.apirest.models.Account;
import com.bank.apirest.models.Produto;
import com.bank.apirest.models.Transaction;
import com.bank.apirest.repository.AccountRepository;
import com.bank.apirest.repository.ProdutoRepository;
import com.bank.apirest.repository.TransactionRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Produtos")
public class TransactionResource {

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    TransactionRepository transactionRepository;

    @ApiOperation(value = "Criação de uma conta")
    @PostMapping("/accounts")
    public Account salvaAccount(@RequestBody @Valid Account account) {
        return accountRepository.save(account);
    }

    @ApiOperation(value = "Consulta de informações de uma conta")
    @GetMapping("/accounts/{accountId}")
    public List<Account> listaAccounts() {
        return accountRepository.findAll();
    }


    @ApiOperation(value = "Criação de uma transação")
    @PostMapping("/transactions")
    public Transaction salvaTransaction(@RequestBody @Valid Transaction transaction) {
        return transactionRepository.save(transaction);
    }

//    @ApiOperation(value = "Retorna uma lista de Produtos")
//    @GetMapping("/produtos")
//    public List<Produto> listaProdutos() {
//        return produtoRepository.findAll();
//    }
//
//    @ApiOperation(value = "Retorna um produto unico")
//    @GetMapping("/produto/{id}")
//    public Produto listaProdutoUnico(@PathVariable(value = "id") long id) {
//        return produtoRepository.findById(id);
//    }
//
//    @ApiOperation(value = "Salva um produto")
//    @PostMapping("/produto")
//    public Produto salvaProduto(@RequestBody @Valid Produto produto) {
//        return produtoRepository.save(produto);
//    }
//
//    @ApiOperation(value = "Deleta um produto")
//    @DeleteMapping("/produto")
//    public void deletaProduto(@RequestBody @Valid Produto produto) {
//        produtoRepository.delete(produto);
//    }
//
//    @ApiOperation(value = "Atualiza um produto")
//    @PutMapping("/produto")
//    public Produto atualizaProduto(@RequestBody @Valid Produto produto) {
//        return produtoRepository.save(produto);
//    }


}
