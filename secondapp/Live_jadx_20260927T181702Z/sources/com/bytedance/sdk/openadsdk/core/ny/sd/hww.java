package com.bytedance.sdk.openadsdk.core.ny.sd;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.utils.wdz;
import java.util.HashSet;
import java.util.Set;
import u4.l1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {
    public static final Set<String> hww = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.ny.sd.hww.1
        {
            add("image/jpeg");
            add("image/png");
            add(l1.f138662g1);
            add("image/gif");
            add("image/jpg");
        }
    };

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public static Set<String> f36547tq = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.ny.sd.hww.2
        {
            add("application/x-javascript");
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ny.sd.hww$hww, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum EnumC0352hww {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum tq {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    @NonNull
    public static Point hww(Context context, int i10, int i11, tq tqVar) {
        if (context == null) {
            context = bs.hww();
        }
        Point point = new Point(i10, i11);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int iTq = wdz.tq(context, i10);
        int iTq2 = wdz.tq(context, i11);
        if (iTq > width || iTq2 > height) {
            Point point2 = new Point();
            if (tq.HTML_RESOURCE == tqVar) {
                point2.x = Math.min(width, iTq);
                point2.y = Math.min(height, iTq2);
            } else {
                float f10 = iTq;
                float f11 = f10 / width;
                float f12 = iTq2;
                float f13 = f12 / height;
                if (f11 >= f13) {
                    point2.x = width;
                    point2.y = (int) (f12 / f11);
                } else {
                    point2.x = (int) (f10 / f13);
                    point2.y = height;
                }
            }
            int i12 = point2.x;
            if (i12 >= 0 && point2.y >= 0) {
                point2.x = wdz.sd(context, i12);
                point2.y = wdz.sd(context, point2.y);
                return point2;
            }
        }
        return point;
    }
}
