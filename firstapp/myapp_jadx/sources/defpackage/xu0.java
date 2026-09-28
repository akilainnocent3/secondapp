package defpackage;

import android.os.Build;
import com.appsflyer.internal.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xu0 {
    public final String a;
    public final u20 b;

    public xu0(String str, u20 u20Var) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        fft fftVar = fft.LOG_ENVIRONMENT_PROD;
        m.a(str, str2, str3);
        this.a = str;
        this.b = u20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu0)) {
            return false;
        }
        xu0 xu0Var = (xu0) obj;
        if (!Intrinsics.g(this.a, xu0Var.a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!Intrinsics.g(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        if (!Intrinsics.g(str2, str2)) {
            return false;
        }
        fft fftVar = fft.LOG_ENVIRONMENT_PROD;
        return this.b.equals(xu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((fft.LOG_ENVIRONMENT_PROD.hashCode() + gmf0.a((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 48517560) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.1, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + fft.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.b + ')';
    }
}
