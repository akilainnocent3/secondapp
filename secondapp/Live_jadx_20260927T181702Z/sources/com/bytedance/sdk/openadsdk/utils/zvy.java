package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import fc.a;
import fc.b;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class zvy implements com.bytedance.sdk.component.hv.wgt {
    private final WeakReference<ImageView> hww;

    public zvy(ImageView imageView) {
        this.hww = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.hv.wgt
    public void hww(com.bytedance.sdk.component.hv.vhb vhbVar) {
        ImageView imageView = this.hww.get();
        if (imageView == null) {
            return;
        }
        try {
            Object objTq = vhbVar.tq();
            if (objTq instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) objTq);
                return;
            }
            if (!(objTq instanceof Drawable)) {
                imageView.setVisibility(8);
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && a.a(objTq)) {
                b.a(objTq).start();
            }
            imageView.setImageDrawable((Drawable) objTq);
        } catch (Throwable unused) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.hv.wgt
    public void hww(int i10, String str, @Nullable Throwable th2) {
        ImageView imageView = this.hww.get();
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
