package eh;

import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a {
    @ky.d
    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    @ky.d
    public static void b(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @ky.d
    public static int c(int i10, int i11, int i12) {
        if (i10 < i11 || i10 >= i12) {
            throw new IndexOutOfBoundsException();
        }
        return i10;
    }

    @ky.d
    public static void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Not in applications main thread");
        }
    }

    @ky.d
    @ux.d({"#1"})
    public static String e(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    @ky.d
    @ux.d({"#1"})
    public static String f(@Nullable String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    @ky.d
    @ux.d({"#1"})
    public static <T> T g(@Nullable T t10) {
        t10.getClass();
        return t10;
    }

    @ky.d
    @ux.d({"#1"})
    public static <T> T h(@Nullable T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @ky.d
    public static void i(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    @ky.d
    public static void j(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @ky.d
    @ux.d({"#1"})
    public static <T> T k(@Nullable T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException();
    }

    @ky.d
    @ux.d({"#1"})
    public static <T> T l(@Nullable T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
