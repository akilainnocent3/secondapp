package x4;

import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class a {
    @qj.m(imports = {"com.google.common.base.Preconditions"}, replacement = "Preconditions.checkArgument(expression)")
    @Deprecated
    @ky.d
    public static void a(boolean z10) {
        zi.l0.d(z10);
    }

    @qj.m(imports = {"com.google.common.base.Preconditions"}, replacement = "Preconditions.checkArgument(expression, errorMessage)")
    @Deprecated
    @ky.d
    public static void b(boolean z10, Object obj) {
        zi.l0.e(z10, obj);
    }

    @Deprecated
    @ky.d
    public static int c(int i10, int i11, int i12) {
        if (i10 < i11 || i10 >= i12) {
            throw new IndexOutOfBoundsException();
        }
        return i10;
    }

    @qj.m(imports = {"com.google.common.base.Preconditions", "android.os.Looper"}, replacement = "Preconditions.checkState(Looper.myLooper() == Looper.getMainLooper(), \"Not in application's main thread\")")
    @Deprecated
    @ky.d
    public static void d() {
        zi.l0.h0(Looper.myLooper() == Looper.getMainLooper(), "Not in application's main thread");
    }

    @Deprecated
    @ky.d
    @ux.d({"#1"})
    public static String e(@Nullable String str) {
        zi.l0.d(!TextUtils.isEmpty(str));
        return str;
    }

    @Deprecated
    @ky.d
    @ux.d({"#1"})
    public static String f(@Nullable String str, Object obj) {
        zi.l0.e(!TextUtils.isEmpty(str), obj);
        return str;
    }

    @qj.m(imports = {"com.google.common.base.Preconditions"}, replacement = "Preconditions.checkNotNull(reference)")
    @Deprecated
    @ky.d
    @ux.d({"#1"})
    public static <T> T g(@Nullable T t10) {
        return (T) zi.l0.E(t10);
    }

    @qj.m(imports = {"com.google.common.base.Preconditions"}, replacement = "Preconditions.checkNotNull(reference, errorMessage)")
    @Deprecated
    @ky.d
    @ux.d({"#1"})
    public static <T> T h(@Nullable T t10, Object obj) {
        return (T) zi.l0.F(t10, obj);
    }

    @qj.m(imports = {"com.google.common.base.Preconditions"}, replacement = "Preconditions.checkState(expression)")
    @Deprecated
    @ky.d
    public static void i(boolean z10) {
        zi.l0.g0(z10);
    }

    @qj.m(imports = {"com.google.common.base.Preconditions"}, replacement = "Preconditions.checkState(expression, errorMessage)")
    @Deprecated
    @ky.d
    public static void j(boolean z10, Object obj) {
        zi.l0.h0(z10, obj);
    }

    @qj.m(imports = {"com.google.common.base.Preconditions"}, replacement = "Preconditions.checkNotNull(reference)")
    @Deprecated
    @ky.d
    @ux.d({"#1"})
    public static <T> T k(@Nullable T t10) {
        return (T) zi.l0.E(t10);
    }

    @qj.m(imports = {"com.google.common.base.Preconditions"}, replacement = "Preconditions.checkNotNull(reference, errorMessage)")
    @Deprecated
    @ky.d
    @ux.d({"#1"})
    public static <T> T l(@Nullable T t10, Object obj) {
        return (T) zi.l0.F(t10, obj);
    }
}
