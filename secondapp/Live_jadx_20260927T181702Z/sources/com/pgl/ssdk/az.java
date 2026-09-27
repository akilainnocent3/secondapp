package com.pgl.ssdk;

import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class az {
    public static void a(long j10) {
        try {
            Thread.currentThread();
            Thread.sleep(j10);
        } catch (Throwable unused) {
        }
    }

    public static boolean a(long j10, long j11) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeInMillis(j10);
        calendar2.setTimeInMillis(j11);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(6) == calendar2.get(6);
    }
}
