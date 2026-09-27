package f2;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f82628a = 3840;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f82629b = 2160;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(23)
    public static class a {
        @NonNull
        public static b a(@NonNull Context context, @NonNull Display display) {
            Display.Mode mode = display.getMode();
            Point pointA = x.a(context, display);
            return (pointA == null || d(mode, pointA)) ? new b(mode, true) : new b(mode, pointA);
        }

        @NonNull
        @SuppressLint({"ArrayReturn"})
        public static b[] b(@NonNull Context context, @NonNull Display display) {
            Display.Mode[] supportedModes = display.getSupportedModes();
            b[] bVarArr = new b[supportedModes.length];
            Display.Mode mode = display.getMode();
            Point pointA = x.a(context, display);
            if (pointA == null || d(mode, pointA)) {
                for (int i10 = 0; i10 < supportedModes.length; i10++) {
                    bVarArr[i10] = new b(supportedModes[i10], e(supportedModes[i10], mode));
                }
            } else {
                for (int i11 = 0; i11 < supportedModes.length; i11++) {
                    bVarArr[i11] = e(supportedModes[i11], mode) ? new b(supportedModes[i11], pointA) : new b(supportedModes[i11], false);
                }
            }
            return bVarArr;
        }

        public static boolean c(@NonNull Display display) {
            Display.Mode mode = display.getMode();
            for (Display.Mode mode2 : display.getSupportedModes()) {
                if (mode.getPhysicalHeight() < mode2.getPhysicalHeight() || mode.getPhysicalWidth() < mode2.getPhysicalWidth()) {
                    return false;
                }
            }
            return true;
        }

        public static boolean d(Display.Mode mode, Point point) {
            if (mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) {
                return true;
            }
            return mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x;
        }

        public static boolean e(Display.Mode mode, Display.Mode mode2) {
            return mode.getPhysicalWidth() == mode2.getPhysicalWidth() && mode.getPhysicalHeight() == mode2.getPhysicalHeight();
        }
    }

    public static Point a(@NonNull Context context, @NonNull Display display) {
        Point pointJ = Build.VERSION.SDK_INT < 28 ? j("sys.display-size", display) : j("vendor.display-size", display);
        if (pointJ != null) {
            return pointJ;
        }
        if (g(context) && f(display)) {
            return new Point(3840, f82629b);
        }
        return null;
    }

    @NonNull
    public static Point b(@NonNull Context context, @NonNull Display display) {
        Point pointA = a(context, display);
        if (pointA != null) {
            return pointA;
        }
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }

    @NonNull
    public static b c(@NonNull Context context, @NonNull Display display) {
        return a.a(context, display);
    }

    @NonNull
    @SuppressLint({"ArrayReturn"})
    public static b[] d(@NonNull Context context, @NonNull Display display) {
        return a.b(context, display);
    }

    @Nullable
    public static String e(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean f(@NonNull Display display) {
        return a.c(display);
    }

    public static boolean g(@NonNull Context context) {
        return h(context) && "Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd");
    }

    public static boolean h(@NonNull Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static Point i(@NonNull String str) throws NumberFormatException {
        String[] strArrSplit = str.trim().split("x", -1);
        if (strArrSplit.length == 2) {
            int i10 = Integer.parseInt(strArrSplit[0]);
            int i11 = Integer.parseInt(strArrSplit[1]);
            if (i10 > 0 && i11 > 0) {
                return new Point(i10, i11);
            }
        }
        throw new NumberFormatException();
    }

    @Nullable
    public static Point j(@NonNull String str, @NonNull Display display) {
        if (display.getDisplayId() != 0) {
            return null;
        }
        String strE = e(str);
        if (!TextUtils.isEmpty(strE) && strE != null) {
            try {
                return i(strE);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Display.Mode f82630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Point f82631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f82632c;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @k.t0(23)
        public static class a {
            @k.t
            public static int a(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }

            @k.t
            public static int b(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }
        }

        public b(@NonNull Point point) {
            e2.x.m(point, "physicalSize == null");
            this.f82631b = point;
            this.f82630a = null;
            this.f82632c = true;
        }

        public int a() {
            return this.f82631b.y;
        }

        public int b() {
            return this.f82631b.x;
        }

        @Deprecated
        public boolean c() {
            return this.f82632c;
        }

        @Nullable
        @k.t0(23)
        public Display.Mode d() {
            return this.f82630a;
        }

        @k.t0(23)
        public b(@NonNull Display.Mode mode, boolean z10) {
            e2.x.m(mode, "mode == null, can't wrap a null reference");
            this.f82631b = new Point(a.b(mode), a.a(mode));
            this.f82630a = mode;
            this.f82632c = z10;
        }

        @k.t0(23)
        public b(@NonNull Display.Mode mode, @NonNull Point point) {
            e2.x.m(mode, "mode == null, can't wrap a null reference");
            e2.x.m(point, "physicalSize == null");
            this.f82631b = point;
            this.f82630a = mode;
            this.f82632c = true;
        }
    }
}
