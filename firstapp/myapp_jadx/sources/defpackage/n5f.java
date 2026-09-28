package defpackage;

import com.sportybet.android.globalpay.nuvei.deposit.a;
import com.sportybet.feature.loyalty.impl.welcomereward.WelcomeRewardBottomSheetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n5f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n5f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(((Number) ((twd0) obj).getValue()).floatValue());
            case 1:
                ((a) obj).requireActivity().finish();
                return Unit.a;
            default:
                WelcomeRewardBottomSheetActivity welcomeRewardBottomSheetActivity = (WelcomeRewardBottomSheetActivity) obj;
                int i2 = WelcomeRewardBottomSheetActivity.d;
                ((u1j0) welcomeRewardBottomSheetActivity.b.getValue()).x1(new x0j0.l(0));
                azm azmVar = welcomeRewardBottomSheetActivity.c;
                if (azmVar == null) {
                    Intrinsics.n("router");
                    throw null;
                }
                azmVar.d(wae.DEPOSIT);
                welcomeRewardBottomSheetActivity.finish();
                return Unit.a;
        }
    }
}
