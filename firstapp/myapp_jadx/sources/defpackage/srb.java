package defpackage;

import android.os.Bundle;
import android.util.Log;
import androidx.transition.nfj.CaBJCMnsV;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class srb {
    public wf4 a;
    public v95 b;

    public final void a(int i, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            h00 h00Var = CaBJCMnsV.JFgpsTIptOaKN.equals(bundle2.getString("_o")) ? this.a : this.b;
            if (h00Var == null) {
                return;
            }
            h00Var.b(string, bundle2);
        }
    }
}
