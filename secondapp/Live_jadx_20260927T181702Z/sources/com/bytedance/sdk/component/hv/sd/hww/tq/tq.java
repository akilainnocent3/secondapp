package com.bytedance.sdk.component.hv.sd.hww.tq;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.hv.bs;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq implements bs {
    private int hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private com.bytedance.sdk.component.hv.sd.hww.sd<String, Bitmap> f34716sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f34717tq;

    public tq(int i10, int i11) {
        this.f34717tq = i10;
        this.hww = i11;
        this.f34716sd = new com.bytedance.sdk.component.hv.sd.hww.sd<String, Bitmap>(i10) { // from class: com.bytedance.sdk.component.hv.sd.hww.tq.tq.1
            @Override // com.bytedance.sdk.component.hv.sd.hww.sd
            /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
            public int tq(String str, Bitmap bitmap) {
                if (bitmap == null) {
                    return 0;
                }
                return tq.hww(bitmap);
            }
        };
    }

    @Override // com.bytedance.sdk.component.hv.hww
    public boolean tq(String str) {
        return this.f34716sd.hww(str) != null;
    }

    @Override // com.bytedance.sdk.component.hv.hww
    public boolean hww(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            return false;
        }
        this.f34716sd.hww(str, bitmap);
        return true;
    }

    @Override // com.bytedance.sdk.component.hv.hww
    public Bitmap hww(String str) {
        return this.f34716sd.hww(str);
    }

    public static int hww(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
