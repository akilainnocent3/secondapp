package com.cleveradssolutions.adapters.exchange.rendering.models;

import android.graphics.Color;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42174a = Color.argb(153, 0, 0, 0);

    public int a() {
        return this.f42174a;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0005 A[PHI: r0
      0x0005: PHI (r0v4 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0003, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    public void b(float f10) {
        float f11 = 0.0f;
        if (f10 < 0.0f) {
            f10 = f11;
        } else {
            f11 = 1.0f;
            if (f10 > 1.0f) {
                f10 = f11;
            }
        }
        this.f42174a = Color.argb((int) (f10 * 255.0f), 0, 0, 0);
    }
}
