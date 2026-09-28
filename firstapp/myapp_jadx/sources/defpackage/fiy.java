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
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fiy {
    public static final void a(final qcn<miy> qcnVar, final Function2<? super String, ? super ht7<Float>, Unit> function2, a aVar, final int i) {
        long j;
        char c;
        imf0 imf0Var;
        qcnVar.getClass();
        function2.getClass();
        b bVarI = aVar.i(-1292096559);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? bVarI.M(qcnVar) : bVarI.A(qcnVar) ? 4 : 2) | i : i;
        int i3 = 32;
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function2) ? 32 : 16;
        }
        boolean z = false;
        boolean z2 = true;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            long j2 = ((lib0) bVarI.O(oib0.a)).i0;
            zk40.a aVar2 = zk40.a;
            d.a aVar3 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(aVar3, j2, aVar2);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
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
            bVarI.N(665475895);
            for (final miy miyVar : qcnVar) {
                qyd0 qyd0Var = oib0.a;
                ute.b(null, 1.0f, ((lib0) bVarI.O(qyd0Var)).A, bVarI, 48, 1);
                lhy lhyVar = miyVar.c;
                d dVarG = j.g(aVar3, 1.0f);
                boolean z3 = lhyVar != lhy.a ? z2 : z;
                boolean zA = ((i2 & 112) == i3 ? z2 : z) | bVarI.A(miyVar);
                Object objY = bVarI.y();
                if (zA || objY == a.C0041a.a) {
                    objY = new Function0() { // from class: diy
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            miy miyVar2 = miyVar;
                            function2.invoke(miyVar2.a, miyVar2.b);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                d dVarI = h.i(androidx.compose.foundation.d.d(dVarG, z3, null, null, (Function0) objY, 14), 16.0f, 11.0f, 16.0f, 12.0f);
                aiv aivVarC = g75.c(ht.a.a, z);
                int iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarI);
                yka.k.getClass();
                tsr.a aVar5 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar5);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS2, yka.a.e);
                yka.a.C1350a c1350a2 = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                }
                hlh0.a(bVarI, dVarC2, yka.a.d);
                int iOrdinal = lhyVar.ordinal();
                if (iOrdinal == 0) {
                    bVarI.N(-968226356);
                    j = ((lib0) bVarI.O(qyd0Var)).e;
                    bVarI.X(z);
                } else if (iOrdinal == z2) {
                    bVarI.N(-968223513);
                    j = ((lib0) bVarI.O(qyd0Var)).a;
                    bVarI.X(z);
                } else {
                    if (iOrdinal != 2) {
                        throw igf0.a(bVarI, -968229070, z);
                    }
                    bVarI.N(-968220873);
                    j = ((lib0) bVarI.O(qyd0Var)).h;
                    bVarI.X(z);
                }
                long j3 = j;
                int iOrdinal2 = lhyVar.ordinal();
                if (iOrdinal2 == 0 || iOrdinal2 == z2) {
                    c = 2;
                    bVarI.N(-968213249);
                    imf0Var = ((ijb0) bVarI.O(kjb0.a)).k;
                    bVarI.X(z);
                } else {
                    c = 2;
                    if (iOrdinal2 != 2) {
                        throw igf0.a(bVarI, -968218143, z);
                    }
                    bVarI.N(-968210721);
                    imf0Var = ((ijb0) bVarI.O(kjb0.a)).j;
                    bVarI.X(z);
                }
                imf0 imf0Var2 = imf0Var;
                UiText uiText = miyVar.d;
                uiText.getClass();
                b bVar = bVarI;
                boolean z4 = z2;
                lkf0.d(uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), null, j3, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var2, bVar, 0, 0, 131066);
                bVarI = bVar;
                bVarI.X(z4);
                z2 = z4;
                i3 = 32;
                aVar3 = aVar3;
                z = false;
                i2 = i2;
            }
            bVarI.X(z);
            bVarI.X(z2);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: eiy
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    fiy.a(qcnVar, function2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
