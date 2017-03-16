package by.epam.tr.lesson9.node;

public class Node<E> {
	private E item;
	private Node<E> next;

	public Node() {

	}

	public Node(E item, Node<E> next) {
		this.item = item;
		this.next = next;
	}

	public Node(E item) {
		this.item = item;
		this.next = null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + ((next == null) ? 0 : next.hashCode());
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
		Node<?> other = (Node<?>) obj;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "Node [item=" + item + ", next=" + next + "]";
	}

	public E getItem() {
		return item;
	}

	public void setItem(E item) {
		this.item = item;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

}
