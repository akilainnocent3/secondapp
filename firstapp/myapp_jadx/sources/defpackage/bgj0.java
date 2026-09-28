package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bgj0 {
    public static final void a(final int i, a aVar, d dVar, String str, String str2) {
        final String str3;
        final String str4;
        b bVar;
        final d dVar2;
        str2.getClass();
        b bVarI = aVar.i(1402063520);
        int i2 = i | 6 | (bVarI.M(str) ? 32 : 16) | (bVarI.M(str2) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new zfj0();
                bVarI.r(objY);
            }
            d.a aVar2 = d.a.b;
            d dVarB = xa80.b(aVar2, false, (Function1) objY);
            i78 i78VarA = g78.a(new kw0.i(4.0f, true, new hw0()), ht.a.n, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            qyd0 qyd0Var = oib0.a;
            lkf0.d(str, null, ((lib0) bVarI.O(qyd0Var)).u, null, mla.m(37.0f, bVarI), null, t9i.E, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, ((i2 >> 3) & 14) | 1572864, 0, 262058);
            str3 = str;
            str4 = str2;
            lkf0.d(str4, g3w.h(aVar2, "double_or_nothing_won_amount_text"), ((lib0) bVarI.O(qyd0Var)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).a, bVarI, ((i2 >> 6) & 14) | 48, 0, 131064);
            bVar = bVarI;
            bVar.X(true);
            dVar2 = aVar2;
        } else {
            str3 = str;
            str4 = str2;
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar2, str3, str4) { // from class: agj0
                public final /* synthetic */ d a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;

                {
                    this.a = dVar2;
                    this.b = str3;
                    this.c = str4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bgj0.a(qj40.a(1), (a) obj, this.a, this.b, this.c);
                    return Unit.a;
                }
            };
        }
    }
}
