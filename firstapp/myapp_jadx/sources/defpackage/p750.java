package defpackage;

import android.graphics.RenderEffect;

/* JADX INFO: loaded from: classes.dex */
public final class p750 {
    public static RenderEffect a(int i, float f, float f2) {
        return (f == 0.0f && f2 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : RenderEffect.createBlurEffect(f, f2, qc0.a(i));
    }
}
