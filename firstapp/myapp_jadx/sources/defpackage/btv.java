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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class btv {
    public static final void a(final dtv dtvVar, final etv etvVar, v0u v0uVar, a aVar, final int i) {
        int i2;
        final v0u v0uVar2;
        b bVar;
        float f;
        dtvVar.getClass();
        ctv ctvVar = dtvVar.c;
        v0uVar.getClass();
        b bVarI = aVar.i(692455253);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(dtvVar) : bVarI.A(dtvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.d(etvVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(v0uVar) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            bVar = bVarI;
            d dVarA = g3w.a(d.a.b, etvVar == etv.b, new ou8(1), null, bVar, 6, 4);
            int iOrdinal = etvVar.ordinal();
            if (iOrdinal == 0) {
                bVar.N(-270418367);
                f = ((cjb0) bVar.O(ejb0.a)).c;
                bVar.X(false);
            } else {
                if (iOrdinal != 1) {
                    throw igf0.a(bVar, -270420515, false);
                }
                bVar.N(-270416096);
                f = ((cjb0) bVar.O(ejb0.a)).d;
                bVar.X(false);
            }
            i78 i78VarA = g78.a(new kw0.i(f, true, new hw0()), ht.a.m, bVar, 0);
            int iHashCode = Long.hashCode(bVar.T);
            ne00 ne00VarS = bVar.S();
            d dVarC = c.c(bVar, dVarA);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVar.D();
            if (bVar.S) {
                bVar.F(aVar2);
            } else {
                bVar.p();
            }
            hlh0.a(bVar, i78VarA, yka.a.f);
            hlh0.a(bVar, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVar, iHashCode, c1350a);
            }
            hlh0.a(bVar, dVarC, yka.a.d);
            UiText uiText = dtvVar.a;
            uiText.getClass();
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            d(uiText.g((Context) bVar.O(qyd0Var)), etvVar, bVar, i2 & 112);
            v0uVar2 = v0uVar;
            c(dtvVar.b, ctvVar, v0uVar2, null, bVar, i2 & 896);
            UiText uiText2 = dtvVar.d;
            if (uiText2 == null) {
                bVar.N(1016664534);
                bVar.X(false);
            } else {
                bVar.N(1016664535);
                b(uiText2.g((Context) bVar.O(qyd0Var)), ctvVar, bVar, 0);
                bVar.X(false);
            }
            bVar.X(true);
        } else {
            v0uVar2 = v0uVar;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xsv
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    btv.a(dtvVar, etvVar, v0uVar2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(String str, ctv ctvVar, a aVar, int i) {
        b bVar;
        long j;
        b bVarI = aVar.i(-1043189558);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.d(ctvVar.ordinal()) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            int iOrdinal = ctvVar.ordinal();
            if (iOrdinal == 1) {
                bVarI.N(-278970101);
                j = ((lib0) bVarI.O(oib0.a)).k;
                bVarI.X(false);
            } else if (iOrdinal == 2 || iOrdinal == 3) {
                bVarI.N(-278972880);
                j = ((ast) bVarI.O(cst.e)).c;
                bVarI.X(false);
            } else {
                bVarI.N(-278968499);
                j = ((lib0) bVarI.O(oib0.a)).b;
                bVarI.X(false);
            }
            bVar = bVarI;
            lkf0.d(str, g3w.h(d.a.b, "mission_progress_alert_text"), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).q, bVar, (i2 & 14) | 48, 0, 131064);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new zsv(ctvVar, str, i, 0);
        }
    }

    public static final void c(final float f, final ctv ctvVar, final v0u v0uVar, d dVar, a aVar, final int i) {
        int i2;
        final d dVar2;
        long j;
        b bVarI = aVar.i(307943076);
        if ((i & 6) == 0) {
            i2 = (bVarI.c(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.d(ctvVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(v0uVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            int iOrdinal = ctvVar.ordinal();
            if (iOrdinal == 0) {
                bVarI.N(-1699684937);
                bVarI.X(false);
                j = v0uVar.a;
            } else if (iOrdinal == 1) {
                bVarI.N(-1699682407);
                j = ((lib0) bVarI.O(oib0.a)).k;
                bVarI.X(false);
            } else if (iOrdinal == 2 || iOrdinal == 3) {
                bVarI.N(-1699678210);
                j = ((ast) bVarI.O(cst.e)).c;
                bVarI.X(false);
            } else {
                if (iOrdinal != 4) {
                    throw igf0.a(bVarI, -1699686713, false);
                }
                bVarI.N(-1699675559);
                j = ((lib0) bVarI.O(oib0.a)).k;
                bVarI.X(false);
            }
            dVar2 = d.a.b;
            d dVarH = g3w.h(j.i(androidx.compose.foundation.a.b(j.g(dVar2, 1.0f), ((ast) bVarI.O(cst.e)).e, j060.c(4.0f)), 4.0f), "mission_progress_bar");
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            g75.a(androidx.compose.foundation.a.b(j.g(j.i(dVar2, 4.0f), f), j, j060.c(4.0f)), bVarI, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ysv
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    btv.c(f, ctvVar, v0uVar, dVar2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(String str, final etv etvVar, a aVar, final int i) {
        int i2;
        b bVar;
        qyd0 qyd0Var;
        long j;
        final String str2 = str;
        b bVarI = aVar.i(-162162811);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(str2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.d(etvVar.ordinal()) ? 32 : 16;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            d dVarH = g3w.h(j.g(d.a.b, 1.0f), "mission_progress_header_text");
            d160 d160VarA = b160.a(kw0.g, ht.a.j, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
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
            String strA = cb40.a(R.string.page_loyalty__progress, new Object[0], bVarI);
            qyd0 qyd0Var2 = kjb0.a;
            imf0 imf0Var = ((ijb0) bVarI.O(qyd0Var2)).q;
            int iOrdinal = etvVar.ordinal();
            if (iOrdinal == 0) {
                bVarI.N(686431125);
                qyd0Var = oib0.a;
                j = ((lib0) bVarI.O(qyd0Var)).q;
                bVarI.X(false);
            } else {
                if (iOrdinal != 1) {
                    throw igf0.a(bVarI, 686428564, false);
                }
                bVarI.N(686434099);
                qyd0Var = oib0.a;
                j = ((lib0) bVarI.O(qyd0Var)).o;
                bVarI.X(false);
            }
            lkf0.d(strA, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 131066);
            str2 = str;
            lkf0.d(str2, null, ((lib0) bVarI.O(qyd0Var)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).q, bVarI, i3 & 14, 0, 131066);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: atv
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    btv.d(str2, etvVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
