package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class umx extends saj implements Function1<Context, cva> {
    public static final umx a = new umx(1, eva.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final cva invoke(Context context) {
        Context applicationContext = context.getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null && o0b.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return new dva(connectivityManager);
            } catch (Exception unused) {
            }
        }
        return cva.a;
    }
}
