package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.text.TextUtils;
import androidx.activity.result.ActivityResult;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.patron.DocumentAudit;
import com.sporty.android.core.model.patron.DocumentAuditStatus;
import com.sporty.android.core.model.patron.KycSource;
import com.sporty.android.core.model.patron.NameConfirmationStatus;
import com.sportybet.android.account.RegistrationKYC$Result;
import com.sportybet.android.account.RegistrationKYCWebViewActivity;
import com.sportybet.android.auth.SportyAccountManagerLegacyHelper;
import com.sportybet.android.data.SimpleResponseWrapper;

/* JADX INFO: loaded from: classes5.dex */
public abstract class pw40 extends com.sportybet.android.account.b {
    xxz patronApiService;
    private final ee<Intent> registrationKYCPageLauncher = registerForActivityResult(new ce(), new a());

    public class a implements ud<ActivityResult> {
        public a() {
        }

        @Override // defpackage.ud
        public final void a(ActivityResult activityResult) {
            Intent intent = activityResult.b;
            RegistrationKYC$Result registrationKYC$Result = intent != null ? (RegistrationKYC$Result) intent.getParcelableExtra("data") : null;
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_ACCOUNT);
            pw40 pw40Var = pw40.this;
            aVar.a("%s received reg-KYC result: %s", pw40Var.getClass().getSimpleName(), registrationKYC$Result);
            if (registrationKYC$Result != null) {
                if (TextUtils.equals(registrationKYC$Result.a, pw40Var.getRegistrationKYCSource().getValue())) {
                    pw40Var.onRegistrationKYCResult(registrationKYC$Result);
                    return;
                }
            }
            aVar.q(MyLog.TAG_ACCOUNT);
            aVar.n("%s ignore reg-KYC result due to different source or empty result, source: %s, registrationKYCResult: %s", pw40Var.getClass().getSimpleName(), pw40Var.getRegistrationKYCSource(), registrationKYC$Result);
        }
    }

    public class b extends SimpleResponseWrapper<NameConfirmationStatus> {
        public final /* synthetic */ lsm a;

        public b(lsm lsmVar) {
            this.a = lsmVar;
        }

        @Override // com.sportybet.android.data.SimpleResponseWrapper
        public final void onFailure(Throwable th) {
            NameConfirmationStatus nameConfirmationStatus = new NameConfirmationStatus();
            nameConfirmationStatus.status = 5000;
            SportyAccountManagerLegacyHelper.updateKycStatuses(pw40.this.getAccountManager(), nameConfirmationStatus.status, 0);
            this.a.a(nameConfirmationStatus);
        }

        @Override // com.sportybet.android.data.SimpleResponseWrapper
        public final void onSuccess(NameConfirmationStatus nameConfirmationStatus) {
            NameConfirmationStatus nameConfirmationStatus2 = nameConfirmationStatus;
            mgb0 accountManager = pw40.this.getAccountManager();
            int i = nameConfirmationStatus2.status;
            DocumentAudit documentAudit = nameConfirmationStatus2.documentAudit;
            SportyAccountManagerLegacyHelper.updateKycStatuses(accountManager, i, documentAudit != null ? documentAudit.status : 0);
            this.a.a(nameConfirmationStatus2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkAccountAndRegistrationKYC$0(Account account, boolean z) {
        if (account == null) {
            finish();
            return;
        }
        if (!needKyc()) {
            onRegistrationKYCResult(true);
            return;
        }
        String lastAccessToken = getAccountHelper().getLastAccessToken();
        if (TextUtils.isEmpty(lastAccessToken)) {
            onRegistrationKYCResult(false);
        } else {
            showRegistrationKYCPageWithAccessToken(lastAccessToken);
        }
    }

    private void showRegistrationKYCPage(KycSource kycSource, String str) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_ACCOUNT);
        aVar.a("%s showRegistrationKYCPage, source: %s, cookie: %s", getClass().getSimpleName(), kycSource, str);
        ee<Intent> eeVar = this.registrationKYCPageLauncher;
        boolean zBooleanValue = showActionBarOnKycPage().booleanValue();
        RegistrationKYCWebViewActivity.y.getClass();
        eeVar.b(RegistrationKYCWebViewActivity.b.a(this, kycSource, str, zBooleanValue));
    }

    public void checkAccountAndRegistrationKYC() {
        getAccountHelper().demandAccount(this, new tit() { // from class: ow40
            @Override // defpackage.tit
            public final void w(Account account, boolean z) {
                this.a.lambda$checkAccountAndRegistrationKYC$0(account, z);
            }
        });
    }

    public void getConfirmNameStatus(lsm<NameConfirmationStatus> lsmVar) {
        this.patronApiService.p1().G(new b(lsmVar));
    }

    public abstract KycSource getRegistrationKYCSource();

    public boolean needKyc() {
        boolean zA = a8b.c().a(getRegistrationKYCSource());
        int userCertStatus = zA ? getAccountHelper().getUserCertStatus() : 360;
        int documentAuditStatus = zA ? SportyAccountManagerLegacyHelper.getDocumentAuditStatus(getAccountManager()) : 0;
        boolean z = (documentAuditStatus == DocumentAuditStatus.SUBMITTED.getValue() || documentAuditStatus == DocumentAuditStatus.APPROVED.getValue()) ? false : true;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_ACCOUNT);
        aVar.a("%s checkAccountAndRegistrationKYC, checkUserCertStatus: %b, accountStatus: %d, documentAuditStatus: %d, shouldBlockByDocumentAudit: %b", getClass().getSimpleName(), Boolean.valueOf(zA), Integer.valueOf(userCertStatus), Integer.valueOf(documentAuditStatus), Boolean.valueOf(z));
        return zA && 325 == userCertStatus && z;
    }

    public abstract void onRegistrationKYCResult(RegistrationKYC$Result registrationKYC$Result);

    public void onRegistrationKYCResult(boolean z) {
        onRegistrationKYCResult(new RegistrationKYC$Result(getRegistrationKYCSource().getValue(), z, null));
    }

    public Boolean showActionBarOnKycPage() {
        return Boolean.TRUE;
    }

    public void showRegistrationKYCPageWithAccessToken(String str) {
        showRegistrationKYCPage(getRegistrationKYCSource(), inm.a("kyc_collect_token=;accessToken=", str));
    }

    public void showRegistrationKYCPageWithSimpleToken(String str) {
        showRegistrationKYCPage(getRegistrationKYCSource(), inm.a("accessToken=;kyc_collect_token=", str));
    }
}
