package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xe0 {
    public static final fkd0<Float> a = yi0.d(0.0f, 0.0f, null, 7);
    public static final fkd0<g7f> b;

    static {
        lk40 lk40Var = mni0.a;
        b = yi0.d(0.0f, 0.0f, new g7f(0.1f), 3);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
    }

    public static final twd0 a(float f, goh gohVar, String str, a aVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            gohVar = b;
        }
        goh gohVar2 = gohVar;
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        return c(new g7f(f), gjs.d, gohVar2, null, str, null, aVar, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }

    public static final twd0 b(float f, xi0 xi0Var, String str, Function1 function1, a aVar, int i, int i2) {
        int i3 = i2 & 2;
        fkd0<Float> fkd0Var = a;
        xi0 xi0Var2 = i3 != 0 ? fkd0Var : xi0Var;
        String str2 = (i2 & 8) != 0 ? "FloatAnimation" : str;
        Function1 function2 = (i2 & 16) != 0 ? null : function1;
        if (xi0Var2 == fkd0Var) {
            aVar.N(1144108831);
            boolean zC = aVar.c(0.01f);
            Object objY = aVar.y();
            if (zC || objY == a.C0041a.a) {
                objY = yi0.d(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                aVar.r(objY);
            }
            xi0Var2 = (fkd0) objY;
            aVar.H();
        } else {
            aVar.N(1144218757);
            aVar.H();
        }
        int i4 = i << 3;
        return c(Float.valueOf(f), gjs.b, xi0Var2, Float.valueOf(0.01f), str2, function2, aVar, (i4 & 458752) | (i & 14) | (57344 & i4), 0);
    }

    public static final twd0 c(Object obj, f0h0 f0h0Var, xi0 xi0Var, Float f, String str, Function1 function1, a aVar, int i, int i2) {
        l67 l67Var;
        wd0 wd0Var;
        Float f2 = (i2 & 8) != 0 ? null : f;
        Object objY = aVar.y();
        Object obj2 = a.C0041a.a;
        if (objY == obj2) {
            objY = m.b(null);
            aVar.r(objY);
        }
        ytw ytwVar = (ytw) objY;
        Object objY2 = aVar.y();
        if (objY2 == obj2) {
            objY2 = new wd0(obj, f0h0Var, f2);
            aVar.r(objY2);
        }
        wd0 wd0Var2 = (wd0) objY2;
        ytw ytwVarC = m.c(function1, aVar);
        if (f2 != null && (xi0Var instanceof fkd0)) {
            fkd0 fkd0Var = (fkd0) xi0Var;
            if (!Intrinsics.g(fkd0Var.c, f2)) {
                xi0Var = new fkd0(fkd0Var.a, fkd0Var.b, f2);
            }
        }
        ytw ytwVarC2 = m.c(xi0Var, aVar);
        Object objY3 = aVar.y();
        if (objY3 == obj2) {
            objY3 = d77.b(-1, 6, null);
            aVar.r(objY3);
        }
        l67 l67Var2 = (l67) objY3;
        int i3 = 0;
        boolean zA = aVar.A(l67Var2) | ((((i & 14) ^ 6) > 4 && aVar.A(obj)) || (i & 6) == 4);
        Object objY4 = aVar.y();
        if (zA || objY4 == obj2) {
            objY4 = new ve0(i3, l67Var2, obj);
            aVar.r(objY4);
        }
        use useVar = xvf.a;
        aVar.t((Function0) objY4);
        boolean zA2 = aVar.A(l67Var2) | aVar.A(wd0Var2) | aVar.M(ytwVarC2) | aVar.M(ytwVarC);
        Object objY5 = aVar.y();
        if (zA2 || objY5 == obj2) {
            l67Var = l67Var2;
            wd0Var = wd0Var2;
            Object we0Var = new we0(l67Var, wd0Var, ytwVarC2, ytwVarC, null);
            aVar.r(we0Var);
            objY5 = we0Var;
        } else {
            l67Var = l67Var2;
            wd0Var = wd0Var2;
        }
        xvf.e(aVar, l67Var, (Function2) objY5);
        twd0 twd0Var = (twd0) ytwVar.getValue();
        return twd0Var == null ? wd0Var.c : twd0Var;
    }
}
