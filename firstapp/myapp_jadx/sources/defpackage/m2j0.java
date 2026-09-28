package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sporty.android.core.model.patron.KycSource;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.account.RegistrationKYCWebViewActivity;
import com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class m2j0 implements l2j0 {
    public final uqm a;
    public final lsp b;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            try {
                iArr[CountryCodeName.GHANA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CountryCodeName.NIGERIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public m2j0(uqm uqmVar, lsp lspVar) {
        this.a = uqmVar;
        this.b = lspVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.l2j0
    public final Object a(Context context, CountryCodeName countryCodeName, x1b x1bVar) {
        n2j0 n2j0Var;
        if (x1bVar instanceof n2j0) {
            n2j0Var = (n2j0) x1bVar;
            int i = n2j0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                n2j0Var.e = i - Integer.MIN_VALUE;
            } else {
                n2j0Var = new n2j0(this, x1bVar);
            }
        } else {
            n2j0Var = new n2j0(this, x1bVar);
        }
        Object objC = n2j0Var.c;
        y5b y5bVar = y5b.a;
        int i2 = n2j0Var.e;
        if (i2 == 0) {
            uj50.b(objC);
            KycSource kycSource = KycSource.WELCOME_REWARDS;
            n2j0Var.a = context;
            n2j0Var.b = countryCodeName;
            n2j0Var.e = 1;
            objC = this.b.c(context, kycSource, n2j0Var);
            if (objC == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            countryCodeName = n2j0Var.b;
            context = n2j0Var.a;
            uj50.b(objC);
        }
        Intent intent = (Intent) objC;
        if (intent != null) {
            return intent;
        }
        int i3 = a.a[countryCodeName.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                return null;
            }
            return new Intent(context, (Class<?>) ConfirmAccountInfoActivity.class);
        }
        RegistrationKYCWebViewActivity.b bVar = RegistrationKYCWebViewActivity.y;
        KycSource kycSource2 = KycSource.WELCOME_REWARDS;
        String str = "kyc_collect_token=;accessToken=" + this.a.getLastAccessToken();
        bVar.getClass();
        return new Intent(RegistrationKYCWebViewActivity.b.a(context, kycSource2, str, false));
    }
}
