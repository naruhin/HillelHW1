# HillelHW1

Написать interface IntList и его реализацию IntArrayList - аналог List<Integer>.

Пример:

https://gist.github.com/akadatsky/38a9e4c9d71d99f7f8a8b8d1c5f7df42



Список методов:

  - void add(int element);

  - boolean add(int index, int element);

  - void clear();

  - int get(int index);

  - boolean isEmpty();

  - boolean remove(int index);

  - boolean removeByValue(int value);

  - boolean set(int index, int element);

  - int size();

  - IntList subList(int fromIndex, int toIndex);

  - int[] toArray();



Методы с типом возврата boolean(add, remove, set), возращают true если операция прошла успешно.
