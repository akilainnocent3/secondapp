package yads;

import android.os.Looper;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vf {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f156932j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile vf f156933k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f156934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f156935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f156936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jv.s0 f156937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jf f156938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pf f156939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d63 f156940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x10 f156941h = new x10();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f156942i = new AtomicBoolean(false);

    public vf(long j10, long j11, Set set, jv.s0 s0Var, jf jfVar, pf pfVar, d63 d63Var) {
        this.f156934a = j10;
        this.f156935b = j11;
        this.f156936c = set;
        this.f156937d = s0Var;
        this.f156938e = jfVar;
        this.f156939f = pfVar;
        this.f156940g = d63Var;
    }

    public static final void a(vf vfVar) {
        vfVar.f156940g.getClass();
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        StackTraceElement[] stackTraceElementArr = allStackTraces.get(Looper.getMainLooper().getThread());
        if (stackTraceElementArr != null) {
            Set set = h33.f149915a;
            if (h33.a(stackTraceElementArr, vfVar.f156936c)) {
                vfVar.f156939f.f153914a.reportAnr(allStackTraces);
            }
        }
    }
}
