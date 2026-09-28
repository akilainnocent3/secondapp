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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j4i0 {
    public static final void a(final String str, String str2, String str3, a aVar, final int i) {
        final String str4;
        String str5;
        final String str6 = str2;
        str3.getClass();
        b bVarI = aVar.i(-1226889453);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str6) ? 32 : 16) | (bVarI.M(str3) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            qyd0 qyd0Var = oib0.a;
            d dVarJ = h.j(h.h(androidx.compose.foundation.a.b(dVarG, ((lib0) bVarI.O(qyd0Var)).i0, zk40.a), 16.0f, 0.0f, 2), 0.0f, 12.0f, 0.0f, 16.0f, 5);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            qyd0 qyd0Var2 = kjb0.a;
            lkf0.d(str, null, ((lib0) bVarI.O(qyd0Var)).c, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).f, bVarI, i2 & 14, 0, 131066);
            ty0.a(bVarI, j.i(aVar2, 8.0f));
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            h6n.b(erz.a(R.drawable.clock, 0, bVarI), null, h.j(j.r(aVar2, 16.0f), 0.0f, 0.0f, 2.0f, 0.0f, 11), ((lib0) bVarI.O(qyd0Var)).P, bVarI, 432, 0);
            str4 = str3;
            lkf0.d(str4, null, ((lib0) bVarI.O(qyd0Var)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).o, bVarI, (i2 >> 6) & 14, 0, 131066);
            ty0.a(bVarI, j.w(aVar2, 8.0f));
            ute.c(j.i(aVar2, 16.0f), 1.0f, ((lib0) bVarI.O(qyd0Var)).B, bVarI, 54, 0);
            ty0.a(bVarI, j.w(aVar2, 8.0f));
            str6 = str2;
            if (str6 == null) {
                bVarI.N(-1540337155);
                String strA = cb40.a(R.string.common_sports__football, new Object[0], bVarI);
                bVarI.X(false);
                str5 = strA;
            } else {
                bVarI.N(-1540337558);
                bVarI.X(false);
                str5 = str6;
            }
            lkf0.d(str5, null, ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).n, bVarI, 0, 0, 131066);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
        } else {
            str4 = str3;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str6, str4, i) { // from class: i4i0
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    j4i0.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
