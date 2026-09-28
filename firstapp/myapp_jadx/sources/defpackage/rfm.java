package defpackage;

import com.sportybet.android.user.kyc.KYCActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rfm implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rfm(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yrh0.t(dfm.this.requireContext(), KYCActivity.class, true);
                break;
            default:
                ((Function1) obj).invoke(new ot70.h(ny70.TOURNAMENT));
                break;
        }
        return Unit.a;
    }
}
