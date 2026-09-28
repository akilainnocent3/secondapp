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
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class vrf {
    public static final void a(final uqf uqfVar, Function0 function0, final Function0 function1, a aVar, final int i) {
        final Function0 function2;
        b bVarI = aVar.i(1623563354);
        int i2 = (bVarI.M(uqfVar) ? 4 : 2) | i | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            function2 = function0;
            u60.a(function2, null, pp8.b(761196643, new Function2() { // from class: srf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarG = j.g(d.a.b, 1.0f);
                        fg6 fg6VarB = gg6.b(c68.a(R.color.background_general_primary, aVar2), 0L, aVar2, 24576, 14);
                        i060 i060VarC = j060.c(0.0f);
                        final uqf uqfVar2 = uqfVar;
                        final Function0 function3 = function1;
                        rg6.a(dVarG, i060VarC, fg6VarB, null, null, pp8.b(-1234579791, new gaj() { // from class: urf
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                a aVar3 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((j78) obj3).getClass();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    d.a aVar4 = d.a.b;
                                    d dVarI = h.i(j.g(aVar4, 1.0f), 30.0f, 36.0f, 30.0f, 32.0f);
                                    i78 i78VarA = g78.a(kw0.e, ht.a.n, aVar3, 54);
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
                                    uqf uqfVar3 = uqfVar2;
                                    h9n.a(erz.a(uqfVar3.a, 0, aVar3), null, null, null, null, 0.0f, null, aVar3, 48, 124);
                                    d dVarJ = h.j(aVar4, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                                    ResourceUiText resourceUiText = uqfVar3.b;
                                    qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
                                    lkf0.e(resourceUiText.a((Context) aVar3.O(qyd0Var)), dVarJ, c68.a(R.color.text_type1_primary, aVar3), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mla.l(R.style.H3_B, aVar3), aVar3, 48, 0, 262136);
                                    lkf0.e(uqfVar3.c.a((Context) aVar3.O(qyd0Var)), h.j(aVar4, 0.0f, 24.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, aVar3), 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, null, mla.l(R.style.B1_R, aVar3), aVar3, 48, 0, 261112);
                                    xya.b(j.i(h.j(j.g(aVar4, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13), 40.0f), false, null, null, null, 0.0f, null, function3, l09.a, aVar3, 100663302, WebSocketProtocol.PAYLOAD_SHORT);
                                    aVar3.s();
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 196614, 24);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 390, 2);
        } else {
            function2 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function2, function1, i) { // from class: trf
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(49);
                    vrf.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
