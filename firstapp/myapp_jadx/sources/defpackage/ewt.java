package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.feature.loyalty.impl.notifications.presentation.mission.LoyaltyMissionBottomSheetActivity;
import com.sportybet.feature.loyalty.impl.notifications.presentation.mission.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ewt implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public /* synthetic */ ewt(int i, Function0 function0) {
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                LoyaltyMissionBottomSheetActivity loyaltyMissionBottomSheetActivity = (LoyaltyMissionBottomSheetActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = LoyaltyMissionBottomSheetActivity.b;
                int i3 = 0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    w8i0 w8i0VarA = zdt.a(aVar);
                    if (w8i0VarA == null) {
                        ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    e eVar = (e) p8i0.a(jq40.a(e.class), w8i0VarA, null, cll.a(w8i0VarA, aVar), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, aVar);
                    o0z.a(null, null, null, null, null, pp8.b(554310554, new fwt(eVar.y, loyaltyMissionBottomSheetActivity, wyh.c(eVar.w, aVar, 0, 7), i3), aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                fue0.g((Function0) obj3, (a) obj, qj40.a(1));
                return Unit.a;
        }
    }

    public /* synthetic */ ewt(LoyaltyMissionBottomSheetActivity loyaltyMissionBottomSheetActivity) {
        this.b = loyaltyMissionBottomSheetActivity;
    }
}
