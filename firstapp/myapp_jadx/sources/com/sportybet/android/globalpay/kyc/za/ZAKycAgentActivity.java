package com.sportybet.android.globalpay.kyc.za;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.sporty.android.core.model.patron.KycSource;
import com.sporty.android.core.model.patron.NameConfirmationStatus;
import com.sporty.android.core.model.patron.RejectReason;
import com.sportybet.android.account.RegistrationKYC$Result;
import com.sportybet.android.globalpay.GlobalDepositActivity;
import com.sportybet.android.globalpay.GlobalWithdrawActivity;
import com.sportybet.android.globalpay.kyc.za.ZAKycAgentActivity;
import defpackage.lsm;
import defpackage.n8m;
import defpackage.o7d;
import defpackage.pwx;
import defpackage.sh8;
import defpackage.wae;
import defpackage.yrh0;
import defpackage.zux;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/sportybet/android/globalpay/kyc/za/ZAKycAgentActivity;", "Lpw40;", "Lzux;", "Lpwx;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ZAKycAgentActivity extends n8m implements zux, pwx {
    public static final /* synthetic */ int c = 0;
    public NameConfirmationStatus b;

    public static final class a {
    }

    @Override // defpackage.pw40
    public final KycSource getRegistrationKYCSource() {
        KycSource kycSourceFromValue = KycSource.INSTANCE.fromValue(getIntent().getStringExtra("REGISTRATION_KYC_SOURCE"));
        return kycSourceFromValue == null ? KycSource.DEPOSIT : kycSourceFromValue;
    }

    @Override // defpackage.pw40
    public final boolean needKyc() {
        return getAccountHelper().getUserCertStatus() == 404 || getAccountHelper().getUserCertStatus() == 408;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getConfirmNameStatus(new lsm() { // from class: o9k0
            @Override // defpackage.lsm
            public final void a(Object obj) {
                NameConfirmationStatus nameConfirmationStatus = (NameConfirmationStatus) obj;
                int i = ZAKycAgentActivity.c;
                nameConfirmationStatus.getClass();
                ZAKycAgentActivity zAKycAgentActivity = this.a;
                zAKycAgentActivity.b = nameConfirmationStatus;
                zAKycAgentActivity.checkAccountAndRegistrationKYC();
            }
        });
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        getWindow().setFlags(8192, 8192);
    }

    @Override // defpackage.pw40
    public final void onRegistrationKYCResult(RegistrationKYC$Result registrationKYC$Result) {
        b bVar;
        List<RejectReason> list;
        b bVar2;
        registrationKYC$Result.getClass();
        Account account = getAccountHelper().getAccount();
        if (registrationKYC$Result.b && account != null) {
            if (getAccountHelper().getUserCertStatus() == 409) {
                sh8.c().e(o7d.a(wae.KYC));
            } else {
                if (getRegistrationKYCSource() == KycSource.WITHDRAW) {
                    b.a aVar = b.a;
                    int userCertStatus = getAccountHelper().getUserCertStatus();
                    aVar.getClass();
                    if (userCertStatus == 405) {
                        bVar2 = b.e;
                    } else if (userCertStatus != 410) {
                        switch (userCertStatus) {
                            case 401:
                                bVar2 = b.b;
                                break;
                            case 402:
                                bVar2 = b.c;
                                break;
                            case 403:
                                bVar2 = b.d;
                                break;
                            default:
                                bVar2 = b.i;
                                break;
                        }
                    } else {
                        bVar2 = b.f;
                    }
                    String strName = bVar2.name();
                    NameConfirmationStatus nameConfirmationStatus = this.b;
                    list = nameConfirmationStatus != null ? nameConfirmationStatus.rejectReasons : null;
                    Integer numValueOf = Integer.valueOf(getIntent().getIntExtra("withdrawChannelId", 0));
                    Intent intent = new Intent(this, (Class<?>) GlobalWithdrawActivity.class);
                    intent.putExtra("withdrawChannelId", numValueOf);
                    if (strName != null) {
                        intent.putExtra("KYC_STATUS_KEY", strName);
                    }
                    if (list != null) {
                        intent.putExtra("KYC_REJECT_REASON_KEY", (Parcelable[]) list.toArray(new RejectReason[0]));
                    }
                    intent.setFlags(268435456);
                    Bundle extras = getIntent().getExtras();
                    if (extras != null) {
                        intent.putExtras(extras);
                    }
                    yrh0.s(this, intent, true);
                } else {
                    b.a aVar2 = b.a;
                    int userCertStatus2 = getAccountHelper().getUserCertStatus();
                    aVar2.getClass();
                    if (userCertStatus2 == 405) {
                        bVar = b.e;
                    } else if (userCertStatus2 != 410) {
                        switch (userCertStatus2) {
                            case 401:
                                bVar = b.b;
                                break;
                            case 402:
                                bVar = b.c;
                                break;
                            case 403:
                                bVar = b.d;
                                break;
                            default:
                                bVar = b.i;
                                break;
                        }
                    } else {
                        bVar = b.f;
                    }
                    String strName2 = bVar.name();
                    NameConfirmationStatus nameConfirmationStatus2 = this.b;
                    list = nameConfirmationStatus2 != null ? nameConfirmationStatus2.rejectReasons : null;
                    Intent intent2 = new Intent(this, (Class<?>) GlobalDepositActivity.class);
                    if (strName2 != null) {
                        intent2.putExtra("KYC_STATUS_KEY", strName2);
                    }
                    if (list != null) {
                        intent2.putExtra("KYC_REJECT_REASON_KEY", (Parcelable[]) list.toArray(new RejectReason[0]));
                    }
                    intent2.setFlags(268435456);
                    Bundle extras2 = getIntent().getExtras();
                    if (extras2 != null) {
                        intent2.putExtras(extras2);
                    }
                    yrh0.s(this, intent2, true);
                }
            }
        }
        finish();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        getWindow().clearFlags(8192);
    }

    @Override // defpackage.pw40
    public final Boolean showActionBarOnKycPage() {
        return Boolean.FALSE;
    }
}
