package yads;

import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class s92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f155313a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f155314b = new WeakHashMap();

    public final boolean a() {
        boolean z10;
        synchronized (this.f155313a) {
            z10 = !this.f155314b.isEmpty();
        }
        return z10;
    }

    public final void b() {
        ArrayList<ld3> arrayList;
        synchronized (this.f155313a) {
            arrayList = new ArrayList(this.f155314b.keySet());
            this.f155314b.clear();
            dr.w2 w2Var = dr.w2.f79517a;
        }
        for (ld3 ld3Var : arrayList) {
            if (ld3Var != null) {
                ld3Var.a();
            }
        }
    }

    public final void a(ld3 ld3Var) {
        synchronized (this.f155313a) {
            this.f155314b.put(ld3Var, null);
            dr.w2 w2Var = dr.w2.f79517a;
        }
    }

    public final void b(ld3 ld3Var) {
        synchronized (this.f155313a) {
            this.f155314b.remove(ld3Var);
        }
    }
}
