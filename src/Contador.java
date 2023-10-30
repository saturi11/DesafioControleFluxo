public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class Contador {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                throw new IllegalArgumentException("É necessário fornecer dois números inteiros como argumentos.");
            }

            int primeiroParametro = Integer.parseInt(args[0]);
            int segundoParametro = Integer.parseInt(args[1]);

            if (primeiroParametro > segundoParametro) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            }

            for (int i = primeiroParametro; i <= segundoParametro; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (NumberFormatException e) {
            System.out.println("Os parâmetros devem ser números inteiros válidos.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}
