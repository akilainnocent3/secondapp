package yads;

import android.app.Application;
import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class cj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f147749a = new s1();

    public final String a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        this.f147749a.getClass();
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, tu1.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            kotlin.jvm.internal.m0.n(objInvoke, "null cannot be cast to non-null type kotlin.String");
            return (String) objInvoke;
        } catch (Throwable unused) {
            boolean z10 = ad1.f146762a;
            return null;
        }
    }
}
