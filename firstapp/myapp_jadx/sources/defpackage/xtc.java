package defpackage;

import java.util.Calendar;

/* JADX INFO: loaded from: classes4.dex */
public final class xtc implements h780 {
    public final /* synthetic */ int a;

    public xtc(int i) {
        this.a = i;
    }

    @Override // defpackage.h780
    public final boolean b(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.getClass();
        yt5.e(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        long j2 = this.a;
        long j3 = timeInMillis + j2;
        Calendar calendarA = yt5.a(calendar, 31);
        yt5.e(calendarA);
        return j3 <= j && j <= calendarA.getTimeInMillis() + j2;
    }
}
