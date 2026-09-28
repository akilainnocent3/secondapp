package defpackage;

import android.os.Trace;
import androidx.compose.runtime.a;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class c01 {
    public static final b01 a(Object obj, m9n m9nVar, Function1 function1, d0b d0bVar, a aVar, int i) {
        return b(new g01(obj, (zz0) aVar.O(cdt.a), m9nVar), function1, null, d0bVar, aVar);
    }

    public static final b01 b(g01 g01Var, Function1 function1, ish0 ish0Var, d0b d0bVar, a aVar) {
        aVar.N(-1242991349);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            nan nanVarC = qsh0.c(g01Var.a, aVar);
            qsh0.g(nanVarC);
            b01.a aVar2 = new b01.a(g01Var.c, nanVarC, g01Var.b);
            Object objY = aVar.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new b01(aVar2);
                aVar.r(objY);
            }
            b01 b01Var = (b01) objY;
            Object objY2 = aVar.y();
            if (objY2 == c0042a) {
                objY2 = xvf.i(e.a, aVar);
                aVar.r(objY2);
            }
            b01Var.B = (v5b) objY2;
            b01Var.C = function1;
            b01Var.D = ish0Var;
            b01Var.E = d0bVar;
            b01Var.F = 1;
            b01Var.G = qsh0.a(aVar);
            b01Var.l(aVar2);
            aVar.H();
            return b01Var;
        } finally {
            Trace.endSection();
        }
    }
}
