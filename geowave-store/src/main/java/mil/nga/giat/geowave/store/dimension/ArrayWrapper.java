package mil.nga.giat.geowave.store.dimension;

import mil.nga.giat.geowave.store.index.CommonIndexValue;

public class ArrayWrapper<T> implements
		CommonIndexValue
{
	private byte[] visibility;
	private final T[] array;

	public ArrayWrapper(
			final T[] array ) {
		this.array = array;
	}

	public ArrayWrapper(
			final T[] array,
			final byte[] visibility ) {
		this.visibility = visibility;
		this.array = array;
	}

	@Override
	public byte[] getVisibility() {
		return visibility;
	}

	@Override
	public void setVisibility(
			final byte[] visibility ) {
		this.visibility = visibility;
	}

	public T[] getArray() {
		return array;
	}

}
