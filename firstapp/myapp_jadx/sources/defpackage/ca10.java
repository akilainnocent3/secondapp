package defpackage;

import com.sportybet.android.globalpay.pixBtg.depositQrCode.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ca10 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ca10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        V v;
        V v2;
        V v3;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(a.f.a);
                break;
            default:
                wd0 wd0Var = (wd0) obj;
                Float fValueOf = Float.valueOf(0.0f);
                T t = wd0Var.g;
                f0h0<T, V> f0h0Var = wd0Var.a;
                V v4 = (V) f0h0Var.a().invoke(fValueOf);
                V v5 = v4;
                if (v4 == 0) {
                    v3 = wd0Var.j;
                }
                if (t == 0 || (v2 = (V) f0h0Var.a().invoke(t)) == 0) {
                    v5 = v3;
                    v = v2;
                    v5 = v3;
                    v = wd0Var.k;
                }
                v5 = v3;
                v = v2;
                int iB = v5.b();
                for (int i2 = 0; i2 < iB; i2++) {
                    if (v5.a(i2) > v.a(i2)) {
                        mm20.b("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + v5 + " is greater than upper bound " + v + " on index " + i2);
                    }
                }
                wd0Var.l = v5;
                wd0Var.m = v;
                wd0Var.g = t;
                if (!wd0Var.e()) {
                    Object objB = wd0Var.b(wd0Var.d());
                    if (!Intrinsics.g(objB, wd0Var.d())) {
                        ((x5a0) wd0Var.c.b).setValue(objB);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
