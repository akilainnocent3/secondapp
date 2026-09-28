package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.sportybet.plugin.realsports.activities.TransactionAgentActivity;

/* JADX INFO: loaded from: classes6.dex */
public interface j800 {
    static void a(Activity activity, Bundle bundle) {
        Intent intent = new Intent(activity, (Class<?>) TransactionAgentActivity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        yrh0.s(activity, intent, false);
    }

    void b(Bundle bundle);

    void c(Activity activity, Bundle bundle);

    default void d(Uri uri) {
        uri.getClass();
    }
}
