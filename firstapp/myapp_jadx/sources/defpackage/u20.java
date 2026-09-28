package defpackage;

import android.os.Build;
import com.appsflyer.internal.m;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u20 {
    public final String a;
    public final String b;
    public final String c;
    public final cx20 d;
    public final ArrayList e;

    public u20(String str, String str2, String str3, cx20 cx20Var, ArrayList arrayList) {
        m.a(str2, str3, Build.MANUFACTURER);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = cx20Var;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u20)) {
            return false;
        }
        u20 u20Var = (u20) obj;
        if (!this.a.equals(u20Var.a) || !Intrinsics.g(this.b, u20Var.b) || !Intrinsics.g(this.c, u20Var.c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return Intrinsics.g(str, str) && this.d.equals(u20Var.d) && this.e.equals(u20Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
