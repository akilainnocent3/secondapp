package defpackage;

import com.sporty.android.core.model.account.AccountActivationData;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lhzc;", "Lc7z;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$Deactivate;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hzc extends c7z<OtpData.Deactivate> {
    public final kzc A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzc(v8w v8wVar, kzc kzcVar, rdd0 rdd0Var) {
        super(v8wVar, rdd0Var);
        v8wVar.getClass();
        rdd0Var.getClass();
        this.A = kzcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final lyh<String> P1() {
        OtpData.Deactivate deactivate = (OtpData.Deactivate) B1();
        kzc kzcVar = this.A;
        kzcVar.getClass();
        lyz lyzVar = kzcVar.a;
        AccountActivationData accountActivationData = deactivate.d;
        String phoneCountryCode = accountActivationData.getPhoneCountryCode();
        if (phoneCountryCode == null) {
            phoneCountryCode = "";
        }
        String phoneNumber = accountActivationData.getPhoneNumber();
        return new izc(lyzVar.x0(phoneCountryCode, phoneNumber != null ? phoneNumber : ""));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final lyh<lk50<OTPResponse>> U1(OtpSelection otpSelection) {
        otpSelection.getClass();
        return this.A.a(otpSelection, z1().b, (OtpData.Deactivate) B1());
    }
}
