package defpackage;

import java.util.Calendar;

/* JADX INFO: loaded from: classes5.dex */
public final class n94 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;

    public static boolean a(uyc uycVar, uyc uycVar2, uyc uycVar3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(uycVar2.a.getTime());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(uycVar3.a.getTime());
        calendar2.set(11, 23);
        calendar2.set(12, 59);
        calendar2.set(13, 59);
        calendar2.set(14, 59);
        return uycVar.a.getTimeInMillis() >= calendar.getTimeInMillis() && uycVar.a.getTimeInMillis() <= calendar2.getTimeInMillis();
    }
}
