package com.bytedance.sdk.openadsdk.hu;

import com.bytedance.sdk.openadsdk.core.khx;
import com.bytedance.sdk.openadsdk.core.sd;
import nk.h;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {
    private static volatile hww hww;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private boolean f37335bs;

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private boolean f37336ed;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int[] f37337hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private int[] f37338hv;
    private boolean khx;
    private boolean nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private int[] f37339ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private int[] f37340ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private int[] f37341rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private boolean f37342sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private boolean f37343tq;
    private int[] vgm;
    private boolean vhb;
    private boolean vy;
    private int weu;
    private boolean wgt;

    private hww() {
        tq();
    }

    public boolean bs() {
        return this.f37336ed;
    }

    public int[] ed() {
        return this.f37341rs;
    }

    public boolean jpb() {
        return this.f37335bs;
    }

    public boolean khx() {
        return this.nod;
    }

    public int[] nod() {
        return this.f37337hu;
    }

    public int[] ny() {
        return this.f37340ok;
    }

    public int[] vhb() {
        return this.vgm;
    }

    public boolean weu() {
        return this.vhb;
    }

    public int[] wgt() {
        return this.f37339ny;
    }

    public boolean ok() {
        return this.vy;
    }

    public int[] rs() {
        return this.f37338hv;
    }

    public boolean vgm() {
        return this.f37342sd;
    }

    public boolean hu() {
        return this.f37343tq;
    }

    public boolean hv() {
        return this.wgt;
    }

    public int vy() {
        return this.weu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] sd(String[] strArr) {
        int length = strArr.length;
        int[] iArr = new int[length];
        int i10 = 0;
        for (String str : strArr) {
            try {
                int i11 = Integer.parseInt(str);
                iArr[i10] = i11;
                if (i11 > 0) {
                    i10++;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (i10 == length) {
            return iArr;
        }
        int[] iArr2 = new int[i10];
        System.arraycopy(iArr, 0, iArr2, 0, i10);
        return iArr2;
    }

    public void tq() {
        khx.tq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hu.hww.1
            @Override // java.lang.Runnable
            public void run() {
                hww.this.khx = com.bytedance.sdk.openadsdk.kv.hww.hww("feature_switch", false);
                if (hww.this.khx) {
                    try {
                        hww.this.f37335bs = com.bytedance.sdk.openadsdk.kv.hww.hww("exclude_banner_native", false);
                        hww.this.weu = com.bytedance.sdk.openadsdk.kv.hww.hww("feature_timer_interval", 10000);
                        hww.this.wgt = com.bytedance.sdk.openadsdk.kv.hww.hww("enable_feature_cids", true);
                        String[] strArrSplit = com.bytedance.sdk.openadsdk.kv.hww.hww("pag_ad_show_cnt", "1,3,5&session").split("&");
                        String[] strArrSplit2 = com.bytedance.sdk.openadsdk.kv.hww.hww("pag_ad_click_cnt", "1,3,5&session").split("&");
                        String[] strArrSplit3 = com.bytedance.sdk.openadsdk.kv.hww.hww("pag_video_play_cnt", "1,3,5&session").split("&");
                        String[] strArrSplit4 = com.bytedance.sdk.openadsdk.kv.hww.hww("pag_dislike_cnt", "1,3,5session").split(",");
                        hww hwwVar = hww.this;
                        hwwVar.f37343tq = hwwVar.hww(strArrSplit);
                        hww hwwVar2 = hww.this;
                        hwwVar2.f37342sd = hwwVar2.hww(strArrSplit2);
                        hww hwwVar3 = hww.this;
                        hwwVar3.vy = hwwVar3.hww(strArrSplit3);
                        hww hwwVar4 = hww.this;
                        hwwVar4.f37338hv = hwwVar4.tq(strArrSplit);
                        hww hwwVar5 = hww.this;
                        hwwVar5.f37337hu = hwwVar5.tq(strArrSplit2);
                        hww hwwVar6 = hww.this;
                        hwwVar6.vgm = hwwVar6.tq(strArrSplit3);
                        hww hwwVar7 = hww.this;
                        hwwVar7.f37339ny = hwwVar7.sd(strArrSplit4);
                        String[] strArrSplit5 = com.bytedance.sdk.openadsdk.kv.hww.hww("pag_landingPage_stay_time", "1,3,5&session").split("&");
                        String[] strArrSplit6 = com.bytedance.sdk.openadsdk.kv.hww.hww("pag_video_stay_time", "1,3,5&session").split("&");
                        hww hwwVar8 = hww.this;
                        hwwVar8.nod = hwwVar8.hww(strArrSplit5);
                        hww hwwVar9 = hww.this;
                        hwwVar9.vhb = hwwVar9.hww(strArrSplit6);
                        hww hwwVar10 = hww.this;
                        hwwVar10.f37340ok = hwwVar10.tq(strArrSplit5);
                        hww hwwVar11 = hww.this;
                        hwwVar11.f37341rs = hwwVar11.tq(strArrSplit6);
                        hww.this.f37336ed = com.bytedance.sdk.openadsdk.kv.hww.hww("pag_video_30p_session", true);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] tq(String[] strArr) {
        if (strArr.length > 0) {
            return sd(strArr[0].split(","));
        }
        return new int[0];
    }

    public static hww hww() {
        if (hww == null) {
            synchronized (sd.class) {
                try {
                    if (hww == null) {
                        hww = new hww();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hww;
    }

    public boolean sd() {
        return this.khx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hww(String[] strArr) {
        if (strArr.length == 2) {
            return h.f117418b.equals(strArr[1]);
        }
        if (strArr.length == 1) {
            return h.f117418b.equals(strArr[0]);
        }
        return false;
    }
}
