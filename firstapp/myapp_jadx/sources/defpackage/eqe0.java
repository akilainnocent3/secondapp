package defpackage;

import j$.time.Clock;
import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class eqe0 {
    public static final eqe0 b = new eqe0();
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ int a = 0;

    public static long a(boolean z) {
        if (!z) {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
        Instant instant = Clock.systemUTC().instant();
        return TimeUnit.SECONDS.toNanos(instant.getEpochSecond()) + ((long) instant.getNano());
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "SystemClock{}";
            default:
                return super.toString();
        }
    }
}
