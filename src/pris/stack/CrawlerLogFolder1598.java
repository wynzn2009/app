package pris.stack;

public class CrawlerLogFolder1598 {
    public int minOperations(String[] logs) {
        int re = 0;
        for (int i = 0; i < logs.length; i++) {
            if ("../".equals(logs[i])) {
                int tmp = re - 1;
                re = Math.max(tmp, 0);
            } else if ("./".equals(logs[i])) {

            } else {
                re++;
            }
        }
        return re;
    }
}
