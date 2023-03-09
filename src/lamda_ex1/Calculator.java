package lamda_ex1;

@FunctionalInterface
public interface Calculator<T> {
	int calc(T x, T y);
}
