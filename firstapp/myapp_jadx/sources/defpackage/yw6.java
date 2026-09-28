package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.ChallengeAnnouncementBottomSheetActivity;
import com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.c;
import com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yw6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yw6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                final ChallengeAnnouncementBottomSheetActivity challengeAnnouncementBottomSheetActivity = (ChallengeAnnouncementBottomSheetActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = ChallengeAnnouncementBottomSheetActivity.d;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final ytw ytwVarC = wyh.c(((d) challengeAnnouncementBottomSheetActivity.c.getValue()).c, aVar, 0, 7);
                    o0z.a(null, null, null, null, null, pp8.b(-1272304941, new Function2() { // from class: zw6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            a aVar2 = (a) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            int i3 = ChallengeAnnouncementBottomSheetActivity.d;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                fx6 fx6Var = (fx6) ytwVarC.getValue();
                                d dVar = (d) challengeAnnouncementBottomSheetActivity.c.getValue();
                                boolean zA = aVar2.A(dVar);
                                Object objY = aVar2.y();
                                if (zA || objY == a.C0041a.a) {
                                    ChallengeAnnouncementBottomSheetActivity.b bVar = new ChallengeAnnouncementBottomSheetActivity.b(1, dVar, d.class, "handleAction", "handleAction(Lcom/sportybet/feature/loyalty/impl/notifications/presentation/challenge/ChallengeAnnouncementBottomSheetAction;)V", 0);
                                    aVar2.r(bVar);
                                    objY = bVar;
                                }
                                c.a(fx6Var, (Function1) ((chp) objY), aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                break;
            default:
                nz3 nz3Var = (nz3) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ivt.a(nz3Var, aVar2, 0);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
