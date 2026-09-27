package d1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f77496a = "android.support.AppLaunchChecker";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f77497b = "startedFromLauncher";

    @Deprecated
    public i() {
    }

    public static boolean a(@NonNull Context context) {
        return context.getSharedPreferences(f77496a, 0).getBoolean(f77497b, false);
    }

    public static void b(@NonNull Activity activity) {
        Intent intent;
        SharedPreferences sharedPreferences = activity.getSharedPreferences(f77496a, 0);
        if (sharedPreferences.getBoolean(f77497b, false) || (intent = activity.getIntent()) == null || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return;
        }
        if (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory(f1.f.f82215e)) {
            sharedPreferences.edit().putBoolean(f77497b, true).apply();
        }
    }
}
