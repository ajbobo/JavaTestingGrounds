public class ProgressBar {
	
	public static void main(String[] args) {
		System.out.println("Hello out there in TV Land!");
		for (int x = 0; x <= 100; x++) {
			StringBuilder builder = new StringBuilder();
			
			builder.append("\r");
			String color = (x < 50 ? ConsoleColors.GREEN : x < 80 ? ConsoleColors.YELLOW : ConsoleColors.RED);
			builder.append(String.format("\r%s%3d%%%s", color, x, ConsoleColors.RESET));
			builder.append(" [");
			int count = (int)((x / 100.0) * 20);
			for (int y = 1; y <= 20; y++) {
				builder.append(y <= count ? "=" : y == count + 1 ? ">" : "-");
			}
			builder.append("]");
			
			System.out.print(builder.toString());
			
			
			try {
				Thread.sleep(100);
			}
			catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println();
	}
	
}