package g2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final int A = 64;
    public static final int B = 128;
    public static final int C = 256;
    public static final int D = 512;
    public static final int E = 1024;
    public static final int F = 2048;
    public static final int G = 4096;
    public static final int H = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f85818a = 128;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f85819b = 256;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f85820c = 512;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f85821d = 1024;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f85822e = 2048;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f85823f = 4096;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final int f85824g = 8192;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f85825h = 16384;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f85826i = 32768;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f85827j = 65536;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f85828k = 131072;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f85829l = 262144;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f85830m = 524288;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f85831n = 1048576;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f85832o = 2097152;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f85833p = 4194304;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f85834q = 8388608;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f85835r = 16777216;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f85836s = 67108864;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f85837t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f85838u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f85839v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f85840w = 4;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f85841x = 8;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f85842y = 16;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f85843z = 32;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(34)
    public static class a {
        @k.t
        public static boolean a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.isAccessibilityDataSensitive();
        }

        @k.t
        public static void b(AccessibilityEvent accessibilityEvent, boolean z10) {
            accessibilityEvent.setAccessibilityDataSensitive(z10);
        }
    }

    /* JADX INFO: renamed from: g2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public @interface InterfaceC0838b {
    }

    @Deprecated
    public static void a(AccessibilityEvent accessibilityEvent, t0 t0Var) {
        accessibilityEvent.appendRecord((AccessibilityRecord) t0Var.g());
    }

    @Deprecated
    public static t0 b(AccessibilityEvent accessibilityEvent) {
        return new t0(accessibilityEvent);
    }

    public static int c(@NonNull AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getAction();
    }

    @SuppressLint({"WrongConstant"})
    public static int d(@NonNull AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static int e(@NonNull AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getMovementGranularity();
    }

    @Deprecated
    public static t0 f(AccessibilityEvent accessibilityEvent, int i10) {
        return new t0(accessibilityEvent.getRecord(i10));
    }

    @Deprecated
    public static int g(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    public static boolean h(@NonNull AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(accessibilityEvent);
        }
        return false;
    }

    public static void i(@NonNull AccessibilityEvent accessibilityEvent, boolean z10) {
        if (Build.VERSION.SDK_INT >= 34) {
            a.b(accessibilityEvent, z10);
        }
    }

    public static void j(@NonNull AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setAction(i10);
    }

    public static void k(@NonNull AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setContentChangeTypes(i10);
    }

    public static void l(@NonNull AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setMovementGranularity(i10);
    }
}
