package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sporty.android.core.model.patron.KycHintExtra;
import com.sporty.android.core.model.patron.KycSource;
import com.sporty.android.core.model.patron.UserCertConstants;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.account.confirm.activity.CommonConfirmNameActivity;
import com.sportybet.android.globalpay.kyc.za.ZAKycAgentActivity;
import com.sportybet.android.user.kyc.KYCActivity;
import com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoActivity;
import com.sportybet.feature.kyc.verifyfailed.KycVerifyFailedActivity;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class lsp {
    public final psm a;
    public final mgb0 b;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[gsp.values().length];
            try {
                gsp gspVar = gsp.a;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                gsp gspVar2 = gsp.a;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                gsp gspVar3 = gsp.a;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                gsp gspVar4 = gsp.a;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public lsp(psm psmVar, mgb0 mgb0Var) {
        psmVar.getClass();
        mgb0Var.getClass();
        this.a = psmVar;
        this.b = mgb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        msp mspVar;
        KycHintExtra kycHintExtra;
        int iIntValue;
        Object documentAuditStatus;
        int i;
        KycHintExtra kycHintExtra2;
        if (x1bVar instanceof msp) {
            mspVar = (msp) x1bVar;
            int i2 = mspVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mspVar.e = i2 - Integer.MIN_VALUE;
            } else {
                mspVar = new msp(this, x1bVar);
            }
        } else {
            mspVar = new msp(this, x1bVar);
        }
        Object kycHintExtra3 = mspVar.c;
        y5b y5bVar = y5b.a;
        int i3 = mspVar.e;
        mgb0 mgb0Var = this.b;
        if (i3 == 0) {
            uj50.b(kycHintExtra3);
            mspVar.e = 1;
            kycHintExtra3 = mgb0Var.getKycHintExtra(mspVar);
            if (kycHintExtra3 != y5bVar) {
            }
            return y5bVar;
        }
        if (i3 == 1) {
            uj50.b(kycHintExtra3);
        } else {
            if (i3 == 2) {
                kycHintExtra = mspVar.a;
                uj50.b(kycHintExtra3);
                iIntValue = ((Number) kycHintExtra3).intValue();
                mspVar.a = kycHintExtra;
                mspVar.b = iIntValue;
                mspVar.e = 3;
                documentAuditStatus = mgb0Var.getDocumentAuditStatus(mspVar);
                if (documentAuditStatus != y5bVar) {
                    kycHintExtra3 = documentAuditStatus;
                    i = iIntValue;
                    kycHintExtra2 = kycHintExtra;
                }
                return y5bVar;
            }
            if (i3 != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = mspVar.b;
            kycHintExtra2 = mspVar.a;
            uj50.b(kycHintExtra3);
        }
        return btp.a(i, ((Number) kycHintExtra3).intValue(), kycHintExtra2.getRejectTitle(), kycHintExtra2.getRejectReason());
        KycHintExtra kycHintExtra4 = (KycHintExtra) kycHintExtra3;
        mspVar.a = kycHintExtra4;
        mspVar.e = 2;
        Object userCertStatus = mgb0Var.getUserCertStatus(mspVar);
        if (userCertStatus != y5bVar) {
            kycHintExtra = kycHintExtra4;
            kycHintExtra3 = userCertStatus;
            iIntValue = ((Number) kycHintExtra3).intValue();
            mspVar.a = kycHintExtra;
            mspVar.b = iIntValue;
            mspVar.e = 3;
            documentAuditStatus = mgb0Var.getDocumentAuditStatus(mspVar);
            if (documentAuditStatus != y5bVar) {
                kycHintExtra3 = documentAuditStatus;
                i = iIntValue;
                kycHintExtra2 = kycHintExtra;
                return btp.a(i, ((Number) kycHintExtra3).intValue(), kycHintExtra2.getRejectTitle(), kycHintExtra2.getRejectReason());
            }
        }
        return y5bVar;
    }

    public final Intent b(Context context, KycSource kycSource, zsp zspVar) {
        gsp gspVar;
        qup qupVarB;
        context.getClass();
        kycSource.getClass();
        psm psmVar = this.a;
        if (zspVar != null && (qupVarB = atp.b(zspVar, psmVar.x())) != null) {
            int i = KycVerifyFailedActivity.e;
            return KycVerifyFailedActivity.a.a(context, qupVarB.a, qupVarB.b, kycSource);
        }
        CountryCodeName countryCode = psmVar.getCountryCode();
        countryCode.getClass();
        switch (ksp.a[countryCode.ordinal()]) {
            case 1:
            case 2:
                gspVar = gsp.a;
                break;
            case 3:
                gspVar = gsp.b;
                break;
            case 4:
                gspVar = gsp.c;
                break;
            case 5:
            case 6:
            case 7:
                gspVar = gsp.d;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                gspVar = null;
                break;
            default:
                uhc.a();
                return null;
        }
        int i2 = gspVar == null ? -1 : a.a[gspVar.ordinal()];
        if (i2 == -1) {
            return null;
        }
        if (i2 == 1) {
            Intent intentPutExtra = new Intent(context, (Class<?>) ConfirmAccountInfoActivity.class).putExtra(UserCertConstants.EXTRA_SOURCE, 1000);
            pcx.a aVar = pcx.b;
            return intentPutExtra.putExtra(UserCertConstants.EXTRA_TRIGGER, "kyc_banner");
        }
        if (i2 == 2) {
            int i3 = ZAKycAgentActivity.c;
            Intent intent = new Intent(context, (Class<?>) ZAKycAgentActivity.class);
            intent.putExtra("REGISTRATION_KYC_SOURCE", kycSource.getValue());
            intent.putExtra("withdrawChannelId", (Serializable) null);
            return intent;
        }
        if (i2 == 3) {
            return new Intent(context, (Class<?>) CommonConfirmNameActivity.class).putExtra("source", kycSource.getValue());
        }
        if (i2 == 4) {
            return new Intent(context, (Class<?>) KYCActivity.class);
        }
        uhc.a();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Context context, KycSource kycSource, x1b x1bVar) {
        nsp nspVar;
        if (x1bVar instanceof nsp) {
            nspVar = (nsp) x1bVar;
            int i = nspVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                nspVar.e = i - Integer.MIN_VALUE;
            } else {
                nspVar = new nsp(this, x1bVar);
            }
        } else {
            nspVar = new nsp(this, x1bVar);
        }
        Object objA = nspVar.c;
        Object obj = y5b.a;
        int i2 = nspVar.e;
        if (i2 == 0) {
            uj50.b(objA);
            nspVar.a = context;
            nspVar.b = kycSource;
            nspVar.e = 1;
            objA = a(nspVar);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kycSource = nspVar.b;
            context = nspVar.a;
            uj50.b(objA);
        }
        qup qupVarB = atp.b((zsp) objA, this.a.x());
        if (qupVarB == null) {
            return null;
        }
        int i3 = KycVerifyFailedActivity.e;
        return KycVerifyFailedActivity.a.a(context, qupVarB.a, qupVarB.b, kycSource);
    }
}
