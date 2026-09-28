package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
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

/* JADX INFO: loaded from: classes5.dex */
public final class ryn {
    public static final void a(syn synVar, final Function2<? super jzn, ? super String, Unit> function2, a aVar, final int i) {
        final Function2<? super jzn, ? super String, Unit> function3;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        final syn synVar2 = synVar;
        function2.getClass();
        b bVarI = aVar.i(-175736910);
        int i2 = i | (bVarI.M(synVar2) ? 4 : 2) | (bVarI.A(function2) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar3 = d.a.b;
            d dVarE = j.e(aVar3, 1.0f);
            kw0.k kVar = kw0.c;
            n54.a aVar4 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar4, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            lkf0.d(synVar2.b, h.g(aVar3, 8.0f, 4.0f), c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.C1_R, bVarI), bVarI, 48, 0, 131064);
            bVarI = bVarI;
            i78 i78VarA2 = g78.a(kVar, aVar4, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, aVar3);
            bVarI.D();
            if (bVarI.S) {
                aVar2 = aVar5;
                bVarI.F(aVar2);
            } else {
                aVar2 = aVar5;
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                c1350a = c1350a2;
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                c1350a = c1350a2;
            }
            hlh0.a(bVarI, dVarC2, cVar);
            d dVarG = h.g(aVar3, 8.0f, 8.0f);
            d160 d160VarA = b160.a(new kw0.i(2.0f, true, new hw0()), ht.a.j, bVarI, 6);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            synVar2 = synVar;
            qcn<syn.a> qcnVar = synVar2.c;
            bVarI.N(-1343444142);
            int size = qcnVar.size();
            for (int i3 = 0; i3 < size; i3++) {
                final syn.a aVar6 = qcnVar.get(i3);
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                qgy qgyVar = aVar6.b;
                boolean zA = ((i2 & 112) == 32) | ((i2 & 14) == 4) | bVarI.A(aVar6);
                Object objY = bVarI.y();
                if (zA || objY == a.C0041a.a) {
                    objY = new Function0() { // from class: pyn
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function2.invoke(synVar2.d, aVar6.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                pgy.a(layoutWeightElement, qgyVar, (Function0) objY, bVarI, 0);
            }
            function3 = function2;
            bVarI.X(false);
            bVarI.X(true);
            ute.b(null, 0.0f, c68.a(R.color.border_primary, bVarI), bVarI, 0, 3);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            function3 = function2;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function3, i) { // from class: qyn
                public final /* synthetic */ Function2 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ryn.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
