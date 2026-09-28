package defpackage;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class fv50 extends t52 {
    public final esc c;
    public final tv50 d;
    public final List<lv50.b> e;
    public final qua f;
    public final wfe0 g;
    public vfe0 h;

    public static final class a extends tv50 {
        @Override // defpackage.tv50
        public final void a(vp60 vp60Var) {
            vp60Var.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // defpackage.tv50
        public final void b(vp60 vp60Var) {
            vp60Var.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // defpackage.tv50
        public final void c(vp60 vp60Var) {
            vp60Var.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // defpackage.tv50
        public final void d(vp60 vp60Var) {
            vp60Var.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // defpackage.tv50
        public final void e(vp60 vp60Var) {
            vp60Var.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // defpackage.tv50
        public final void f(vp60 vp60Var) {
            vp60Var.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // defpackage.tv50
        public final tv50.a g(vp60 vp60Var) {
            vp60Var.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }
    }

    public final class b extends wfe0.a {
        public b(int i) {
            super(i);
        }

        @Override // wfe0.a
        public final void c(rzi rziVar) {
            fv50.this.f(new ufe0(rziVar));
        }

        @Override // wfe0.a
        public final void d(rzi rziVar, int i, int i2) {
            f(rziVar, i, i2);
        }

        @Override // wfe0.a
        public final void e(rzi rziVar) {
            ufe0 ufe0Var = new ufe0(rziVar);
            fv50 fv50Var = fv50.this;
            fv50Var.h(ufe0Var);
            fv50Var.h = rziVar;
        }

        @Override // wfe0.a
        public final void f(rzi rziVar, int i, int i2) {
            fv50.this.g(new ufe0(rziVar), i, i2);
        }
    }

    public fv50(esc escVar, tv50 tv50Var, nv50 nv50Var) {
        int i;
        qua xuaVar;
        this.c = escVar;
        this.d = tv50Var;
        List<lv50.b> list = escVar.e;
        lv50.c cVar = escVar.g;
        wfe0.c cVar2 = escVar.c;
        xp60 xp60Var = escVar.t;
        String str = escVar.b;
        this.e = list == null ? m2g.a : list;
        wfe0 wfe0VarA = null;
        if (xp60Var != null) {
            this.g = null;
            if (xp60Var.b()) {
                xuaVar = new ruz(new t52.a(this, xp60Var), str == null ? ":memory:" : str, nv50Var);
            } else if (str == null) {
                xuaVar = new xua(new t52.a(this, xp60Var));
            } else {
                t52.a aVar = new t52.a(this, xp60Var);
                int iOrdinal = cVar.ordinal();
                if (iOrdinal == 1) {
                    i = 1;
                } else {
                    if (iOrdinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + cVar + '\'').toString());
                    }
                    i = 4;
                }
                int iOrdinal2 = cVar.ordinal();
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + cVar + '\'').toString());
                }
                xuaVar = new xua(aVar, str, i);
            }
            this.f = xuaVar;
        } else {
            if (cVar2 == null) {
                hb5.a("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            Context context = escVar.a;
            context.getClass();
            wfe0VarA = cVar2.a(new wfe0.b(context, str, new b(tv50Var.a), false, false));
            this.g = wfe0VarA;
            this.f = new ruz(new x1p(wfe0VarA), str == null ? ":memory:" : str, nv50Var);
        }
        boolean z = cVar == lv50.c.c;
        if (wfe0VarA != null) {
            wfe0VarA.setWriteAheadLoggingEnabled(z);
        }
    }

    @Override // defpackage.t52
    public final List<lv50.b> c() {
        return this.e;
    }

    @Override // defpackage.t52
    public final esc d() {
        return this.c;
    }

    @Override // defpackage.t52
    public final tv50 e() {
        return this.d;
    }

    public fv50(esc escVar, iv50 iv50Var, mv50 mv50Var) {
        lv50.c cVar = escVar.g;
        this.c = escVar;
        this.d = new a(-1, "", "");
        List<lv50.b> list = escVar.e;
        this.e = list == null ? m2g.a : list;
        ArrayList arrayListJ0 = CollectionsKt.j0(list == null ? m2g.a : list, new gv50(new ev50(this)));
        Context context = escVar.a;
        String str = escVar.b;
        wfe0.c cVar2 = escVar.c;
        lv50.d dVar = escVar.d;
        boolean z = escVar.f;
        Executor executor = escVar.h;
        Executor executor2 = escVar.i;
        Intent intent = escVar.j;
        boolean z2 = escVar.k;
        boolean z3 = escVar.l;
        Set<Integer> set = escVar.m;
        String str2 = escVar.n;
        File file = escVar.o;
        Callable<InputStream> callable = escVar.p;
        List<Object> list2 = escVar.q;
        List<Object> list3 = escVar.r;
        boolean z4 = escVar.s;
        xp60 xp60Var = escVar.t;
        CoroutineContext coroutineContext = escVar.u;
        context.getClass();
        executor.getClass();
        executor2.getClass();
        wfe0 wfe0Var = (wfe0) iv50Var.invoke(new esc(context, str, cVar2, dVar, arrayListJ0, z, cVar, executor, executor2, intent, z2, z3, set, str2, file, callable, list2, list3, z4, xp60Var, coroutineContext));
        this.g = wfe0Var;
        x1p x1pVar = new x1p(wfe0Var);
        String str3 = escVar.b;
        this.f = new ruz(x1pVar, str3 == null ? ":memory:" : str3, mv50Var);
        boolean z5 = cVar == lv50.c.c;
        if (wfe0Var != null) {
            wfe0Var.setWriteAheadLoggingEnabled(z5);
        }
    }
}
