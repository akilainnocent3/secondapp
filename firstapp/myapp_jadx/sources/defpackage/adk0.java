package defpackage;

import androidx.camera.core.c;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class adk0 {
    public final Object b = new Object();
    public final ArrayDeque<c> a = new ArrayDeque<>(3);

    public adk0(wck0 wck0Var) {
    }

    public final c a() {
        c cVarRemoveLast;
        synchronized (this.b) {
            cVarRemoveLast = this.a.removeLast();
        }
        return cVarRemoveLast;
    }

    public final void b(c cVar) throws Exception {
        Object objA;
        c9n c9nVarM1 = cVar.m1();
        e06 e06Var = c9nVarM1 instanceof f06 ? ((f06) c9nVarM1).a : null;
        if (e06Var == null || ((e06Var.f() != zz5.f && e06Var.f() != zz5.d) || e06Var.h() != xz5.e || e06Var.g() != b06.d)) {
            cVar.close();
            return;
        }
        synchronized (this.b) {
            try {
                objA = this.a.size() >= 3 ? a() : null;
                this.a.addFirst(cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objA != null) {
            ((c) objA).close();
        }
    }
}
