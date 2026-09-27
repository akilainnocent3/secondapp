package com.bytedance.sdk.openadsdk.core.settings;

import e8.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq {
    public int aed;
    public int aeg;
    public boolean blh;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    public int f36797bs;

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    public int f36798ed;
    public int grv;
    public boolean hnv;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    public int f36799hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    public int f36800hv;
    public JSONObject hwp;
    public String hww;
    public int jpb;
    public int khx;
    public List<String> kub;

    /* JADX INFO: renamed from: kv, reason: collision with root package name */
    public int f36801kv;
    public int mrs;

    /* JADX INFO: renamed from: mw, reason: collision with root package name */
    public boolean f36802mw;
    public int nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    public int f36803ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    public int f36804ok;
    public int omn;
    public int oxu;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    public int f36805rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public int f36806sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public int f36807tq;
    public int vgm;
    public int vhb;
    public int vy;
    public int weu;
    public int wgt;

    /* JADX INFO: renamed from: za, reason: collision with root package name */
    public boolean f36808za;
    public int zvy;

    public tq(JSONObject jSONObject) {
        this.f36807tq = 1;
        this.f36806sd = 1;
        this.vy = 2;
        this.f36800hv = 1;
        this.f36799hu = 100;
        this.vgm = 0;
        this.f36804ok = 2;
        this.f36805rs = 1;
        this.nod = 3;
        this.vhb = 30;
        this.f36803ny = 30;
        this.f36798ed = 1;
        this.khx = 1;
        this.weu = 2;
        this.wgt = 1500;
        this.f36797bs = 2;
        this.jpb = a.f80547h;
        this.mrs = 0;
        this.omn = 5;
        this.hnv = false;
        this.f36801kv = 0;
        this.aeg = 2;
        this.grv = 0;
        this.aed = 0;
        this.zvy = 5;
        this.f36802mw = true;
        this.f36808za = false;
        this.blh = false;
        this.oxu = -1;
        new JSONObject();
        this.hwp = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.hww = jSONObject.optString("code_id");
        this.f36807tq = jSONObject.optInt("auto_play", 1);
        this.oxu = jSONObject.optInt("endcard_close_time", -1);
        this.f36806sd = jSONObject.optInt("voice_control", 1);
        this.vy = jSONObject.optInt("rv_preload", 2);
        this.f36800hv = jSONObject.optInt("nv_preload", 1);
        this.f36799hu = Math.min(100, Math.max(0, jSONObject.optInt("proportion_watching", 100)));
        this.vgm = jSONObject.optInt("skip_time_displayed", 0);
        this.f36804ok = jSONObject.optInt("video_skip_result", 2);
        this.f36805rs = jSONObject.optInt("reg_creative_control", 1);
        this.nod = jSONObject.optInt("play_bar_show_time", 3);
        int iOptInt = jSONObject.optInt("rv_skip_time", 30);
        this.vhb = iOptInt;
        if (iOptInt < 0) {
            this.vhb = 30;
        }
        this.f36798ed = jSONObject.optInt("voice_control", 2);
        this.khx = jSONObject.optInt("if_show_win", 1);
        this.weu = jSONObject.optInt("sp_preload", 2);
        this.wgt = jSONObject.optInt("stop_time", 1500);
        this.f36797bs = jSONObject.optInt("native_playable_delay", 2);
        this.jpb = jSONObject.optInt("time_out_control", -1);
        this.mrs = jSONObject.optInt("playable_reward_type", 0);
        this.f36801kv = jSONObject.optInt("reward_is_callback", 0);
        int iOptInt2 = jSONObject.optInt("iv_skip_time", 5);
        this.omn = iOptInt2;
        if (iOptInt2 < 0) {
            this.omn = 5;
        }
        hww(jSONObject.optJSONArray("parent_tpl_ids"));
        this.aeg = jSONObject.optInt("slot_type", 2);
        this.hnv = jSONObject.optBoolean("close_on_click", false);
        this.grv = jSONObject.optInt("allow_system_back", 0);
        this.aed = jSONObject.optInt("splash_skip_time", 0);
        this.zvy = jSONObject.optInt("splash_image_count_down_time", 5);
        this.f36808za = jSONObject.optBoolean("splash_count_down_time_off", false);
        this.blh = jSONObject.optBoolean("splash_close_on_click", false);
        this.f36802mw = jSONObject.optBoolean("allow_mediaview_click", true);
        if (!hww(this.f36806sd)) {
            this.f36806sd = 1;
        }
        if (!hww(this.f36798ed)) {
            this.f36798ed = 1;
        }
        this.f36803ny = jSONObject.optInt("multi_rv_skip_time", 30);
    }

    private static boolean hww(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public void hww(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.kub = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                this.kub.add(jSONArray.get(i10).toString());
            } catch (Exception unused) {
                return;
            }
        }
    }

    public tq(String str, int i10) {
        this.f36807tq = 1;
        this.f36806sd = 1;
        this.vy = 2;
        this.f36800hv = 1;
        this.f36799hu = 100;
        this.vgm = 0;
        this.f36804ok = 2;
        this.f36805rs = 1;
        this.nod = 3;
        this.vhb = 30;
        this.f36803ny = 30;
        this.f36798ed = 1;
        this.khx = 1;
        this.weu = 2;
        this.wgt = 1500;
        this.f36797bs = 2;
        this.jpb = a.f80547h;
        this.mrs = 0;
        this.omn = 5;
        this.hnv = false;
        this.f36801kv = 0;
        this.aeg = 2;
        this.grv = 0;
        this.aed = 0;
        this.zvy = 5;
        this.f36802mw = true;
        this.f36808za = false;
        this.blh = false;
        this.oxu = -1;
        this.hwp = new JSONObject();
        this.hww = str;
        this.f36806sd = i10;
    }
}
