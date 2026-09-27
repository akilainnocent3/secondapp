package kp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static DateFormat f102868a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SimpleDateFormat f102869b = new SimpleDateFormat("yyyy-MM-dd");

    public static String a(int dayDifference) {
        Calendar calendar = Calendar.getInstance();
        if (dayDifference != 0) {
            calendar.add(5, dayDifference);
        }
        return f102869b.format(calendar.getTime());
    }

    public static String b(Date date) {
        f102868a.setTimeZone(TimeZone.getTimeZone("UTC"));
        return f102868a.format(date);
    }

    public static boolean c(String referenceStr, int days) {
        return a(-days).equals(referenceStr);
    }
}
