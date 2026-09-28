package defpackage;

import androidx.compose.runtime.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class n6s {
    public final ytw A;
    public final ytw B;
    public bff0 a;
    public final oj40 b;
    public final ooa0 c;
    public final osf d;
    public dkf0 e;
    public final ytw f;
    public final ytw g;
    public urr h;
    public final ytw<vkf0> i;
    public nk0 j;
    public final ytw k;
    public final ytw l;
    public final ytw m;
    public final ytw n;
    public final ytw o;
    public boolean p;
    public final ytw q;
    public final rnp r;
    public final ytw s;
    public final ytw t;
    public Function1<? super ijf0, Unit> u;
    public final l6s v;
    public final uhi w;
    public final m6s x;
    public final b90 y;
    public long z;

    public n6s(bff0 bff0Var, oj40 oj40Var, ooa0 ooa0Var) {
        this.a = bff0Var;
        this.b = oj40Var;
        this.c = ooa0Var;
        osf osfVar = new osf();
        nk0 nk0Var = qk0.a;
        long j = ulf0.b;
        ijf0 ijf0Var = new ijf0(nk0Var, j, (ulf0) null);
        osfVar.a = ijf0Var;
        osfVar.b = new rvf(nk0Var, ijf0Var.b);
        this.d = osfVar;
        Boolean bool = Boolean.FALSE;
        this.f = m.b(bool);
        this.g = m.b(new g7f(0.0f));
        this.i = m.b(null);
        this.k = m.b(ocl.a);
        this.l = m.b(bool);
        this.m = m.b(bool);
        this.n = m.b(bool);
        this.o = m.b(bool);
        this.p = true;
        this.q = m.b(Boolean.TRUE);
        this.r = new rnp(ooa0Var);
        this.s = m.b(bool);
        this.t = m.b(bool);
        int i = 0;
        this.u = new k6s(0);
        this.v = new l6s(this, i);
        this.w = new uhi(this, 1);
        this.x = new m6s(this, i);
        this.y = c90.a();
        this.z = j58.m;
        this.A = m.b(new ulf0(j));
        this.B = m.b(new ulf0(j));
    }

    public final ocl a() {
        return (ocl) ((x5a0) this.k).getValue();
    }

    public final boolean b() {
        return ((Boolean) ((x5a0) this.f).getValue()).booleanValue();
    }

    public final urr c() {
        urr urrVar = this.h;
        if (urrVar == null || !urrVar.e()) {
            return null;
        }
        return urrVar;
    }

    public final vkf0 d() {
        return (vkf0) ((x5a0) this.i).getValue();
    }

    public final void e(long j) {
        ((x5a0) this.B).setValue(new ulf0(j));
    }

    public final void f(long j) {
        ((x5a0) this.A).setValue(new ulf0(j));
    }
}
