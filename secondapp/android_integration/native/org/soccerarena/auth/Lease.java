package org.soccerarena.auth;

/** Pure policy: server deadlines translated onto monotonic device time. */
public final class Lease {
    private Lease() {}
    public static long serverTime(String value) throws java.text.ParseException {
        java.util.regex.Matcher m = java.util.regex.Pattern.compile(
            "^(\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2})(?:\\.(\\d{1,9}))?(Z|[+-]\\d{2}:\\d{2})$").matcher(value);
        if (!m.matches()) throw new java.text.ParseException("Invalid server timestamp", 0);
        String fraction = m.group(2) == null ? "000" : (m.group(2) + "000").substring(0, 3);
        String zone = m.group(3).equals("Z") ? "+0000" : m.group(3).replace(":", "");
        java.text.SimpleDateFormat parser = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", java.util.Locale.US);
        parser.setLenient(false);
        return parser.parse(m.group(1) + "." + fraction + zone).getTime();
    }
    public static long deadline(boolean allowed, long server, long expiry,
                                long requestStart, long now, int maxSeconds) {
        if (!allowed || server <= 0 || expiry <= server || now < requestStart || maxSeconds <= 0) return 0;
        long duration = Math.min(60000L, Math.min((long) maxSeconds * 1000, expiry - server));
        long end = requestStart + duration; // conservatively charge the whole network round trip
        return end > now ? end : 0;
    }
    public static boolean valid(long deadline, long now) { return deadline > now; }
}
