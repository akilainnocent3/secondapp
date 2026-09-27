package com.bykv.vk.openvk.hww.hww.hww.sd;

import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class sd implements Serializable {

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private String f31567bs;
    private int hnv;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private tq f31569hu;
    private long jpb;
    private String khx;

    /* JADX INFO: renamed from: kv, reason: collision with root package name */
    private int f31571kv;
    private boolean mrs;
    private boolean nod;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private String f31574ok;
    private boolean omn;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private boolean f31575rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public int f31576sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public String f31577tq;
    private tq vgm;
    private int weu;
    private int wgt;
    private int zvy;
    private int vhb = 204800;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private int f31573ny = 0;

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private int f31568ed = 0;
    protected float hww = -1.0f;
    public final HashMap<String, Object> vy = new HashMap<>();
    private int kub = 10000;
    private int aeg = 10000;
    private int grv = 10000;
    private int aed = 0;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    public int f31570hv = 1;

    /* JADX INFO: renamed from: mw, reason: collision with root package name */
    private JSONObject f31572mw = new JSONObject();

    public sd(String str, tq tqVar, tq tqVar2, int i10, int i11) {
        this.hnv = 0;
        this.f31571kv = 0;
        this.f31574ok = str;
        this.f31569hu = tqVar;
        this.vgm = tqVar2;
        this.hnv = i10;
        this.f31571kv = i11;
    }

    public boolean aed() {
        return this.nod;
    }

    public tq aeg() {
        return this.vgm;
    }

    public String bs() {
        if (khx()) {
            return this.vgm.khx();
        }
        tq tqVar = this.f31569hu;
        if (tqVar != null) {
            return tqVar.khx();
        }
        return null;
    }

    public boolean ed() {
        if (khx()) {
            return this.vgm.hnv();
        }
        tq tqVar = this.f31569hu;
        if (tqVar != null) {
            return tqVar.hnv();
        }
        return true;
    }

    public boolean grv() {
        return this.f31575rs;
    }

    public int hnv() {
        return this.grv;
    }

    public int hu() {
        if (khx()) {
            return this.vgm.weu();
        }
        tq tqVar = this.f31569hu;
        if (tqVar != null) {
            return tqVar.weu();
        }
        return 0;
    }

    public String hv() {
        return this.f31574ok;
    }

    public void hww(int i10) {
        this.zvy = i10;
    }

    public int jpb() {
        return this.hnv;
    }

    public boolean khx() {
        tq tqVar;
        if (this.f31571kv != 1 || (tqVar = this.vgm) == null || TextUtils.isEmpty(tqVar.vhb())) {
            return false;
        }
        if (com.bykv.vk.openvk.hww.hww.hww.sd.hu() == 2) {
            return Build.VERSION.SDK_INT >= 26;
        }
        return this.hnv == 1;
    }

    public tq kub() {
        return this.f31569hu;
    }

    public int kv() {
        return this.aed;
    }

    public int mrs() {
        return this.kub;
    }

    public long nod() {
        return this.jpb;
    }

    public long ny() {
        if (khx()) {
            return this.vgm.hv();
        }
        tq tqVar = this.f31569hu;
        if (tqVar != null) {
            return tqVar.hv();
        }
        return 0L;
    }

    public int ok() {
        return this.weu;
    }

    public int omn() {
        return this.aeg;
    }

    public int rs() {
        return this.wgt;
    }

    public JSONObject sd() {
        return this.f31572mw;
    }

    public boolean tq() {
        return this.zvy == 2;
    }

    public boolean vgm() {
        return this.omn;
    }

    public boolean vhb() {
        return this.mrs;
    }

    public int vy() {
        return this.f31572mw.optInt("pitaya_cache_size", 0);
    }

    public float weu() {
        float f10 = this.hww;
        if (f10 != -1.0f) {
            return f10;
        }
        if (khx()) {
            return this.vgm.ok();
        }
        tq tqVar = this.f31569hu;
        if (tqVar != null) {
            return tqVar.ok();
        }
        return -1.0f;
    }

    public String wgt() {
        if (khx()) {
            return this.vgm.vhb();
        }
        tq tqVar = this.f31569hu;
        if (tqVar != null) {
            return tqVar.vhb();
        }
        return null;
    }

    public synchronized Object hv(String str) {
        return this.vy.get(str);
    }

    public boolean hww() {
        int i10 = this.zvy;
        return i10 == 1 || i10 == 2;
    }

    public void ok(int i10) {
        this.aed = i10;
    }

    public void sd(int i10) {
        this.wgt = i10;
    }

    public void tq(String str) {
        this.khx = str;
    }

    public void vgm(int i10) {
        this.grv = i10;
    }

    public void vy(String str) {
        this.f31577tq = str;
    }

    public void hv(int i10) {
        this.kub = i10;
    }

    public void hww(String str) {
        this.f31574ok = str;
    }

    public void sd(String str) {
        this.f31567bs = str;
    }

    public void tq(int i10) {
        this.weu = i10;
    }

    public void vy(int i10) {
        this.f31576sd = i10;
    }

    public void hww(long j10) {
        this.jpb = j10;
    }

    public void sd(boolean z10) {
        this.nod = z10;
    }

    public void tq(boolean z10) {
        this.f31575rs = z10;
    }

    public void hu(int i10) {
        this.aeg = i10;
    }

    public void hww(boolean z10) {
        this.mrs = z10;
    }

    public synchronized void hww(String str, Object obj) {
        this.vy.put(str, obj);
    }
}
