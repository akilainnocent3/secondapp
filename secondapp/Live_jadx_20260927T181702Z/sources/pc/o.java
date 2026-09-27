package pc;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f120696a = 31;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f120697b = 17;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f120698c = cv.k.f77221a.toCharArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f120699d = new char[64];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static volatile Handler f120700e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f120701a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f120701a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f120701a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f120701a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f120701a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f120701a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @NonNull
    public static String A(@NonNull byte[] bArr) {
        String strF;
        char[] cArr = f120699d;
        synchronized (cArr) {
            strF = f(bArr, cArr);
        }
        return strF;
    }

    public static void a() {
        if (!u()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static void b() {
        if (!v()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean c(@Nullable lc.a<?> aVar, @Nullable lc.a<?> aVar2) {
        if (aVar == null) {
            return aVar2 == null;
        }
        return aVar.Y(aVar2);
    }

    public static boolean d(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj instanceof ac.m ? ((ac.m) obj).a(obj2) : obj.equals(obj2);
    }

    public static boolean e(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @NonNull
    public static String f(@NonNull byte[] bArr, @NonNull char[] cArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f120698c;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & zi.c.f161639q];
        }
        return new String(cArr);
    }

    @NonNull
    public static <T> Queue<T> g(int i10) {
        return new ArrayDeque(i10);
    }

    public static int h(int i10, int i11, @Nullable Bitmap.Config config) {
        return i10 * i11 * j(config);
    }

    @TargetApi(19)
    public static int i(@NonNull Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + C4235d4.j.f61460d + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int j(@Nullable Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i10 = a.f120701a[config.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2 && i10 != 3) {
                return i10 != 4 ? 4 : 8;
            }
        }
        return i11;
    }

    @Deprecated
    public static int k(@NonNull Bitmap bitmap) {
        return i(bitmap);
    }

    @NonNull
    public static <T> List<T> l(@NonNull Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t10 : collection) {
            if (t10 != null) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static Handler m() {
        if (f120700e == null) {
            synchronized (o.class) {
                try {
                    if (f120700e == null) {
                        f120700e = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f120700e;
    }

    public static int n(float f10) {
        return o(f10, 17);
    }

    public static int o(float f10, int i10) {
        return q(Float.floatToIntBits(f10), i10);
    }

    public static int p(int i10) {
        return q(i10, 17);
    }

    public static int q(int i10, int i11) {
        return (i11 * 31) + i10;
    }

    public static int r(@Nullable Object obj, int i10) {
        return q(obj == null ? 0 : obj.hashCode(), i10);
    }

    public static int s(boolean z10) {
        return t(z10, 17);
    }

    public static int t(boolean z10, int i10) {
        return q(z10 ? 1 : 0, i10);
    }

    public static boolean u() {
        return !v();
    }

    public static boolean v() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean w(int i10) {
        return i10 > 0 || i10 == Integer.MIN_VALUE;
    }

    public static boolean x(int i10, int i11) {
        return w(i10) && w(i11);
    }

    public static void y(Runnable runnable) {
        m().post(runnable);
    }

    public static void z(Runnable runnable) {
        m().removeCallbacks(runnable);
    }
}
