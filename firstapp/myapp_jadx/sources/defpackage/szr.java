package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface szr {
    static /* synthetic */ void e(szr szrVar, String str, op8 op8Var, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        szrVar.b(str, null, op8Var);
    }

    static /* synthetic */ void f(szr szrVar, int i, Function1 function1, op8 op8Var, int i2) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        szrVar.d(i, function1, qzr.a, op8Var);
    }

    static /* synthetic */ void h(szr szrVar, Object obj, gaj gajVar, int i) {
        if ((i & 1) != 0) {
            obj = null;
        }
        szrVar.i(obj, null, gajVar);
    }

    default void b(Object obj, String str, op8 op8Var) {
        i(obj, str, new op8(1691919627, new rzr(op8Var), true));
    }

    default void d(int i, Function1 function1, Function1 function2, op8 op8Var) {
        throw new IllegalStateException("The method is not implemented");
    }

    default void i(Object obj, Object obj2, gaj<? super gwr, ? super a, ? super Integer, Unit> gajVar) {
        throw new IllegalStateException("The method is not implemented");
    }
}
