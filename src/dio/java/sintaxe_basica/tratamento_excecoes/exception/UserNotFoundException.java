package dio.java.sintaxe_basica.tratamento_excecoes.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(final String message){
        super(message);
    }
}
