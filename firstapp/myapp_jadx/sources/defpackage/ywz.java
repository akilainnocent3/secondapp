package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class ywz {
    public static final void a(final ijf0 ijf0Var, final uxs uxsVar, final boolean z, final UiText uiText, final boolean z2, final Function1<? super uwz, Unit> function1, String str, final Function0<Unit> function0, final Function0<Unit> function2, a aVar, final int i, final int i2) {
        int i3;
        String strA;
        b bVar;
        ijf0Var.getClass();
        uxsVar.getClass();
        uiText.getClass();
        function1.getClass();
        function0.getClass();
        function2.getClass();
        b bVarI = aVar.i(-402253017);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(ijf0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.d(uxsVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.M(uiText) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bVarI.b(z2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= bVarI.A(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                strA = str;
                int i4 = bVarI.M(strA) ? 1048576 : 524288;
                i3 |= i4;
            } else {
                strA = str;
            }
            i3 |= i4;
        } else {
            strA = str;
        }
        if ((12582912 & i) == 0) {
            i3 |= bVarI.A(function0) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= bVarI.A(function2) ? 67108864 : 33554432;
        }
        if (bVarI.q(i3 & 1, (38347923 & i3) != 38347922)) {
            bVarI.A0();
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
                int i5 = i2 & 64;
            } else if ((i2 & 64) != 0) {
                strA = cb40.a(R.string.common_functions__enter_password_description, new Object[0], bVarI);
            }
            bVarI.Y();
            final String str2 = strA;
            bVar = bVarI;
            x8d0.a(null, pp8.b(1476085662, new q1c(1, function0, function2), bVarI), null, null, pp8.b(-1077086568, new gaj() { // from class: wwz
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    tmz tmzVar = (tmz) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    tmzVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(tmzVar) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        d.a aVar3 = d.a.b;
                        d dVarI = h.i(h.e(j.e(aVar3, 1.0f), tmzVar), 32.0f, 40.0f, 32.0f, 24.0f);
                        i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarI);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, i78VarA, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        lkf0.d(cb40.a(R.string.common_functions__enter_password, new Object[0], aVar2), g3w.h(aVar3, "password_verification_title"), c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, aVar2), aVar2, 48, 0, 131064);
                        lkf0.d(str2, g3w.h(h.h(aVar3, 0.0f, 20.0f, 1), "password_verification_explanation_text"), c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, aVar2), aVar2, 48, 0, 130040);
                        d dVarE = c9j.e(aVar3);
                        UiText uiText2 = uiText;
                        uiText2.getClass();
                        ycg.b bVar2 = new ycg.b(uiText2.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b)));
                        String strA2 = cb40.a(R.string.common_functions__password, new Object[0], aVar2);
                        Boolean boolValueOf = Boolean.valueOf(z2);
                        Function1 function3 = function1;
                        boolean zM = aVar2.M(function3);
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zM || objY == c0042a) {
                            objY = new c5v(function3, 1);
                            aVar2.r(objY);
                        }
                        Function1 function4 = (Function1) objY;
                        boolean zM2 = aVar2.M(function3);
                        Object objY2 = aVar2.y();
                        if (zM2 || objY2 == c0042a) {
                            objY2 = new ooq(1, function3);
                            aVar2.r(objY2);
                        }
                        qwz.b(dVarE, ijf0Var, z, bVar2, false, strA2, null, null, boolValueOf, null, null, function4, (Function0) objY2, aVar2, 0, 0, 3792);
                        d dVarH = g3w.h(h.j(aVar3, 0.0f, 20.0f, 0.0f, 0.0f, 13), "password_verification_forgot_password_button");
                        boolean zM3 = aVar2.M(function3);
                        Object objY3 = aVar2.y();
                        if (zM3 || objY3 == c0042a) {
                            objY3 = new poq(1, function3);
                            aVar2.r(objY3);
                        }
                        ddd0.a(dVarH, false, null, null, null, false, null, null, (Function0) objY3, wh9.a, aVar2, 805306374, 254);
                        ty0.a(aVar2, new LayoutWeightElement(1.0f, true));
                        d dVarH2 = g3w.h(j.g(aVar3, 1.0f), "password_verification_confirm_button");
                        String strA3 = cb40.a(R.string.common_functions__confirm, new Object[0], aVar2);
                        boolean zM4 = aVar2.M(function3);
                        Object objY4 = aVar2.y();
                        if (zM4 || objY4 == c0042a) {
                            objY4 = new qoq(1, function3);
                            aVar2.r(objY4);
                        }
                        aza.a(dVarH2, strA3, uxsVar, null, null, null, null, null, (Function0) objY4, null, aVar2, 6, 760);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 24624, 13);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        final String str3 = strA;
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xwz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ywz.a(ijf0Var, uxsVar, z, uiText, z2, function1, str3, function0, function2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
