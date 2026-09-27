package yads;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class l53 implements eb3 {
    public final String a() {
        String property;
        String property2 = null;
        try {
            property = System.getProperty("http.agent");
        } catch (Exception unused) {
            boolean z10 = ad1.f146762a;
            property = null;
        }
        if (property != null && property.length() != 0) {
            return property;
        }
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("Dalvik/");
        try {
            property2 = System.getProperty("java.vm.version");
        } catch (Exception unused2) {
            boolean z11 = ad1.f146762a;
        }
        if (property2 == null || property2.length() == 0) {
            property2 = "1.0.0";
        }
        sb2.append(property2);
        sb2.append(" (Linux; U; Android ");
        String str = Build.VERSION.RELEASE;
        if (str.length() == 0) {
            str = "1.0";
        }
        sb2.append(str);
        if (kotlin.jvm.internal.m0.g("REL", Build.VERSION.CODENAME)) {
            String str2 = Build.MODEL;
            if (str2.length() > 0) {
                sb2.append("; ");
                sb2.append(str2);
            }
        }
        String str3 = Build.ID;
        if (str3.length() > 0) {
            sb2.append(" Build/");
            sb2.append(str3);
        }
        sb2.append(gi.j.f86771d);
        return sb2.toString();
    }
}
