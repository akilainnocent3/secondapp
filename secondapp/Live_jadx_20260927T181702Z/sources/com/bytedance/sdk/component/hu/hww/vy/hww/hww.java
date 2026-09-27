package com.bytedance.sdk.component.hu.hww.vy.hww;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww implements com.bytedance.sdk.component.hu.hww.vy.hww {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private long f34642hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private long f34643hv;
    protected JSONObject hww;
    private byte nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private int f34644ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private String f34645ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private String f34646rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private byte f34647sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private tq f34648tq;
    private long vgm;
    private String vhb;
    private byte vy;

    public hww(String str, JSONObject jSONObject) {
        this.f34646rs = str;
        this.hww = jSONObject;
    }

    public static com.bytedance.sdk.component.hu.hww.vy.hww sd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("type");
            int iOptInt2 = jSONObject.optInt("priority");
            hww hwwVar = new hww();
            hwwVar.hww((byte) iOptInt);
            hwwVar.tq((byte) iOptInt2);
            hwwVar.hww(jSONObject.optJSONObject("event"));
            hwwVar.hww(jSONObject.optString("localId"));
            hwwVar.tq(jSONObject.optString("genTime"));
            hwwVar.hww(jSONObject.optInt("channel"));
            return hwwVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.hu.hww.vy.hww
    public String hu() {
        if (TextUtils.isEmpty(this.f34646rs)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("localId", this.f34646rs);
            jSONObject.put("event", vgm());
            jSONObject.put("genTime", ny());
            jSONObject.put("priority", (int) this.vy);
            jSONObject.put("type", (int) this.f34647sd);
            jSONObject.put("channel", this.f34644ny);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.hu.hww.vy.hww
    public byte hv() {
        return this.vy;
    }

    @Override // com.bytedance.sdk.component.hu.hww.vy.hww
    public tq hww() {
        return this.f34648tq;
    }

    @Override // com.bytedance.sdk.component.hu.hww.vy.hww
    public int nod() {
        return this.f34644ny;
    }

    public String ny() {
        return this.f34645ok;
    }

    @Override // com.bytedance.sdk.component.hu.hww.vy.hww
    public long ok() {
        return this.f34643hv;
    }

    @Override // com.bytedance.sdk.component.hu.hww.vy.hww
    public long rs() {
        return this.f34642hu;
    }

    @Override // com.bytedance.sdk.component.hu.hww.vy.hww
    public byte tq() {
        return this.nod;
    }

    @Override // com.bytedance.sdk.component.hu.hww.vy.hww
    public synchronized JSONObject vgm() {
        tq tqVar;
        try {
            if (this.hww == null && (tqVar = this.f34648tq) != null) {
                this.hww = tqVar.hww(vhb());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.hww;
    }

    public String vhb() {
        return this.vhb;
    }

    @Override // com.bytedance.sdk.component.hu.hww.vy.hww
    public byte vy() {
        return this.f34647sd;
    }

    @Override // com.bytedance.sdk.component.hu.hww.vy.hww
    public void hww(JSONObject jSONObject) {
        this.hww = jSONObject;
    }

    @Override // com.bytedance.sdk.component.hu.hww.vy.hww
    public void tq(String str) {
        this.f34645ok = str;
    }

    @Override // com.bytedance.sdk.component.hu.hww.vy.hww
    public void hww(byte b10) {
        this.f34647sd = b10;
    }

    @Override // com.bytedance.sdk.component.hu.hww.vy.hww
    public void tq(long j10) {
        this.f34642hu = j10;
    }

    public hww(String str, tq tqVar) {
        this.f34646rs = str;
        this.f34648tq = tqVar;
    }

    @Override // com.bytedance.sdk.component.hu.hww.vy.hww
    public void hww(String str) {
        this.f34646rs = str;
    }

    @Override // com.bytedance.sdk.component.hu.hww.vy.hww
    public void tq(byte b10) {
        this.vy = b10;
    }

    @Override // com.bytedance.sdk.component.hu.hww.vy.hww
    public void hww(long j10) {
        this.f34643hv = j10;
    }

    @Override // com.bytedance.sdk.component.hu.hww.vy.hww
    public void hww(int i10) {
        this.f34644ny = i10;
    }

    private hww() {
    }

    public void sd(byte b10) {
        this.nod = b10;
    }

    @Override // com.bytedance.sdk.component.hu.hww.vy.hww
    public String sd() {
        return this.f34646rs;
    }

    @Override // com.bytedance.sdk.component.hu.hww.vy.hww
    public void sd(long j10) {
        this.vgm = j10;
    }
}
