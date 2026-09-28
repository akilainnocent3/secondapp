package defpackage;

import android.content.Context;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class zx3 {
    public static final void a(d dVar, final ay3 ay3Var, final Function0 function0, final Function0 function1, final Function0 function2, a aVar, final int i) {
        b bVar;
        final d dVar2;
        int i2;
        z45 cVar;
        ay3Var.getClass();
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(420549849);
        int i3 = i | 6 | (bVarI.M(ay3Var) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024) | (bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            UiText uiText = ay3Var.a;
            UiText uiText2 = ay3Var.d;
            long j = ((lib0) bVarI.O(oib0.a)).a;
            iyf0 iyf0Var = iyf0.b;
            int i4 = i3 & 896;
            float f = ((cjb0) bVarI.O(ejb0.a)).f;
            m2g m2gVar = m2g.a;
            zs7 zs7Var = new zs7(f, m2gVar, function0);
            if (ay3Var.e == by3.c) {
                bVarI.N(181539586);
                uxs uxsVar = uxs.ENABLE;
                uiText2.getClass();
                m2gVar.getClass();
                i2 = i4;
                cVar = new z45.d(new w45.c("bottom_sheet_primary_button", uiText2, uxsVar, m2gVar, function1), new w45.b(pp8.b(-1555980328, new gaj() { // from class: wx3
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((d) obj).getClass();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            ddd0.a(j.g(d.a.b, 1.0f), false, null, null, null, false, null, null, function2, ns8.a, aVar2, 805306374, 254);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI)));
                bVarI.X(false);
            } else {
                i2 = i4;
                bVarI.N(182298125);
                bVarI.X(false);
                uxs uxsVar2 = uxs.ENABLE;
                uiText2.getClass();
                m2gVar.getClass();
                cVar = new z45.c(new w45.c("bottom_sheet_primary_button", uiText2, uxsVar2, m2gVar, function1));
            }
            d.a aVar2 = d.a.b;
            bVar = bVarI;
            jib0.d(aVar2, uiText, null, 0L, 0L, j, iyf0Var, zs7Var, cVar, null, null, function0, function0, null, null, null, pp8.b(1227340283, new gaj() { // from class: xx3
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d.a aVar4 = d.a.b;
                        d dVarG = j.g(aVar4, 1.0f);
                        i78 i78VarA = g78.a(new kw0.i(((cjb0) aVar3.O(ejb0.a)).f, true, new hw0()), ht.a.n, aVar3, 48);
                        int iHashCode = Long.hashCode(aVar3.m());
                        ne00 ne00VarO = aVar3.o();
                        d dVarC = c.c(aVar3, dVarG);
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
                        ay3 ay3Var2 = ay3Var;
                        UiText uiText3 = ay3Var2.b;
                        uiText3.getClass();
                        mw90.a(uiText3.g((Context) aVar3.O(AndroidCompositionLocals_androidKt.b)), "Loyalty Bottom Sheet Image", j.g(aVar4, 1.0f), null, null, d0b.a.d, null, aVar3, 1573296, 1976);
                        gnm.a(j.g(aVar4, 1.0f), kotlin.text.c.p(kotlin.text.c.p(cb40.a(ay3Var2.c, new Object[0], aVar3), "\\n", "<br>", false), "\n", "<br>", false), R.color.text_primary, R.style.B1_R, 1, false, aVar3, 221190, 0);
                        aVar3.s();
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 1572870, ((i3 >> 3) & 112) | 1572864 | i2, 58908);
            dVar2 = aVar2;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(ay3Var, function0, function1, function2, i) { // from class: yx3
                public final /* synthetic */ ay3 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    zx3.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
