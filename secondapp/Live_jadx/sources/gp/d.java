package gp;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f87260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f87261b;

    public d(JSONObject prop, long ts2) {
        this.f87260a = prop;
        this.f87261b = ts2;
    }

    public JSONObject a() {
        return this.f87260a;
    }

    public long b() {
        return this.f87261b;
    }

    public void c(JSONObject prop) {
        this.f87260a = prop;
    }

    public void d(long ts2) {
        this.f87261b = ts2;
    }
}
