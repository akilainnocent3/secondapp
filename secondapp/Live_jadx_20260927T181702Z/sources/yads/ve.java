package yads;

import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ve implements dg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f156924c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final te f156925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f156926b;

    public ve(te teVar, Executor executor) {
        this.f156925a = teVar;
        this.f156926b = executor;
    }

    public static void a(bg bgVar) {
        bgVar.a();
        bgVar.b();
        boolean z10 = ad1.f146762a;
    }

    public final void b(final bg bgVar) {
        this.f156926b.execute(new Runnable() { // from class: yads.oc4
            @Override // java.lang.Runnable
            public final void run() {
                ve.a(this.f153442b, bgVar);
            }
        });
    }

    public static final void a(ve veVar, bg bgVar) {
        Object objB;
        veVar.getClass();
        a(bgVar);
        if (veVar.f156925a.f155856a.b()) {
            try {
                dr.i1.a aVar = dr.i1.f79460c;
                AppMetricaLibraryAdapter.reportEvent("ads_sdk", bgVar.f147178a, bgVar.f147179b);
                objB = dr.i1.b(dr.w2.f79517a);
            } catch (Throwable th2) {
                dr.i1.a aVar2 = dr.i1.f79460c;
                objB = dr.i1.b(dr.j1.a(th2));
            }
            if (dr.i1.e(objB) != null) {
                boolean z10 = ad1.f146762a;
            }
        }
    }
}
