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
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class ka4 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final Function0 function0, final Function0 function1, final Function1 function2, cb4 cb4Var, a aVar, final int i) {
        final cb4 cb4Var2;
        final cb4 cb4Var3;
        int i2;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        b bVarI = aVar.i(-532797589);
        int i3 = i | (bVarI.A(function0) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128) | 1024;
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    cb4Var3 = (cb4) p8i0.a(jq40.a(cb4.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
                    i2 = i3 & (-7169);
                }
            } else {
                bVarI.G();
                i2 = i3 & (-7169);
                cb4Var3 = cb4Var;
            }
            bVarI.Y();
            ya4 ya4Var = (ya4) wyh.c(cb4Var3.e, bVarI, 0, 7).getValue();
            boolean zA = bVarI.A(cb4Var3);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new Function1() { // from class: aa4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Object value;
                        qd4.c cVar = (qd4.c) obj;
                        if (cVar != null) {
                            itf0.a.a("on Auth Succeeded " + cVar, new Object[0]);
                            cb4 cb4Var4 = cb4Var3;
                            wwd0 wwd0Var = cb4Var4.d;
                            do {
                                value = wwd0Var.getValue();
                            } while (!wwd0Var.g(value, ya4.a((ya4) value, null, System.currentTimeMillis(), false, 5)));
                            ej5.c(o8i0.d(cb4Var4), null, null, new za4(cb4Var4, cVar, null), 3);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            Function1 function3 = (Function1) objY;
            boolean zA2 = bVarI.A(cb4Var3);
            Object objY2 = bVarI.y();
            if (zA2 || objY2 == c0042a) {
                objY2 = new ba4();
                bVarI.r(objY2);
            }
            Function1 function4 = (Function1) objY2;
            boolean zA3 = bVarI.A(cb4Var3);
            Object objY3 = bVarI.y();
            if (zA3 || objY3 == c0042a) {
                ga4 ga4Var = new ga4(0, cb4Var3, cb4.class, "prepareAuthContext", "prepareAuthContext()Lkotlinx/coroutines/Job;", 8);
                bVarI.r(ga4Var);
                objY3 = ga4Var;
            }
            Function0 function5 = (Function0) objY3;
            boolean zA4 = bVarI.A(cb4Var3);
            Object objY4 = bVarI.y();
            if (zA4 || objY4 == c0042a) {
                ha4 ha4Var = new ha4(0, cb4Var3, cb4.class, "consumeState", "consumeState()V", 0);
                bVarI.r(ha4Var);
                objY4 = ha4Var;
            }
            Function0 function6 = (Function0) ((chp) objY4);
            boolean zA5 = bVarI.A(cb4Var3);
            Object objY5 = bVarI.y();
            if (zA5 || objY5 == c0042a) {
                objY5 = new ia4(0, cb4Var3, cb4.class, "handleBiometricShown", "handleBiometricShown()V", 0);
                bVarI.r(objY5);
            }
            int i4 = i2 << 6;
            b(null, ya4Var, function0, function1, function3, function4, function5, function2, function6, (Function0) ((chp) objY5), bVarI, ((i2 << 15) & 29360128) | (i4 & 7168) | (i4 & 896) | 64);
            cb4Var2 = cb4Var3;
        } else {
            bVarI.G();
            cb4Var2 = cb4Var;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, function2, cb4Var2, i) { // from class: ca4
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ cb4 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ka4.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(d dVar, final ya4 ya4Var, final Function0 function0, final Function0 function1, final Function1 function2, final Function1 function3, final Function0 function4, final Function1 function5, final Function0 function6, final Function0 function7, a aVar, final int i) {
        Function1 function8;
        Function0 function9;
        b bVar;
        final d dVar2;
        b bVarI = aVar.i(1490251376);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(ya4Var) : bVarI.A(ya4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function8 = function2;
            i2 |= bVarI.A(function8) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            function8 = function2;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(function4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.A(function5) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= bVarI.A(function6) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            function9 = function7;
            i2 |= bVarI.A(function9) ? 536870912 : 268435456;
        } else {
            function9 = function7;
        }
        if (bVarI.q(i2 & 1, (306783379 & i2) != 306783378)) {
            td4.a(ya4Var.a, function8, function3, null, function9, bVarI, ((i2 >> 9) & 1008) | ((i2 >> 15) & 57344), 8);
            bVar = bVarI;
            Boolean boolValueOf = Boolean.valueOf(ya4Var.c);
            boolean z = ((29360128 & i2) == 8388608) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && bVar.A(ya4Var))) | ((i2 & 234881024) == 67108864);
            Object objY = bVar.y();
            if (z || objY == a.C0041a.a) {
                objY = new ja4(ya4Var, function5, function6, null);
                bVar.r(objY);
            }
            xvf.e(bVar, boolValueOf, (Function2) objY);
            d.a aVar2 = d.a.b;
            dVar2 = aVar2;
            x8d0.b(h.j(androidx.compose.foundation.a.b(j.e(aVar2, 1.0f), c68.a(R.color.background_general_primary, bVar), zk40.a), 0.0f, 0.0f, 0.0f, 24.0f, 7), null, h.j(aVar2, 40.0f, 40.0f, 40.0f, 0.0f, 8), null, ht.a.n, pp8.b(-1940949469, new Function2() { // from class: da4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        odd0.c(null, cb40.a(R.string.biometrics_authentication__biometrics_authentication, new Object[0], aVar3), function0, function1, aVar3, 0, 1);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVar), pp8.b(1890436338, new gaj() { // from class: ea4
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d.a aVar4 = d.a.b;
                        lkf0.d(cb40.a(R.string.biometrics_authentication__biometrics_verification, new Object[0], aVar3), g3w.h(aVar4, "biometrics_verification"), c68.a(R.color.text_type1_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, aVar3), aVar3, 48, 0, 131064);
                        lkf0.d(cb40.a(R.string.biometrics_authentication__verify_biometrics_again, new Object[0], aVar3), h.j(aVar4, 0.0f, 44.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, aVar3), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, aVar3), aVar3, 48, 0, 130040);
                        mw90.a("https://s.sporty.net/cms/img_setup_biometrics_bf7959f886.png", "Biometrics Verification", g3w.h(j.t(h.j(aVar4, 0.0f, 44.0f, 0.0f, 0.0f, 13), 281.0f, 191.0f), "bio_auth_verification_image"), null, null, null, null, aVar3, 438, 2040);
                        xya.a(h.j(wtc.b(aVar4, 40.0f, aVar3, aVar4, 1.0f), 0.0f, 44.0f, 0.0f, 0.0f, 13), false, cb40.a(R.string.identity_verification__verify_again, new Object[0], aVar3), null, null, null, null, null, null, function4, aVar3, 6, 506);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVar), bVar, 1794432, 10);
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: fa4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ka4.b(dVar2, ya4Var, function0, function1, function2, function3, function4, function5, function6, function7, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
