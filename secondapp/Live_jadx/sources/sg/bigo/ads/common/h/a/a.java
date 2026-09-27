package sg.bigo.ads.common.h.a;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f133078a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f133079b = 20;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f133080c = 40;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f133081d = 432000000;

    public a() {
        c();
    }

    private void c() {
        this.f133078a = 3;
        this.f133079b = 20;
        this.f133080c = 40;
        this.f133081d = 432000000L;
    }

    public final int a() {
        int i10 = this.f133079b;
        if (i10 == 0) {
            return Integer.MAX_VALUE;
        }
        return i10;
    }

    public final boolean b() {
        return this.f133078a <= 0;
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            c();
            return;
        }
        this.f133078a = jSONObject.optInt("download_parallel_num", 3);
        int iOptInt = jSONObject.optInt("num", 20);
        this.f133079b = iOptInt;
        this.f133080c = iOptInt * 2;
        long jOptInt = ((long) jSONObject.optInt("valid_period")) * 1000;
        if (jOptInt == 0) {
            jOptInt = 432000000;
        }
        this.f133081d = jOptInt;
    }
}
