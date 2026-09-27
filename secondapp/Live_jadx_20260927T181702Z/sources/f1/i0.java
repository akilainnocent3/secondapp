package f1;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f82253a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f82254b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f82255c = -2;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public @interface a {
    }

    public static int a(@NonNull Context context, @NonNull String str) {
        return c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    public static int b(@NonNull Context context, @NonNull String str, @Nullable String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static int c(@NonNull Context context, @NonNull String str, int i10, int i11, @Nullable String str2) {
        if (context.checkPermission(str, i10, i11) == -1) {
            return -1;
        }
        String strF = d1.k.f(str);
        if (strF == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return ((Process.myUid() != i11 || !e2.s.a(context.getPackageName(), str2)) ? d1.k.e(context, strF, str2) : d1.k.a(context, i11, strF, str2)) == 0 ? 0 : -2;
    }

    public static int d(@NonNull Context context, @NonNull String str) {
        return c(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
