package by.epam.tr.lesson9.main;

import by.epam.tr.lesson9.list.IList;
import by.epam.tr.lesson9.list.impl.CustomList;
/*
Реализуйте самостоятельно динамическую структуру Односвязный список.
Реализуйте методы добавления (в голову, хвост и произвольное место списка), 
удаления и поиска объекта в списке. Используйте параметризацию при описании 
класса. (Условие не означает необходимости повторить все возможности 
класса LinkedList. Возможности Java Collection Framework не использовать).
 */


public class Main {

	public static void main(String[] args) {

		IList<Integer> cl = new CustomList<>();

		cl.add(10);
		cl.addAsFirst(105);
		cl.add(3);
		cl.add(5);
		System.out.println("Initial:");
		System.out.println(cl);
		cl.add(2, -18);
		System.out.println("Value is inserted in the position with index = 2:");
		System.out.println(cl);
		cl.remove(1);
		System.out.println("Element with index = 1 was removed:");
		System.out.println(cl);
		System.out.println("Search for element with index = 2: ");
		System.out.println(cl.get(2));

	}

}
