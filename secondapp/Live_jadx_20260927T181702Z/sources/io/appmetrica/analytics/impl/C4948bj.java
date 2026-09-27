package io.appmetrica.analytics.impl;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bj, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4948bj {
    public static ScreenInfo a(Context context) {
        Point point;
        int i10;
        float f10;
        Display display;
        try {
            if (AndroidUtils.isApiAchieved(30)) {
                try {
                    display = context.getDisplay();
                } catch (Throwable unused) {
                    display = null;
                }
            } else {
                display = null;
            }
            if (display == null) {
                display = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            }
            point = display != null ? (Point) SystemServiceUtils.accessSystemServiceSafely(display, "getting display metrics", "Display", new C4922aj()) : null;
        } catch (Throwable unused2) {
        }
        if (point == null) {
            return null;
        }
        int iMax = Math.max(point.x, point.y);
        int iMin = Math.min(point.x, point.y);
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            i10 = displayMetrics.densityDpi;
            try {
                f10 = displayMetrics.density;
            } catch (Throwable unused3) {
                f10 = 0.0f;
            }
        } catch (Throwable unused4) {
            i10 = 0;
        }
        return new ScreenInfo(iMax, iMin, i10, f10);
    }
}
