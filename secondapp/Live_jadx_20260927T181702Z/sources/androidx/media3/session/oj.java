package androidx.media3.session;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class oj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f16265a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16266b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16267c = 2;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static int a(Context context, @Nullable String str, int i10) {
        if (str == null) {
            return 1;
        }
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid == null || packagesForUid.length == 0) {
            return 2;
        }
        for (String str2 : packagesForUid) {
            if (str2.equals(str)) {
                return 0;
            }
        }
        return 1;
    }

    public static void b(@Nullable c0 c0Var) {
        if (c0Var != null) {
            try {
                c0Var.d(0);
            } catch (RemoteException unused) {
            }
        }
    }
}
