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

/* JADX INFO: loaded from: classes5.dex */
public final class kxf {
    public static final void a(lxf lxfVar, Function0<Unit> function0, Function0<Unit> function1, Function1<? super wwf, Unit> function2, a aVar, final int i) {
        final Function1<? super wwf, Unit> function3;
        final Function0<Unit> function4;
        final Function0<Unit> function5;
        final lxf lxfVar2;
        lxfVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        b bVarI = aVar.i(-1428867917);
        int i2 = (bVarI.M(lxfVar) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            b(lxfVar, function0, function1, function2, bVarI, i2 & 8190);
            lxfVar2 = lxfVar;
            function5 = function0;
            function4 = function1;
            function3 = function2;
        } else {
            function3 = function2;
            function4 = function1;
            function5 = function0;
            lxfVar2 = lxfVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function5, function4, function3, i) { // from class: dxf
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    kxf.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final lxf lxfVar, final Function0<Unit> function0, final Function0<Unit> function1, final Function1<? super wwf, Unit> function2, a aVar, final int i) {
        b bVarI = aVar.i(1946205898);
        int i2 = (bVarI.M(lxfVar) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            uwf.a(lxfVar.f, function2, bVarI, (i2 >> 6) & 112);
            x8d0.a(null, pp8.b(1621793331, new exf(function0, function1), bVarI), null, null, pp8.b(-963743623, new gaj() { // from class: fxf
                /* JADX WARN: Code duplicated, block: B:41:0x0284  */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a.C0041a.C0042a c0042a;
                    boolean zM;
                    Object objY;
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
                        lkf0.d(cb40.a(R.string.email_change__enter_new_email_title, new Object[0], aVar2), null, c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, aVar2), aVar2, 0, 0, 131066);
                        lkf0.d(cb40.a(R.string.email_change__enter_new_email_content, new Object[0], aVar2), h.h(aVar3, 0.0f, 20.0f, 1), c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, aVar2), aVar2, 48, 0, 130040);
                        lxf lxfVar2 = lxfVar;
                        tyx.c(null, lxfVar2.a, null, null, false, null, false, false, null, cb40.a(R.string.email_change__your_current_email, new Object[0], aVar2), null, null, null, 0, null, null, null, aVar2, 1572864, 0, 130493);
                        ty0.a(aVar2, j.i(aVar3, 20.0f));
                        ijf0 ijf0Var = lxfVar2.b;
                        String strA = cb40.a(R.string.email_change__your_new_email_address, new Object[0], aVar2);
                        final Function1 function3 = function2;
                        boolean zM2 = aVar2.M(function3);
                        Object objY2 = aVar2.y();
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (zM2 || objY2 == c0042a2) {
                            objY2 = new hxf(function3, 0);
                            aVar2.r(objY2);
                        }
                        jr7.a(null, ijf0Var, null, false, null, false, null, strA, null, null, null, 0, null, "new_email_address", (Function1) objY2, aVar2, 0, 3072, 8061);
                        ty0.a(aVar2, j.i(aVar3, 20.0f));
                        ijf0 ijf0Var2 = lxfVar2.c;
                        String strA2 = cb40.a(R.string.email_change__confirm_your_new_email_address, new Object[0], aVar2);
                        boolean z = lxfVar2.h;
                        UiText uiText = lxfVar2.d;
                        uiText.getClass();
                        ycg.b bVar = new ycg.b(uiText.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b)));
                        boolean zM3 = aVar2.M(function3);
                        Object objY3 = aVar2.y();
                        if (zM3) {
                            c0042a = c0042a2;
                        } else {
                            c0042a = c0042a2;
                            if (objY3 == c0042a) {
                            }
                            a.C0041a.C0042a c0042a3 = c0042a;
                            jr7.a(null, ijf0Var2, null, z, bVar, false, null, strA2, null, null, null, 0, null, "confirm_new_email_address", (Function1) objY3, aVar2, 0, 3072, 8037);
                            ty0.a(aVar2, new LayoutWeightElement(1.0f, true));
                            d dVarG = j.g(aVar3, 1.0f);
                            String strA3 = cb40.a(R.string.common_functions__confirm, new Object[0], aVar2);
                            uxs uxsVar = lxfVar2.e;
                            zM = aVar2.M(function3);
                            objY = aVar2.y();
                            if (zM || objY == c0042a3) {
                                objY = new Function0() { // from class: jxf
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function3.invoke(wwf.a.a);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY);
                            }
                            aza.a(dVarG, strA3, uxsVar, null, null, null, null, null, (Function0) objY, null, aVar2, 6, 760);
                            aVar2.s();
                        }
                        objY3 = new Function1() { // from class: ixf
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                ijf0 ijf0Var3 = (ijf0) obj4;
                                ijf0Var3.getClass();
                                function3.invoke(new wwf.c(ijf0Var3));
                                return Unit.a;
                            }
                        };
                        aVar2.r(objY3);
                        a.C0041a.C0042a c0042a4 = c0042a;
                        jr7.a(null, ijf0Var2, null, z, bVar, false, null, strA2, null, null, null, 0, null, "confirm_new_email_address", (Function1) objY3, aVar2, 0, 3072, 8037);
                        ty0.a(aVar2, new LayoutWeightElement(1.0f, true));
                        d dVarG2 = j.g(aVar3, 1.0f);
                        String strA4 = cb40.a(R.string.common_functions__confirm, new Object[0], aVar2);
                        uxs uxsVar2 = lxfVar2.e;
                        zM = aVar2.M(function3);
                        objY = aVar2.y();
                        if (zM) {
                            objY = new Function0() { // from class: jxf
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function3.invoke(wwf.a.a);
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY);
                        } else {
                            objY = new Function0() { // from class: jxf
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function3.invoke(wwf.a.a);
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY);
                        }
                        aza.a(dVarG2, strA4, uxsVar2, null, null, null, null, null, (Function0) objY, null, aVar2, 6, 760);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 24624, 13);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, function2, i) { // from class: gxf
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    kxf.b(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
