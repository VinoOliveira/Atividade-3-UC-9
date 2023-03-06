package atividade.pkg3.uc9;

public class Validacoes {

    public static boolean validarCpf(String cpf) {
        boolean validar = cpf.matches("[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}");
        return validar;
    }

    public static boolean validarTelefone(String telefone) {
        boolean validar = telefone.matches("^\\([1-9]{2}\\) (?:[2-8]|9[1-9])[0-9]{3}\\-[0-9]{4}$");
        return validar;
    }

    public static boolean validarData(String data) {
        boolean validar = data.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/-](0?[1-9]|1[012])[\\/-]\\d{4}$");
        return validar;
    }
}
