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
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final class nu3 {
    public static final void a(final ou3 ou3Var, a aVar, final int i) {
        b bVarI = aVar.i(-69759483);
        int i2 = (bVarI.M(ou3Var) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            qcn<ou3.a> qcnVar = ou3Var.c;
            int i3 = ou3Var.b;
            String str = ou3Var.a;
            ou3.a aVar2 = (ou3.a) CollectionsKt.p0(qcnVar);
            if (aVar2 != null) {
                bVarI.N(559621223);
                c(aVar2, str, i3, bVarI, 0);
                bVarI.X(false);
            } else {
                bVarI.N(559712394);
                b(qcnVar, str, i3, bVarI, 0);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: ku3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    nu3.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(qcn<ou3.a> qcnVar, String str, int i, a aVar, int i2) {
        String str2;
        d.a aVar2;
        boolean z;
        b bVarI = aVar.i(1791887735);
        int i3 = i2 | (bVarI.M(qcnVar) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.d(i) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            d.a aVar3 = d.a.b;
            d dVarG = j.g(aVar3, 1.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            LayoutWeightElement layoutWeightElementA = yy.a(bVarI, dVarC, cVar, 1.0f, true);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, layoutWeightElementA);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            bVarI.N(-600124291);
            for (ou3.a aVar5 : qcnVar) {
                d dVarG2 = j.g(aVar3, 1.0f);
                d160 d160VarA2 = b160.a(new kw0.i(4.0f, true, new hw0()), ht.a.k, bVarI, 54);
                int iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = c.c(bVarI, dVarG2);
                yka.k.getClass();
                tsr.a aVar6 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar6);
                } else {
                    bVarI.p();
                }
                yka.a.b bVar2 = yka.a.f;
                hlh0.a(bVarI, d160VarA2, bVar2);
                yka.a.d dVar2 = yka.a.e;
                hlh0.a(bVarI, ne00VarS3, dVar2);
                yka.a.C1350a c1350a2 = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
                }
                yka.a.c cVar2 = yka.a.d;
                hlh0.a(bVarI, dVarC3, cVar2);
                UiText uiText = aVar5.a;
                if (uiText == null) {
                    bVarI.N(2112664879);
                    bVarI.X(false);
                    aVar2 = aVar3;
                    z = true;
                } else {
                    bVarI.N(2112664880);
                    d dVarA = ls7.a(j.t(aVar3, 24.0f, 12.0f), j060.c(24.0f));
                    qyd0 qyd0Var = oib0.a;
                    d dVarB = androidx.compose.foundation.a.b(dVarA, ((lib0) bVarI.O(qyd0Var)).r0, zk40.a);
                    aiv aivVarC = g75.c(ht.a.e, false);
                    int iHashCode4 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS4 = bVarI.S();
                    d dVarC4 = c.c(bVarI, dVarB);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar6);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC, bVar2);
                    hlh0.a(bVarI, ne00VarS4, dVar2);
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                        n30.a(iHashCode4, bVarI, iHashCode4, c1350a2);
                    }
                    hlh0.a(bVarI, dVarC4, cVar2);
                    b bVar3 = bVarI;
                    aVar2 = aVar3;
                    z = true;
                    lkf0.d(uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), null, ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).q, bVar3, 0, 0, 131066);
                    bVarI = bVar3;
                    bVarI.X(true);
                    Unit unit = Unit.a;
                    bVarI.X(false);
                }
                mw90.a(aVar5.b, null, j.r(h.f(aVar2, 3.0f), 18.0f), null, null, null, null, bVarI, 432, 2040);
                b bVar4 = bVarI;
                lkf0.d(aVar5.c, null, ((lib0) bVarI.O(oib0.a)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).f, bVar4, 0, 0, 131066);
                bVarI = bVar4;
                bVarI.X(z);
                aVar3 = aVar2;
            }
            bVarI.X(false);
            bVarI.X(true);
            str2 = str;
            du3.a(i, (i3 >> 3) & WebSocketProtocol.PAYLOAD_SHORT, bVarI, str2);
            bVarI.X(true);
        } else {
            str2 = str;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new lu3(qcnVar, str2, i, i2);
        }
    }

    public static final void c(final ou3.a aVar, final String str, final int i, a aVar2, final int i2) {
        b bVarI = aVar2.i(1074722823);
        int i3 = i2 | (bVarI.M(aVar) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.d(i) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            d.a aVar3 = d.a.b;
            d dVarG = j.g(aVar3, 1.0f);
            kw0.j jVar = kw0.a;
            n54.b bVar = ht.a.k;
            d160 d160VarA = b160.a(jVar, bVar, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            LayoutWeightElement layoutWeightElementA = yy.a(bVarI, dVarC, cVar, 1.0f, true);
            d160 d160VarA2 = b160.a(new kw0.i(4.0f, true, new hw0()), bVar, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, layoutWeightElementA);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            mw90.a(aVar.b, null, j.r(h.f(aVar3, 3.0f), 18.0f), null, null, null, null, bVarI, 432, 2040);
            lkf0.d(aVar.c, null, ((lib0) bVarI.O(oib0.a)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).f, bVarI, 0, 0, 131066);
            bVarI = bVarI;
            bVarI.X(true);
            du3.a(i, (i3 >> 3) & WebSocketProtocol.PAYLOAD_SHORT, bVarI, str);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, i, i2) { // from class: mu3
                public final /* synthetic */ String b;
                public final /* synthetic */ int c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    nu3.c(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
