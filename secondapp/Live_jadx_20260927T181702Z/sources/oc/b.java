package oc;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import k.h1;
import tb.f;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f118992a = "AppVersionSignature";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentMap<String, f> f118993b = new ConcurrentHashMap();

    @Nullable
    public static PackageInfo a(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(f118992a, "Cannot resolve info for" + context.getPackageName(), e10);
            return null;
        }
    }

    @NonNull
    public static String b(@Nullable PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    @NonNull
    public static f c(@NonNull Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, f> concurrentMap = f118993b;
        f fVar = concurrentMap.get(packageName);
        if (fVar != null) {
            return fVar;
        }
        f fVarD = d(context);
        f fVarPutIfAbsent = concurrentMap.putIfAbsent(packageName, fVarD);
        return fVarPutIfAbsent == null ? fVarD : fVarPutIfAbsent;
    }

    @NonNull
    public static f d(@NonNull Context context) {
        return new e(b(a(context)));
    }

    @h1
    public static void e() {
        f118993b.clear();
    }
}
