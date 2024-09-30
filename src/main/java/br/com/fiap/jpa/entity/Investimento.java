package br.com.fiap.jpa.entity;

@Entity
@Table(name"TDS_TB_INVESTIMENTO")
@SequenceGenerator(name="inves", sequenceName = "QS_TDS_TB_INVESTIMENTO", allocationSize =1)
public class Investimento {

    @Id
    @Column(name="cd_investimento")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inves")
    private Integer codigo;
    @Column(name="nm_investimento", nullable = false, lenght = 50)
    private String nome;

    @Column(name="vl_investimento"), precision = 10, scale =2, nullable = false)
    private Double valor;

    @Enumerated(EnumType.STRING)
    @Column(name="st_tipo", lenth =40)
    private TipoInvestimento tipo;
    public Investimento(String nome, Double valor, TipoInvestimento tipo) {
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;

    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Double getValor(){
        return valor;
    }
    public void setValor(){
        this.valor = valor;
    }

    public TipoInvestimento getTipo() {
        return tipo;
    }
    public void setTipo (TipoInvestimento tipo){
        this.tipo = tipo;

    }
}
