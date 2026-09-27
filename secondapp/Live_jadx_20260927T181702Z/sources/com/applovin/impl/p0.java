package com.applovin.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f28234a = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f28235b = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f28236c = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f28237d = new HashMap(2);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f28238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f28239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f28240c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f28241d;

        public a(int i10, int i11, int i12, int i13) {
            this.f28238a = i10;
            this.f28239b = i11;
            this.f28240c = i12;
            this.f28241d = i13;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public int b() {
            return this.f28238a;
        }

        public int c() {
            return this.f28240c;
        }

        public int d() {
            return this.f28239b;
        }

        public Map e() {
            HashMap map = new HashMap();
            map.put("left", Integer.valueOf(this.f28238a));
            map.put("top", Integer.valueOf(this.f28239b));
            map.put("right", Integer.valueOf(this.f28240c));
            map.put("bottom", Integer.valueOf(this.f28241d));
            return map;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a(this) && b() == aVar.b() && d() == aVar.d() && c() == aVar.c() && a() == aVar.a();
        }

        public int hashCode() {
            return ((((((b() + 59) * 59) + d()) * 59) + c()) * 59) + a();
        }

        public String toString() {
            return "CompatibilityUtils.Insets(left=" + b() + ", top=" + d() + ", right=" + c() + ", bottom=" + a() + gi.j.f86771d;
        }

        public int a() {
            return this.f28241d;
        }

        public static a a(Insets insets) {
            return new a(insets.left, insets.top, insets.right, insets.bottom);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f28242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f28243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f28244c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f28245d;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f28246a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f28247b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f28248c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f28249d;

            public a a(int i10) {
                this.f28248c = i10;
                return this;
            }

            public a b(int i10) {
                this.f28249d = i10;
                return this;
            }

            public a c(int i10) {
                this.f28246a = i10;
                return this;
            }

            public a d(int i10) {
                this.f28247b = i10;
                return this;
            }

            public String toString() {
                return "CompatibilityUtils.ScreenCornerRadii.ScreenCornerRadiiBuilder(topLeft=" + this.f28246a + ", topRight=" + this.f28247b + ", bottomLeft=" + this.f28248c + ", bottomRight=" + this.f28249d + gi.j.f86771d;
            }

            public b a() {
                return new b(this.f28246a, this.f28247b, this.f28248c, this.f28249d);
            }
        }

        public b(int i10, int i11, int i12, int i13) {
            this.f28242a = i10;
            this.f28243b = i11;
            this.f28244c = i12;
            this.f28245d = i13;
        }

        public boolean a(Object obj) {
            return obj instanceof b;
        }

        public int b() {
            return this.f28245d;
        }

        public int c() {
            return this.f28242a;
        }

        public int d() {
            return this.f28243b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a(this) && c() == bVar.c() && d() == bVar.d() && a() == bVar.a() && b() == bVar.b();
        }

        public int hashCode() {
            return ((((((c() + 59) * 59) + d()) * 59) + a()) * 59) + b();
        }

        public String toString() {
            return "CompatibilityUtils.ScreenCornerRadii(topLeft=" + c() + ", topRight=" + d() + ", bottomLeft=" + a() + ", bottomRight=" + b() + gi.j.f86771d;
        }

        public int a() {
            return this.f28244c;
        }
    }

    public static void a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }

    public static Point b(Context context) {
        int orientation = AppLovinSdkUtils.getOrientation(context);
        com.applovin.impl.sdk.l lVar = com.applovin.impl.sdk.l.E0;
        boolean z10 = lVar == null || ((Boolean) lVar.a(z4.I6)).booleanValue();
        if (!c(context) || z10) {
            Map map = f28237d;
            if (map.containsKey(Integer.valueOf(orientation))) {
                return (Point) map.get(Integer.valueOf(orientation));
            }
        }
        Point point = new Point();
        point.x = 480;
        point.y = 320;
        WindowManager windowManagerF = q7.f(context);
        if (windowManagerF != null) {
            Display defaultDisplay = windowManagerF.getDefaultDisplay();
            if (b()) {
                Rect bounds = windowManagerF.getMaximumWindowMetrics().getBounds();
                point = new Point(bounds.width(), bounds.height());
            } else {
                defaultDisplay.getRealSize(point);
            }
        }
        f28237d.put(Integer.valueOf(orientation), point);
        return point;
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("android.hardware.type.foldable") || packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static a c(WindowInsets windowInsets, com.applovin.impl.sdk.l lVar) {
        if (lVar == null || !((Boolean) lVar.a(z4.J4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        return a.a(windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.statusBars()));
    }

    public static Point a(Context context) {
        Display defaultDisplay = q7.f(context).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static Map c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f28235b.get(str);
    }

    public static a a(WindowInsets windowInsets, com.applovin.impl.sdk.l lVar) {
        if (lVar == null || !((Boolean) lVar.a(z4.J4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.displayCutout());
        return new a(insetsIgnoringVisibility.left, insetsIgnoringVisibility.top, insetsIgnoringVisibility.right, insetsIgnoringVisibility.bottom);
    }

    public static void c(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f28235b.put(str, aVar.e());
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static Map a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f28234a.get(str);
    }

    public static void a(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f28234a.put(str, aVar.e());
    }

    public static a b(WindowInsets windowInsets, com.applovin.impl.sdk.l lVar) {
        if (lVar == null || !((Boolean) lVar.a(z4.J4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        return a.a(windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars()));
    }

    public static b a(Context context, com.applovin.impl.sdk.l lVar) {
        WindowManager windowManagerF;
        if (((Boolean) lVar.a(z4.f29659e4)).booleanValue() && i() && (windowManagerF = q7.f(context)) != null) {
            try {
                Display defaultDisplay = windowManagerF.getDefaultDisplay();
                return new b.a().c(a(0, defaultDisplay)).d(a(1, defaultDisplay)).a(a(3, defaultDisplay)).b(a(2, defaultDisplay)).a();
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Map b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f28236c.get(str);
    }

    public static void b(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f28236c.put(str, aVar.e());
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    private static int a(int i10, Display display) {
        RoundedCorner roundedCorner = display.getRoundedCorner(i10);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return -1;
    }

    public static boolean a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
