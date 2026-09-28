package defpackage;

import com.sportybet.android.user.kyc.KYCActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vhp implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ vhp(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                KYCActivity.Companion companion = KYCActivity.E;
                return h0j0.a();
            default:
                return Unit.a;
        }
    }
}
