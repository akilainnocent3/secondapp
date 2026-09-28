package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes4.dex */
public final class ajk0 extends o0b {
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static void e(Context context, qgk0 qgk0Var, IntentFilter intentFilter) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            context.registerReceiver(qgk0Var, intentFilter, i >= 33 ? 2 : 0);
        } else {
            context.registerReceiver(qgk0Var, intentFilter);
        }
    }
}
