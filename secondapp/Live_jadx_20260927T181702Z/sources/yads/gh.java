package yads;

import io.appmetrica.analytics.IReporter;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gh implements io2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zg f149609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dr.i0 f149610b;

    public gh(dr.i0 i0Var, zg zgVar) {
        this.f149609a = zgVar;
        this.f149610b = i0Var;
    }

    @Override // yads.io2
    public final void a(eo2 eo2Var) {
        if (this.f149609a.a()) {
            try {
                ((IReporter) this.f149610b.getValue()).reportEvent(eo2Var.f148795a, eo2Var.f148796b);
            } catch (Throwable unused) {
                boolean z10 = ad1.f146762a;
            }
        }
    }

    @Override // yads.io2
    public final void reportAnr(Map map) {
        if (this.f149609a.a()) {
            try {
                ((IReporter) this.f149610b.getValue()).reportAnr(map);
            } catch (Throwable unused) {
                boolean z10 = ad1.f146762a;
            }
        }
    }

    @Override // yads.rm0
    public final void reportError(String str, Throwable th2) {
        if (this.f149609a.a()) {
            try {
                ((IReporter) this.f149610b.getValue()).reportError(str, th2);
            } catch (Throwable unused) {
                boolean z10 = ad1.f146762a;
            }
        }
    }

    @Override // yads.io2
    public final void reportUnhandledException(Throwable th2) {
        if (this.f149609a.a()) {
            try {
                ((IReporter) this.f149610b.getValue()).reportUnhandledException(th2);
            } catch (Throwable unused) {
                boolean z10 = ad1.f146762a;
            }
        }
    }
}
