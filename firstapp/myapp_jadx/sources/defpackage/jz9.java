package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jz9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        final tmz tmzVar = (tmz) obj;
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        tmzVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar.M(tmzVar) ? 4 : 2;
        }
        if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            a1c.a(6, pp8.b(-1649992849, new Function2() { // from class: iz9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    a aVar2 = (a) obj4;
                    int iIntValue2 = ((Integer) obj5).intValue();
                    if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                        d.a aVar3 = d.a.b;
                        d dVarG = h.g(op70.c(h.e(j.e(aVar3, 1.0f), tmzVar), op70.a(aVar2), 14), 20.0f, 20.0f);
                        i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarG);
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
                        lkf0.d(cb40.a(R.string.unique_codes__about_more_about_unique_code_title, new Object[0], aVar2), j.g(aVar3, 1.0f), c68.a(R.color.text_type2_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, aVar2), aVar2, 48, 0, 130040);
                        ty0.a(aVar2, j.i(aVar3, 24.0f));
                        aVar2.N(856486304);
                        int i = 0;
                        for (Object obj6 : neh0.d) {
                            int i2 = i + 1;
                            if (i < 0) {
                                b.q();
                                throw null;
                            }
                            weh0.a(cb40.a(((Number) obj6).intValue(), new Object[0], aVar2), aVar2, 0);
                            if (i != b.j(neh0.d)) {
                                aVar2.N(-1399758409);
                                ty0.a(aVar2, j.i(aVar3, 16.0f));
                                aVar2.H();
                            } else {
                                aVar2.N(-1399683451);
                                aVar2.H();
                            }
                            i = i2;
                        }
                        aVar2.H();
                        ty0.a(aVar2, j.i(aVar3, 24.0f));
                        ute.b(null, 0.0f, c68.a(R.color.border_secondary, aVar2), aVar2, 0, 3);
                        lkf0.d(cb40.a(R.string.unique_codes__about_maximize_your_credits_title, new Object[0], aVar2), wtc.b(aVar3, 24.0f, aVar2, aVar3, 1.0f), c68.a(R.color.text_type2_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, aVar2), aVar2, 48, 0, 130040);
                        ty0.a(aVar2, j.i(aVar3, 24.0f));
                        aVar2.N(856517634);
                        int i3 = 0;
                        for (Object obj7 : neh0.e) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                b.q();
                                throw null;
                            }
                            weh0.a(cb40.a(((Number) obj7).intValue(), new Object[0], aVar2), aVar2, 0);
                            if (i3 != b.j(neh0.e)) {
                                aVar2.N(-1289687712);
                                ty0.a(aVar2, j.i(aVar3, 16.0f));
                                aVar2.H();
                            } else {
                                aVar2.N(-1289612754);
                                aVar2.H();
                            }
                            i3 = i4;
                        }
                        aVar2.H();
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, aVar), aVar);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
