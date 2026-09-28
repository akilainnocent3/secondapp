package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.feature.loyalty.impl.challenge.domain.model.ChallengeType;
import com.sportybet.feature.loyalty.impl.challenge.presentation.model.ChallengeCardStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class y17 {
    public static final void a(final Function0<Unit> function0, final Function1<? super String, Unit> function1, final Function0<Unit> function2, final Function0<Unit> function3, a aVar, final int i) {
        phx phxVar;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        b bVarI = aVar.i(-1202981375);
        int i2 = i | (bVarI.A(function0) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128) | (bVarI.A(function3) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            final phx phxVarC = mr10.c(new vkx[0], bVarI);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new s17();
                bVarI.r(objY);
            }
            d dVarB = xa80.b(d.a.b, false, (Function1) objY);
            n07 n07Var = n07.INSTANCE;
            boolean zA = ((i2 & 14) == 4) | bVarI.A(phxVarC) | ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                Function1 function4 = new Function1() { // from class: t17
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ghx ghxVar = (ghx) obj;
                        ghxVar.getClass();
                        final phx phxVar2 = phxVarC;
                        final Function0 function5 = function0;
                        final Function0 function6 = function3;
                        final Function1 function7 = function1;
                        op8 op8Var = new op8(-788338238, new iaj() { // from class: v17
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                final phx phxVar3 = phxVar2;
                                boolean zA2 = aVar2.A(phxVar3);
                                Object objY3 = aVar2.y();
                                if (zA2 || objY3 == a.C0041a.a) {
                                    objY3 = new naj() { // from class: x17
                                        @Override // defpackage.naj
                                        public final Object e(Long l, Object obj6, Integer num, Long l2, Long l3, Integer num2, Object obj7, Object obj8, Integer num3) {
                                            long jLongValue = l.longValue();
                                            String str = (String) obj6;
                                            int iIntValue = num.intValue();
                                            long jLongValue2 = l2.longValue();
                                            long jLongValue3 = l3.longValue();
                                            int iIntValue2 = num2.intValue();
                                            ChallengeCardStatus challengeCardStatus = (ChallengeCardStatus) obj7;
                                            ChallengeType challengeType = (ChallengeType) obj8;
                                            int iIntValue3 = num3.intValue();
                                            str.getClass();
                                            challengeCardStatus.getClass();
                                            challengeType.getClass();
                                            yfx.h(phxVar3, new j07(jLongValue, str, iIntValue, jLongValue2, jLongValue3, iIntValue2, challengeCardStatus, challengeType, iIntValue3), null, 6);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY3);
                                }
                                l17.e(null, function5, (naj) objY3, function7, function6, null, aVar2, 0);
                                return Unit.a;
                            }
                        }, true);
                        o2g o2gVar = o2g.a;
                        o2gVar.getClass();
                        m2g m2gVar = m2g.a;
                        hhx.a(ghxVar, jq40.a(n07.class), o2gVar, m2gVar, null, null, null, null, op8Var);
                        final Function0 function8 = function2;
                        hhx.a(ghxVar, jq40.a(j07.class), o2gVar, m2gVar, null, null, null, null, new op8(-1418091207, new iaj() { // from class: w17
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                phx phxVar3 = phxVar2;
                                boolean zA2 = aVar2.A(phxVar3);
                                Object objY3 = aVar2.y();
                                if (zA2 || objY3 == a.C0041a.a) {
                                    objY3 = new k02(phxVar3, 1);
                                    aVar2.r(objY3);
                                }
                                a2s.a(null, (Function0) objY3, function8, aVar2, 0);
                                return Unit.a;
                            }
                        }, true));
                        return Unit.a;
                    }
                };
                phxVar = phxVarC;
                bVarI.r(function4);
                objY2 = function4;
            } else {
                phxVar = phxVarC;
            }
            uix.b(phxVar, n07Var, dVarB, null, null, null, null, null, null, (Function1) objY2, bVarI, 48, 2040);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, function2, function3, i) { // from class: u17
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    y17.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
