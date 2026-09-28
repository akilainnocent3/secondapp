package defpackage;

import android.os.Trace;
import androidx.compose.runtime.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class a350 {
    public Set<j350> a;
    public qma b;
    public final duw<k350> c;
    public stw<k350> d;
    public duw<k350> e;
    public final duw<Object> f;
    public final duw<Function0<Unit>> g;
    public stw<uga> h;
    public rtw<e, nzz> i;
    public ArrayList j;
    public gz60<k350> k;

    public a350() {
        duw<k350> duwVar = new duw<>(new k350[16]);
        this.c = duwVar;
        this.d = hz60.a();
        this.e = duwVar;
        this.f = new duw<>(new Object[16]);
        this.g = new duw<>(new Function0[16]);
    }

    public static final boolean f(k350 k350Var, duw<k350> duwVar) {
        k350[] k350VarArr = duwVar.a;
        int i = duwVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            j350 j350Var = k350VarArr[i2].a;
            if (j350Var instanceof nzz) {
                duw<k350> duwVar2 = ((nzz) j350Var).b;
                if (duwVar2.j(k350Var) || f(k350Var, duwVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.a = null;
        this.b = null;
        duw<k350> duwVar = this.c;
        duwVar.g();
        this.d.e();
        this.e = duwVar;
        this.f.g();
        this.g.g();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public final void b() {
        Set<j350> set = this.a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator<j350> it = set.iterator();
            while (it.hasNext()) {
                j350 next = it.next();
                it.remove();
                next.e();
            }
            Unit unit = Unit.a;
        } finally {
            Trace.endSection();
        }
    }

    public final void c() {
        Set<j350> set = this.a;
        if (set == null) {
            return;
        }
        this.k = null;
        duw<Object> duwVar = this.f;
        if (duwVar.c != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                stw<uga> stwVar = this.h;
                int i = duwVar.c;
                while (true) {
                    i--;
                    if (-1 >= i) {
                        break;
                    }
                    Object obj = duwVar.a[i];
                    try {
                        if (obj instanceof k350) {
                            j350 j350Var = ((k350) obj).a;
                            set.remove(j350Var);
                            j350Var.f();
                        }
                        if (obj instanceof uga) {
                            if (stwVar == null || !stwVar.a((uga) obj)) {
                                ((uga) obj).c();
                            } else {
                                ((uga) obj).a();
                            }
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        qma qmaVar = this.b;
                        if (qmaVar != null) {
                            qmaVar.a(th, obj);
                        }
                        throw th;
                    }
                }
                Unit unit2 = Unit.a;
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        duw<k350> duwVar2 = this.c;
        if (duwVar2.c != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set<j350> set2 = this.a;
                if (set2 != null) {
                    k350[] k350VarArr = duwVar2.a;
                    int i2 = duwVar2.c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        k350 k350Var = k350VarArr[i3];
                        j350 j350Var2 = k350Var.a;
                        set2.remove(j350Var2);
                        try {
                            j350Var2.c();
                            Unit unit3 = Unit.a;
                        } catch (Throwable th3) {
                            qma qmaVar2 = this.b;
                            if (qmaVar2 != null) {
                                qmaVar2.a(th3, k350Var);
                            }
                            throw th3;
                        }
                    }
                }
                Unit unit4 = Unit.a;
                Trace.endSection();
            } catch (Throwable th4) {
                Trace.endSection();
                throw th4;
            }
        }
    }

    public final void d() {
        duw<Function0<Unit>> duwVar = this.g;
        if (duwVar.c != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Function0<Unit>[] function0Arr = duwVar.a;
                int i = duwVar.c;
                for (int i2 = 0; i2 < i; i2++) {
                    function0Arr[i2].invoke();
                }
                duwVar.g();
                Unit unit = Unit.a;
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e(k350 k350Var) {
        if (this.d.a(k350Var)) {
            this.d.l(k350Var);
            if (!this.e.j(k350Var)) {
                duw<k350> duwVar = this.c;
                if (!duwVar.j(k350Var)) {
                    f(k350Var, duwVar);
                }
            }
            Set<j350> set = this.a;
            if (set == null) {
                return;
            } else {
                set.add(k350Var.a);
            }
        }
        gz60<k350> gz60Var = this.k;
        if (gz60Var == null || !gz60Var.a(k350Var)) {
            this.f.b(k350Var);
        }
    }

    public final void g(Set set, rma rmaVar) {
        a();
        this.a = set;
        this.b = rmaVar;
    }

    public final void h(k350 k350Var) {
        this.e.b(k350Var);
        this.d.d(k350Var);
    }
}
