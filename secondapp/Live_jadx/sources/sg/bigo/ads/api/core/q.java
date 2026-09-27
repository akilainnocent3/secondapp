package sg.bigo.ads.api.core;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f132817a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f132818b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f132819c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f132820d = 0;

    public q() {
        a();
    }

    private void a() {
        this.f132817a = false;
        this.f132818b = "";
        this.f132819c = 3;
        this.f132820d = 20000;
    }

    public final boolean b(int i10) {
        return i10 < this.f132819c;
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            a();
            return;
        }
        this.f132817a = true;
        this.f132818b = jSONObject.optString("http_succ_code");
        this.f132819c = jSONObject.optInt("retry_cnt", 3);
        int iOptInt = jSONObject.optInt("retry_interval") * 1000;
        this.f132820d = iOptInt;
        if (iOptInt < 20000) {
            this.f132820d = 20000;
        }
    }

    public final boolean a(int i10) {
        if (i10 >= 100) {
            return this.f132818b.contains(String.valueOf(i10));
        }
        return false;
    }

    public final boolean a(long j10, long j11) {
        return j10 + ((long) this.f132820d) < j11;
    }
}
