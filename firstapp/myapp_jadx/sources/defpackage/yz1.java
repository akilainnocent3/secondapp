package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.core.model.patron.KycSource;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public abstract class yz1 extends pw40 implements fth {
    public static final /* synthetic */ int c = 0;
    public int a = 300;
    public boolean b;

    public abstract void A1(boolean z);

    @Override // defpackage.fth
    public final void O0() {
        if (isFinishing() || this.b) {
            return;
        }
        A1(true);
        getConfirmNameStatus(new lsm() { // from class: wz1
            @Override // defpackage.lsm
            public final void a(Object obj) {
                int i = yz1.c;
                yz1 yz1Var = this.a;
                yz1Var.A1(false);
                yz1Var.b = true;
                FragmentManager supportFragmentManager = yz1Var.getSupportFragmentManager();
                ale aleVar = new ale(new xz1(yz1Var));
                if (((s8n) supportFragmentManager.H("kyc_registration_dialog")) == null) {
                    s8n s8nVar = new s8n();
                    Bundle bundle = new Bundle();
                    bundle.putInt("arg_title_res_id", R.string.page_payment__kyc_verification);
                    bundle.putInt("arg_description_res_id", R.string.page_payment__kyc_verification_dialog_content);
                    bundle.putString("arg_description", null);
                    bundle.putInt("arg_positive_text_res_id", R.string.common_functions__home);
                    bundle.putInt("arg_negative_text_res_id", R.string.common_functions__transactions);
                    bundle.putString("arg_image", "");
                    s8nVar.setArguments(bundle);
                    s8nVar.A = aleVar;
                    s8nVar.show(supportFragmentManager, "kyc_registration_dialog");
                }
            }
        });
    }

    @Override // defpackage.pw40
    public final KycSource getRegistrationKYCSource() {
        return KycSource.DEPOSIT;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = getAccountHelper().getUserCertStatus();
    }
}
