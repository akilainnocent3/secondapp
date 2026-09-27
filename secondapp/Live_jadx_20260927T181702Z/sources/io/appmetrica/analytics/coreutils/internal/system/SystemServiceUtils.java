package io.appmetrica.analytics.coreutils.internal.system;

import android.content.Context;
import cs.o;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class SystemServiceUtils {

    @l
    public static final SystemServiceUtils INSTANCE = new SystemServiceUtils();

    private SystemServiceUtils() {
    }

    @o
    @m
    public static final <T, S> S accessSystemServiceByNameSafely(@l Context context, @l String str, @l String str2, @l String str3, @l FunctionWithThrowable<T, S> functionWithThrowable) {
        try {
            return (S) accessSystemServiceSafely(context.getSystemService(str), str2, str3, functionWithThrowable);
        } catch (Throwable unused) {
            return null;
        }
    }

    @o
    public static final <T, S> S accessSystemServiceByNameSafelyOrDefault(@l Context context, @l String str, @l String str2, @l String str3, S s10, @l FunctionWithThrowable<T, S> functionWithThrowable) {
        try {
            return (S) accessSystemServiceSafelyOrDefault(context.getSystemService(str), str2, str3, s10, functionWithThrowable);
        } catch (Throwable unused) {
            return s10;
        }
    }

    @o
    @m
    public static final <T, S> S accessSystemServiceSafely(@m T t10, @l String str, @l String str2, @l FunctionWithThrowable<T, S> functionWithThrowable) {
        if (t10 == null) {
            return null;
        }
        try {
            return functionWithThrowable.apply(t10);
        } catch (Throwable unused) {
            return null;
        }
    }

    @o
    public static final <T, S> S accessSystemServiceSafelyOrDefault(@m T t10, @l String str, @l String str2, S s10, @l FunctionWithThrowable<T, S> functionWithThrowable) {
        S s11 = (S) accessSystemServiceSafely(t10, str, str2, functionWithThrowable);
        return s11 == null ? s10 : s11;
    }
}
