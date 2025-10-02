// Nossa própria interface para garantir o contrato de clonagem
public interface DocumentPrototype extends Cloneable {
    DocumentPrototype clonar();
    void exibirInfo();
}