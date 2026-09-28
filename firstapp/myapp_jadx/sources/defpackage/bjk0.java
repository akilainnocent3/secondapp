package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.ProgressBar;
import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class bjk0 implements Runnable {
    public final uik0 a;
    public final /* synthetic */ gjk0 b;

    public bjk0(gjk0 gjk0Var, uik0 uik0Var) {
        this.b = gjk0Var;
        this.a = uik0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.a) {
            ConnectionResult connectionResult = this.a.b;
            boolean z = (connectionResult.b == 0 || connectionResult.c == null) ? false : true;
            gjk0 gjk0Var = this.b;
            if (z) {
                dbs dbsVar = gjk0Var.mLifecycleFragment;
                Activity activity = gjk0Var.getActivity();
                PendingIntent pendingIntent = connectionResult.c;
                hm20.h(pendingIntent);
                int i = this.a.a;
                int i2 = GoogleApiActivity.b;
                Intent intent = new Intent(activity, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", false);
                dbsVar.startActivityForResult(intent, 1);
                return;
            }
            if (gjk0Var.d.a(connectionResult.b, gjk0Var.getActivity(), null) != null) {
                gjk0 gjk0Var2 = this.b;
                gjk0Var2.d.h(gjk0Var2.getActivity(), gjk0Var2.mLifecycleFragment, connectionResult.b, this.b);
                return;
            }
            int i3 = connectionResult.b;
            gjk0 gjk0Var3 = this.b;
            if (i3 != 18) {
                gjk0Var3.a(connectionResult, this.a.a);
                return;
            }
            v4l v4lVar = gjk0Var3.d;
            Activity activity2 = gjk0Var3.getActivity();
            v4lVar.getClass();
            ProgressBar progressBar = new ProgressBar(activity2, null, R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(activity2);
            builder.setView(progressBar);
            builder.setMessage(sgk0.b(activity2, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog alertDialogCreate = builder.create();
            v4l.f(activity2, alertDialogCreate, "GooglePlayServicesUpdatingDialog", gjk0Var3);
            gjk0 gjk0Var4 = this.b;
            Context applicationContext = gjk0Var4.getActivity().getApplicationContext();
            xik0 xik0Var = new xik0(this, alertDialogCreate);
            gjk0Var4.d.getClass();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme(LxHElgWAiSeM.gTlRNZapjXNkMN);
            qgk0 qgk0Var = new qgk0(xik0Var);
            ajk0.e(applicationContext, qgk0Var, intentFilter);
            qgk0Var.a(applicationContext);
            if (m5l.b(applicationContext)) {
                return;
            }
            xik0Var.a();
            qgk0Var.b();
        }
    }
}
