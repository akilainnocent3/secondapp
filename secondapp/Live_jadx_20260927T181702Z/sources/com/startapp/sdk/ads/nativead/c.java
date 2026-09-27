package com.startapp.sdk.ads.nativead;

import android.graphics.Bitmap;
import com.startapp.sdk.internal.i2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f74135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f74136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f74137c;

    public c(NativeAdDetails nativeAdDetails, Runnable runnable) {
        this.f74137c = nativeAdDetails;
        this.f74136b = runnable;
    }

    @Override // com.startapp.sdk.internal.i2
    public final void a(Bitmap bitmap, int i10) {
        if (i10 == 0) {
            this.f74137c.setImageBitmap(bitmap);
        } else {
            this.f74137c.setSecondaryImageBitmap(bitmap);
        }
        int i11 = this.f74135a + 1;
        this.f74135a = i11;
        if (i11 == 2) {
            this.f74136b.run();
        }
    }
}
