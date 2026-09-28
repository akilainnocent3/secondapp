package defpackage;

import android.os.Bundle;
import com.sportybet.feature.gift.payday.presentation.PaydayGiftBottomSheetActivity;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v400 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v400(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                PaydayGiftBottomSheetActivity paydayGiftBottomSheetActivity = (PaydayGiftBottomSheetActivity) obj;
                azm azmVar = paydayGiftBottomSheetActivity.b;
                if (azmVar == null) {
                    Intrinsics.n("iRouter");
                    throw null;
                }
                wae waeVar = wae.DEPOSIT;
                dag dagVar = dag.PAYDAY_PROMO;
                Bundle bundle = new Bundle();
                bundle.putSerializable("EXTRA_ENTRANCE", dagVar);
                azmVar.e(waeVar, bundle);
                paydayGiftBottomSheetActivity.finish();
                return Unit.a;
            default:
                q1c0 q1c0Var = (q1c0) obj;
                q1c0Var.K0();
                w3c0 w3c0Var = (w3c0) q1c0Var.b;
                if (w3c0Var != null) {
                    w3c0Var.J.n(8388613);
                }
                GameDetails gameDetails = q1c0Var.W1;
                wz.a("MenuClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                return Unit.a;
        }
    }
}
