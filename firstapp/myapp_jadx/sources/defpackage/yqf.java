package defpackage;

import com.sportybet.plugin.realsports.home.KycVerificationInProgressBottomSheetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yqf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yqf(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ytw) obj).setValue(null);
                break;
            default:
                KycVerificationInProgressBottomSheetActivity.a aVar = KycVerificationInProgressBottomSheetActivity.d;
                ((KycVerificationInProgressBottomSheetActivity) obj).finish();
                break;
        }
        return Unit.a;
    }
}
