package defpackage;

import android.util.Log;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class j9h<T> extends psa0<T> {
    public final T a;
    public final String b;
    public final String c;
    public final r80 d;
    public final psa0.a e;
    public final m9j0 f;

    public j9h(T t, String str, String str2, r80 r80Var, psa0.a aVar) {
        t.getClass();
        str.getClass();
        r80Var.getClass();
        aVar.getClass();
        this.a = t;
        this.b = str;
        this.c = str2;
        this.d = r80Var;
        this.e = aVar;
        m9j0 m9j0Var = new m9j0(str2 + " value: " + t);
        StackTraceElement[] stackTrace = m9j0Var.getStackTrace();
        stackTrace.getClass();
        Object[] array = ay0.u(stackTrace).toArray(new StackTraceElement[0]);
        if (array == null) {
            bmy.a("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            throw null;
        }
        m9j0Var.setStackTrace((StackTraceElement[]) array);
        this.f = m9j0Var;
    }

    @Override // defpackage.psa0
    public final T a() throws m9j0 {
        int iOrdinal = this.e.ordinal();
        if (iOrdinal == 0) {
            throw this.f;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return null;
            }
            uhc.a();
            return null;
        }
        T t = this.a;
        t.getClass();
        String str = this.c;
        str.getClass();
        this.d.getClass();
        String str2 = this.b;
        str2.getClass();
        Log.d(str2, str + " value: " + t);
        return null;
    }

    @Override // defpackage.psa0
    public final psa0<T> b(String str, Function1<? super T, Boolean> function1) {
        function1.getClass();
        return this;
    }
}
