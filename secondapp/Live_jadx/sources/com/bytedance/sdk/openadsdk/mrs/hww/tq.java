package com.bytedance.sdk.openadsdk.mrs.hww;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.utils.omn;
import com.bytedance.sdk.component.utils.vy;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq {

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private Bitmap f37466hv;
    int hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private byte[] f37467sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private Drawable f37468tq;
    private Bitmap vy;

    public tq(Drawable drawable, int i10) {
        this.f37467sd = null;
        this.vy = null;
        this.f37466hv = null;
        this.f37468tq = drawable;
        this.hww = i10;
    }

    public boolean hv() {
        if (this.vy != null || this.f37468tq != null) {
            return true;
        }
        byte[] bArr = this.f37467sd;
        return bArr != null && bArr.length > 0;
    }

    public Bitmap hww() {
        return this.vy;
    }

    public byte[] sd() {
        try {
            if (this.f37467sd == null) {
                this.f37467sd = vy.hww(this.vy);
            }
        } catch (OutOfMemoryError e10) {
            omn.sd("GifRequestResult", e10.getMessage());
        }
        return this.f37467sd;
    }

    public Bitmap tq() {
        return this.f37466hv;
    }

    public Drawable vy() {
        return this.f37468tq;
    }

    public tq(byte[] bArr, int i10) {
        this.f37468tq = null;
        this.vy = null;
        this.f37466hv = null;
        this.f37467sd = bArr;
        this.hww = i10;
    }

    public tq(Bitmap bitmap, Bitmap bitmap2, int i10) {
        this.f37468tq = null;
        this.f37467sd = null;
        this.f37466hv = bitmap2;
        this.vy = bitmap;
        this.hww = i10;
    }
}
