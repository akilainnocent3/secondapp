package defpackage;

import android.graphics.PathMeasure;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gxz extends ath0 {
    public ya5 b;
    public float f;
    public ya5 g;
    public float k;
    public float m;
    public boolean p;
    public yae0 q;
    public final j90 r;
    public j90 s;
    public final ttr t;
    public float c = 1.0f;
    public List<? extends qxz> d = lwh0.a;
    public float e = 1.0f;
    public int h = 0;
    public int i = 0;
    public float j = 4.0f;
    public float l = 1.0f;
    public boolean n = true;
    public boolean o = true;

    public static final class a extends qlr implements Function0<pxz> {
        public static final a a = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final pxz invoke() {
            return new l90(new PathMeasure());
        }
    }

    public gxz() {
        j90 j90VarA = m90.a();
        this.r = j90VarA;
        this.s = j90VarA;
        this.t = hwr.a(a1s.c, a.a);
    }

    @Override // defpackage.ath0
    public final void a(tcf tcfVar) {
        yae0 yae0Var;
        if (this.n) {
            uxz.b(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        ya5 ya5Var = this.b;
        if (ya5Var != null) {
            tcf.j0(tcfVar, this.s, ya5Var, this.c, null, null, 0, 56);
        }
        ya5 ya5Var2 = this.g;
        if (ya5Var2 != null) {
            yae0 yae0Var2 = this.q;
            if (this.o || yae0Var2 == null) {
                yae0 yae0Var3 = new yae0(this.f, this.j, this.h, this.i, null, 16);
                this.q = yae0Var3;
                this.o = false;
                yae0Var = yae0Var3;
            } else {
                yae0Var = yae0Var2;
            }
            tcf.j0(tcfVar, this.s, ya5Var2, this.e, yae0Var, null, 0, 48);
        }
    }

    public final void e() {
        float f = this.k;
        j90 j90Var = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = j90Var;
            return;
        }
        if (Intrinsics.g(this.s, j90Var)) {
            this.s = m90.a();
        } else {
            int iQ = this.s.q();
            this.s.j();
            this.s.h(iQ);
        }
        ttr ttrVar = this.t;
        ((pxz) ttrVar.getValue()).a(j90Var);
        float length = ((pxz) ttrVar.getValue()).getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((pxz) ttrVar.getValue()).b(f4, f5, this.s);
        } else {
            ((pxz) ttrVar.getValue()).b(f4, length, this.s);
            ((pxz) ttrVar.getValue()).b(0.0f, f5, this.s);
        }
    }

    public final String toString() {
        return this.r.toString();
    }
}
