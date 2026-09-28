package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;

/* JADX INFO: loaded from: classes4.dex */
public final class the {
    public static Boolean a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Boolean boolValueOf = a;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            a = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean b(Context context) {
        a(context);
        Boolean boolValueOf = b;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.getPackageManager().hasSystemFeature(gvQvkPPtA.HvhiggR));
            b = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            if (!bl10.a() || Build.VERSION.SDK_INT >= 30) {
                return true;
            }
            return false;
        }
        return false;
    }
}
