package androidx.work;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import k.t0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class z {
    public static final /* synthetic */ <W extends ListenableWorker> y.a a(long j10, TimeUnit repeatIntervalTimeUnit) {
        m0.p(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        m0.y(4, l3.a.T4);
        return new y.a((Class<? extends ListenableWorker>) ListenableWorker.class, j10, repeatIntervalTimeUnit);
    }

    public static final /* synthetic */ <W extends ListenableWorker> y.a b(long j10, TimeUnit repeatIntervalTimeUnit, long j11, TimeUnit flexTimeIntervalUnit) {
        m0.p(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        m0.p(flexTimeIntervalUnit, "flexTimeIntervalUnit");
        m0.y(4, l3.a.T4);
        return new y.a(ListenableWorker.class, j10, repeatIntervalTimeUnit, j11, flexTimeIntervalUnit);
    }

    @t0(26)
    public static final /* synthetic */ <W extends ListenableWorker> y.a c(Duration repeatInterval) {
        m0.p(repeatInterval, "repeatInterval");
        m0.y(4, l3.a.T4);
        return new y.a(ListenableWorker.class, repeatInterval);
    }

    @t0(26)
    public static final /* synthetic */ <W extends ListenableWorker> y.a d(Duration repeatInterval, Duration flexTimeInterval) {
        m0.p(repeatInterval, "repeatInterval");
        m0.p(flexTimeInterval, "flexTimeInterval");
        m0.y(4, l3.a.T4);
        return new y.a((Class<? extends ListenableWorker>) ListenableWorker.class, repeatInterval, flexTimeInterval);
    }
}
