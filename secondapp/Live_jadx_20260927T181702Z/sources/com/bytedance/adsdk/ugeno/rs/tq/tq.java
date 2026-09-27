package com.bytedance.adsdk.ugeno.rs.tq;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq extends com.bytedance.adsdk.ugeno.tq.hww<com.bytedance.adsdk.ugeno.rs.tq.hww> {
    private com.bytedance.adsdk.ugeno.rs.tq.hww rjt;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww extends com.bytedance.adsdk.ugeno.tq.hww.C0306hww {
        protected int aed;

        public hww(com.bytedance.adsdk.ugeno.tq.hww hwwVar) {
            super(hwwVar);
            this.aed = -1;
        }

        private int tq(String str) {
            str.getClass();
            switch (str) {
                case "bottom":
                    return 80;
                case "center":
                    return 17;
                case "center_vertical":
                    return 16;
                case "top":
                    return 48;
                case "left":
                    return 3;
                case "right":
                    return 5;
                case "center_horizontal":
                    return 1;
                default:
                    return -1;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.tq.hww.C0306hww
        public void hww(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.hww(context, str, str2);
            if (TextUtils.equals(str, "layoutGravity")) {
                this.aed = hww(str2);
            }
        }

        @Override // com.bytedance.adsdk.ugeno.tq.hww.C0306hww
        /* JADX INFO: renamed from: tq, reason: merged with bridge method [inline-methods] */
        public FrameLayout.LayoutParams hww() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.hww, (int) this.f32680tq);
            layoutParams.leftMargin = (int) this.f32673hu;
            layoutParams.rightMargin = (int) this.vgm;
            layoutParams.topMargin = (int) this.f32677ok;
            layoutParams.bottomMargin = (int) this.f32678rs;
            layoutParams.gravity = this.aed;
            return layoutParams;
        }

        private int hww(String str) {
            String[] strArrSplit;
            if (TextUtils.isEmpty(str) || (strArrSplit = str.split("\\|")) == null || strArrSplit.length <= 0) {
                return -1;
            }
            int iTq = 0;
            for (String str2 : strArrSplit) {
                iTq |= tq(str2);
            }
            return iTq;
        }
    }

    public tq(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.tq.hww
    public com.bytedance.adsdk.ugeno.tq.hww.C0306hww nod() {
        return new hww(this);
    }

    @Override // com.bytedance.adsdk.ugeno.tq.sd
    /* JADX INFO: renamed from: sd, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.rs.tq.hww hww() {
        com.bytedance.adsdk.ugeno.rs.tq.hww hwwVar = new com.bytedance.adsdk.ugeno.rs.tq.hww(this.f32728tq);
        this.rjt = hwwVar;
        hwwVar.hww(this);
        return this.rjt;
    }

    @Override // com.bytedance.adsdk.ugeno.tq.hww, com.bytedance.adsdk.ugeno.tq.sd
    public void tq() {
        this.rjt.setEventMap(this.f32725sf);
        super.tq();
    }
}
