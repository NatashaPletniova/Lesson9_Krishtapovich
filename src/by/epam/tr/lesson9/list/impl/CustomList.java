package by.epam.tr.lesson9.list.impl;

import by.epam.tr.lesson9.list.IList;
import by.epam.tr.lesson9.node.Node;

public class CustomList<E> implements IList<E> {

	private Node<E> head;
	private int size;

	public CustomList() {

	}

	@Override
	public void add(E e) {

		if (size == 0) {
			addAsFirst(e);
			return;
		}
		Node<E> nodeToAdd = new Node<>(e);
		Node<E> current = head;

		for (int i = 0; i < size - 1; i++) {
			current = current.getNext();
		}
		current.setNext(nodeToAdd);
		size++;

	}

	@Override
	public void add(int index, E element) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		} else {
			if (index == 0) {
				addAsFirst(element);
			} else {
				if (index == size) {
					add(element);
				} else {
					Node<E> nodeToAdd = new Node<>(element);
					Node<E> current = head;
					for (int i = 0; i < index - 1; i++) {
						current = current.getNext();
					}
					nodeToAdd.setNext(current.getNext());
					current.setNext(nodeToAdd);
					size++;
				}
			}
		}

	}

	@Override
	public void addAsFirst(E e) {
		Node<E> newHead = new Node<E>(e,this.head);
		head = newHead;
		size++;
	}

	@Override
	public E get(int index) {
		if ((index < 0 || index > size())) {
			throw new IndexOutOfBoundsException();
		}
		Node<E> current = head;
		for (int i = 0; i < index; i++) {
			current = current.getNext();
		}
		return current.getItem();
	}

	@Override
	public E remove(int index) {
		Node<E> nodeToDelete = null;
		if ((index < 0 || index > size())) {
			throw new IndexOutOfBoundsException();
		} else {
			if (index == 0) {
				head = head.getNext();
				size--;
			} else {
				Node<E> current = head;

				for (int i = 0; i < index - 1; i++) {
					current = current.getNext();
				}
				nodeToDelete = current.getNext();
				current.setNext(current.getNext().getNext());
				size--;

			}
		}
		return nodeToDelete.getItem();
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public String toString() {
		StringBuilder br = new StringBuilder();
		br.append("[ ");
		Node<E> current = head;
		for (int i = 0; i < size; i++) {
			br.append(current.getItem() + " ");
			current = current.getNext();
		}
		br.append("]");
		return br.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((head == null) ? 0 : head.hashCode());
		result = prime * result + size;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomList<?> other = (CustomList<?>) obj;
		if (head == null) {
			if (other.head != null)
				return false;
		} else if (!head.equals(other.head))
			return false;
		if (size != other.size)
			return false;

		return true;
	}

}
