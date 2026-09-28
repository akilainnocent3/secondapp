package defpackage;

import androidx.compose.runtime.m;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class h0s<T> {
    public final lyh<kqz<T>> a;
    public final CoroutineContext b;
    public final a c;
    public final ytw d;
    public final ytw e;

    public static final class a extends rqz<T> {
        public final /* synthetic */ h0s<T> m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h0s<T> h0sVar, CoroutineContext coroutineContext, kqz<T> kqzVar) {
            super(coroutineContext, kqzVar);
            this.m = h0sVar;
        }

        @Override // defpackage.rqz
        public final Object c(qqz qqzVar, x1b x1bVar) {
            h0s<T> h0sVar = this.m;
            ((x5a0) h0sVar.d).setValue(h0sVar.c.f());
            return Unit.a;
        }
    }

    public h0s(lyh<kqz<T>> lyhVar) {
        lyhVar.getClass();
        this.a = lyhVar;
        CoroutineContext coroutineContext = (CoroutineContext) uc0.A.getValue();
        this.b = coroutineContext;
        a aVar = new a(this, coroutineContext, lyhVar instanceof a390 ? (kqz) CollectionsKt.firstOrNull(((a390) lyhVar).c()) : null);
        this.c = aVar;
        this.d = m.b(aVar.f());
        y78 y78Var = (y78) aVar.k.a.getValue();
        if (y78Var == null) {
            jxs jxsVar = k0s.a;
            y78Var = new y78(jxsVar.a, jxsVar.b, jxsVar.c, jxsVar, null);
        }
        this.e = m.b(y78Var);
    }

    public final Object a(tje0 tje0Var) {
        Object objCollect = this.c.k.a.collect(new f1i.a(new f0s(this)), tje0Var);
        y5b y5bVar = y5b.a;
        if (objCollect != y5bVar) {
            objCollect = Unit.a;
        }
        return objCollect == y5bVar ? objCollect : Unit.a;
    }

    public final T b(int i) {
        this.c.a(i);
        return (T) ((d3p) ((x5a0) this.d).getValue()).get(i);
    }

    public final int c() {
        return ((d3p) ((x5a0) this.d).getValue()).b();
    }

    public final y78 d() {
        return (y78) ((x5a0) this.e).getValue();
    }

    public final T e(int i) {
        return (T) ((d3p) ((x5a0) this.d).getValue()).get(i);
    }

    public final void f() {
        this.c.d();
    }
}
