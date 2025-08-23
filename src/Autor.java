import java.time.LocalDate;

public class Autor {

    final long id;
    private String nomeAutor;
    private LocalDate dataNascimento;

    public Autor(long id, String nomeAutor, LocalDate dataNascimento) {
        this.id = id;
        this.nomeAutor = nomeAutor;
        this.dataNascimento = dataNascimento;
    }

    public long getId() {
        return id;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", nomeAutor='" + nomeAutor + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
