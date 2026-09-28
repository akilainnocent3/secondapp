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
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class nag {
    public static final void a(final int i, a aVar, d dVar, final List list) {
        final d dVar2;
        list.getClass();
        b bVarI = aVar.i(-1888480490);
        int i2 = i | 6 | (bVarI.M(list) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarK = j.k(aVar2, 0.0f, 420.0f, 1);
            boolean z = (i2 & 112) == 32;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new Function1() { // from class: jag
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        final List list2 = list;
                        szr.f(szrVar, list2.size(), null, new op8(1959752372, new iaj() { // from class: lag
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                int iIntValue = ((Integer) obj3).intValue();
                                a aVar3 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((gwr) obj2).getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= aVar3.d(iIntValue) ? 32 : 16;
                                }
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    oag oagVar = (oag) list2.get(iIntValue);
                                    nag.b(oagVar.a.g((Context) aVar3.O(AndroidCompositionLocals_androidKt.b)), oagVar.b, aVar3, 0);
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, true), 6);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            Function1 function1 = (Function1) objY;
            dVar2 = aVar2;
            aur.a(dVarK, null, null, false, null, null, null, false, null, function1, bVarI, 12582912, 382);
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar2, list) { // from class: kag
                public final /* synthetic */ d a;
                public final /* synthetic */ List b;

                {
                    this.a = dVar2;
                    this.b = list;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nag.a(qj40.a(1), (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(String str, String str2, a aVar, int i) {
        String str3;
        b bVar;
        b bVarI = aVar.i(-558824181);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarJ = h.j(d.a.b, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            imf0 imf0VarL = mla.l(R.style.B2_R, bVarI);
            long jA = c68.a(R.color.text_type1_secondary, bVarI);
            t9i t9iVar = t9i.E;
            lkf0.d(str, null, jA, null, 0L, null, t9iVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL, bVarI, (i2 & 14) | 1572864, 0, 131002);
            ty0.a(bVarI, new LayoutWeightElement(1.0f, true));
            str3 = str2;
            lkf0.d(str3, null, c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, t9iVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, ((i2 >> 3) & 14) | 1572864, 0, 131002);
            bVar = bVarI;
            bVar.X(true);
        } else {
            str3 = str2;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new mag(str, i, 0, str3);
        }
    }
}
