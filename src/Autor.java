import java.time.LocalDate;

public class Autor {

    final long autorId;
    private String nomeAutor;
    private LocalDate dataNascimento;

    public Autor(long id, String nomeAutor, LocalDate dataNascimento) {
        this.autorId = id;
        this.nomeAutor = nomeAutor;
        this.dataNascimento = dataNascimento;
    }

    public long getAutorId() {
        return autorId;
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
                "id=" + autorId +
                ", nomeAutor='" + nomeAutor + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
