package com.manoelcampos.cepservice;

/**
 * Acesso à API REST to serviço <a href="https://postmon.com.br">Postmon</a>.
 * Exemplo de requisição: <a href="https://api.postmon.com.br/v1/cep/77021090">https://api.postmon.com.br/v1/cep/77021090</a>.
 *
 * @author Manoel Campos da Silva Filho
 */
public final class PostmonService extends AbstractCepService {
    private static final String DOMINIO = "https://api.postmon.com.br/";

    /**
     * Define um construtor padrão que não aceita parâmetros.
     * Ele apenas chama o construtor protegido na superclasse,
     * passando o domínio do serviço a ser acessado.
     * O construtor da superclasse não é incluído aqui pois
     * não queremos que quem for utilizar tal classe,
     * possa chamar aquele construtor.
     * Se tal construtor fosse adicionado,
     * o usuário da classe poderia instanciá-la, indicando um domínio diferente
     * para o serviço. No entanto, o domínio e fixo, logo, não deve ser alterado.
     */
    public PostmonService(){
        super(DOMINIO);
    }

    @Override
    protected String buildPath(final String cep) {
        return "v1/cep/" + cep;
    }
}
