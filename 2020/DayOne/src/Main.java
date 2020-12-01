import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> values = Files.readAllLines(Paths.get("./src/input.txt")).stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(partOne(values));
        System.out.println(partTwo(values));
    }

    private static int partOne(List<Integer> values) {
        for(int i = 0; i < values.size(); i++) {
            for (int j = i + 1; j < values.size(); j++) {
                if (values.get(i) + values.get(j) == 2020) {
                    return(values.get(i) * values.get(j));
                }
            }
        }

        return -1;
    }

    private static int partTwo(List<Integer> values) {
        for(int i = 0; i < values.size(); i++) {
            for (int j = i + 1; j < values.size(); j++) {
                for (int k = j + 1; k < values.size(); k++) {
                    if (values.get(i) + values.get(j) + values.get(k) == 2020) {
                        return (values.get(i) * values.get(j) * values.get(k));
                    }
                }
            }
        }

        return -1;
    }
}
