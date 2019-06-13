public interface MyInterface {
    String notDefault();
    String noDefault();

    default String testDefault() {
        return "Hello Default Method";
    }
}