package d1;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f77511a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f77512b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f77513c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f77514d = 3;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(23)
    public static class a {
        @k.t
        public static <T> T a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @k.t
        public static int b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        @k.t
        public static int c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        @k.t
        public static String d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(29)
    public static class b {
        @k.t
        public static int a(@Nullable AppOpsManager appOpsManager, @NonNull String str, int i10, @NonNull String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i10, str2);
        }

        @NonNull
        @k.t
        public static String b(@NonNull Context context) {
            return context.getOpPackageName();
        }

        @Nullable
        @k.t
        public static AppOpsManager c(@NonNull Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    public static int a(@NonNull Context context, int i10, @NonNull String str, @NonNull String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return e(context, str, str2);
        }
        AppOpsManager appOpsManagerC = b.c(context);
        int iA = b.a(appOpsManagerC, str, Binder.getCallingUid(), str2);
        return iA != 0 ? iA : b.a(appOpsManagerC, str, i10, b.b(context));
    }

    public static int b(@NonNull Context context, @NonNull String str, int i10, @NonNull String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOp(str, i10, str2);
    }

    public static int c(@NonNull Context context, @NonNull String str, int i10, @NonNull String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOpNoThrow(str, i10, str2);
    }

    public static int d(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        return a.b((AppOpsManager) a.a(context, AppOpsManager.class), str, str2);
    }

    public static int e(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        return a.c((AppOpsManager) a.a(context, AppOpsManager.class), str, str2);
    }

    @Nullable
    public static String f(@NonNull String str) {
        return a.d(str);
    }
}
