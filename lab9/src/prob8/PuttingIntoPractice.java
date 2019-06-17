package prob8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PuttingIntoPractice {
	public static void main(String... args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

		// Query 1: Find all transactions from year 2011 and sort them by value (small
		// to high).
		transactions.stream().filter(tran -> tran.getYear() >= 2011)
				// 'from 2011' not 'for 2011' (I hope there's no semantic conflict here. If
				// there is, then kindly use == 2011)
				.sorted((tran1, tran2) -> ((Integer) tran1.getValue()).compareTo((Integer) tran2.getValue()))
				.forEach(System.out::println);

		System.out.println("\n ---Unique cities where the traders work: ");
		// Query 2: What are all the unique cities where the traders work?
		transactions.stream().map(tran -> tran.getTrader().getCity()).distinct().forEach(System.out::println);

		System.out.println("\n ---All traders from Cambridge sorted by name:");
		// Query 3: Find all traders from Cambridge and sort them by name.
		transactions.stream().map(tran -> tran.getTrader()).filter(trader -> trader.getCity().equals("Cambridge"))
				.map(trader -> trader.getName()).sorted().distinct().forEach(System.out::println);

		System.out.println("\n ---A string of all traders names sorted alphabetically:");
		// Query 4: Return a string of all traders names sorted alphabetically.
		String traders = transactions.stream().map(tran -> tran.getTrader()).map(trader -> trader.getName()).sorted()
				.distinct().collect(Collectors.joining(", "));
		System.out.println(traders);

		System.out.println("\n");
		// Query 5: Are there any traders based in Milan?
		Optional<Transaction> milanTrader = transactions.stream()
				.filter(tran -> tran.getTrader().getCity().equals("Milan")).findFirst();

		System.out.println("Any trader based in Milan? " + milanTrader.isPresent());

		System.out.println("\n Updating Cities for Traders");
		// Query 6: Update all transactions so that the traders from Milan are set to
		// Cambridge.
		transactions.stream().map(tran -> {
			if (tran.getTrader().getCity().equals("Milan")) {
				tran.getTrader().setCity("Cambridge");
			}
			return tran;
		}).forEach(System.out::println);

		// Query 7: What's the highest value in all the transactions?
		System.out.println("\n Getting Max");

		Optional<Integer> maxValue = transactions.stream().map(tran -> tran.getValue()).max(Integer::compareTo);
		System.out.println("Maximum value: " + maxValue.orElse(0));

	}
}
