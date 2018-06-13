package lambda;

public class TestPredicate {

	public static void main(String[] args) {

		Predicate p1 = new Predicate() {

			public boolean test(String s) {
				return s.length() > 10;
			}

		};

		Predicate p2 = (String s) -> {
			return s.length() > 10;
		};

		Predicate p3 = s -> {
			return s.length() > 10;
		};

		Predicate p4 = s -> s.length() > 10;

	}

}
