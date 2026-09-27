package pa;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import com.ironsource.Y1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f120534a = androidx.work.r.f("PackageManagerHelper");

    public static boolean a(Context context, Class<?> klazz) {
        return b(context, klazz.getName());
    }

    public static boolean b(Context context, String className) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, className)) == 1;
    }

    public static void c(@NonNull Context context, @NonNull Class<?> klazz, boolean enabled) {
        String str = Y1.f60332e;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, klazz.getName()), enabled ? 1 : 2, 1);
            androidx.work.r.c().a(f120534a, String.format("%s %s", klazz.getName(), enabled ? "enabled" : Y1.f60332e), new Throwable[0]);
        } catch (Exception e10) {
            androidx.work.r rVarC = androidx.work.r.c();
            String str2 = f120534a;
            String name = klazz.getName();
            if (enabled) {
                str = "enabled";
            }
            rVarC.a(str2, String.format("%s could not be %s", name, str), e10);
        }
    }
}
