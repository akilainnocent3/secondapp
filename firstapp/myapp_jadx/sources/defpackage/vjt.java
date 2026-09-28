package defpackage;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public final class vjt {
    public static final boolean a(long j, long j2) {
        return Math.abs(j - j2) < 86400000 && (j + ((long) TimeZone.getDefault().getOffset(j))) / 86400000 == (j2 + ((long) TimeZone.getDefault().getOffset(j2))) / 86400000;
    }

    public static final boolean b(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(1);
        calendar.setTimeInMillis(j2);
        return i == calendar.get(1);
    }
}
