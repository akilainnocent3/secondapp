package defpackage;

import android.widget.Toast;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.kyc.nin.NINVerificationDialogActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ja5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ja5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (lk40) obj;
            case 1:
                return Integer.valueOf(((yms) obj).e.getColor(R.color.spr_gray3));
            default:
                int i2 = NINVerificationDialogActivity.d;
                Toast.makeText((NINVerificationDialogActivity) obj, R.string.identity_verification__nin_verified_success_toast, 1).show();
                return Unit.a;
        }
    }
}
