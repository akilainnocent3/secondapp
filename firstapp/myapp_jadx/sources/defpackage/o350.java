package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes.dex */
public final class o350 {
    public static final String a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final ytw b(Object[] objArr, final uv60 uv60Var, Function0 function0, a aVar) {
        return (ytw) d(Arrays.copyOf(objArr, objArr.length), new uv60(new n350(uv60Var), new Function2() { // from class: m350
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                wv60 wv60Var = (wv60) obj;
                ytw ytwVar = (ytw) obj2;
                if (!(ytwVar instanceof w5a0)) {
                    hb5.a("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                    return null;
                }
                w5a0 w5a0Var = (w5a0) ytwVar;
                Object objInvoke = uv60Var.a.invoke(wv60Var, w5a0Var.getValue());
                if (objInvoke == null) {
                    return null;
                }
                y5a0 y5a0VarH = w5a0Var.h();
                y5a0VarH.getClass();
                return m.a(objInvoke, y5a0VarH);
            }
        }), function0, aVar, 3456, 0);
    }

    public static final <T> T c(Object[] objArr, rv60<T, ? extends Object> rv60Var, Function0<? extends T> function0, a aVar, int i) {
        return (T) d(Arrays.copyOf(objArr, objArr.length), rv60Var, function0, aVar, 384 | ((i << 3) & 7168), 0);
    }

    @fae
    public static final Object d(Object[] objArr, rv60 rv60Var, Function0 function0, a aVar, int i, int i2) {
        Object[] objArr2;
        final Object obj;
        Object objE;
        if ((i2 & 2) != 0) {
            rv60Var = vv60.a;
        }
        final rv60 rv60Var2 = rv60Var;
        final String string = Long.toString(aVar.m(), CharsKt.checkRadix(36));
        string.getClass();
        rv60Var2.getClass();
        final mt60 mt60Var = (mt60) aVar.O(pt60.a);
        Object objY = aVar.y();
        Object obj2 = a.C0041a.a;
        if (objY == obj2) {
            Object objB = (mt60Var == null || (objE = mt60Var.e(string)) == null) ? null : rv60Var2.b(objE);
            if (objB == null) {
                objB = function0.invoke();
            }
            objArr2 = objArr;
            Object dt60Var = new dt60(rv60Var2, mt60Var, string, objB, objArr2);
            aVar.r(dt60Var);
            objY = dt60Var;
        } else {
            objArr2 = objArr;
        }
        final dt60 dt60Var2 = (dt60) objY;
        Object objInvoke = Arrays.equals(objArr2, dt60Var2.e) ? dt60Var2.d : null;
        if (objInvoke == null) {
            objInvoke = function0.invoke();
        }
        boolean zA = aVar.A(dt60Var2) | ((((i & 112) ^ 48) > 32 && aVar.A(rv60Var2)) || (i & 48) == 32) | aVar.A(mt60Var) | aVar.M(string) | aVar.A(objInvoke) | aVar.A(objArr2);
        Object objY2 = aVar.y();
        if (zA || objY2 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = objInvoke;
            Object obj3 = new Function0() { // from class: l350
                /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean z;
                    dt60 dt60Var3 = dt60Var2;
                    mt60 mt60Var2 = dt60Var3.b;
                    mt60 mt60Var3 = mt60Var;
                    boolean z2 = true;
                    if (mt60Var2 != mt60Var3) {
                        dt60Var3.b = mt60Var3;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = dt60Var3.c;
                    String str2 = string;
                    if (Intrinsics.g(str, str2)) {
                        z2 = z;
                    } else {
                        dt60Var3.c = str2;
                    }
                    dt60Var3.a = rv60Var2;
                    dt60Var3.d = obj;
                    dt60Var3.e = objArr3;
                    mt60.a aVar2 = dt60Var3.f;
                    if (aVar2 != null && z2) {
                        aVar2.a();
                        dt60Var3.f = null;
                        dt60Var3.b();
                    }
                    return Unit.a;
                }
            };
            aVar.r(obj3);
            objY2 = obj3;
        } else {
            obj = objInvoke;
        }
        use useVar = xvf.a;
        aVar.t((Function0) objY2);
        return obj;
    }

    public static final <T> T e(Object[] objArr, Function0<? extends T> function0, a aVar, int i) {
        return (T) d(Arrays.copyOf(objArr, objArr.length), vv60.a, function0, aVar, ((i << 6) & 7168) | 384, 0);
    }
}
