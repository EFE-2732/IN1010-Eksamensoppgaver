public class BadViewIntException extends RuntimeException{
    BadViewIntException(int utsikt){
        super(utsikt+utsikt<1?" er mindre enn 1.":" er større enn 6.");
    }
}
