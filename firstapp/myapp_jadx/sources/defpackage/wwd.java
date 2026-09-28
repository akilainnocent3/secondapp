package defpackage;

import com.sportybet.feature.kyc.nin.NINVerificationDialogActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wwd implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wwd(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ytw) obj).setValue(Boolean.FALSE);
                return Unit.a;
            case 1:
                fid0 fid0Var = ((yms) obj).b;
                return new u8z(fid0Var.G, fid0Var.H, new ArrayList(), true);
            default:
                NINVerificationDialogActivity nINVerificationDialogActivity = (NINVerificationDialogActivity) obj;
                int i2 = NINVerificationDialogActivity.d;
                if (!nINVerificationDialogActivity.isFinishing()) {
                    nINVerificationDialogActivity.finish();
                }
                return Unit.a;
        }
    }
}
