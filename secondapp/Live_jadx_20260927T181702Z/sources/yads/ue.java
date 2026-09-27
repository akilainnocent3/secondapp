package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ue {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f156382d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bh f156383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zg f156384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te f156385c;

    public /* synthetic */ ue(Context context) {
        this(new bh(), new zg(context), new te(context));
    }

    public final void a(Context context) {
        Object objB;
        if (this.f156384b.b() && f156382d.compareAndSet(false, true)) {
            boolean z10 = !this.f156383a.f147186a.b(context);
            if (this.f156385c.f155856a.b()) {
                try {
                    dr.i1.a aVar = dr.i1.f79460c;
                    AppMetricaLibraryAdapter.activate(context, AppMetricaLibraryAdapterConfig.newConfigBuilder().withAdvIdentifiersTracking(z10).build());
                    objB = dr.i1.b(dr.w2.f79517a);
                } catch (Throwable th2) {
                    dr.i1.a aVar2 = dr.i1.f79460c;
                    objB = dr.i1.b(dr.j1.a(th2));
                }
                if (dr.i1.e(objB) != null) {
                    boolean z11 = ad1.f146762a;
                }
            }
        }
    }

    public ue(bh bhVar, zg zgVar, te teVar) {
        this.f156383a = bhVar;
        this.f156384b = zgVar;
        this.f156385c = teVar;
    }
}
