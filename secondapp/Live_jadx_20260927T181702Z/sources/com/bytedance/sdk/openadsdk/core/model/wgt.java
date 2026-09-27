package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class wgt implements com.bytedance.sdk.component.adexpress.sd {

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    public JSONObject f36439ed;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    public final long f36440hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    public final long f36441hv;
    public final float hww;
    public boolean khx;
    public SparseArray<com.bytedance.sdk.openadsdk.core.sd.sd.hww> nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    public int f36442ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    public int f36443ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    public JSONObject f36444rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public final float f36445sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public final float f36446tq;
    public final String vgm;
    public final boolean vhb;
    public final float vy;
    public int weu;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {

        /* JADX INFO: renamed from: ed, reason: collision with root package name */
        private JSONObject f36447ed;

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        private float f36448hu;

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        private float f36449hv;
        private int nod;

        /* JADX INFO: renamed from: ny, reason: collision with root package name */
        private int f36450ny;

        /* JADX INFO: renamed from: ok, reason: collision with root package name */
        private int f36451ok;

        /* JADX INFO: renamed from: rs, reason: collision with root package name */
        private String f36452rs;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private long f36453sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private long f36454tq;
        private float vgm;
        private JSONObject vhb;
        private float vy;
        private boolean weu;
        private boolean khx = false;
        protected SparseArray<com.bytedance.sdk.openadsdk.core.sd.sd.hww> hww = new SparseArray<>();

        public hww hww(int i10) {
            this.f36450ny = i10;
            return this;
        }

        public hww sd(int i10) {
            this.f36451ok = i10;
            return this;
        }

        public hww tq(int i10) {
            this.nod = i10;
            return this;
        }

        public hww vy(float f10) {
            this.vgm = f10;
            return this;
        }

        public hww hww(JSONObject jSONObject) {
            this.vhb = jSONObject;
            return this;
        }

        public hww sd(float f10) {
            this.f36448hu = f10;
            return this;
        }

        public hww tq(long j10) {
            this.f36453sd = j10;
            return this;
        }

        public hww hww(boolean z10) {
            this.weu = z10;
            return this;
        }

        public hww tq(float f10) {
            this.f36449hv = f10;
            return this;
        }

        public hww hww(long j10) {
            this.f36454tq = j10;
            return this;
        }

        public hww tq(JSONObject jSONObject) {
            this.f36447ed = jSONObject;
            return this;
        }

        public hww hww(float f10) {
            this.vy = f10;
            return this;
        }

        public hww tq(boolean z10) {
            this.khx = z10;
            return this;
        }

        public hww hww(String str) {
            this.f36452rs = str;
            return this;
        }

        public hww hww(SparseArray<com.bytedance.sdk.openadsdk.core.sd.sd.hww> sparseArray) {
            this.hww = sparseArray;
            return this;
        }

        public wgt hww() {
            return new wgt(this);
        }
    }

    private wgt(@NonNull hww hwwVar) {
        this.khx = false;
        this.hww = hwwVar.vgm;
        this.f36446tq = hwwVar.f36448hu;
        this.f36445sd = hwwVar.f36449hv;
        this.vy = hwwVar.vy;
        this.f36441hv = hwwVar.f36453sd;
        this.f36440hu = hwwVar.f36454tq;
        this.vgm = hwwVar.f36452rs;
        this.nod = hwwVar.hww;
        this.vhb = hwwVar.weu;
        this.f36443ok = hwwVar.nod;
        this.f36444rs = hwwVar.vhb;
        this.f36442ny = hwwVar.f36450ny;
        this.f36439ed = hwwVar.f36447ed;
        this.khx = hwwVar.khx;
        this.weu = hwwVar.f36451ok;
    }
}
