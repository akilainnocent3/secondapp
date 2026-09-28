package defpackage;

import com.sportybet.plugin.realsports.home.KycVerificationInProgressBottomSheetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class arf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ arf(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke((irf) obj);
                return Unit.a;
            default:
                KycVerificationInProgressBottomSheetActivity kycVerificationInProgressBottomSheetActivity = (KycVerificationInProgressBottomSheetActivity) obj2;
                wup wupVar = (wup) obj;
                KycVerificationInProgressBottomSheetActivity.a aVar = KycVerificationInProgressBottomSheetActivity.d;
                rdd0 rdd0Var = kycVerificationInProgressBottomSheetActivity.c;
                if (rdd0Var == null) {
                    Intrinsics.n("sportyTrackingUseCase");
                    throw null;
                }
                rdd0Var.a(new osp.r(wupVar), k00.d);
                azm azmVar = kycVerificationInProgressBottomSheetActivity.b;
                if (azmVar == null) {
                    Intrinsics.n("router");
                    throw null;
                }
                azmVar.d(wae.ME);
                kycVerificationInProgressBottomSheetActivity.finish();
                return Unit.a;
        }
    }
}
