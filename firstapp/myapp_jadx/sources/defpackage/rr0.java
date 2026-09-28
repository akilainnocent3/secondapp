package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class rr0 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final lbe h;

    public rr0(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, lbe lbeVar) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = lbeVar;
    }

    public static rr0 a(Context context, x6n x6nVar, String str, String str2, ArrayList arrayList, lbe lbeVar) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String strD = x6nVar.d();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String string = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new rr0(str, str2, arrayList, strD, packageName, string, str3, lbeVar);
    }
}
