package com.bytedance.adsdk.tq.tq;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.adsdk.tq.hu.hu;
import com.bytedance.adsdk.tq.nod;
import com.bytedance.adsdk.tq.vy;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class tq {
    private static final Object hww = new Object();

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final Map<String, nod> f32323hv;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final String f32324sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final Context f32325tq;
    private vy vy;

    public tq(Drawable.Callback callback, String str, vy vyVar, Map<String, nod> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f32324sd = str;
        } else {
            this.f32324sd = str + '/';
        }
        this.f32323hv = map;
        hww(vyVar);
        if (callback instanceof View) {
            this.f32325tq = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f32325tq = null;
        }
    }

    private Bitmap tq(String str, Bitmap bitmap) {
        synchronized (hww) {
            this.f32323hv.get(str).hww(bitmap);
        }
        return bitmap;
    }

    public void hww(vy vyVar) {
        this.vy = vyVar;
    }

    public Bitmap hww(String str, Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap bitmapVhb = this.f32323hv.get(str).vhb();
            tq(str, bitmap);
            return bitmapVhb;
        }
        nod nodVar = this.f32323hv.get(str);
        Bitmap bitmapVhb2 = nodVar.vhb();
        nodVar.hww(null);
        return bitmapVhb2;
    }

    public Bitmap hww(String str) {
        nod nodVar = this.f32323hv.get(str);
        if (nodVar == null) {
            return null;
        }
        Bitmap bitmapVhb = nodVar.vhb();
        if (bitmapVhb != null) {
            return bitmapVhb;
        }
        vy vyVar = this.vy;
        if (vyVar != null) {
            return vyVar.hww(nodVar);
        }
        Context context = this.f32325tq;
        if (context == null) {
            return null;
        }
        String strRs = nodVar.rs();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strRs.startsWith("data:") && strRs.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strRs.substring(strRs.indexOf(44) + 1), 0);
                return tq(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.f32324sd)) {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.f32324sd + strRs), null, options);
                    if (bitmapDecodeStream == null) {
                        return null;
                    }
                    return tq(str, hu.hww(bitmapDecodeStream, nodVar.hww(), nodVar.tq()));
                } catch (IllegalArgumentException unused2) {
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException unused3) {
            return null;
        }
    }

    public boolean hww(Context context) {
        return (context == null && this.f32325tq == null) || this.f32325tq.equals(context);
    }
}
