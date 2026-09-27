package fk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<f> f84714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f84715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f84716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f84717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f84718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ck.f f84719h;

    public a(String str, String str2, List<f> list, String str3, String str4, String str5, String str6, ck.f fVar) {
        this.f84712a = str;
        this.f84713b = str2;
        this.f84714c = list;
        this.f84715d = str3;
        this.f84716e = str4;
        this.f84717f = str5;
        this.f84718g = str6;
        this.f84719h = fVar;
    }

    public static a a(Context context, n0 n0Var, String str, String str2, List<f> list, ck.f fVar) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String strG = n0Var.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strB = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = n0.f84864h;
        }
        return new a(str, str2, list, strG, packageName, strB, str3, fVar);
    }

    public static String b(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }
}
