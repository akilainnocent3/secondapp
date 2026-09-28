package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class zcg {
    public static String a(Context context, int i) {
        if (context == null) {
            return "";
        }
        if (i == 1) {
            return context.getString(R.string.fingerprint_error_hw_not_available);
        }
        if (i != 7) {
            switch (i) {
                case 9:
                    break;
                case 10:
                    return context.getString(R.string.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(R.string.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(R.string.fingerprint_error_hw_not_present);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i);
                    return context.getString(R.string.default_error_msg);
            }
        }
        return context.getString(R.string.fingerprint_error_lockout);
    }

    public static final d930 b(int i, a aVar, Function0 function0, final boolean z) {
        function0.getClass();
        if (Float.compare(80.0f, 0.0f) <= 0) {
            hb5.a("The refresh trigger must be greater than zero!");
            return null;
        }
        Object objY = aVar.y();
        Object obj = a.C0041a.a;
        if (objY == obj) {
            objY = xvf.i(e.a, aVar);
            aVar.r(objY);
        }
        v5b v5bVar = (v5b) objY;
        ytw ytwVarC = m.c(function0, aVar);
        final aq40 aq40Var = new aq40();
        final aq40 aq40Var2 = new aq40();
        mmd mmdVar = (mmd) aVar.O(kna.h);
        aq40Var.a = mmdVar.C1(80.0f);
        aq40Var2.a = mmdVar.C1(56.0f);
        boolean zM = aVar.M(v5bVar);
        Object objY2 = aVar.y();
        if (zM || objY2 == obj) {
            objY2 = new d930(v5bVar, ytwVarC, aq40Var2.a, aq40Var.a);
            aVar.r(objY2);
        }
        final d930 d930Var = (d930) objY2;
        boolean zA = ((((i & 14) ^ 6) > 4 && aVar.b(z)) || (i & 6) == 4) | aVar.A(d930Var) | aVar.c(aq40Var.a) | aVar.c(aq40Var2.a);
        Object objY3 = aVar.y();
        if (zA || objY3 == obj) {
            objY3 = new Function0() { // from class: e930
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    d930 d930Var2 = d930Var;
                    boolean zB = d930Var2.b();
                    v5b v5bVar2 = d930Var2.a;
                    isw iswVar = d930Var2.h;
                    boolean z2 = z;
                    if (zB != z2) {
                        ((x5a0) d930Var2.d).setValue(Boolean.valueOf(z2));
                        ((t5a0) d930Var2.f).A(0.0f);
                        ej5.c(v5bVar2, null, null, new c930(d930Var2, z2 ? ((t5a0) iswVar).j() : 0.0f, null), 3);
                    }
                    ((t5a0) d930Var2.g).A(aq40Var.a);
                    float f = aq40Var2.a;
                    t5a0 t5a0Var = (t5a0) iswVar;
                    if (t5a0Var.j() != f) {
                        t5a0Var.A(f);
                        if (d930Var2.b()) {
                            ej5.c(v5bVar2, null, null, new c930(d930Var2, f, null), 3);
                        }
                    }
                    return Unit.a;
                }
            };
            aVar.r(objY3);
        }
        use useVar = xvf.a;
        aVar.t((Function0) objY3);
        return d930Var;
    }
}
