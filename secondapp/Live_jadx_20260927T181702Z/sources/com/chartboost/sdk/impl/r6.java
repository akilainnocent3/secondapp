package com.chartboost.sdk.impl;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class r6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowManager f40743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f40744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ds.a f40745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DisplayMetrics f40746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f40747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f40748f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f40749b = new a();

        public a() {
            super(0);
        }

        @Override // ds.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
    }

    public r6(WindowManager windowManager, DisplayMetrics displayMetrics, ds.a androidVersion, DisplayMetrics realDisplayMetrics) {
        kotlin.jvm.internal.m0.p(windowManager, "windowManager");
        kotlin.jvm.internal.m0.p(displayMetrics, "displayMetrics");
        kotlin.jvm.internal.m0.p(androidVersion, "androidVersion");
        kotlin.jvm.internal.m0.p(realDisplayMetrics, "realDisplayMetrics");
        this.f40743a = windowManager;
        this.f40744b = displayMetrics;
        this.f40745c = androidVersion;
        this.f40746d = realDisplayMetrics;
        this.f40747e = displayMetrics.density;
        this.f40748f = displayMetrics.densityDpi;
    }

    public final s6 a(WindowManager windowManager) {
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        kotlin.jvm.internal.m0.o(currentWindowMetrics, "getCurrentWindowMetrics(...)");
        WindowInsets windowInsets = currentWindowMetrics.getWindowInsets();
        kotlin.jvm.internal.m0.o(windowInsets, "getWindowInsets(...)");
        Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
        kotlin.jvm.internal.m0.o(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        int i10 = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
        int i11 = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
        Rect bounds = currentWindowMetrics.getBounds();
        kotlin.jvm.internal.m0.o(bounds, "getBounds(...)");
        return new s6(bounds.width() - i10, bounds.height() - i11);
    }

    public final float b() {
        return this.f40747e;
    }

    public final int c() {
        return this.f40748f;
    }

    public final s6 d() {
        try {
            if (((Number) this.f40745c.invoke()).intValue() >= 30) {
                Rect bounds = this.f40743a.getCurrentWindowMetrics().getBounds();
                return new s6(bounds.width(), bounds.height());
            }
            this.f40746d.setTo(this.f40744b);
            Display defaultDisplay = this.f40743a.getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getRealMetrics(this.f40746d);
            }
            DisplayMetrics displayMetrics = this.f40746d;
            return new s6(displayMetrics.widthPixels, displayMetrics.heightPixels);
        } catch (Exception e10) {
            sb.b("Cannot create size", e10);
            return new s6(0, 0);
        }
    }

    public /* synthetic */ r6(WindowManager windowManager, DisplayMetrics displayMetrics, ds.a aVar, DisplayMetrics displayMetrics2, int i10, kotlin.jvm.internal.x xVar) {
        this(windowManager, displayMetrics, (i10 & 4) != 0 ? a.f40749b : aVar, (i10 & 8) != 0 ? new DisplayMetrics() : displayMetrics2);
    }

    public final s6 a() {
        try {
            if (((Number) this.f40745c.invoke()).intValue() >= 30) {
                return a(this.f40743a);
            }
            DisplayMetrics displayMetrics = this.f40744b;
            return new s6(displayMetrics.widthPixels, displayMetrics.heightPixels);
        } catch (Exception e10) {
            sb.b("Cannot create device size", e10);
            return new s6(0, 0);
        }
    }
}
