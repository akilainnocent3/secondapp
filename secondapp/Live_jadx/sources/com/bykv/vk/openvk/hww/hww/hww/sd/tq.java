package com.bykv.vk.openvk.hww.hww.hww.sd;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class tq {

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private int f31579ed;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private String f31580hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private String f31581hv;
    private int hww;
    private String nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private int f31582ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private String f31583ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private String f31584rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private long f31585sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f31586tq;
    private String vgm;
    private double vhb;
    private double vy;
    private float khx = -1.0f;
    private int weu = 0;
    private int wgt = 0;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private int f31578bs = 0;
    private int jpb = 0;
    private int mrs = 307200;
    private int omn = 1;

    public int bs() {
        return this.jpb;
    }

    public String ed() {
        return this.f31584rs;
    }

    public boolean hnv() {
        return this.f31578bs == 0;
    }

    public double hu() {
        return this.vy;
    }

    public long hv() {
        return this.f31585sd;
    }

    public int hww() {
        return this.f31582ny;
    }

    public JSONObject jpb() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", tq());
            jSONObject.put("cover_url", nod());
            jSONObject.put("cover_width", sd());
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, ny());
            jSONObject.put("file_hash", khx());
            jSONObject.put("resolution", rs());
            jSONObject.put("size", hv());
            jSONObject.put("video_duration", hu());
            jSONObject.put("video_url", vhb());
            jSONObject.put("playable_download_url", ed());
            jSONObject.put("if_playable_loading_show", mrs());
            jSONObject.put("remove_loading_page_type", omn());
            jSONObject.put("fallback_endcard_judge", hww());
            jSONObject.put("video_preload_size", weu());
            jSONObject.put("reward_video_cached_type", wgt());
            jSONObject.put("execute_cached_type", bs());
            jSONObject.put("endcard_render", vy());
            jSONObject.put("replay_time", kv());
            jSONObject.put("play_speed_ratio", ok());
            if (vgm() > 0.0d) {
                jSONObject.put("start", vgm());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String khx() {
        if (TextUtils.isEmpty(this.nod)) {
            this.nod = com.bykv.vk.openvk.hww.hww.hww.vgm.tq.hww(this.vgm);
        }
        return this.nod;
    }

    public int kv() {
        return this.omn;
    }

    public int mrs() {
        return this.weu;
    }

    public String nod() {
        return this.f31580hu;
    }

    public String ny() {
        return this.f31583ok;
    }

    public float ok() {
        return this.khx;
    }

    public int omn() {
        return this.wgt;
    }

    public String rs() {
        return this.f31581hv;
    }

    public int sd() {
        return this.f31586tq;
    }

    public int tq() {
        return this.hww;
    }

    public double vgm() {
        return this.vhb;
    }

    public String vhb() {
        return this.vgm;
    }

    public int vy() {
        return this.f31579ed;
    }

    public int weu() {
        if (this.mrs < 0) {
            this.mrs = 307200;
        }
        long j10 = this.mrs;
        long j11 = this.f31585sd;
        if (j10 > j11) {
            this.mrs = (int) j11;
        }
        return this.mrs;
    }

    public int wgt() {
        return this.f31578bs;
    }

    public void hu(String str) {
        this.nod = str;
    }

    public void hv(String str) {
        this.f31584rs = str;
    }

    public void hww(int i10) {
        this.f31582ny = i10;
    }

    public void nod(int i10) {
        this.omn = Math.min(4, Math.max(1, i10));
    }

    public void ok(int i10) {
        this.weu = i10;
    }

    public void rs(int i10) {
        this.wgt = i10;
    }

    public void sd(int i10) {
        this.f31586tq = i10;
    }

    public void tq(int i10) {
        this.hww = i10;
    }

    public void vgm(int i10) {
        this.jpb = i10;
    }

    public void vy(int i10) {
        this.f31579ed = i10;
    }

    public void hu(int i10) {
        this.f31578bs = i10;
    }

    public void hv(int i10) {
        this.mrs = i10;
    }

    public void hww(long j10) {
        this.f31585sd = j10;
    }

    public void sd(String str) {
        this.vgm = str;
    }

    public void tq(String str) {
        this.f31580hu = str;
    }

    public void vy(String str) {
        this.f31583ok = str;
    }

    public void hww(double d10) {
        this.vy = d10;
    }

    public void hww(String str) {
        this.f31581hv = str;
    }
}
