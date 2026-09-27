package qv;

import jv.q3;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    @cs.g
    public final or.j f123019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Object[] f123020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final q3<Object>[] f123021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f123022d;

    public o1(@oy.l or.j jVar, int i10) {
        this.f123019a = jVar;
        this.f123020b = new Object[i10];
        this.f123021c = new q3[i10];
    }

    public final void a(@oy.l q3<?> q3Var, @oy.m Object obj) {
        Object[] objArr = this.f123020b;
        int i10 = this.f123022d;
        objArr[i10] = obj;
        q3<Object>[] q3VarArr = this.f123021c;
        this.f123022d = i10 + 1;
        kotlin.jvm.internal.m0.n(q3Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        q3VarArr[i10] = q3Var;
    }

    public final void b(@oy.l or.j jVar) {
        int length = this.f123021c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            q3<Object> q3Var = this.f123021c[length];
            kotlin.jvm.internal.m0.m(q3Var);
            q3Var.f0(jVar, this.f123020b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
