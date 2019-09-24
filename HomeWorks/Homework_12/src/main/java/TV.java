import java.util.Scanner;

public class TV {
    public static int DEFAULT_COUNT = 1;
    public static final int DEFAULT_COUNT_CHANNEL = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ChannelImpl[] channelsImpl = new ChannelImpl[DEFAULT_COUNT_CHANNEL];
        int countChannel = 0;
        String tempName = "";
        while(countChannel < DEFAULT_COUNT_CHANNEL) {
            tempName = scanner.next();
            if (!tempName.equals("exit")) {
                channelsImpl[countChannel] = new ChannelImpl();
                channelsImpl[countChannel].nameChannel = tempName;
                channelsImpl[countChannel].numberInTV = DEFAULT_COUNT;
                DEFAULT_COUNT++;
                countChannel++;
            } else {
                break;
            }
        }
    int i = 0;
    }
}
