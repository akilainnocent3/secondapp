package com.bytedance.sdk.component.adexpress.dynamic.animation.hww;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd {
    private static volatile sd hww;

    private sd() {
    }

    public static sd hww() {
        if (hww == null) {
            synchronized (sd.class) {
                try {
                    if (hww == null) {
                        hww = new sd();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hww;
    }

    public vy hww(View view, com.bytedance.sdk.component.adexpress.dynamic.vy.hww hwwVar) {
        if (hwwVar == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(hwwVar.rs())) {
            return new vhb(view, hwwVar);
        }
        if ("translate".equals(hwwVar.rs())) {
            return new weu(view, hwwVar);
        }
        if ("ripple".equals(hwwVar.rs())) {
            return new ok(view, hwwVar);
        }
        if ("marquee".equals(hwwVar.rs())) {
            return new vgm(view, hwwVar);
        }
        if ("waggle".equals(hwwVar.rs())) {
            return new wgt(view, hwwVar);
        }
        if ("shine".equals(hwwVar.rs())) {
            return new ny(view, hwwVar);
        }
        if ("swing".equals(hwwVar.rs())) {
            return new khx(view, hwwVar);
        }
        if ("fade".equals(hwwVar.rs())) {
            return new hww(view, hwwVar);
        }
        if ("rubIn".equals(hwwVar.rs())) {
            return new nod(view, hwwVar);
        }
        if ("rotate".equals(hwwVar.rs())) {
            return new rs(view, hwwVar);
        }
        if ("cutIn".equals(hwwVar.rs())) {
            return new hu(view, hwwVar);
        }
        if ("stretch".equals(hwwVar.rs())) {
            return new ed(view, hwwVar);
        }
        if ("bounce".equals(hwwVar.rs())) {
            return new hv(view, hwwVar);
        }
        return null;
    }
}
