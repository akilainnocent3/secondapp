package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.kyc.nin.NINVerificationDialogActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vwd implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vwd(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ytw) obj).setValue(Boolean.TRUE);
                return Unit.a;
            case 1:
                return Integer.valueOf(((xms) obj).c.getColor(R.color.spr_gray3));
            default:
                NINVerificationDialogActivity nINVerificationDialogActivity = (NINVerificationDialogActivity) obj;
                d900 d900Var = nINVerificationDialogActivity.b;
                if (d900Var == null) {
                    Intrinsics.n("paymentRouter");
                    throw null;
                }
                d900Var.b.d(wae.NAME_UPDATE);
                if (!nINVerificationDialogActivity.isFinishing()) {
                    nINVerificationDialogActivity.finish();
                }
                return Unit.a;
        }
    }
}
