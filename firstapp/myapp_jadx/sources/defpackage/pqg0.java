package defpackage;

import android.content.Context;
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
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class pqg0 {
    public static final void a(final k9h k9hVar, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, final Function0<Unit> function3, a aVar, final int i) {
        k9hVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        b bVarI = aVar.i(-1297848462);
        int i2 = i | (bVarI.M(k9hVar) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024) | (bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            final Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            u60.a(function3, new yle(false, false, false), pp8.b(1641857275, new Function2() { // from class: lqg0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarH = h.h(j.g(d.a.b, 1.0f), 25.0f, 0.0f, 2);
                        i060 i060VarC = j060.c(2.0f);
                        long jA = c68.a(R.color.background_general_primary, aVar2);
                        final k9h k9hVar2 = k9hVar;
                        final Context context2 = context;
                        final Function0 function4 = function3;
                        final Function0 function5 = function0;
                        final Function0 function6 = function1;
                        final Function0 function7 = function2;
                        ihe0.a(dVarH, i060VarC, jA, 0L, 0.0f, 0.0f, null, pp8.b(1431479296, new Function2() { // from class: nqg0
                            /* JADX WARN: Code duplicated, block: B:49:0x02b6  */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                int i3;
                                int i4;
                                a.C0041a.C0042a c0042a;
                                boolean z;
                                Function0 function8;
                                boolean zM;
                                Object objY;
                                a aVar3 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    d.a aVar4 = d.a.b;
                                    d dVarI = h.i(aVar4, 32.0f, 35.0f, 32.0f, 32.0f);
                                    i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar3, 48);
                                    int iHashCode = Long.hashCode(aVar3.m());
                                    ne00 ne00VarO = aVar3.o();
                                    d dVarC = c.c(aVar3, dVarI);
                                    yka.k.getClass();
                                    tsr.a aVar5 = yka.a.b;
                                    if (aVar3.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar3.D();
                                    if (aVar3.g()) {
                                        aVar3.F(aVar5);
                                    } else {
                                        aVar3.p();
                                    }
                                    hlh0.a(aVar3, i78VarA, yka.a.f);
                                    hlh0.a(aVar3, ne00VarO, yka.a.e);
                                    yka.a.C1350a c1350a = yka.a.g;
                                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                    }
                                    hlh0.a(aVar3, dVarC, yka.a.d);
                                    k9h k9hVar3 = k9hVar2;
                                    int iOrdinal = k9hVar3.b.ordinal();
                                    if (iOrdinal == 0) {
                                        i3 = R.string.page_payment__deposit_failed;
                                    } else {
                                        if (iOrdinal != 1) {
                                            uhc.a();
                                            return null;
                                        }
                                        i3 = R.string.page_withdraw__withdrawal_failed;
                                    }
                                    String strA = cb40.a(i3, new Object[0], aVar3);
                                    long jA2 = c68.a(R.color.text_type1_primary, aVar3);
                                    long jM = mla.m(20.0f, aVar3);
                                    t9i t9iVar = t9i.E;
                                    v1k v1kVar = f8i.b;
                                    lkf0.d(strA, j.g(aVar4, 1.0f), jA2, null, jM, null, t9iVar, v1kVar, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, null, aVar3, 1572912, 0, 260904);
                                    UiText uiText = k9hVar3.c;
                                    Context context3 = context2;
                                    String strG = uiText != null ? uiText.g(context3) : null;
                                    if (strG == null) {
                                        aVar3.N(-2098238514);
                                        i4 = 0;
                                        strG = cb40.a(R.string.common_feedback__something_went_wrong_please_try_again_later, new Object[0], aVar3);
                                    } else {
                                        i4 = 0;
                                        aVar3.N(-2098240529);
                                    }
                                    aVar3.H();
                                    int i5 = i4;
                                    lkf0.d(strG, h.j(j.g(aVar4, 1.0f), 30.0f, 19.0f, 30.0f, 0.0f, 8), c68.a(R.color.text_type1_primary, aVar3), null, mla.m(16.0f, aVar3), null, null, v1kVar, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, null, aVar3, 0, 0, 260968);
                                    String strA2 = tug.a(cb40.a(R.string.page_payment__retry_with, new Object[i5], aVar3), " ", k9hVar3.a.g(context3));
                                    uxs uxsVar = uxs.ENABLE;
                                    d dVarJ = h.j(j.g(aVar4, 1.0f), 0.0f, 38.0f, 0.0f, 0.0f, 13);
                                    final Function0 function9 = function4;
                                    boolean zM2 = aVar3.M(function9);
                                    final Function0 function10 = function5;
                                    boolean zM3 = zM2 | aVar3.M(function10);
                                    Object objY2 = aVar3.y();
                                    a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                    if (zM3 || objY2 == c0042a2) {
                                        objY2 = new Function0() { // from class: oqg0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                function9.invoke();
                                                function10.invoke();
                                                return Unit.a;
                                            }
                                        };
                                        aVar3.r(objY2);
                                    }
                                    aza.a(dVarJ, strA2, uxsVar, null, null, null, null, null, (Function0) objY2, null, aVar3, 390, 760);
                                    String upperCase = cb40.a(R.string.common_functions__transactions, new Object[i5], aVar3).toUpperCase(Locale.ROOT);
                                    upperCase.getClass();
                                    alb0 alb0Var = g9z.b;
                                    d dVarJ2 = h.j(j.g(aVar4, 1.0f), 0.0f, 9.0f, 0.0f, 0.0f, 13);
                                    boolean zM4 = aVar3.M(function9);
                                    Function0 function11 = function6;
                                    boolean zM5 = zM4 | aVar3.M(function11);
                                    Object objY3 = aVar3.y();
                                    if (zM5) {
                                        c0042a = c0042a2;
                                    } else {
                                        c0042a = c0042a2;
                                        if (objY3 != c0042a) {
                                            z = true;
                                        }
                                        a.C0041a.C0042a c0042a3 = c0042a;
                                        vuc0.b(dVarJ2, false, null, alb0Var, null, upperCase, null, null, null, null, (Function0) objY3, aVar3, 6, 0, 982);
                                        d dVarJ3 = h.j(aVar4, 0.0f, 10.0f, 0.0f, 0.0f, 13);
                                        boolean zM6 = aVar3.M(function9);
                                        function8 = function7;
                                        zM = zM6 | aVar3.M(function8);
                                        objY = aVar3.y();
                                        if (zM || objY == c0042a3) {
                                            objY = new sdr(1, function9, function8);
                                            aVar3.r(objY);
                                        }
                                        ddd0.b(dVarJ3, false, null, null, null, 0.0f, false, null, null, (Function0) objY, pp8.b(-992073922, new pmm(k9hVar3, 2), aVar3), ry9.a, null, aVar3, 6, 54, 4606);
                                        aVar3.s();
                                    }
                                    z = true;
                                    objY3 = new rdr(1, function9, function11);
                                    aVar3.r(objY3);
                                    a.C0041a.C0042a c0042a4 = c0042a;
                                    vuc0.b(dVarJ2, false, null, alb0Var, null, upperCase, null, null, null, null, (Function0) objY3, aVar3, 6, 0, 982);
                                    d dVarJ4 = h.j(aVar4, 0.0f, 10.0f, 0.0f, 0.0f, 13);
                                    boolean zM7 = aVar3.M(function9);
                                    function8 = function7;
                                    zM = zM7 | aVar3.M(function8);
                                    objY = aVar3.y();
                                    if (zM) {
                                        objY = new sdr(1, function9, function8);
                                        aVar3.r(objY);
                                    } else {
                                        objY = new sdr(1, function9, function8);
                                        aVar3.r(objY);
                                    }
                                    ddd0.b(dVarJ4, false, null, null, null, 0.0f, false, null, null, (Function0) objY, pp8.b(-992073922, new pmm(k9hVar3, 2), aVar3), ry9.a, null, aVar3, 6, 54, 4606);
                                    aVar3.s();
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 12582918, 120);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 12) & 14) | 432, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, function2, function3, i) { // from class: mqg0
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    pqg0.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
