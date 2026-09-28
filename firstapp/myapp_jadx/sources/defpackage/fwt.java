package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.feature.loyalty.impl.notifications.presentation.mission.LoyaltyMissionBottomSheetActivity;
import com.sportybet.feature.loyalty.impl.notifications.presentation.mission.b;
import com.sportybet.feature.loyalty.impl.notifications.presentation.mission.c;
import com.sportybet.feature.loyalty.impl.notifications.presentation.mission.d;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fwt implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fwt(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj5;
                LoyaltyMissionBottomSheetActivity loyaltyMissionBottomSheetActivity = (LoyaltyMissionBottomSheetActivity) obj4;
                twd0 twd0Var = (twd0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = LoyaltyMissionBottomSheetActivity.b;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d dVar = (d) twd0Var.getValue();
                    if (Intrinsics.g(dVar, d.c.a)) {
                        aVar.N(116501374);
                        aVar.H();
                    } else {
                        boolean z = dVar instanceof d.a;
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (z) {
                            aVar.N(-683336133);
                            d.a aVar2 = (d.a) dVar;
                            boolean zA = aVar.A(loyaltyMissionBottomSheetActivity);
                            Object objY = aVar.y();
                            if (zA || objY == c0042a) {
                                objY = new gwt(loyaltyMissionBottomSheetActivity, 0);
                                aVar.r(objY);
                            }
                            c.a(aVar2, bVar, (Function0) objY, aVar, 0);
                            aVar.H();
                        } else {
                            if (!(dVar instanceof d.b)) {
                                throw rg.a(116499082, aVar);
                            }
                            aVar.N(-682994668);
                            d.b bVar2 = (d.b) dVar;
                            boolean zA2 = aVar.A(loyaltyMissionBottomSheetActivity);
                            Object objY2 = aVar.y();
                            if (zA2 || objY2 == c0042a) {
                                objY2 = new hwt(loyaltyMissionBottomSheetActivity, 0);
                                aVar.r(objY2);
                            }
                            c.b(bVar2, bVar, (Function0) objY2, aVar, 0);
                            aVar.H();
                        }
                    }
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                final ArrayList arrayList = (ArrayList) obj5;
                final ugy ugyVar = (ugy) obj4;
                final rc20 rc20Var = (rc20) obj3;
                a aVar3 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    scv.b(null, null, null, pp8.b(1339804445, new Function2() { // from class: vgy
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            a aVar4 = (a) obj6;
                            int iIntValue3 = ((Integer) obj7).intValue();
                            if (aVar4.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                bhy.a(null, a4h.b(arrayList), ugyVar, rc20Var, aVar4, 0);
                            } else {
                                aVar4.G();
                            }
                            return Unit.a;
                        }
                    }, aVar3), aVar3, 3072, 7);
                } else {
                    aVar3.G();
                }
                return Unit.a;
        }
    }
}
