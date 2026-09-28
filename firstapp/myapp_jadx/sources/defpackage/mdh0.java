package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class mdh0 {
    public static final <T, R> Object a(vn70<? super T> vn70Var, boolean z, R r, Function2<? super R, ? super v1b<? super T>, ? extends Object> function2) {
        Object dn8Var;
        Object objS;
        try {
            if (function2 instanceof pz1) {
                y8h0.d(2, function2);
                dn8Var = function2.invoke(r, vn70Var);
            } else {
                dn8Var = yzo.c(vn70Var, r, function2);
            }
        } catch (vre e) {
            Throwable th = e.a;
            vn70Var.R(new dn8(th, false));
            throw th;
        } catch (Throwable th2) {
            dn8Var = new dn8(th2, false);
        }
        y5b y5bVar = y5b.a;
        if (dn8Var == y5bVar || (objS = vn70Var.S(dn8Var)) == p9p.b) {
            return y5bVar;
        }
        vn70Var.o0();
        if (!(objS instanceof dn8)) {
            return p9p.a(objS);
        }
        if (!z) {
            Throwable th3 = ((dn8) objS).a;
            if ((th3 instanceof txf0) && ((txf0) th3).a == vn70Var) {
                if (dn8Var instanceof dn8) {
                    throw ((dn8) dn8Var).a;
                }
                return dn8Var;
            }
        }
        throw ((dn8) objS).a;
    }
}
