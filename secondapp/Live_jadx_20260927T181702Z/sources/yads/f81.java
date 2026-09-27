package yads;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class f81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s00 f149016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g81 f149017b;

    public /* synthetic */ f81(s00 s00Var) {
        this(s00Var, new g81());
    }

    public final void a(ua1 ua1Var, bb1 bb1Var) {
        g81 g81Var = this.f149017b;
        synchronized (g81Var.f149462a) {
            try {
                Set hashSet = (Set) g81Var.f149464c.get(ua1Var);
                if (hashSet == null) {
                    hashSet = new HashSet();
                    g81Var.f149464c.put(ua1Var, hashSet);
                }
                hashSet.add(bb1Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public f81(s00 s00Var, g81 g81Var) {
        this.f149016a = s00Var;
        this.f149017b = g81Var;
    }
}
