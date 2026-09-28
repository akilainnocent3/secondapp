package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/LazyKt")
public class hwr {
    public static <T> ttr<T> a(a1s a1sVar, Function0<? extends T> function0) {
        function0.getClass();
        int iOrdinal = a1sVar.ordinal();
        if (iOrdinal == 0) {
            return new mpe0(function0, null, 2, null);
        }
        if (iOrdinal == 1) {
            vr60 vr60Var = new vr60();
            vr60Var.a = function0;
            vr60Var.b = tbh0.a;
            return vr60Var;
        }
        if (iOrdinal != 2) {
            uhc.a();
            return null;
        }
        xgh0 xgh0Var = new xgh0();
        xgh0Var.a = function0;
        xgh0Var.b = tbh0.a;
        return xgh0Var;
    }

    public static mpe0 b(Function0 function0) {
        function0.getClass();
        return new mpe0(function0, null, 2, null);
    }
}
