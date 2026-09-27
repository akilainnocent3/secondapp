package com.bytedance.adsdk.tq.tq;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.tq.sd;
import com.bytedance.adsdk.tq.sd.vgm;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class hww {

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private sd f32320hv;
    private final AssetManager vy;
    private final vgm<String> hww = new vgm<>();

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final Map<vgm<String>, Typeface> f32322tq = new HashMap();

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final Map<String, Typeface> f32321sd = new HashMap();

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private String f32319hu = ".ttf";

    public hww(Drawable.Callback callback, sd sdVar) {
        this.f32320hv = sdVar;
        if (callback instanceof View) {
            this.vy = ((View) callback).getContext().getAssets();
        } else {
            this.vy = null;
        }
    }

    private Typeface tq(com.bytedance.adsdk.tq.sd.sd sdVar) {
        Typeface typefaceCreateFromAsset;
        String strHww = sdVar.hww();
        Typeface typeface = this.f32321sd.get(strHww);
        if (typeface != null) {
            return typeface;
        }
        String strSd = sdVar.sd();
        String strTq = sdVar.tq();
        sd sdVar2 = this.f32320hv;
        if (sdVar2 != null) {
            typefaceCreateFromAsset = sdVar2.hww(strHww, strSd, strTq);
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = this.f32320hv.hww(strHww);
            }
        } else {
            typefaceCreateFromAsset = null;
        }
        sd sdVar3 = this.f32320hv;
        if (sdVar3 != null && typefaceCreateFromAsset == null) {
            String strTq2 = sdVar3.tq(strHww, strSd, strTq);
            if (strTq2 == null) {
                strTq2 = this.f32320hv.tq(strHww);
            }
            if (strTq2 != null) {
                try {
                    typefaceCreateFromAsset = Typeface.createFromAsset(this.vy, strTq2);
                } catch (Throwable unused) {
                    typefaceCreateFromAsset = Typeface.DEFAULT;
                }
            }
        }
        if (sdVar.vy() != null) {
            return sdVar.vy();
        }
        if (typefaceCreateFromAsset == null) {
            try {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.vy, "fonts/" + strHww + this.f32319hu);
            } catch (Throwable unused2) {
                typefaceCreateFromAsset = Typeface.DEFAULT;
            }
        }
        this.f32321sd.put(strHww, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    public void hww(sd sdVar) {
        this.f32320hv = sdVar;
    }

    public void hww(String str) {
        this.f32319hu = str;
    }

    public Typeface hww(com.bytedance.adsdk.tq.sd.sd sdVar) {
        this.hww.hww(sdVar.hww(), sdVar.sd());
        Typeface typeface = this.f32322tq.get(this.hww);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceHww = hww(tq(sdVar), sdVar.sd());
        this.f32322tq.put(this.hww, typefaceHww);
        return typefaceHww;
    }

    private Typeface hww(Typeface typeface, String str) {
        int i10;
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        if (zContains && zContains2) {
            i10 = 3;
        } else if (zContains) {
            i10 = 2;
        } else {
            i10 = zContains2 ? 1 : 0;
        }
        return typeface.getStyle() == i10 ? typeface : Typeface.create(typeface, i10);
    }
}
