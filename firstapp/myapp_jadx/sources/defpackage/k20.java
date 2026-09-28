package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class k20 implements kcf {
    public final a a;
    public final /* synthetic */ c20<Object> b;

    public static final class a implements l9f {
        public final /* synthetic */ c20<Object> a;

        public a(c20<Object> c20Var) {
            this.a = c20Var;
        }

        @Override // defpackage.l9f
        public final void a(float f) {
            c20<Object> c20Var = this.a;
            c20Var.n.a(c20Var.f(f), 0.0f);
        }
    }

    public k20(c20<Object> c20Var) {
        this.b = c20Var;
        this.a = new a(c20Var);
    }

    @Override // defpackage.kcf
    public final void a(float f) {
        this.b.d(f);
    }

    @Override // defpackage.kcf
    public final Object b(icf icfVar, g9f g9fVar) {
        Object objA = this.b.a(huw.b, new j20(this, icfVar, null), g9fVar);
        return objA == y5b.a ? objA : Unit.a;
    }
}
