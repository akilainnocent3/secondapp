package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class syb {
    private static boolean hww(View view, int i10) {
        float fHww = hww(view);
        return fHww > 0.0f && fHww >= ((float) i10) / 100.0f;
    }

    private static int sd(View view, int i10) {
        if (i10 == 3) {
            return com.bytedance.sdk.openadsdk.utils.wdz.hv(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    private static boolean tq(View view) {
        return view != null && view.isShown();
    }

    public static float hww(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0 && view.getParent() != null) {
                    Rect rect = new Rect();
                    if (!view.getGlobalVisibleRect(rect)) {
                        return -1.0f;
                    }
                    long jHeight = ((long) rect.height()) * ((long) rect.width());
                    long height = ((long) view.getHeight()) * ((long) view.getWidth());
                    if (height <= 0) {
                        return -1.0f;
                    }
                    return jHeight / height;
                }
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }

    private static int tq(View view, int i10) {
        if (i10 == 3) {
            return (int) (((double) com.bytedance.sdk.openadsdk.utils.wdz.sd(view.getContext().getApplicationContext())) * 0.7d);
        }
        return 20;
    }

    private static int tq(View view, int i10, int i11, boolean z10) throws Throwable {
        if (view.getWindowVisibility() != 0) {
            return 4;
        }
        if (!tq(view)) {
            return 1;
        }
        if (hww(view, i11, z10)) {
            return !hww(view, i10) ? 3 : 0;
        }
        return 6;
    }

    private static boolean hww(View view, int i10, boolean z10) {
        int iTq = tq(view, i10);
        int iSd = sd(view, i10);
        if (i10 == 1 && z10) {
            return view.getWidth() > 0 && view.getHeight() > 0;
        }
        return view.getWidth() >= iTq && view.getHeight() >= iSd;
    }

    public static boolean hww(View view, int i10, int i11, boolean z10) {
        if (i11 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() != 0) {
                        return false;
                    }
                    if ((view instanceof com.bytedance.sdk.openadsdk.core.rs.omn) || (view instanceof com.bytedance.sdk.openadsdk.core.vy.vy)) {
                        break;
                    }
                    view = (View) view.getParent();
                } catch (Throwable unused) {
                }
            }
            if (z10) {
                i10 = 0;
            }
        }
        return tq(view, i10, i11, z10) == 0;
    }
}
