package cd;

import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f22977b = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f22978a;

    public static void a(d dVar, Exception exc) {
        b(dVar, kd.a.a(exc, null));
    }

    public static void b(d dVar, Object... objArr) {
        gd.b.a("%s : dispatching event", "IgniteEventDispatcher");
        if (f22977b.f22978a != null) {
            t tVarA = t.a(dVar);
            if (tVarA == null) {
                IAlog.f("%s : One DT Error: %s is missing in IAReportError map", "IgniteEventDispatcherWrapper", dVar);
            } else {
                new w(tVarA).a(objArr).a((String) null);
            }
        }
    }
}
