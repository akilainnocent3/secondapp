package com.bytedance.sdk.component.hv.vy.sd.hww.tq;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.hv.bs;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww implements bs {
    private long hww = 4194304;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f34796sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f34797tq;
    private com.bytedance.sdk.component.hv.vy.sd.hww.sd<String, Bitmap> vy;

    public hww(int i10, int i11) {
        this.f34797tq = i11;
        this.f34796sd = i10;
        this.vy = new com.bytedance.sdk.component.hv.vy.sd.hww.sd<>(i11);
    }

    @Override // com.bytedance.sdk.component.hv.hww
    public boolean tq(String str) {
        try {
            return this.vy.hww(str) != null;
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.hv.hww
    public boolean hww(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            try {
                int iHww = hww(bitmap);
                if (iHww <= this.hww && iHww != 0) {
                    this.vy.hww(str, bitmap);
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.hv.hww
    public Bitmap hww(String str) {
        try {
            return this.vy.hww(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int hww(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
