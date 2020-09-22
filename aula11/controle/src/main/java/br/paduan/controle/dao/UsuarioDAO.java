package br.paduan.controle.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.paduan.controle.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{
    public Usuario findByEmailAndSenha(String email, String senha);
    public Usuario findByEmailOrCpf(String email, String cpf);
 
    @Query(value="Select new Usuario(u.id, u.nome, u.email) from Usuario u where u.id = :id")
    public Usuario buscaUsuarioPorId(@Param("id") Integer id);

    @Query(value = "Select id, nome, email from Usuario Where id = :id", nativeQuery = true)
    public Object[] buscarUsuarioPorIdNativo(@Param("id") Integer id);
}
