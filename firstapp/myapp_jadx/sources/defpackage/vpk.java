package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportybet.feature.gift.gift.presentation.h;
import com.sportybet.feature.gift.gift.presentation.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class vpk {
    public static final /* synthetic */ int a = 0;

    public static final void a(final k kVar, final Function0 function0, final Function1 function1, final Function1 function2, phx phxVar, a aVar, final int i) {
        final phx phxVar2;
        phx phxVarC;
        int i2;
        phx phxVar3;
        kVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        b bVarI = aVar.i(635537538);
        int i3 = i | (bVarI.A(kVar) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024) | 8192;
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                phxVarC = mr10.c(new vkx[0], bVarI);
                i2 = i3 & (-57345);
            } else {
                bVarI.G();
                i2 = i3 & (-57345);
                phxVarC = phxVar;
            }
            bVarI.Y();
            ifx ifxVarH = phxVarC.b.h();
            int i4 = i2 & 14;
            boolean zA = bVarI.A(ifxVarH) | (i4 == 4 || bVarI.A(kVar));
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new upk(ifxVarH, kVar, null);
                bVarI.r(objY);
            }
            xvf.e(bVarI, ifxVarH, (Function2) objY);
            kok kokVar = kok.INSTANCE;
            boolean zA2 = (i4 == 4 || bVarI.A(kVar)) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | bVarI.A(phxVarC) | ((i2 & 7168) == 2048);
            Object objY2 = bVarI.y();
            if (zA2 || objY2 == c0042a) {
                final phx phxVar4 = phxVarC;
                Function1 function3 = new Function1() { // from class: qpk
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ghx ghxVar = (ghx) obj;
                        ghxVar.getClass();
                        final k kVar2 = kVar;
                        final Function0 function4 = function0;
                        final Function1 function5 = function1;
                        final phx phxVar5 = phxVar4;
                        op8 op8Var = new op8(-1567844191, new iaj() { // from class: spk
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                Function1 function6 = function5;
                                boolean zM = aVar2.M(function6);
                                Object objY3 = aVar2.y();
                                a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                if (zM || objY3 == c0042a2) {
                                    objY3 = new ydb(function6, 1);
                                    aVar2.r(objY3);
                                }
                                Function0 function7 = (Function0) objY3;
                                phx phxVar6 = phxVar5;
                                boolean zA3 = aVar2.A(phxVar6);
                                Object objY4 = aVar2.y();
                                if (zA3 || objY4 == c0042a2) {
                                    objY4 = new zdb(phxVar6, 2);
                                    aVar2.r(objY4);
                                }
                                h.a(kVar2, function4, function7, (Function0) objY4, aVar2, 8);
                                return Unit.a;
                            }
                        }, true);
                        o2g o2gVar = o2g.a;
                        o2gVar.getClass();
                        m2g m2gVar = m2g.a;
                        hhx.a(ghxVar, jq40.a(kok.class), o2gVar, m2gVar, null, null, null, null, op8Var);
                        final Function1 function6 = function2;
                        hhx.a(ghxVar, jq40.a(ap40.class), o2gVar, m2gVar, null, null, null, null, new op8(-618327478, new iaj() { // from class: tpk
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                phx phxVar6 = phxVar5;
                                boolean zA3 = aVar2.A(phxVar6);
                                Object objY3 = aVar2.y();
                                int i5 = 1;
                                a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                if (zA3 || objY3 == c0042a2) {
                                    objY3 = new vdb(phxVar6, i5);
                                    aVar2.r(objY3);
                                }
                                Function0 function7 = (Function0) objY3;
                                Function1 function8 = function5;
                                boolean zM = aVar2.M(function8);
                                Object objY4 = aVar2.y();
                                if (zM || objY4 == c0042a2) {
                                    objY4 = new wdb(function8, 1);
                                    aVar2.r(objY4);
                                }
                                Function0 function9 = (Function0) objY4;
                                boolean zA4 = aVar2.A(phxVar6);
                                Object objY5 = aVar2.y();
                                if (zA4 || objY5 == c0042a2) {
                                    objY5 = new xdb(phxVar6, i5);
                                    aVar2.r(objY5);
                                }
                                gp40.a(function7, function9, (Function0) objY5, function6, null, aVar2, 0);
                                return Unit.a;
                            }
                        }, true));
                        return Unit.a;
                    }
                };
                phxVar3 = phxVar4;
                bVarI.r(function3);
                objY2 = function3;
            } else {
                phxVar3 = phxVarC;
            }
            uix.b(phxVar3, kokVar, null, null, null, null, null, null, null, (Function1) objY2, bVarI, 48, 2044);
            phxVar2 = phxVar3;
        } else {
            bVarI.G();
            phxVar2 = phxVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, function2, phxVar2, i) { // from class: rpk
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ phx e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    vpk.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
