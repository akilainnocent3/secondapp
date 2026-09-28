package defpackage;

import android.view.View;
import com.sportybet.android.verifybet.VerifyBetActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class pyh0 implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ VerifyBetActivity b;
    public final /* synthetic */ df c;

    public pyh0(cq40 cq40Var, VerifyBetActivity verifyBetActivity, df dfVar) {
        this.a = cq40Var;
        this.b = verifyBetActivity;
        this.c = dfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        cq40 cq40Var = this.a;
        if (jCurrentTimeMillis - cq40Var.a < 350) {
            return;
        }
        cq40Var.a = jCurrentTimeMillis;
        view.getClass();
        String strValueOf = String.valueOf(this.c.B.getText());
        int i = VerifyBetActivity.f;
        VerifyBetActivity verifyBetActivity = this.b;
        verifyBetActivity.getAccountHelper().demandAccount(verifyBetActivity, new y75(verifyBetActivity, strValueOf, 1));
    }
}
