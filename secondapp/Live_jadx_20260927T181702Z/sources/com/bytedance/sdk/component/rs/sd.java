package com.bytedance.sdk.component.rs;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class sd implements View.OnTouchListener {
    private ViewConfiguration hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f34999tq = -1;

    public abstract void hww(View.OnTouchListener onTouchListener);

    public boolean hww(float f10, float f11, float f12, float f13, Context context) {
        if (this.hww == null) {
            this.hww = ViewConfiguration.get(context);
        }
        if (this.f34999tq == -1) {
            this.f34999tq = this.hww.getScaledTouchSlop();
        }
        return Math.abs(f10 - f12) <= ((float) this.f34999tq) && Math.abs(f11 - f13) <= ((float) this.f34999tq);
    }
}
