package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes4.dex */
public final class r0b {
    public static final int a(Context context, int i) {
        context.getClass();
        return (int) (i * context.getResources().getDisplayMetrics().density);
    }

    public static final String b(Context context) {
        context.getClass();
        return (context.getResources().getConfiguration().uiMode & 48) == 32 ? "dark" : "light";
    }

    public static final boolean c(Context context, String str) {
        context.getClass();
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static final boolean d(Context context) {
        context.getClass();
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
