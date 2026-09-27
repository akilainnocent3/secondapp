package com.bytedance.adsdk.tq.hww;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.bytedance.adsdk.tq.hu.hv;
import f2.z1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class hww extends Paint {
    public hww() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            super.setAlpha(hv.hww(i10, 0, 255));
        } else {
            setColor((hv.hww(i10, 0, 255) << 24) | (getColor() & z1.f82662x));
        }
    }

    public hww(int i10) {
        super(i10);
    }

    public hww(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public hww(int i10, PorterDuff.Mode mode) {
        super(i10);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }
}
