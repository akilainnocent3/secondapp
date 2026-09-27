package ev;

import dr.l1;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@l1(version = "1.6")
public enum k {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ sr.a f81690k = sr.c.c(d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final TimeUnit f81691b;

    k(TimeUnit timeUnit) {
        this.f81691b = timeUnit;
    }

    @oy.l
    public static sr.a<k> g() {
        return f81690k;
    }

    @oy.l
    public final TimeUnit h() {
        return this.f81691b;
    }
}
