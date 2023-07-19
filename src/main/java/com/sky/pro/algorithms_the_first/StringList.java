
package com.sky.pro.algorithms_the_first;


public interface StringList {


        // Добавление элемента.
        // Вернуть добавленный элемент
        // в качестве результата выполнения.

    String add(String item);

        // Добавление элемента
        // на определенную позицию списка.
        // Если выходит за пределы фактического
        // количества элементов или массива,
        // выбросить исключение.
        // Вернуть добавленный элемент
        // в качестве результата выполнения.

    String add(int index, String item);

        // Установить элемент
        // на определенную позицию,
        // затерев существующий.
        // Выбросить исключение,
        // если индекс больше
        // фактического количества элементов
        // или выходит за пределы массива.

    String set(int index, String item);

        // Удаление элемента.
        // Вернуть удаленный элемент
        // или исключение, если подобный
        // элемент отсутствует в списке.


    String remove(String item);

        // Удаление элемента по индексу.
        // Вернуть удаленный элемент
        // или исключение, если подобный
        // элемент отсутствует в списке.

    String remove(int index);

        // Проверка на существование элемента.
        // Вернуть true/false;

    boolean contains(String item);

        // Поиск элемента.
        // Вернуть индекс элемента
        // или -1 в случае отсутствия.

    int indexOf(String item);

        // Поиск элемента с конца.
        // Вернуть индекс элемента
        // или -1 в случае отсутствия.

    int lastIndexOf(String item);

        // Получить элемент по индексу.
        // Вернуть элемент или исключение,
        // если выходит за рамки фактического
        // количества элементов.

    String get(int index);

        // Сравнить текущий список с другим.
        // Вернуть true/false или исключение,
        // если передан null.

    boolean equals(StringList otherList);

        // Вернуть фактическое количество элементов.


    int size();

        // Вернуть true,
        // если элементов в списке нет,
        // иначе false.

    boolean isEmpty();

        // Удалить все элементы из списка.

    void clear();

//        static String[] toArray();




    String[] toArray();

        // Создать новый массив
        // из строк в списке
        // и вернуть его.



        }
//
//



//    Напишите реализацию этого интерфейса, выполнив все его методы.
//    В качестве хранилища используйте массив.
//
//    В конструкторе должен задаваться размер массива внутри.
//
//    Список не должен добавлять или хранить в себе null.
//    Т. е. в случае удаления элемента нужно смещать все элементы на ячейку влево, а при добавлении в середину или начало — на ячейку вправо.
//
//    По желанию можно реализовать расширение массива.
//
//    Рекомендуется написать свои исключения и выбрасывать их в тех ситуациях,
//    которые описаны в интерфейсе. Если в какой-то из методов в качестве параметра приходит null, выбросить исключение.

