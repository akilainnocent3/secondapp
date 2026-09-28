package defpackage;

import java.util.Calendar;

/* JADX INFO: loaded from: classes4.dex */
public final class n11 implements h780 {
    public static final n11 a = new n11();
    public static final mpe0 b = hwr.b(new m11(0));

    public static int c() {
        return ((Number) b.getValue()).intValue();
    }

    @Override // defpackage.h780
    public final boolean a(int i) {
        return i <= c();
    }

    @Override // defpackage.h780
    public final boolean b(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.roll(1, -18);
        return calendar.getTimeInMillis() > j;
    }
}
