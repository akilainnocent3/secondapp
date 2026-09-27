package se;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b2 f130350b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final a f130351a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(31)
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f130352b = new a(LogSessionId.LOG_SESSION_ID_NONE);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LogSessionId f130353a;

        public a(LogSessionId logSessionId) {
            this.f130353a = logSessionId;
        }
    }

    static {
        f130350b = eh.o1.f81142a < 31 ? new b2() : new b2(a.f130352b);
    }

    public b2() {
        this((a) null);
        eh.a.i(eh.o1.f81142a < 31);
    }

    @k.t0(31)
    public LogSessionId a() {
        return ((a) eh.a.g(this.f130351a)).f130353a;
    }

    @k.t0(31)
    public b2(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    public b2(@Nullable a aVar) {
        this.f130351a = aVar;
    }
}
