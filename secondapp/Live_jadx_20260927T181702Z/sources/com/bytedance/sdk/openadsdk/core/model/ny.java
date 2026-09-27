package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.util.Iterator;
import n0.w;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ny {

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private final JSONObject f36356bs;

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private final SparseArray<com.bytedance.sdk.openadsdk.core.sd.sd.hww> f36357ed;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private final float f36358hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final float f36359hv;
    private final int[] hww;
    private final int khx;
    private final int nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private final int f36360ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private final long f36361ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private final int f36362rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final float f36363sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final int[] f36364tq;
    private final long vgm;
    private final int vhb;
    private final float vy;
    private final JSONObject weu;
    private final String wgt;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {

        /* JADX INFO: renamed from: bs, reason: collision with root package name */
        private String f36365bs;

        /* JADX INFO: renamed from: ed, reason: collision with root package name */
        private int f36366ed;

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        private float f36367hu;

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        private long f36368hv;
        float hww;
        private int jpb;
        private int khx;
        private JSONObject mrs;
        private int[] nod;

        /* JADX INFO: renamed from: ny, reason: collision with root package name */
        private int f36369ny;

        /* JADX INFO: renamed from: ok, reason: collision with root package name */
        private float f36370ok;
        private JSONObject omn;

        /* JADX INFO: renamed from: rs, reason: collision with root package name */
        private float f36371rs;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        float f36372sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        int f36373tq;
        private float vgm;
        private int[] vhb;
        private long vy;
        private SparseArray<com.bytedance.sdk.openadsdk.core.sd.sd.hww> weu;
        private int wgt;

        public hww hu(float f10) {
            this.f36371rs = f10;
            return this;
        }

        public hww hv(float f10) {
            this.f36370ok = f10;
            return this;
        }

        public hww hww(int i10) {
            this.jpb = i10;
            return this;
        }

        public hww sd(int i10) {
            this.f36373tq = i10;
            return this;
        }

        public hww tq(JSONObject jSONObject) {
            this.omn = jSONObject;
            return this;
        }

        public hww vy(float f10) {
            this.vgm = f10;
            return this;
        }

        public hww hu(int i10) {
            this.khx = i10;
            return this;
        }

        public hww hv(int i10) {
            this.f36366ed = i10;
            return this;
        }

        public hww hww(JSONObject jSONObject) {
            this.mrs = jSONObject;
            return this;
        }

        public hww sd(float f10) {
            this.f36367hu = f10;
            return this;
        }

        public hww tq(int i10) {
            this.wgt = i10;
            return this;
        }

        public hww vy(int i10) {
            this.f36369ny = i10;
            return this;
        }

        public hww hww(SparseArray<com.bytedance.sdk.openadsdk.core.sd.sd.hww> sparseArray) {
            this.weu = sparseArray;
            return this;
        }

        public hww tq(float f10) {
            this.f36372sd = f10;
            return this;
        }

        public hww hww(float f10) {
            this.hww = f10;
            return this;
        }

        public hww tq(long j10) {
            this.f36368hv = j10;
            return this;
        }

        public hww hww(long j10) {
            this.vy = j10;
            return this;
        }

        public hww tq(int[] iArr) {
            this.vhb = iArr;
            return this;
        }

        public hww hww(int[] iArr) {
            this.nod = iArr;
            return this;
        }

        public hww hww(String str) {
            this.f36365bs = str;
            return this;
        }

        public ny hww() {
            return new ny(this);
        }
    }

    public JSONObject hww() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = this.f36356bs;
            if (jSONObject2 != null) {
                try {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.putOpt(next, this.f36356bs.opt(next));
                    }
                } catch (Exception unused) {
                }
            }
            int[] iArr = this.hww;
            if (iArr != null && iArr.length == 2) {
                jSONObject.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.hww[1]));
            }
            int[] iArr2 = this.f36364tq;
            if (iArr2 != null && iArr2.length == 2) {
                jSONObject.putOpt("width", Integer.valueOf(iArr2[0])).putOpt("height", Integer.valueOf(this.f36364tq[1]));
            }
            jSONObject.putOpt("down_x", Float.toString(this.f36363sd)).putOpt("down_y", Float.toString(this.vy)).putOpt("up_x", Float.toString(this.f36359hv)).putOpt("up_y", Float.toString(this.f36358hu)).putOpt("down_time", Long.valueOf(this.vgm)).putOpt("up_time", Long.valueOf(this.f36361ok)).putOpt("toolType", Integer.valueOf(this.f36362rs)).putOpt("deviceId", Integer.valueOf(this.nod)).putOpt("source", Integer.valueOf(this.vhb)).putOpt("ft", hww(this.f36357ed, this.f36360ny)).putOpt("click_area_type", this.wgt);
            int i10 = this.khx;
            if (i10 > 0) {
                jSONObject.putOpt("areaType", Integer.valueOf(i10));
            }
            JSONObject jSONObject3 = this.weu;
            if (jSONObject3 != null) {
                jSONObject.putOpt("rectInfo", jSONObject3);
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    private ny(@NonNull hww hwwVar) {
        this.hww = hwwVar.nod;
        this.f36364tq = hwwVar.vhb;
        this.f36363sd = hwwVar.f36371rs;
        this.vy = hwwVar.f36370ok;
        this.f36359hv = hwwVar.vgm;
        this.f36358hu = hwwVar.f36367hu;
        this.vgm = hwwVar.f36368hv;
        this.f36361ok = hwwVar.vy;
        this.f36362rs = hwwVar.f36369ny;
        this.nod = hwwVar.f36366ed;
        this.vhb = hwwVar.khx;
        this.f36360ny = hwwVar.wgt;
        this.f36357ed = hwwVar.weu;
        this.wgt = hwwVar.f36365bs;
        this.khx = hwwVar.jpb;
        this.weu = hwwVar.mrs;
        this.f36356bs = hwwVar.omn;
    }

    public static JSONObject hww(SparseArray<com.bytedance.sdk.openadsdk.core.sd.sd.hww> sparseArray, int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (sparseArray != null) {
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    com.bytedance.sdk.openadsdk.core.sd.sd.hww hwwVarValueAt = sparseArray.valueAt(i11);
                    if (hwwVarValueAt != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("force", Double.valueOf(hwwVarValueAt.f36767sd)).putOpt("mr", Double.valueOf(hwwVarValueAt.f36768tq)).putOpt(w.c.S, Integer.valueOf(hwwVarValueAt.hww)).putOpt("ts", Long.valueOf(hwwVarValueAt.vy));
                        jSONArray.put(jSONObject2);
                        jSONObject.putOpt("ftc", Integer.valueOf(i10)).putOpt("info", jSONArray);
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
