package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Hash_table {


    String key,value;


    public Hash_table()

    {
        Boolean test = true;
        ArrayList keys = new ArrayList();
        ArrayList values = new ArrayList();

        while (test == true) {
            System.out.print(
                            "1 - Просмотр\n\n"
                            + "2 - Добавление\n\n"
                            + "3 - Удаление\n\n"
                            + "4 - Поиск\n\n"
                            + "5 - Выход\n\n  "
            );

            Scanner sc = new Scanner(System.in);

            int k = sc.nextInt();

            sc.nextLine();
            System.out.print("\n");


            int hash;
            int i;


            switch (k) {
                case 1:
                    for (i = 0; i < keys.size(); i++)
                        System.out.print("    " + keys.get(i) + " - " + values.get(i) + "\n\n");
                    break;

                case 2:
                    System.out.print("    Введите ключ\n\n      ");
                    key = sc.nextLine();
                    System.out.print("\n    Введите значение\n\n      ");
                    value = sc.nextLine();
                    System.out.print("\n");
                    hash = key.hashCode(); // функция хеширования
                    keys.add(hash);
                    values.add(value);
                    break;

                case 3:
                    System.out.print("    Введите ключ\n\n      ");
                    key = sc.nextLine();
                    System.out.print("\n");
                    hash = key.hashCode();
                    for (i = 0; i < keys.size(); i++)
                        if (keys.get(i).equals(hash)) {      // компаратор
                            keys.remove(i);
                            values.remove(i);
                            i = 0;
                            if (keys.size() == 1 && keys.get(i).equals(hash)) {
                                keys.remove(i);
                                values.remove(i);
                            }
                        }
                    break;

                case 4:
                    System.out.print("    Введите ключ\n\n      ");
                    key = sc.nextLine();
                    System.out.print("\n");
                    hash = key.hashCode();
                    for (i = 0; i < keys.size(); i++)
                        if (keys.get(i).equals(hash))
                            System.out.print("    " + keys.get(i) + " - " + values.get(i) + "\n\n");
                    break;

                case 5:
                    test = false;
                    break;
            }
        }
    }



}
