package defpackage;

import com.sporty.android.core.model.account.AccountActivationData;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OtpData;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public final class kzc {
    public final lyz a;
    public final pc80 b;

    public kzc(lyz lyzVar, pc80 pc80Var) {
        lyzVar.getClass();
        this.a = lyzVar;
        this.b = pc80Var;
    }

    public final yzh a(OtpSelection otpSelection, String str, OtpData.Deactivate deactivate) {
        otpSelection.getClass();
        str.getClass();
        j6c j6cVar = j6c.DEACTIVATE;
        AccountActivationData accountActivationData = deactivate.d;
        String phoneNumber = accountActivationData.getPhoneNumber();
        String str2 = phoneNumber == null ? "" : phoneNumber;
        String phoneCountryCode = accountActivationData.getPhoneCountryCode();
        return this.b.a(otpSelection, str, j6cVar, str2, phoneCountryCode == null ? "" : phoneCountryCode);
    }

    public final yzh b(String str, String str2, OtpData.Deactivate deactivate) throws JSONException {
        str.getClass();
        str2.getClass();
        return bm50.a(new jzc(this.a.m(deactivate.d.genRequestBodyForDeactivateAccount(str2, str))));
    }
}
