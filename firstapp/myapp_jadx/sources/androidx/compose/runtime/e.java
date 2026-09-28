package androidx.compose.runtime;

import defpackage.dtw;
import defpackage.k0p;
import defpackage.l00;
import defpackage.nae;
import defpackage.oj40;
import defpackage.rj40;
import defpackage.rtw;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class e implements oj40 {
    public rj40 a;
    public int b;
    public l00 c;
    public Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> d;
    public int e;
    public dtw<Object> f;
    public rtw<nae<?>, Object> g;

    public static final class a {
        public static void a(h hVar, List list, rj40 rj40Var) {
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                int iC = hVar.c((l00) list.get(i));
                int iN = hVar.N(hVar.b, hVar.q(iC));
                Object obj = iN < hVar.f(hVar.b, hVar.q(iC + 1)) ? hVar.c[hVar.g(iN)] : androidx.compose.runtime.a.C0041a.a;
                e eVar = obj instanceof e ? (e) obj : null;
                if (eVar != null) {
                    eVar.a = rj40Var;
                }
            }
        }
    }

    public e(rj40 rj40Var) {
        this.a = rj40Var;
    }

    public final boolean a() {
        if (this.a != null) {
            l00 l00Var = this.c;
            if (l00Var != null ? l00Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final k0p b(Object obj) {
        k0p k0pVarN;
        rj40 rj40Var = this.a;
        return (rj40Var == null || (k0pVarN = rj40Var.n(this, obj)) == null) ? k0p.a : k0pVarN;
    }

    public final void c() {
        rj40 rj40Var = this.a;
        if (rj40Var != null) {
            rj40Var.c();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }

    public final void e(Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function2) {
        this.d = function2;
    }

    @Override // defpackage.oj40
    public final void invalidate() {
        rj40 rj40Var = this.a;
        if (rj40Var != null) {
            rj40Var.n(this, null);
        }
    }
}
