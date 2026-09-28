package defpackage;

import android.app.ProgressDialog;
import android.content.Context;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class h330 {
    public final ProgressDialog a;

    public h330(Context context) {
        context.getClass();
        ProgressDialog progressDialog = new ProgressDialog(context);
        Context context2 = progressDialog.getContext();
        context2.getClass();
        progressDialog.setMessage(sn5.b(context2, R.string.common_functions__loading, new Object[0]));
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        this.a = progressDialog;
    }

    public final void a() {
        ProgressDialog progressDialog = this.a;
        if (!progressDialog.isShowing()) {
            progressDialog = null;
        }
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    public final void b() {
        ProgressDialog progressDialog = this.a;
        if (progressDialog.isShowing()) {
            return;
        }
        progressDialog.show();
    }
}
