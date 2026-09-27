package com.bytedance.adsdk.ugeno.yoga.tq;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.vgm.ok;
import com.bytedance.adsdk.ugeno.yoga.ed;
import com.bytedance.adsdk.ugeno.yoga.hu;
import com.bytedance.adsdk.ugeno.yoga.hv;
import com.bytedance.adsdk.ugeno.yoga.khx;
import com.bytedance.adsdk.ugeno.yoga.nod;
import com.bytedance.adsdk.ugeno.yoga.vy;
import fw.b;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww extends com.bytedance.adsdk.ugeno.tq.hww<sd> {
    private hu alz;

    /* JADX INFO: renamed from: km, reason: collision with root package name */
    private khx f32821km;
    private hv rjt;

    /* JADX INFO: renamed from: sr, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.yoga.hww f32822sr;
    private nod tre;
    private com.bytedance.adsdk.ugeno.yoga.hww yuv;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.yoga.tq.hww$hww, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0310hww extends com.bytedance.adsdk.ugeno.tq.hww.C0306hww {
        public int aed;
        public float blh;

        /* JADX INFO: renamed from: cj, reason: collision with root package name */
        private boolean f32825cj;
        private boolean gvr;
        public int hwp;

        /* JADX INFO: renamed from: mw, reason: collision with root package name */
        public float f32826mw;
        private boolean npz;
        public int oxu;

        /* JADX INFO: renamed from: qm, reason: collision with root package name */
        private boolean f32827qm;

        /* JADX INFO: renamed from: qt, reason: collision with root package name */
        public float f32828qt;
        public int rpd;
        public int syb;
        private boolean wdz;

        /* JADX INFO: renamed from: yt, reason: collision with root package name */
        public int f32829yt;

        /* JADX INFO: renamed from: za, reason: collision with root package name */
        public int f32830za;
        private boolean zeu;
        public float zvy;

        public C0310hww(com.bytedance.adsdk.ugeno.tq.hww hwwVar) {
            super(hwwVar);
            this.aed = 1;
            this.zvy = 0.0f;
            this.f32826mw = 1.0f;
            this.f32830za = com.bytedance.adsdk.ugeno.yoga.hww.AUTO.hww();
            this.blh = -1.0f;
            this.oxu = ed.RELATIVE.hww();
        }

        private void vy() {
            com.bytedance.adsdk.ugeno.tq.hww hwwVar = this.grv;
            if (hwwVar instanceof hww) {
                if (((hww) hwwVar).xe() == hv.ROW && this.grv.rpd() == -2 && this.hww == -1.0f && !this.grv.zeu()) {
                    this.hww = -2.0f;
                    this.f32826mw = 1.0f;
                    this.zvy = 1.0f;
                    this.wdz = true;
                    this.blh = -1.0f;
                }
                if (((hww) this.grv).xe() == hv.COLUMN && this.grv.qt() == -2 && this.f32680tq == -1.0f && !this.grv.zeu()) {
                    this.f32680tq = -2.0f;
                    this.f32826mw = 1.0f;
                    this.zvy = 1.0f;
                    this.wdz = true;
                    this.blh = -1.0f;
                }
            }
        }

        public boolean sd() {
            float f10 = this.hww;
            if (f10 == -1.0f && this.f32680tq == -1.0f) {
                return false;
            }
            return f10 == -2.0f || this.f32680tq == -2.0f;
        }

        @Override // com.bytedance.adsdk.ugeno.tq.hww.C0306hww
        public String toString() {
            return "LayoutParams{mOrder=" + this.aed + ", mFlexGrow=" + this.zvy + ", mFlexShrink=" + this.f32826mw + ", mAlignSelf=" + this.f32830za + ", mFlexBasis=" + this.blh + ", mPosition=" + this.oxu + ", mTop=" + this.hwp + ", mBottom=" + this.f32829yt + ", mLeft=" + this.syb + ", mRight=" + this.rpd + b.f85383j;
        }

        @Override // com.bytedance.adsdk.ugeno.tq.hww.C0306hww
        /* JADX INFO: renamed from: tq, reason: merged with bridge method [inline-methods] */
        public sd.hww hww() {
            vy();
            sd.hww hwwVar = new sd.hww((int) this.hww, (int) this.f32680tq);
            hwwVar.ny((int) (this.omn ? this.f32673hu : this.f32674hv));
            hwwVar.khx((int) (this.hnv ? this.vgm : this.f32674hv));
            hwwVar.vhb((int) (this.f32675kv ? this.f32677ok : this.f32674hv));
            hwwVar.ed((int) (this.kub ? this.f32678rs : this.f32674hv));
            hwwVar.hww(this.aed);
            hwwVar.hv(this.f32830za);
            hwwVar.tq(this.zvy);
            hwwVar.sd(this.f32826mw);
            hwwVar.wgt(this.f32679sd);
            hwwVar.bs(this.vy);
            if (this.wdz) {
                hwwVar.vy(this.blh);
            }
            hwwVar.hu(this.oxu);
            if (this.gvr) {
                hwwVar.vgm(this.hwp);
            }
            if (this.f32827qm) {
                hwwVar.rs(this.f32829yt);
            }
            if (this.npz) {
                hwwVar.ok(this.syb);
            }
            if (this.f32825cj) {
                hwwVar.nod(this.rpd);
            }
            if (this.zeu && sd()) {
                float f10 = this.f32828qt;
                if (f10 > 0.0f) {
                    hwwVar.weu(f10);
                    hwwVar.sd(0.0f);
                    hwwVar.tq(0.0f);
                }
            }
            return hwwVar;
        }

        @Override // com.bytedance.adsdk.ugeno.tq.hww.C0306hww
        public void hww(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.hww(context, str, str2);
            str.getClass();
            switch (str) {
                case "flexBasis":
                    this.wdz = true;
                    float fHww = com.bytedance.adsdk.ugeno.vgm.sd.hww(str2, -1.0f);
                    this.blh = fHww;
                    this.blh = ok.hww(context, fHww);
                    break;
                case "bottom":
                    this.f32827qm = true;
                    this.f32829yt = (int) ok.hww(context, com.bytedance.adsdk.ugeno.vgm.sd.hww(str2, 0));
                    break;
                case "top":
                    this.gvr = true;
                    this.hwp = (int) ok.hww(context, com.bytedance.adsdk.ugeno.vgm.sd.hww(str2, 0));
                    break;
                case "left":
                    this.npz = true;
                    this.syb = (int) ok.hww(context, com.bytedance.adsdk.ugeno.vgm.sd.hww(str2, 0));
                    break;
                case "order":
                    this.aed = com.bytedance.adsdk.ugeno.vgm.sd.hww(str2, 1);
                    break;
                case "ratio":
                    this.zeu = true;
                    this.f32828qt = com.bytedance.adsdk.ugeno.vgm.sd.hww(str2, 0.0f);
                    break;
                case "right":
                    this.f32825cj = true;
                    this.rpd = (int) ok.hww(context, com.bytedance.adsdk.ugeno.vgm.sd.hww(str2, 0));
                    break;
                case "position":
                    this.oxu = ed.hww(str2).hww();
                    break;
                case "flexShrink":
                    this.f32826mw = com.bytedance.adsdk.ugeno.vgm.sd.hww(str2, 1.0f);
                    break;
                case "flexGrow":
                    this.zvy = com.bytedance.adsdk.ugeno.vgm.sd.hww(str2, 0.0f);
                    break;
                case "alignSelf":
                    this.f32830za = com.bytedance.adsdk.ugeno.yoga.hww.hww(str2).hww();
                    break;
            }
        }
    }

    public hww(Context context) {
        super(context);
        this.rjt = hv.ROW;
        this.f32821km = khx.NO_WRAP;
        this.alz = hu.FLEX_START;
        com.bytedance.adsdk.ugeno.yoga.hww hwwVar = com.bytedance.adsdk.ugeno.yoga.hww.STRETCH;
        this.f32822sr = hwwVar;
        this.yuv = hwwVar;
    }

    @Override // com.bytedance.adsdk.ugeno.tq.sd
    public void mw() {
        ImageView.ScaleType scaleType;
        if (this.npz) {
            com.bytedance.adsdk.ugeno.hv.hww().tq().hww(this.f32722rs, this.wdz, new com.bytedance.adsdk.ugeno.hww.InterfaceC0300hww() { // from class: com.bytedance.adsdk.ugeno.yoga.tq.hww.1
                @Override // com.bytedance.adsdk.ugeno.hww.InterfaceC0300hww
                public void hww(Bitmap bitmap) {
                    if (bitmap == null) {
                        if (((com.bytedance.adsdk.ugeno.tq.sd) hww.this).ecg != null) {
                            com.bytedance.adsdk.ugeno.core.hu unused = ((com.bytedance.adsdk.ugeno.tq.sd) hww.this).ecg;
                            String unused2 = ((com.bytedance.adsdk.ugeno.tq.sd) hww.this).wdz;
                            return;
                        }
                        return;
                    }
                    if (((com.bytedance.adsdk.ugeno.tq.sd) hww.this).ecg != null) {
                        com.bytedance.adsdk.ugeno.core.hu unused3 = ((com.bytedance.adsdk.ugeno.tq.sd) hww.this).ecg;
                        String unused4 = ((com.bytedance.adsdk.ugeno.tq.sd) hww.this).wdz;
                    }
                    final Bitmap bitmapHww = ok.hww(((com.bytedance.adsdk.ugeno.tq.sd) hww.this).f32728tq, bitmap, (int) ((com.bytedance.adsdk.ugeno.tq.sd) hww.this).f32719qm);
                    if (bitmapHww != null) {
                        ok.hww(new Runnable() { // from class: com.bytedance.adsdk.ugeno.yoga.tq.hww.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                hww.this.hww(new BitmapDrawable(bitmapHww));
                            }
                        });
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.rs.vy.hww hwwVar = new com.bytedance.adsdk.ugeno.rs.vy.hww(this.f32728tq);
        com.bytedance.adsdk.ugeno.hv.hww().tq().hww(this.f32722rs, this.wdz, hwwVar, this.f32701hv.getWidth(), this.f32701hv.getHeight(), new com.bytedance.adsdk.ugeno.hww.InterfaceC0300hww() { // from class: com.bytedance.adsdk.ugeno.yoga.tq.hww.2
            @Override // com.bytedance.adsdk.ugeno.hww.InterfaceC0300hww
            public void hww(Bitmap bitmap) {
                if (bitmap == null) {
                    if (((com.bytedance.adsdk.ugeno.tq.sd) hww.this).ecg != null) {
                        com.bytedance.adsdk.ugeno.core.hu unused = ((com.bytedance.adsdk.ugeno.tq.sd) hww.this).ecg;
                        String unused2 = ((com.bytedance.adsdk.ugeno.tq.sd) hww.this).wdz;
                        return;
                    }
                    return;
                }
                if (((com.bytedance.adsdk.ugeno.tq.sd) hww.this).ecg != null) {
                    com.bytedance.adsdk.ugeno.core.hu unused3 = ((com.bytedance.adsdk.ugeno.tq.sd) hww.this).ecg;
                    String unused4 = ((com.bytedance.adsdk.ugeno.tq.sd) hww.this).wdz;
                }
            }
        });
        if (!this.f32686cj || (scaleType = this.gvr) == ImageView.ScaleType.FIT_XY) {
            hwwVar.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            hwwVar.setScaleType(scaleType);
        }
        hwwVar.setCornerRadius(this.zeu);
        sd.hww hwwVar2 = new sd.hww(-1, -1);
        hwwVar2.hu(ed.ABSOLUTE.hww());
        hwwVar2.vgm(0.0f);
        hwwVar2.ok(0.0f);
        T t10 = this.f32701hv;
        if (t10 instanceof sd) {
            ((sd) t10).addView(hwwVar, 0, hwwVar2);
            hww(hwwVar);
        }
    }

    public hv xe() {
        return this.rjt;
    }

    @Override // com.bytedance.adsdk.ugeno.tq.sd
    public void khx() {
        if (this.oxu) {
            this.tre.tq(vy.ALL, this.aed);
        }
        if (this.hwp) {
            this.tre.tq(vy.LEFT, this.zvy);
        }
        if (this.f32736yt) {
            this.tre.tq(vy.RIGHT, this.f32712mw);
        }
        if (this.syb) {
            this.tre.tq(vy.TOP, this.f32737za);
        }
        if (this.rpd) {
            this.tre.tq(vy.BOTTOM, this.blh);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.tq.sd
    /* JADX INFO: renamed from: sd, reason: merged with bridge method [inline-methods] */
    public sd hww() {
        sd sdVar = new sd(this.f32728tq);
        sdVar.hww(this);
        this.tre = sdVar.getYogaNode();
        return sdVar;
    }

    @Override // com.bytedance.adsdk.ugeno.tq.hww, com.bytedance.adsdk.ugeno.tq.sd
    public void tq() {
        super.tq();
        this.tre.hww(this.rjt);
        this.tre.hww(this.f32821km);
        this.tre.hww(this.alz);
        this.tre.hww(this.f32822sr);
        this.tre.sd(this.yuv);
        this.tre.hww(true);
    }

    @Override // com.bytedance.adsdk.ugeno.tq.hww
    /* JADX INFO: renamed from: vy, reason: merged with bridge method [inline-methods] */
    public C0310hww nod() {
        return new C0310hww(this);
    }

    @Override // com.bytedance.adsdk.ugeno.tq.sd
    public void hww(Drawable drawable) {
        ImageView.ScaleType scaleType;
        com.bytedance.adsdk.ugeno.rs.vy.hww hwwVar = new com.bytedance.adsdk.ugeno.rs.vy.hww(this.f32728tq);
        hwwVar.setImageDrawable(drawable);
        if (this.f32686cj && (scaleType = this.gvr) != ImageView.ScaleType.FIT_XY) {
            hwwVar.setScaleType(scaleType);
        } else {
            hwwVar.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        hwwVar.setCornerRadius(this.zeu);
        sd.hww hwwVar2 = new sd.hww(-1, -1);
        hwwVar2.hu(ed.ABSOLUTE.hww());
        hwwVar2.vgm(0.0f);
        hwwVar2.ok(0.0f);
        T t10 = this.f32701hv;
        if (t10 instanceof sd) {
            ((sd) t10).addView(hwwVar, 0, hwwVar2);
            hww(hwwVar);
        }
    }

    private void hww(final com.bytedance.adsdk.ugeno.rs.vy.hww hwwVar) {
        this.f32701hv.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.adsdk.ugeno.yoga.tq.hww.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                nod nodVarHww;
                if (((com.bytedance.adsdk.ugeno.tq.sd) hww.this).f32701hv == null || (nodVarHww = ((sd) ((com.bytedance.adsdk.ugeno.tq.sd) hww.this).f32701hv).hww(hwwVar)) == null) {
                    return;
                }
                int width = ((com.bytedance.adsdk.ugeno.tq.sd) hww.this).f32701hv.getWidth();
                nodVarHww.vy(width);
                int height = ((com.bytedance.adsdk.ugeno.tq.sd) hww.this).f32701hv.getHeight();
                nodVarHww.hu(height);
                hwwVar.setCornerRadius(((com.bytedance.adsdk.ugeno.tq.sd) hww.this).zeu);
                ((com.bytedance.adsdk.ugeno.tq.sd) hww.this).f32701hv.requestLayout();
                if (width > 0 || height > 0) {
                    ((com.bytedance.adsdk.ugeno.tq.sd) hww.this).f32701hv.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.tq.hww
    public void hww(com.bytedance.adsdk.ugeno.tq.sd sdVar) {
        super.hww(sdVar);
    }

    @Override // com.bytedance.adsdk.ugeno.tq.hww
    public void hww(com.bytedance.adsdk.ugeno.tq.sd sdVar, ViewGroup.LayoutParams layoutParams) {
        if (sdVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.tq.hww) this).hww.add(sdVar);
        View viewVhb = sdVar.vhb();
        if (viewVhb != null) {
            ((sd) this.f32701hv).addView(viewVhb, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.tq.sd
    public void hww(String str, String str2) {
        super.hww(str, str2);
        str.getClass();
        switch (str) {
            case "alignItems":
                this.f32822sr = com.bytedance.adsdk.ugeno.yoga.hww.hww(str2);
                break;
            case "flexDirection":
                this.rjt = hv.hww(str2);
                break;
            case "alignContent":
                this.yuv = com.bytedance.adsdk.ugeno.yoga.hww.hww(str2);
                break;
            case "flexWrap":
                this.f32821km = khx.hww(str2);
                break;
            case "justifyContent":
                this.alz = hu.hww(str2);
                break;
        }
    }
}
