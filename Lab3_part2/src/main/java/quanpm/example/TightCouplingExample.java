package quanpm.example;

interface Printer {
    void print(String message);
}

class ConsolePrinter implements Printer {
    public void print(String message) {
        System.out.println(message);
    }
}

class Report {
    private Printer printer;

    // Inject Printer thông qua constructor
    public Report(Printer printer) {
        this.printer = printer;
    }

    void generate() {
        printer.print("Generating report...");
    }
}

// Example usage
class Main {
    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();  // có thể thay bằng mock, FilePrinter, v.v.
        Report report = new Report(printer);
        report.generate();
    }
}
