package e5;

import android.media.metrics.LogSessionId;
import android.os.Build;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public final class k4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k4 f80222c = new k4("");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k4 f80223d = new k4("preload");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final a f80225b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(31)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LogSessionId f80226a = LogSessionId.LOG_SESSION_ID_NONE;

        public void a(LogSessionId logSessionId) {
            zi.l0.g0(this.f80226a.equals(LogSessionId.LOG_SESSION_ID_NONE));
            this.f80226a = logSessionId;
        }
    }

    public k4(String str) {
        this.f80224a = str;
        this.f80225b = Build.VERSION.SDK_INT >= 31 ? new a() : null;
    }

    @k.t0(31)
    public synchronized LogSessionId a() {
        return ((a) zi.l0.E(this.f80225b)).f80226a;
    }

    @k.t0(31)
    public synchronized void b(LogSessionId logSessionId) {
        ((a) zi.l0.E(this.f80225b)).a(logSessionId);
    }
}
