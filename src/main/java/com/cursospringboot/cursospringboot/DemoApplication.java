package com.cursospringboot.cursospringboot;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import com.cursospringboot.cursospringboot.domain.Categoria;
import com.cursospringboot.cursospringboot.domain.Cidade;
import com.cursospringboot.cursospringboot.domain.Cliente;
import com.cursospringboot.cursospringboot.domain.Endereco;
import com.cursospringboot.cursospringboot.domain.Estado;
import com.cursospringboot.cursospringboot.domain.ItemPedido;
import com.cursospringboot.cursospringboot.domain.Pagamento;
import com.cursospringboot.cursospringboot.domain.PagamentoComBoleto;
import com.cursospringboot.cursospringboot.domain.PagamentoComCartao;
import com.cursospringboot.cursospringboot.domain.Pedido;
import com.cursospringboot.cursospringboot.domain.Produto;
import com.cursospringboot.cursospringboot.domain.enums.EstadoPagamento;
import com.cursospringboot.cursospringboot.domain.enums.TipoCliente;
import com.cursospringboot.cursospringboot.repositories.CategoriaRepository;
import com.cursospringboot.cursospringboot.repositories.CidadeRepository;
import com.cursospringboot.cursospringboot.repositories.ClienteRepository;
import com.cursospringboot.cursospringboot.repositories.EnderecoRepository;
import com.cursospringboot.cursospringboot.repositories.EstadoRepository;
import com.cursospringboot.cursospringboot.repositories.ItemPedidoRepository;
import com.cursospringboot.cursospringboot.repositories.PagamentoRepository;
import com.cursospringboot.cursospringboot.repositories.PedidoRepository;
import com.cursospringboot.cursospringboot.repositories.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
 