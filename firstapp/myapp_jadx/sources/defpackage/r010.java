package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.core.model.kyc.phonemigration.KYCDuplicateIDWebViewResponse;
import com.sporty.android.core.model.kyc.phonemigration.PhoneMigrateConfigResponse;
import com.sporty.android.core.model.kyc.phonemigration.PhoneMigrateFindMainAccountResponse;
import com.sporty.android.core.model.kyc.phonemigration.PhoneMigrateParams;
import com.sportybet.android.account.RegistrationKYCWebViewActivity;
import com.sportybet.android.gp.tz.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r010 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r010(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ixi ixiVar;
        v720 binding;
        j820 binding2;
        v720 binding3;
        v720 binding4;
        v720 binding5;
        v720 binding6;
        v720 binding7;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                m410 m410Var = (m410) obj2;
                m410Var.D = ((Boolean) obj).booleanValue();
                m410Var.F = 0;
                m410Var.U0();
                wz.a("AutoBet", "Ping Pong", "1", m410Var.D ? "On" : "Off");
                ixi ixiVar2 = (ixi) m410Var.b;
                if (ixiVar2 != null && (binding3 = ixiVar2.b.getBinding()) != null && binding3.Y.getVisibility() == 0) {
                    ixi ixiVar3 = (ixi) m410Var.b;
                    if (ixiVar3 != null && (binding7 = ixiVar3.b.getBinding()) != null) {
                        binding7.Y.setVisibility(8);
                    }
                    ixi ixiVar4 = (ixi) m410Var.b;
                    if (ixiVar4 != null && (binding6 = ixiVar4.b.getBinding()) != null) {
                        binding6.D.setVisibility(8);
                    }
                    ixi ixiVar5 = (ixi) m410Var.b;
                    if (ixiVar5 != null && (binding5 = ixiVar5.b.getBinding()) != null) {
                        binding5.a0.setVisibility(8);
                    }
                    ixi ixiVar6 = (ixi) m410Var.b;
                    if (ixiVar6 != null && (binding4 = ixiVar6.b.getBinding()) != null) {
                        binding4.q0.setVisibility(0);
                    }
                    m410Var.N = false;
                }
                if (!m410Var.D && (ixiVar = (ixi) m410Var.b) != null && (binding = ixiVar.b.getBinding()) != null && (binding2 = binding.d.getBinding()) != null) {
                    binding2.d.setText("");
                }
                return Unit.a;
            default:
                RegistrationKYCWebViewActivity registrationKYCWebViewActivity = (RegistrationKYCWebViewActivity) obj2;
                KYCDuplicateIDWebViewResponse kYCDuplicateIDWebViewResponse = (KYCDuplicateIDWebViewResponse) obj;
                RegistrationKYCWebViewActivity.b bVar = RegistrationKYCWebViewActivity.y;
                if (kYCDuplicateIDWebViewResponse == null) {
                    return Unit.a;
                }
                if (kYCDuplicateIDWebViewResponse instanceof KYCDuplicateIDWebViewResponse.KYCDuplicateIDWebViewData) {
                    KYCDuplicateIDWebViewResponse.KYCDuplicateIDWebViewData kYCDuplicateIDWebViewData = (KYCDuplicateIDWebViewResponse.KYCDuplicateIDWebViewData) kYCDuplicateIDWebViewResponse;
                    if (kYCDuplicateIDWebViewData.getConfig().getEnabled()) {
                        PhoneMigrateConfigResponse config = kYCDuplicateIDWebViewData.getConfig();
                        PhoneMigrateFindMainAccountResponse accountInfo = kYCDuplicateIDWebViewData.getAccountInfo();
                        PhoneMigrateParams phoneMigrateParams = new PhoneMigrateParams(config.getEnabled(), config.getNameMatchingEnabled(), config.getOtpForMainAccountEnabled(), config.getOtpForSubsidiaryAccountEnabled(), kYCDuplicateIDWebViewData.getUserName(), accountInfo.getKycFailedUserPhone(), accountInfo.getMainUserPhone(), kYCDuplicateIDWebViewData.getCheckPasswordToken().getToken());
                        final FragmentManager supportFragmentManager = registrationKYCWebViewActivity.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        String token = kYCDuplicateIDWebViewData.getCheckPasswordToken().getToken();
                        j6c j6cVar = j6c.MigratePhone;
                        final d7i d7iVar = new d7i(registrationKYCWebViewActivity, 3);
                        supportFragmentManager.n0("REQUEST_KEY_MIGRATE_PHONE", registrationKYCWebViewActivity, new qxi() { // from class: nj
                            @Override // defpackage.qxi
                            public final void a(String str, Bundle bundle) {
                                pj.a.a(d7iVar, supportFragmentManager, str, bundle);
                            }
                        });
                        pj pjVar = new pj();
                        pjVar.setArguments(vj5.a(new Pair("ARG_PRIMARY_OTP_VERIFY_TOKEN", token), new Pair("ARG_CAPTCHA_ACTION", j6cVar), new Pair("ARG_PHONE_MIGRATE_PARAMS", phoneMigrateParams), new Pair("ARG_ENTRANCE", null)));
                        pjVar.show(supportFragmentManager, pj.class.getName());
                    } else {
                        ime.b(registrationKYCWebViewActivity, new ple(registrationKYCWebViewActivity.getCMSString(R.string.common_feedback__something_went_wrong, new Object[0]), (String) null, (DialogInterface.OnClickListener) null, (String) null, (ny1) null, (String) null, WebSocketProtocol.PAYLOAD_SHORT));
                    }
                } else {
                    if (!kYCDuplicateIDWebViewResponse.equals(KYCDuplicateIDWebViewResponse.Failed.INSTANCE)) {
                        uhc.a();
                        return null;
                    }
                    ime.b(registrationKYCWebViewActivity, new ple(registrationKYCWebViewActivity.getCMSString(R.string.common_feedback__something_went_wrong, new Object[0]), (String) null, (DialogInterface.OnClickListener) null, (String) null, (ny1) null, (String) null, WebSocketProtocol.PAYLOAD_SHORT));
                }
                return Unit.a;
        }
    }
}
