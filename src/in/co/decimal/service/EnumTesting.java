package in.co.decimal.service;
enum EnumClass{
    UPLOAD, APPROVE, UPDATE, SEARCH
}
public class EnumTesting {
    public static void main(String[] args) {
        System.out.println (EnumClass.UPDATE.name());
    }
}
