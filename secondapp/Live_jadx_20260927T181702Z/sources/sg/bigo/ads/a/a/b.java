package sg.bigo.ads.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.session.fe;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f130679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f130680b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f130681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f130682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f130683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f130684d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f130685e;

        public a(boolean z10, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.f130681a = z10;
            this.f130685e = str;
            this.f130684d = str2;
            this.f130683c = str3;
            this.f130682b = str4;
        }
    }

    @NonNull
    public static a a(Context context) {
        String string;
        String str;
        String str2;
        String str3;
        String strValueOf;
        int iIndexOf;
        a aVar = f130680b;
        if (aVar != null) {
            return aVar;
        }
        boolean z10 = false;
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com")), 0);
        String strConcat = null;
        String str4 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.chrome", 0);
            if (packageInfo == null || !"com.android.chrome".equals(packageInfo.packageName)) {
                string = "No chrome pkg";
                str = string;
                str2 = strConcat;
            } else {
                f130679a = "com.android.chrome";
                String str5 = packageInfo.versionName;
                try {
                    String strSubstring = (TextUtils.isEmpty(str5) || (iIndexOf = str5.indexOf(fe.F)) < 0) ? null : str5.substring(0, iIndexOf);
                    if (TextUtils.isEmpty(strSubstring)) {
                        str3 = "Invalid chrome version: ";
                        strValueOf = String.valueOf(str5);
                    } else {
                        if (Integer.parseInt(strSubstring) >= 45) {
                            z10 = true;
                        } else {
                            str3 = "Chrome version is low: ";
                            strValueOf = String.valueOf(str5);
                        }
                        str2 = str5;
                        str = strConcat;
                    }
                    strConcat = str3.concat(strValueOf);
                    str2 = str5;
                    str = strConcat;
                } catch (PackageManager.NameNotFoundException e10) {
                    e = e10;
                    strConcat = str5;
                    string = e.toString();
                    str = string;
                    str2 = strConcat;
                } catch (Exception e11) {
                    e = e11;
                    strConcat = str5;
                    string = e.toString();
                    str = string;
                    str2 = strConcat;
                }
            }
        } catch (PackageManager.NameNotFoundException e12) {
            e = e12;
        } catch (Exception e13) {
            e = e13;
        }
        a aVar2 = new a(z10, f130679a, str2, str4, str);
        f130680b = aVar2;
        return aVar2;
    }
}
