package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k74 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k74(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                g74 g74Var = (g74) obj;
                g74Var.getClass();
                int i2 = g74Var.a;
                String str = g74Var.b;
                wwd0 wwd0Var = ((aa) obj2).C;
                str.getClass();
                if (i2 == 7) {
                    do {
                        value = wwd0Var.getValue();
                        StringUiText stringUiText = vch0.a;
                    } while (!wwd0Var.g(value, q74.a((q74) value, null, false, null, null, false, new ResourceUiText(R.string.biometrics_authentication__login_with_password), new ResourceUiText(R.string.biometrics_authentication__please_login_with_password), 0L, 159)));
                } else if (i2 == 13 || i2 == 10) {
                    itf0.a.g("operation is cancelled by user interaction", new Object[0]);
                } else if (i2 != 11) {
                    itf0.a.d("Error during biometric authentication: " + i2 + ", " + str, new Object[0]);
                } else {
                    itf0.a.g("No fingerprints enrolled", new Object[0]);
                    do {
                        value2 = wwd0Var.getValue();
                        StringUiText stringUiText2 = vch0.a;
                    } while (!wwd0Var.g(value2, q74.a((q74) value2, null, false, null, null, false, new ResourceUiText(R.string.biometrics_authentication__android_please_enroll_biometric_title), new ResourceUiText(R.string.biometrics_authentication__android_please_enroll_biometric_description), 0L, 159)));
                }
                break;
            case 1:
                ls00 ls00Var = (ls00) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                ls00Var.b = OtpData.PhoneMigration.a((OtpData.PhoneMigration) ls00Var.B1(), oTPResult);
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                ((nn40) obj2).v0(str2);
                break;
        }
        return Unit.a;
    }
}
