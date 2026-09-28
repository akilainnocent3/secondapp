package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public final class gg80 {
    public static final gg80 a = new gg80();
    public static final jcp b;

    static {
        kcp kcpVar = new kcp();
        kcpVar.a(fg80.class, gf1.a);
        kcpVar.a(rg80.class, hf1.a);
        kcpVar.a(xoc.class, ef1.a);
        kcpVar.a(xu0.class, df1.a);
        kcpVar.a(u20.class, cf1.a);
        kcpVar.a(cx20.class, ff1.a);
        kcpVar.d = true;
        b = new jcp(kcpVar);
    }

    public static xu0 a(yoh yohVar) throws PackageManager.NameNotFoundException {
        yohVar.a();
        Context context = yohVar.a;
        context.getClass();
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        yohVar.a();
        String str = yohVar.c.b;
        str.getClass();
        Build.MODEL.getClass();
        Build.VERSION.RELEASE.getClass();
        fft fftVar = fft.LOG_ENVIRONMENT_PROD;
        packageName.getClass();
        String str2 = packageInfo.versionName;
        if (str2 == null) {
            str2 = strValueOf;
        }
        Build.MANUFACTURER.getClass();
        yohVar.a();
        cx20 cx20VarB = dx20.b(context);
        yohVar.a();
        return new xu0(str, new u20(packageName, str2, strValueOf, cx20VarB, dx20.a(context)));
    }
}
