package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class ubx {
    public static final void a(final Function0 function0, final Function0 function1, final Function0 function2, a aVar, final int i) {
        b bVarI = aVar.i(-757967708);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            final wk0.a aVarC = wk0.c(cb40.a(R.string.component_name_binding_dialog__tip_2, new Object[0], bVarI), new String[]{"^"}, imf0.b(mla.l(R.style.B1_R, bVarI), c68.a(R.color.brand_secondary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214).a, imf0.b(mla.l(R.style.B1_R, bVarI), c68.a(R.color.text_type1_primary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214).a);
            final wk0.a aVarC2 = wk0.c(cb40.a(R.string.component_name_binding_dialog__tip_3, new Object[0], bVarI), new String[]{"^"}, imf0.b(mla.l(R.style.B1_R, bVarI), c68.a(R.color.brand_secondary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214).a, imf0.b(mla.l(R.style.B1_R, bVarI), c68.a(R.color.text_type1_primary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214).a);
            u60.a(function2, null, pp8.b(-1933647763, new Function2() { // from class: rbx
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarG = j.g(d.a.b, 1.0f);
                        fg6 fg6VarB = gg6.b(c68.a(R.color.background_general_primary, aVar2), 0L, aVar2, 24576, 14);
                        i060 i060VarC = j060.c(0.0f);
                        final wk0.a aVar3 = aVarC2;
                        final wk0.a aVar4 = aVarC;
                        final Function0 function3 = function0;
                        final Function0 function4 = function1;
                        rg6.a(dVarG, i060VarC, fg6VarB, null, null, pp8.b(26572603, new gaj() { // from class: tbx
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                a aVar5 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((j78) obj3).getClass();
                                if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    d.a aVar6 = d.a.b;
                                    d dVarG2 = h.g(j.g(aVar6, 1.0f), 30.0f, 40.0f);
                                    i78 i78VarA = g78.a(kw0.e, ht.a.n, aVar5, 54);
                                    int iHashCode = Long.hashCode(aVar5.m());
                                    ne00 ne00VarO = aVar5.o();
                                    d dVarC = c.c(aVar5, dVarG2);
                                    yka.k.getClass();
                                    tsr.a aVar7 = yka.a.b;
                                    if (aVar5.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar5.D();
                                    if (aVar5.g()) {
                                        aVar5.F(aVar7);
                                    } else {
                                        aVar5.p();
                                    }
                                    hlh0.a(aVar5, i78VarA, yka.a.f);
                                    hlh0.a(aVar5, ne00VarO, yka.a.e);
                                    yka.a.C1350a c1350a = yka.a.g;
                                    if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar5, iHashCode, c1350a);
                                    }
                                    hlh0.a(aVar5, dVarC, yka.a.d);
                                    h9n.a(erz.a(R.drawable.withdraw_enabled, 0, aVar5), null, null, null, null, 0.0f, null, aVar5, 48, 124);
                                    lkf0.d(cb40.a(R.string.page_payment__name_binding__GH, new Object[0], aVar5), h.j(aVar6, 0.0f, 16.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, aVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, aVar5), aVar5, 48, 0, 131064);
                                    nj5.b(6, 4, c68.a(R.color.brand_secondary, aVar5), aVar3.a, aVar5, h.j(j.g(aVar6, 1.0f), 0.0f, 20.0f, 0.0f, 0.0f, 13), null);
                                    nj5.b(6, 6, 0L, aVar4.a, aVar5, h.j(j.g(aVar6, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), null);
                                    xya.b(j.i(h.j(j.g(aVar6, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13), 40.0f), false, null, null, null, 0.0f, null, function3, dg9.a, aVar5, 100663302, WebSocketProtocol.PAYLOAD_SHORT);
                                    vuc0.a(j.i(h.j(j.g(aVar6, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13), 40.0f), false, null, null, function4, null, null, null, null, dg9.b, aVar5, 805306374, 494);
                                    aVar5.s();
                                } else {
                                    aVar5.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 196614, 24);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 6) & 14) | 384, 2);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, function2, i) { // from class: sbx
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ubx.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
