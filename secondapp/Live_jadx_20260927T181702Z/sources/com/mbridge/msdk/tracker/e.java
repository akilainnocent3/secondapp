package com.mbridge.msdk.tracker;

import java.io.Serializable;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f70223a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private JSONObject f70226d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private h f70231i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f70224b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f70225c = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f70229g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f70230h = ne.e.f116460d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f70232j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f70233k = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f70228f = System.currentTimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f70227e = UUID.randomUUID().toString();

    public e(String str) {
        this.f70223a = str;
    }

    public void a(int i10) {
        this.f70225c = i10;
    }

    public void b(int i10) {
        this.f70224b = i10;
    }

    public void c(long j10) {
        this.f70228f = j10;
    }

    public long d() {
        return this.f70229g;
    }

    public String g() {
        return this.f70223a;
    }

    public int h() {
        return this.f70225c;
    }

    public JSONObject i() {
        JSONObject jSONObject = this.f70226d;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.f70226d = jSONObject2;
        return jSONObject2;
    }

    public h j() {
        return this.f70231i;
    }

    public long k() {
        return this.f70230h;
    }

    public long l() {
        return this.f70228f;
    }

    public int m() {
        return this.f70224b;
    }

    public String n() {
        return this.f70227e;
    }

    public boolean o() {
        return this.f70233k;
    }

    public boolean p() {
        return this.f70232j;
    }

    public void a(JSONObject jSONObject) {
        this.f70226d = jSONObject;
    }

    public void b(long j10) {
        this.f70230h = j10;
    }

    public void a(String str) {
        this.f70227e = str;
    }

    public void a(long j10) {
        this.f70229g = j10;
    }

    public void a(h hVar) {
        this.f70231i = hVar;
    }

    public void a(boolean z10) {
        this.f70233k = z10;
    }
}
