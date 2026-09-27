package fk;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f84919b = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f84920a;

    public static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    public synchronized String a(Context context) {
        try {
            if (this.f84920a == null) {
                this.f84920a = b(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return "".equals(this.f84920a) ? null : this.f84920a;
    }
}
