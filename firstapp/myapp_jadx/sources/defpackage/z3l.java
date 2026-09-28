package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z3l implements Continuation {
    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) throws IOException {
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            i08.a("SERVICE_NOT_AVAILABLE");
            return null;
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString(AnalyticsEvent.BI_TRACKING_KIND_ERROR);
        if ("RST".equals(string3)) {
            i08.a("INSTANCE_ID_RESET");
            return null;
        }
        if (string3 != null) {
            i08.a(string3);
            return null;
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        i08.a("SERVICE_NOT_AVAILABLE");
        return null;
    }
}
