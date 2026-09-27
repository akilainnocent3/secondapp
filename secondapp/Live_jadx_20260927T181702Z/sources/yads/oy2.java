package yads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.UserManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class oy2 {
    public static SharedPreferences a(oy2 oy2Var, Context context, String str) {
        Object objB;
        oy2Var.getClass();
        try {
            dr.i1.a aVar = dr.i1.f79460c;
            Object systemService = context.getSystemService("user");
            kotlin.jvm.internal.m0.n(systemService, "null cannot be cast to non-null type android.os.UserManager");
            objB = dr.i1.b(Boolean.valueOf(((UserManager) systemService).isUserUnlocked()));
        } catch (Throwable th2) {
            dr.i1.a aVar2 = dr.i1.f79460c;
            objB = dr.i1.b(dr.j1.a(th2));
        }
        Boolean bool = Boolean.TRUE;
        if (dr.i1.i(objB)) {
            objB = bool;
        }
        return (((Boolean) objB).booleanValue() || Build.VERSION.SDK_INT < 24) ? context.getSharedPreferences(str, 0) : context.createDeviceProtectedStorageContext().getSharedPreferences(str, 0);
    }
}
