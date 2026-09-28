package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class xa4 {
    public static final void a(String str, Function1<? super String, Unit> function1, Function0<Unit> function0, a aVar, int i) {
        String str2;
        Function1<? super String, Unit> function2;
        Function0<Unit> function3;
        function1.getClass();
        function0.getClass();
        b bVarI = aVar.i(1475295680);
        int i2 = (bVarI.M(str) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            str2 = str;
            function2 = function1;
            function3 = function0;
            b(((i2 << 3) & 112) | (i2 & 896) | ((i2 << 6) & 7168), bVarI, null, str2, function3, function2);
        } else {
            str2 = str;
            function2 = function1;
            function3 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new ra4(str2, function2, function3, i);
        }
    }

    public static final void b(final int i, a aVar, d dVar, final String str, final Function0 function0, final Function1 function1) {
        final d dVar2;
        b bVarI = aVar.i(586175142);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        int i3 = i2 | (bVarI.A(function0) ? 256 : 128);
        if ((i & 3072) == 0) {
            i3 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            d.a aVar2 = d.a.b;
            x8d0.b(h.j(androidx.compose.foundation.a.b(j.e(aVar2, 1.0f), c68.a(R.color.background_general_primary, bVarI), zk40.a), 0.0f, 0.0f, 0.0f, 24.0f, 7), null, h.j(aVar2, 32.0f, 40.0f, 32.0f, 0.0f, 8), null, ht.a.n, pp8.b(1773818265, new sa4(function0, 0), bVarI), pp8.b(-142597976, new gaj() { // from class: ta4
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d.a aVar4 = d.a.b;
                        h9n.a(erz.a(R.drawable.account_activation_successful, 0, aVar3), cb40.a(R.string.identity_verification__verification_successful, new Object[0], aVar3), j.r(aVar4, 120.0f), null, null, 0.0f, null, aVar3, 384, 120);
                        lkf0.d(cb40.a(R.string.identity_verification__verification_successful, new Object[0], aVar3), g3w.h(h.j(aVar4, 0.0f, 56.0f, 0.0f, 0.0f, 13), "title"), c68.a(R.color.text_type1_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H2_M, aVar3), aVar3, 48, 0, 131064);
                        d dVarH = g3w.h(h.j(aVar4, 0.0f, 4.0f, 0.0f, 0.0f, 13), "date");
                        imf0 imf0VarL = mla.l(R.style.B1_R, aVar3);
                        long jA = c68.a(R.color.text_type1_secondary, aVar3);
                        final String str2 = str;
                        lkf0.d(str2, dVarH, jA, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL, aVar3, 48, 0, 131064);
                        lkf0.d(cb40.a(R.string.biometrics_authentication__successfully_verified_biometrics_authentication_message, new Object[0], aVar3), g3w.h(h.j(aVar4, 0.0f, 40.0f, 0.0f, 0.0f, 13), "description"), c68.a(R.color.text_type1_primary, aVar3), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, aVar3), aVar3, 48, 0, 130040);
                        d dVarH2 = g3w.h(h.j(wtc.b(aVar4, 44.0f, aVar3, aVar4, 1.0f), 0.0f, 44.0f, 0.0f, 0.0f, 13), "ok_button");
                        String strA = cb40.a(R.string.common_functions__ok, new Object[0], aVar3);
                        final Function1 function2 = function1;
                        boolean zM = aVar3.M(function2) | aVar3.M(str2);
                        Object objY = aVar3.y();
                        if (zM || objY == a.C0041a.a) {
                            objY = new Function0() { // from class: va4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function2.invoke(str2);
                                    return Unit.a;
                                }
                            };
                            aVar3.r(objY);
                        }
                        xya.a(dVarH2, false, strA, null, null, null, null, null, null, (Function0) objY, aVar3, 6, 506);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 1794432, 10);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ua4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xa4.b(qj40.a(i | 1), (a) obj, dVar2, str, function0, function1);
                    return Unit.a;
                }
            };
        }
    }
}
