package br.paduan.controle.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "chamado")
public class Chamado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_chamado")
    private int numChamado;

    @Column(name = "descricao", length = 255, nullable = true)
    private String descricao;

    @Column(name = "data_agendamento")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataAgendamento;

    @Column(name = "horas_gastas")
    @JsonFormat(pattern = "HH:mm")
    private LocalTime horasGastas;

    @Column(name = "troca", nullable = true)
    private Integer troca;

    @Column(name = "status")
    private int status;


    @ManyToOne
    //nome da coluna na tabela 'chamado'
    @JoinColumn(name = "id_usuario")
    @JsonIgnoreProperties("chamados")
    private Usuario usuario;

    //vários chamados podem ter a mesma atividade
    @ManyToOne
    @JoinColumn(name = "id_atividade")
    @JsonIgnoreProperties("chamados")
    private Atividade atividade;
    


    public int getNumChamado() {
        return numChamado;
    }

    public void setNumChamado(int numChamado) {
        this.numChamado = numChamado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(LocalDate dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public LocalTime getHorasGastas() {
        return horasGastas;
    }

    public void setHorasGastas(LocalTime horasGastas) {
        this.horasGastas = horasGastas;
    }

    public Integer getTroca() {
        return troca;
    }

    public void setTroca(Integer troca) {
        this.troca = troca;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

}
