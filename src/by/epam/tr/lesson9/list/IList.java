package by.epam.tr.lesson9.list;

public interface IList<E> {
	/**
	 * Appends element to the end of the list.
	 * 
	 * @param e
	 *            element element to be inserted.
	 * @return {@code false} if adding fails, {@code true} otherwise.
	 */
	void add(E e);

	/**
	 * Inserts the specified element at the specified position in this list.
	 * 
	 * @param index
	 *            index at which the specified element is inserted.
	 * @param element
	 *            element to be inserted.
	 * @return {@code false} if adding fails, {@code true} otherwise.
	 */
	void add(int index, E element);

	/**
	 * Appends element to the head of the list.
	 * 
	 * @param e
	 *            element to be inserted.
	 * @return {@code false} if adding fails, {@code true} otherwise.
	 */
	void addAsFirst(E e);

	/**
	 * Returns the element at the specified position in this list.
	 * 
	 * @param index
	 *            index of the element to return.
	 * @return the element at the specified position in this list.
	 */
	E get(int index);

	/**
	 * Removes the element at the specified position in this list.
	 * 
	 * @param index
	 *            index of the element to remove.
	 * @return {@code false} if removing fails, {@code true} otherwise.
	 */
	E remove(int index);

	/**
	 * Returns the number of elements in this list.
	 * 
	 * @return number of elements.
	 */
	int size();
}
