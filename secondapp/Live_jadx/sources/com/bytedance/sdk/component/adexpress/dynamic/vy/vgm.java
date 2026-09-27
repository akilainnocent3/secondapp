package com.bytedance.sdk.component.adexpress.dynamic.vy;

import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.hv.vhb;
import com.google.android.material.timepicker.h;
import com.ironsource.C4235d4;
import gi.j;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vgm {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private String f34266hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private hv f34267hv;
    public int hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public JSONObject f34268sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public String f34269tq;
    private hu vy;

    public vgm(hv hvVar) {
        this.f34267hv = hvVar;
        this.hww = hvVar.hww();
        this.f34269tq = hvVar.sd();
        this.f34268sd = hvVar.hv().nuc();
        this.f34266hu = hvVar.vy();
        if (com.bytedance.sdk.component.adexpress.vy.sd() == 1) {
            this.vy = hvVar.vgm();
        } else {
            this.vy = hvVar.hv();
        }
        if (com.bytedance.sdk.component.adexpress.vy.tq()) {
            this.vy = hvVar.hv();
        }
    }

    private boolean as() {
        if (com.bytedance.sdk.component.adexpress.vy.tq()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.f34269tq) && this.f34269tq.contains("adx:")) || vhb.tq();
    }

    private boolean kft() {
        return (com.bytedance.sdk.component.adexpress.vy.tq() && (this.f34267hv.tq().contains("logo-union") || this.f34267hv.tq().contains("logounion") || this.f34267hv.tq().contains("logoad"))) || "logo-union".equals(this.f34267hv.tq()) || "logounion".equals(this.f34267hv.tq()) || "logoad".equals(this.f34267hv.tq());
    }

    public long aed() {
        return this.vy.oo();
    }

    public String aeg() {
        return this.vy.wdz();
    }

    public int blh() {
        return this.vy.sd();
    }

    public int bq() {
        return this.vy.hwp();
    }

    public float bs() {
        return this.vy.ny();
    }

    public int ce() {
        return this.vy.efj();
    }

    public boolean cj() {
        return this.vy.lb();
    }

    public String eb() {
        return this.vy.blh();
    }

    public String ece() {
        return this.vy.sg();
    }

    public double ed() {
        if (this.hww == 11) {
            try {
                double d10 = Double.parseDouble(this.f34269tq);
                return !com.bytedance.sdk.component.adexpress.vy.tq() ? (int) d10 : d10;
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    public boolean ep() {
        return this.vy.ed();
    }

    public int et() {
        return this.vy.fo();
    }

    public int fc() {
        return this.vy.ecg();
    }

    public double fp() {
        return this.vy.rpd();
    }

    public String fxi() {
        return this.vy.za();
    }

    public String grv() {
        return this.vy.juo();
    }

    public String gsa() {
        return this.vy.grv();
    }

    public int gvr() {
        return this.vy.wqa();
    }

    public boolean hh() {
        return this.vy.rjt();
    }

    public String hnv() {
        return this.vy.aeg();
    }

    public String hu() {
        if (this.hww == 0) {
            return !TextUtils.isEmpty(this.f34269tq) ? this.f34269tq : this.f34268sd.optString(com.bytedance.sdk.component.adexpress.vy.vgm.sd(com.bytedance.sdk.component.adexpress.vy.hww()));
        }
        return "";
    }

    public float hv() {
        return this.vy.jpb();
    }

    public int hwp() {
        return this.vy.hv();
    }

    public int hww() {
        return (int) this.vy.khx();
    }

    public int icx() {
        return this.vy.alz();
    }

    public String ji() {
        return this.vy.rbt();
    }

    public int jk() {
        return this.vy.yt();
    }

    public int jpb() {
        return this.vy.ze();
    }

    public int jy() {
        return this.vy.ia();
    }

    public double khx() {
        return this.vy.mrs();
    }

    public int kub() {
        return this.vy.zeu();
    }

    public boolean kv() {
        return this.vy.cj();
    }

    public boolean mg() {
        return this.vy.rjt();
    }

    public int mrs() {
        return this.vy.rt();
    }

    public int mw() {
        return hww(this.vy.kub());
    }

    public String nod() {
        int i10 = this.hww;
        return (i10 == 2 || i10 == 13) ? this.f34269tq : "";
    }

    public String npz() {
        return this.vy.qt();
    }

    public String nuc() {
        return this.vy.zem();
    }

    public String ny() {
        return this.f34266hu;
    }

    public int ok() {
        String strHnv = this.vy.hnv();
        if ("left".equals(strHnv)) {
            return 17;
        }
        if ("center".equals(strHnv)) {
            return 4;
        }
        return "right".equals(strHnv) ? 3 : 2;
    }

    public boolean omn() {
        return this.vy.tdy();
    }

    public int oxu() {
        return this.vy.tq();
    }

    public int qm() {
        return this.vy.jy();
    }

    public String qt() {
        return this.vy.gvr();
    }

    public String rpd() {
        return this.vy.nod();
    }

    public int rs() {
        int iOk = ok();
        if (iOk == 4) {
            return 17;
        }
        return iOk == 3 ? 8388613 : 8388611;
    }

    public int sd() {
        return (int) this.vy.weu();
    }

    public int syb() {
        return this.vy.rs();
    }

    public int tq() {
        return (int) this.vy.bs();
    }

    public int vgm() {
        return hww(this.vy.kv());
    }

    public String vhb() {
        return this.hww == 1 ? this.f34269tq : "";
    }

    public int vy() {
        return (int) this.vy.wgt();
    }

    public double wal() {
        return this.vy.syb();
    }

    public boolean wc() {
        return this.vy.dv();
    }

    public boolean wdz() {
        return this.vy.wc();
    }

    public float weu() {
        return this.vy.vhb();
    }

    public int wgt() {
        return hww(this.vy.aed());
    }

    public int wqa() {
        return this.vy.sf();
    }

    public boolean wyi() {
        return this.vy.oxu();
    }

    public int xas() {
        return this.vy.fqb();
    }

    public String xe() {
        return this.vy.km();
    }

    public int yt() {
        return this.vy.vy();
    }

    public int ytm() {
        return this.vy.pq();
    }

    public double za() {
        return this.vy.ok();
    }

    public int zeu() {
        return this.vy.vgm();
    }

    public int zvy() {
        String strWdz = this.vy.wdz();
        if ("skip-with-time-skip-btn".equals(this.f34267hv.tq()) || h.f51923u.equals(this.f34267hv.tq()) || TextUtils.equals("skip-with-countdowns-skip-btn", this.f34267hv.tq())) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.f34267hv.tq()) && !"skip-with-time".equals(this.f34267hv.tq())) {
            if (this.hww == 10 && TextUtils.equals(this.vy.gvr(), "click")) {
                return 5;
            }
            if (kft() && as()) {
                return 0;
            }
            if (kft()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.f34267hv.tq())) {
                return 3;
            }
            if (!TextUtils.isEmpty(strWdz) && !strWdz.equals("none")) {
                if (strWdz.equals("video") || (this.f34267hv.hww() == 7 && TextUtils.equals(strWdz, "normal"))) {
                    return (com.bytedance.sdk.component.adexpress.vy.tq() && this.f34267hv.hv() != null && this.f34267hv.hv().oa()) ? 11 : 4;
                }
                if (strWdz.equals("normal")) {
                    return 1;
                }
                return (strWdz.equals("creative") || "slide".equals(this.vy.gvr())) ? 2 : 0;
            }
        }
        return 0;
    }

    public static float[] tq(String str) {
        String[] strArrSplit = str.substring(str.indexOf(j.f86770c) + 1, str.indexOf(j.f86771d)).split(",");
        return (strArrSplit == null || strArrSplit.length != 4) ? new float[]{0.0f, 0.0f, 0.0f, 0.0f} : new float[]{Float.parseFloat(strArrSplit[0]), Float.parseFloat(strArrSplit[1]), Float.parseFloat(strArrSplit[2]), Float.parseFloat(strArrSplit[3])};
    }

    public void hww(float f10) {
        this.vy.hww(f10);
    }

    public static int hww(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str)) {
            return -16777216;
        }
        if (str.equals(C4235d4.i.T)) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (str.startsWith("rgba") && (strArrSplit = str.substring(str.indexOf(j.f86770c) + 1, str.indexOf(j.f86771d)).split(",")) != null) {
            try {
                if (strArrSplit.length == 4) {
                    return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
                }
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return -16777216;
    }

    public boolean hww(int i10) {
        hv hvVar = this.f34267hv;
        if (hvVar == null) {
            return false;
        }
        if (i10 == 1) {
            this.vy = hvVar.vgm();
        } else {
            this.vy = hvVar.hv();
        }
        return this.vy != null;
    }
}
