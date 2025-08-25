package funcoes;

import java.util.ArrayList;
import java.util.Random;

import objetos.Conta;

public class MetodosConta implements Metodos<Conta>{
    
    ArrayList<Conta> contas = new ArrayList<Conta>();

    @Override
    public void gravar(Conta conta) throws Exception{
        if(conta.getAgencia() <= 0){
            throw new Exception("Essa agência não é válida!");
        }

        System.out.println(conta.getClass());
        
        conta.setNumero(gerarNumero());

        while(!verificarNumero(conta.getNumero())){
            conta.setNumero(gerarNumero());
        }
        
        contas.add(conta);
    }

    @Override
    public void editar(Conta conta) throws Exception{
        if(conta.getAgencia() <= 0 || conta.getNumero() <= 0){
            throw new Exception("Essa conta não tem informações válidas!");
        }

        for (int i = 0; i < contas.size(); i++) {
            if(contas.get(i).getNumero() == conta.getNumero()){
                contas.get(i).setSaldo(conta.getSaldo());
                contas.get(i).setAgencia(conta.getAgencia());
            }
        }
    }

    @Override
    public void excluir(int numero) throws Exception{
        if(numero <= 0){
            throw new Exception("O número dessa conta não é válido!");
        }

        boolean encontrado = false;

        for (int i = 0; i < contas.size(); i++) {
            if(contas.get(i).getNumero() == numero){
                contas.remove(i);
                encontrado = true;
                break;
            }
        }

        if(!encontrado) throw new Exception("Essa conta não foi encontrada!");
    }

    @Override
    public void cancelar(){
        return;
    }

    public int gerarNumero(){
        Random gerador = new Random();
        return Math.abs(gerador.nextInt());
    }

    public boolean verificarNumero(int numero){
        for (Conta conta : contas) {
            if(conta.getNumero() == numero){
                return false;
            }
        }
        return true;
    }

}
