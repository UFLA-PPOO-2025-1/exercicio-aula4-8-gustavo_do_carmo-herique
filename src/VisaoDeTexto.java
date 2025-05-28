import java.awt.Color;

public class VisaoDeTexto implements VisaoSimulador {
    // Um objeto de estatísticas que calcula e armazena informações da simulação.
    private EstatisticasCampo estatisticas;
    
    public VisaoDeTexto(){
        estatisticas = new EstatisticasCampo();
    }

    /**
     * Define uma cor a ser usada para uma classe específica de animal.
     * @param classeAnimal A classe do animal.
     * @param cor A cor a ser usada para a classe fornecida.
     */
    public void definirCor(Class<?> classeAnimal, Color cor){
        // Não há o que fazer aqui
    }

    /**
     * Determina se a simulação deve continuar a ser executada.
     * @return true Se houver mais de uma espécie viva.
     */
    @Override
    public boolean ehViavel(Campo campo){
        return estatisticas.ehViavel(campo);
    }

    /**
     * Mostra o estado atual do campo.
     * @param passo Qual iteração do passo está sendo exibida.
     * @param campo O campo cujo estado será exibido.
     */
    @Override
    public void mostrarStatus(int passo, Campo campo){
        reiniciar();
        System.out.println("Passo " + passo + " - Raposas: " + estatisticas.obterContagemPopulacao(campo, Raposa.class) + " Coelhos: " + estatisticas.obterContagemPopulacao(campo, Coelho.class) );
    }
    
    /**
     * Prepara para uma nova execução
     */
    @Override
    public void reiniciar(){
        estatisticas.reiniciar();
    }

    /**
     * Reabilita as opções da visão
     */
    @Override
    public void reabilitarOpcoes(){
        // Não há o que fazer aqui
    }
}