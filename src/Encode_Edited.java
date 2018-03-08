// Расширенный пример.
/*
    Использование операции поразрядного исключающего ИЛИ
    для шифровки и дешифровки сообщений.

    Изменения:
        В качестве ключа шифрования используется строка из восьми символов.
        Вместо обычного цикла for используется его разновидность for-each,
 */
public class Encode_Edited {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        int key = 88;
        String keyStr = "dawdwa12";
        key = 0;

        for (int x : keyStr.toCharArray()){     // высиление суммы всех числовых
            key += x;                           // значений всех символов строки
        }
        System.out.print("Original message: ");
        System.out.println(msg);

        // зашифровать сообщение
        for (int x : msg.toCharArray())
            // Построение зашифрованной строки сообщения.
            encmsg += (char) (x ^ key);

        System.out.print("Encoded message: ");
        System.out.println(encmsg);

        // дешифровать сообщение
        for (int x : encmsg.toCharArray())
            // Построение дешифрованной строки сообщения.
            decmsg += (char) (x ^ key);

        System.out.print("Decoded message: ");
        System.out.println(decmsg);
    }
}
