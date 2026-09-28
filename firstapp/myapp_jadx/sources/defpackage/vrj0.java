package defpackage;

import android.view.View;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class vrj0 implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ lsj0 b;

    public vrj0(cq40 cq40Var, lsj0 lsj0Var) {
        this.a = cq40Var;
        this.b = lsj0Var;
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
        lsj0 lsj0Var = this.b;
        String string = lsj0Var.getString(R.string.page_payment__withdraw_phone_number_info_content);
        string.getClass();
        c000.p0(lsj0Var, null, string, sn5.d(lsj0Var, R.string.common_functions__ok, new Object[0]), wrj0.a, sn5.d(lsj0Var, R.string.common_functions__contact_support, new Object[0]), new xrj0(lsj0Var), 64);
    }
}
