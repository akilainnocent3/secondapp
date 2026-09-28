package defpackage;

import com.sporty.android.core.model.security.otp.ResetSportyPINResult;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.sportypin.WithdrawalPinActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hg2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hg2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.u(((Number) ((twd0) obj2).getValue()).floatValue());
                break;
            case 1:
                ((Function1) obj2).invoke(new o6z.f((qd4.c) obj));
                break;
            default:
                WithdrawalPinActivity withdrawalPinActivity = (WithdrawalPinActivity) obj2;
                int i2 = WithdrawalPinActivity.g0;
                OTPResult<ResetSportyPINResult> oTPResult = ((OtpData.ResetPin) obj).d;
                if (oTPResult instanceof OTPResult.Success) {
                    String pinToken = ((ResetSportyPINResult) ((OTPResult.Success) oTPResult).a).getPinToken();
                    withdrawalPinActivity.Z.setVisibility(0);
                    WithdrawalPinActivity.j0 = true;
                    withdrawalPinActivity.R = pinToken;
                    withdrawalPinActivity.T1(false);
                    withdrawalPinActivity.N = 0;
                    withdrawalPinActivity.V1(0);
                } else if (oTPResult instanceof OTPResult.Failed) {
                    withdrawalPinActivity.C1(2300, "");
                }
                break;
        }
        return Unit.a;
    }
}
