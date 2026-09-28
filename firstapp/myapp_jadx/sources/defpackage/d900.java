package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;
import com.sportybet.android.transaction.ui.txlist.TxListActivity;
import com.sportybet.android.user.kyc.KYCActivity;
import com.sportybet.feature.payment.api.model.BindNewPhoneResult;
import com.sportybet.plugin.webcontainer.utils.WebViewActivityUtils;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class d900 implements b900 {
    public final bnh0 a;
    public final azm b;
    public final psm c;
    public final lsp d;

    public d900(bnh0 bnh0Var, azm azmVar, psm psmVar, lsp lspVar) {
        this.a = bnh0Var;
        this.b = azmVar;
        this.c = psmVar;
        this.d = lspVar;
    }

    @Override // defpackage.b900
    public final void a() {
        azm.c(this.b, bjb0.S(WebViewActivityUtils.URL_HOW_TO_PLAY_WITHHOLDING_TAX), null, null, 6);
    }

    public final Intent b(Context context, String str) {
        str.getClass();
        Intent intent = new Intent();
        intent.setClass(context, RSportsBetTicketDetailsActivity.class);
        intent.putExtra(AnalyticsParam.SOCIAL_ORDER_ID, str);
        return intent;
    }

    public final void c(e eVar, Integer num) {
        eVar.getClass();
        yrh0.s(eVar, KYCActivity.E.newInstanceForBankAccountVerification(eVar, num), true);
    }

    public final void d(e eVar) {
        eVar.getClass();
        yrh0.s(eVar, KYCActivity.E.newInstanceForIdentityVerification(eVar), true);
    }

    public final void e(ucv ucvVar) {
        ucvVar.getClass();
        String str = ucvVar.a;
        azm.c(this.b, bjb0.S(str != null ? "/m/my_accounts/transactions/materials_upload?from=".concat(str) : "/m/my_accounts/transactions/materials_upload"), vj5.a(new Pair("data_enable_default_action_bar", Boolean.FALSE)), null, 4);
    }

    public final void f(Context context, int i, bag bagVar) {
        context.getClass();
        int i2 = TxListActivity.K;
        Intent intent = new Intent(context, (Class<?>) TxListActivity.class);
        intent.putExtra("parameter", true);
        intent.putExtra("key_param_tx_category", i);
        if (bagVar != null) {
            intent.putExtra("EXTRA_ENTRANCE", bagVar);
        }
        context.startActivity(intent);
    }

    public final void g() {
        e(ucv.Transaction);
    }

    public final void h(final FragmentManager fragmentManager, ibs ibsVar, String str, final Function1<? super BindNewPhoneResult, Unit> function1, bag bagVar) {
        fragmentManager.getClass();
        ibsVar.getClass();
        fragmentManager.n0("REQUEST_KEY_ADD_NEW_MOBILE_NUMBER", ibsVar, new qxi() { // from class: oj
            @Override // defpackage.qxi
            public final void a(String str2, Bundle bundle) {
                pj.a.b(function1, fragmentManager, str2, bundle);
            }
        });
        pj pjVar = new pj();
        pjVar.setArguments(vj5.a(new Pair("ARG_PRIMARY_OTP_VERIFY_TOKEN", str), new Pair("ARG_CAPTCHA_ACTION", null), new Pair("ARG_PHONE_MIGRATE_PARAMS", null), new Pair("ARG_ENTRANCE", bagVar)));
        pjVar.show(fragmentManager, pj.class.getName());
    }
}
