package io.appmetrica.analytics.coreutils.internal.system;

import android.annotation.SuppressLint;
import android.content.Context;
import cs.o;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class SystemPropertiesHelper {

    @l
    public static final SystemPropertiesHelper INSTANCE = new SystemPropertiesHelper();

    private SystemPropertiesHelper() {
    }

    @l
    @SuppressLint({"PrivateApi"})
    @o
    public static final String readSystemProperty(@l String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties", true, Context.class.getClassLoader());
            Object objInvoke = cls.getMethod("get", String.class).invoke(cls, str);
            String str2 = objInvoke instanceof String ? (String) objInvoke : null;
            return str2 == null ? "" : str2;
        } catch (Exception unused) {
            return "";
        }
    }
}
