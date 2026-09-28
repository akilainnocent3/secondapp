package defpackage;

import android.app.AlertDialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.ProgressBar;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lszz;", "Lpy1;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class szz extends bzl {
    public AlertDialog b;

    public final void z1() {
        AlertDialog alertDialog = this.b;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        AlertDialog alertDialog2 = this.b;
        if (alertDialog2 != null) {
            alertDialog2.show();
            return;
        }
        AlertDialog alertDialogShow = new AlertDialog.Builder(this).setView(new ProgressBar(this)).setCancelable(false).show();
        Window window = alertDialogShow.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.clearFlags(2);
        }
        this.b = alertDialogShow;
    }
}
