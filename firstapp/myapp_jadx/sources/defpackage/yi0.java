package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class yi0 {
    public static cgn a(mgf mgfVar, l850 l850Var, long j, int i) {
        if ((i & 2) != 0) {
            l850Var = l850.a;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        return new cgn(mgfVar, l850Var, j);
    }

    public static final <T> hpp<T> b(Function1<? super hpp.b<T>, Unit> function1) {
        hpp.b bVar = new hpp.b();
        function1.invoke(bVar);
        return new hpp<>(bVar);
    }

    public static a5a0 c() {
        return new a5a0(0);
    }

    public static fkd0 d(float f, float f2, Object obj, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new fkd0(f, f2, obj);
    }

    public static gzg0 e(int i, int i2, tkf tkfVar, int i3) {
        if ((i3 & 1) != 0) {
            i = 300;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            tkfVar = xkf.a;
        }
        return new gzg0(i, i2, tkfVar);
    }
}
