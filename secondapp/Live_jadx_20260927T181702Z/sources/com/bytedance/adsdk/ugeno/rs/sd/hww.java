package com.bytedance.adsdk.ugeno.rs.sd;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.rs.vy.sd;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class hww extends sd {

    /* JADX INFO: renamed from: sr, reason: collision with root package name */
    private int f32620sr;

    public hww(Context context) {
        super(context);
        this.f32620sr = -16777216;
    }

    private String wgt(String str) {
        String strKhx = khx(str);
        return TextUtils.isEmpty(strKhx) ? "" : "local://".concat(String.valueOf(strKhx));
    }

    @Override // com.bytedance.adsdk.ugeno.rs.vy.sd, com.bytedance.adsdk.ugeno.tq.sd
    public void hww(String str, String str2) {
        super.hww(str, str2);
        str.getClass();
        if (str.equals("textColor")) {
            this.f32620sr = com.bytedance.adsdk.ugeno.vgm.hww.hww(str2);
        }
    }

    public abstract String khx(String str);

    @Override // com.bytedance.adsdk.ugeno.rs.vy.sd
    public String sd() {
        return "drawable";
    }

    @Override // com.bytedance.adsdk.ugeno.rs.vy.sd, com.bytedance.adsdk.ugeno.tq.sd
    public void tq() {
        ((sd) this).hww = wgt(((sd) this).hww);
        super.tq();
        ((com.bytedance.adsdk.ugeno.rs.vy.hww) this.f32701hv).setColorFilter(this.f32620sr);
        ((com.bytedance.adsdk.ugeno.rs.vy.hww) this.f32701hv).setScaleType(ImageView.ScaleType.FIT_CENTER);
    }
}
