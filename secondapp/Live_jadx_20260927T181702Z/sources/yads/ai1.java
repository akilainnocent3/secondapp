package yads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ai1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f81 f146813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fi1 f146814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hi1 f146815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a91 f146816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d3 f146817e;

    public ai1(f81 f81Var, fi1 fi1Var, hi1 hi1Var, a91 a91Var, d3 d3Var) {
        this.f146813a = f81Var;
        this.f146814b = fi1Var;
        this.f146815c = hi1Var;
        this.f146816d = a91Var;
        this.f146817e = d3Var;
    }

    public final void a() {
        boolean z10;
        hi1 hi1Var = this.f146815c;
        hi1Var.getClass();
        synchronized (hi1.f150148b) {
            Iterator it = hi1Var.f150150a.entrySet().iterator();
            z10 = false;
            while (it.hasNext()) {
                if (kotlin.jvm.internal.m0.g(this, (ai1) ((Map.Entry) it.next()).getValue())) {
                    it.remove();
                    z10 = true;
                }
            }
        }
        if (z10) {
            this.f146817e.b();
            this.f146816d.f146706a = null;
        }
    }
}
