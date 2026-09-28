package defpackage;

import j$.util.DesugarTimeZone;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class qbk0 {
    public static final long a;

    static {
        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        calendar.clear();
        calendar.set(2026, 7, 3, 0, 0, 0);
        a = calendar.getTimeInMillis();
    }
}
